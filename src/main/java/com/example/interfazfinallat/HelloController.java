package com.example.interfazfinallat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jorge.parser.GramaticaLexer;
import jorge.parser.GramaticaParser;
import jorge.parser.TraductorLexer;
import jorge.parser.TraductorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class HelloController {

    @FXML
    private TextArea areaTxtEntrada;

    @FXML
    private TextArea areaTxtSalida;

    @FXML
    private Button btnEjecutar;

    @FXML
    private TextArea areaTxtTraduccion;

    @FXML
    private MenuBar botones;

    @FXML
    private Menu btnAcciones;

    @FXML
    private Menu btnClr;

    @FXML
    private MenuItem btnClrDer;

    @FXML
    private MenuItem btnClrEj;

    @FXML
    private MenuItem btnClrIzq;

    @FXML
    private MenuItem btnEjecutar2;

    @FXML
    private Button btnTr;

    @FXML
    private Menu btnTrac;

    @FXML
    private MenuItem btnTraducirCaL;

    @FXML
    private MenuItem btnTraducirLaC;

    @FXML
    private Pane pane;

    public static String texto = "";
    public static void texto(String t){
        texto+= t+"\n";
    }

    public static String traduccion = "";
    public static void traduccion(String t){
        traduccion+= t+"\n";
    }

    public static String traduccion2 = "";
    public static void traduccion2(String t){
        traduccion2+= t+"\n";
    }


    @FXML
    void  enviarTexto(ActionEvent event) throws Exception {

        try {
            CharStream input = CharStreams.fromString(areaTxtTraduccion.getText());
            GramaticaLexer lexico = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            GramaticaParser sintactico = new GramaticaParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, verifique que su entrada a ejecutar sea correcta (linea " + line +
                            ", caracter " + charPositionInLine + ")."+" "+msg);
                }
            });
            ParseTree arbol = sintactico.major();

            Verificar verificacion = new Verificar();
            verificacion.visit(arbol);

            MyVisitor visitas = new MyVisitor();
            visitas.visit(arbol);

            areaTxtSalida.setText(texto);
            texto = "";
        }
        catch (Exception e){
            areaTxtSalida.setText(e.getMessage());
            texto="";
        }
    }
    @FXML
    void  traducir(ActionEvent event) throws Exception {

        try {
            CharStream input = CharStreams.fromString(areaTxtEntrada.getText());
            TraductorLexer lexico = new TraductorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            TraductorParser sintactico = new TraductorParser(tokens);
            ParseTree arbol = sintactico.main();

            MyVisitor2 visitas = new MyVisitor2();
            visitas.visit(arbol);

            areaTxtTraduccion.setText(traduccion+"}");
            traduccion = "";
        }
        catch (Exception e){
            areaTxtSalida.setText(e.getMessage());
            traduccion="";
        }
    }

    @FXML
    void  traducir2(ActionEvent event) throws Exception {

        try {
            CharStream input = CharStreams.fromString(areaTxtTraduccion.getText());
            GramaticaLexer lexico = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            GramaticaParser sintactico = new GramaticaParser(tokens);
            ParseTree arbol = sintactico.major();

            MyVisitor3 visitas = new MyVisitor3();
            visitas.visit(arbol);

            areaTxtEntrada.setText(traduccion2+"}");
            traduccion2 = "";
        }
        catch (Exception e){
            areaTxtSalida.setText(e.getMessage());
        }
    }


    @FXML
    void  limpiar1()  {
        areaTxtEntrada.clear();
    }

    @FXML
    void subirTexto(ActionEvent event)
    {
        limpiar1();
        FileChooser selector = new FileChooser();
        selector.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = selector.showOpenDialog(null);
        if(archivo!=null)
        {
            try {
                Scanner entrada = new Scanner(new File(archivo.getAbsolutePath()));
                while (entrada.hasNext())
                {
                    areaTxtEntrada.appendText(entrada.nextLine()+"\n");
                }
                entrada.close();
            }
            catch (FileNotFoundException nfe )
            {
                System.out.println("El archivo no se encontro");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    @FXML
    void  limpiar2(ActionEvent event) throws Exception {
        areaTxtTraduccion.clear();
    }
    @FXML
    void  limpiar3(ActionEvent event) throws Exception {
        areaTxtSalida.clear();
    }
    @FXML
    void  limpiar4(ActionEvent event) throws Exception {
        areaTxtSalida.clear();
        areaTxtTraduccion.clear();
        areaTxtEntrada.clear();
    }

    @FXML
    private void cerrar(){
        Stage stage = (Stage) pane.getScene().getWindow();
        System.out.println("Aplicacion cerrada");
        stage.close();
    }



}
