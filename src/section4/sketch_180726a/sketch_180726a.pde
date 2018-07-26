PImage catPic;
void setup(){
size( 907,  510);

}
void draw(){
  catPic = loadImage("cat.jpg");
        catPic.resize(width,
        height);
        background(catPic);
  
    if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#FF0000);
  ellipse(641, 233, 40, 40);
  ellipse(504, 227, 40, 40);
 
  
  
  
  
  
}