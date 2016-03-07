// Name: Ethan Peterson
int tileSize = 40;
int column = 0;

void setup() {
  size(400, 400);
}

void draw() {
  rect(column * tileSize, 0, tileSize, tileSize);

  column++;
}
