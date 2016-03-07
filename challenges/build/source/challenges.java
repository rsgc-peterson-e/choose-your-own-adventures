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
  fill(randomColor(0, 100));
  line(column * tileSize, row, tileSize * column + tileSize, row + tileSize);
  column++;
  if (column * tileSize > width) {
    row = row + tileSize;
    column = 0; // reset column val so the squares are drawn in every new row starting from the left
  }
}

public int randomColor(int c1, int c2) { //returns one or the other grayscale color the user inputted
  if (random(0, 1) > 0.5f) {
    return c1;
  } else if (random(0, 1) < 0.5f) {
    return c2;
  }
  return 0; // return the color black if the above conditionals are false
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
