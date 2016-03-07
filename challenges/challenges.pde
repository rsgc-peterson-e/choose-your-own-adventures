// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int row = 0;


void setup() {
  size(480, 680);
}

void draw() {
  fill(0);
  line(column * tileSize, row, tileSize * column + tileSize, row + tileSize); // draw the pair of crossed lines
  line((column * tileSize) + tileSize, row, tileSize * column, row + tileSize);
  column++;
  if (column * tileSize > width) { // check if the tiles have been drawn past the width of the canvas and reset the variables accordingly
    row = row + tileSize;
    column = 0; // reset column val so the squares are drawn in every new row starting from the left
  }
}
