PImage rainbow;
    PImage unicorn;
void setup(){
rainbow = loadImage("Rainbow.png");
   size(800, 600);
   rainbow.resize(width,height);
  unicorn = loadImage("unicorn.jpg");
   unicorn.resize(250,250);
}

void draw(){
background(rainbow);
image(unicorn, mouseX, mouseY);  
}