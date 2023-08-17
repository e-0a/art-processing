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
    sphereDetail(3);
    push();
    translate(width/2, height/2);
    for(int x = 0; x < tiles; x++){
    for(int y = 0; y < tiles; y++){
      
    color c = img.get(int(x * tileSize), int(y * tileSize));
    float b = map(brightness(c), 0, 255, 1, 0);
      
    float z = map(b, 0, 1, -100, 100);
      
    push();
    translate(x * tileSize - width/2, y * tileSize - height/2, z);
    rotateY(width/2);
    sphere(tileSize * b * 0.8);
    pop();
      
    }
  }
  
  pop();
}
