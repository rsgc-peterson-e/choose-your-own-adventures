// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int y = 0;

void setup() {
  size(400, 400);
}

void draw() {
  rect(column * tileSize, y, tileSize, tileSize);
  column++;
  if (column * tileSize > width) {
    y = y + tileSize;
    column = 0;
  }
}
