import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class challenges extends PApplet {

// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int row = 0;


public void setup() {
  
}

public void draw() {
  fill(255);
  rect(column * tileSize, row, tileSize, tileSize);
  fill(0);
  line(column * tileSize, row, tileSize * column + tileSize, row + tileSize);
  line((column * tileSize) + tileSize, row, tileSize * column, row + tileSize);
  column++;
  if (column * tileSize > width) {
    row = row + tileSize;
    column = 0; // reset column val so the squares are drawn in every new row starting from the left
  }
}
  public void settings() {  size(480, 680); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "challenges" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
