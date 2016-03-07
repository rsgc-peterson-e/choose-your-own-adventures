// Name: Ethan Peterson
int tileSize = 40;
int column = 0;
int y = 0;


void setup() {
  size(480, 680);
}

void draw() {
  fill(randomColor(0, 100));
  rect(column * tileSize, y, tileSize, tileSize);
  column++;
  if (column * tileSize > width) {
    y = y + tileSize;
    column = 0;
  }
}

int randomColor(int c1, int c2) {
  if (random(0, 1) > 0.5) {
    return c1;
  } else if (random(0, 1) < 0.5) {
    return c2;
  } else {
    return 1;
  }
}
