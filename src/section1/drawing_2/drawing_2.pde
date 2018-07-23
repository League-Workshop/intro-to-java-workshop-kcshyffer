PImage rainbow;
  PImage unicorn;
void setup(){

  rainbow = loadImage("rainbow.jpg");

size(1000, 1000);

rainbow.resize(width,height);
background(rainbow);
unicorn = loadImage("unicorn.png");
unicorn.resize(100,100);
  
}
void draw(){
  background(rainbow);

  image(unicorn, mouseX,mouseY);
  
}