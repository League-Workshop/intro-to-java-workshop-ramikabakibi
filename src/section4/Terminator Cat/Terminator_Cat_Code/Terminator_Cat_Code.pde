int acceleration = 5;
PImage catPic;
int xleft = 214;
int xright = 106;
int x= 287;
int y = 126;

void setup(){
 size(500,333); 
 catPic = loadImage("cat.jpg");
background(catPic);
}

void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
noStroke();
ellipse(xleft,xright,45,50);
fill(#FC0341);
ellipse(x,y,45,50);
if(x>width){
  background(catPic);
  xleft = 214;
 xright = 106;
 x= 287;
    y = 126;
 acceleration = 9;
}
}
void keyPressed() {
  xleft+=2*acceleration;
  xright+=2*acceleration;
  x+=2*acceleration;
  y+=2*acceleration;
  
}