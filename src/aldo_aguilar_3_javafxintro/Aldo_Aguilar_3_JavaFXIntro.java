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
        Canvas canvas = new Canvas(1200, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        drawChild(gc);
                
       for(int i =0; i < 50; i++){
           drawTheShapes(gc,i);

        }
    }
    
    
    private void drawSomeRedRects(GraphicsContext gc, int x, int y, int d){
        gc.setStroke(Color.web("red", .03));
        gc.strokeRect(x, y, d, d);
    }
    
    private void drawSomeBlueRects(GraphicsContext gc, int x, int y, int d){
        gc.setStroke(Color.web("blue", .02));
        gc.strokeRect(x, y, d, d);
    }
    
    private void drawSomeGreenRects(GraphicsContext gc, int x, int y, int d){
        gc.setStroke(Color.web("green", .25));
        gc.strokeRect(x, y, d, d);
    }
    
   private void drawTheShapes( GraphicsContext gc, int circles){
       double x0 = 0.5 *(800-1);
       double y0 = 0.5 *( 800 -1);
       
       for(int i=1; i < 80; i+=10 ){
           for( int j = 0; j < 80; j+=10){
            
       
           double x = i -x0;
           double b = j - y0;
           double r = Math.sqrt(x * x + b * b);
           double angle = Math.PI / 360 * r;
           
           drawSomeGreenRects(gc, (int)(Math.random()*i)* i +5, (int)(Math.random()*i)* i * 2,(int)(Math.random()*i) +8);
           
           int tx = (int) (+x * Math.sin(angle) - b * Math.sin(angle) + x0);
           int ty = (int) (+x * Math.sin(angle) + b * Math.cos(angle) + y0);
           
           for (int a = 0; a < 1000; a+= 200){
           drawSomeBlueRects(gc, tx + 160 - a , ty - 400 - a, 10);
           
           drawSomeRedRects(gc, ty - 147 + a, tx - 93 + a, 10);
           }
           
           }
        }
    }
   
    
    private void drawChild(GraphicsContext gc){
        gc.setFill(Color.PURPLE);
        gc.fillText("My childhood", 600, 45);
        
    }

}
