int xPos = 500;
int yPos = 500;

int xDirection = 5;
int yDirection = 3;


void setup() {
  size(1000,1000);
  
  
}


void draw() {
  move();
  
  background(100);
  
  fill(255,0,0);
  rect(800,mouseY,100,200);
  
  
  fill(0,0,255);
  ellipse(xPos,yPos,100,100);
  
}


void move() {
  
  xPos = xPos + xDirection;
  
  yPos = yPos + yDirection;
  
  
  if (xPos == 950 || xPos == 50) {
    xDirection = xDirection*-1;
  }
  
   if (yPos == 950 || yPos == 50) {
    yDirection = yDirection*-1;
  }
  
  
  
}