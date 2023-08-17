PImage img;

void setup{
    size(700,700, P3D);
    img = loadImage("data/textura.jpg");
    img.resize(700,700);
}

void draw{
    background(#221F20);
}