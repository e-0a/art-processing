PImage img;

void setup{
    size(700,700, P3D);
    img = loadImage("data/textura.jpg");
    img.resize(700,700);
}

void draw{
    background(#221F20);
    fill(255);
    noStroke();

      float tiles = mouseX/2;
        float tileSize = width/tiles;
}