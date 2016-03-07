// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int row = 0;


void setup() {
  size(480, 680);
}

void draw() {
  fill(randomColor(0, 160));
  rect(column * tileSize, row, tileSize, tileSize);
  column++;
  if (column * tileSize > width) {
    row = row + tileSize;
    column = 0; // reset column val so the squares are drawn in every new row starting from the left
  }
}

int randomColor(int c1, int c2) { //returns one or the other grayscale color the user inputted
  if (random(0, 1) > 0.5) {
    return c1;
  } else if (random(0, 1) < 0.5) {
    return c2;
  }
  return 0; // return the color black if the above conditionals are false
}
