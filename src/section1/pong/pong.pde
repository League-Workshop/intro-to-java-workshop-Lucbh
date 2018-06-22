int xPos = 500;
int yPos = 500;

int xDirection = 5;
int yDirection = 3;

int px = 800;



void setup() {
  size(1000,1000);
  
  
}


void draw() {
  move();
  
  background(100);
  
  fill(255,0,0);
  rect(px,mouseY,50,200);
  
  
  fill(0,0,255);
  ellipse(xPos,yPos,100,100);
  
  
  if (xPos + 50 > px && yPos > mouseY && yPos < mouseY + 200) {
    
    xDirection = xDirection*-1;
    
  }
  
  if (yPos + 50 > mouseY + 200 && yPos + 50 < mouseY + 200 && yPos + 50 > xPos && yPos + 50 < yPos + 50) {
    
    yDirection = yDirection*-1;
    
  }
  
  
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