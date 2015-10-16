/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldo_aguilar_3_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Aldo_Aguilar_3_JavaFXIntro extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

                
        for(int i =0; i < 30; i++){
            drawLotsOfCircles(gc,i);
            
        }
    }
    
    private void drawSomeBlueRects(GraphicsContext gc, int x, int y, int d){
        gc.setStroke(Color.web("blue", .02));
        gc.strokeRect(x, y, d, d);
    }
    
    private void drawSomeGreenRects(GraphicsContext gc, int x, int y, int d){
        gc.setStroke(Color.web("green", .25));
        gc.strokeRect(x, y, d, d);
    }
    
   private void drawLotsOfCircles( GraphicsContext gc, int circles){
       
       for(int i=0; i < circles; i++ ){
            drawSomeGreenRects(gc, (int)(Math.random()*i)* i +5, (int)(Math.random()*i)* i * 2,(int)(Math.random()*i) +8);
            drawSomeBlueRects(gc, (i*20) +300, (i*10) + 300,(i* 5) +6 ) ;
        }
    }
    
    private void drawCircle(GraphicsContext gc){
        gc.fillOval(4, 4, 42, 42);
    }
    
    private void drawHouse(GraphicsContext gc){
        gc.setFill(Color.BROWN);
        gc.fillText("My House", 42, 42);
        
    }
    
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30 , 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);

    }

}
