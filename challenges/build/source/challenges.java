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
int y = 0;

public void setup() {
  
}

public void draw() {
  rect(column * tileSize, y, tileSize, tileSize);
  column++;
  if (column * tileSize > width) {
    y = y + tileSize;
    column = 0;
  }
}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "challenges" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
