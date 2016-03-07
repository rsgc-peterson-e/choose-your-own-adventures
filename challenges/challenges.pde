// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int row = 0;


void setup() {
  size(480, 680);
}

void draw() {
  line(column * tileSize, row, tileSize * column + tileSize, row + tileSize);
  column++;
  if (column * tileSize > width) {
    row = row + tileSize;
    column = 0; // reset column val so the squares are drawn in every new row starting from the left
  }
}
