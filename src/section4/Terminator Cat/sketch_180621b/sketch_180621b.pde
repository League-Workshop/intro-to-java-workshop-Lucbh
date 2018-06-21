PImage catPic;
int leftEyeX = 446;
int leftEyeY = 564;
int acceleration = 1;

void setup() {
  
  
  size(1000,1000);
   catPic = loadImage("catwithbigeyes.jpg");
  catPic.resize(width, height);
  background(catPic);

  
}



void draw() {
  
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

   fill(255,0,0);
   noStroke();
   ellipse(leftEyeX, leftEyeY, 40, 40);
    ellipse(leftEyeX+195, leftEyeY-20, 40, 40);
   
   
   if ( leftEyeX >= width) {
     
     background(catPic);
     leftEyeX = 446;
     leftEyeY = 564;
     acceleration = 1;
   }
   
}
  
void keyPressed() {
    
  leftEyeX += 2*acceleration;
  leftEyeY += 2*acceleration;

    acceleration+=1;
    
  }