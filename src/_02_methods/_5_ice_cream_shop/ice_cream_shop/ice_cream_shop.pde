/*** When you are done, this program will draw an ice cream cone with 
     scoops of ice cream, sprinkles, and a cherry on top.
***/

void setup(){

     size(500,500);
     
     // Call the makeIceCreamCone() method below to draw the cone for your ice cream

     // Use the addScoop method below to add as many scoops of ice cream as you want
     // Choose a different flavor for each scoop

     // Use the method provided to add some sprinkles to your ice cream

     // Write code to add a cherry to the top of your ice cream. Hint: ellipse

}

/***********  These are methods for you to use. DON'T CHANGE CODE BELOW THIS LINE !!!   *****************/

//Icecream recipe
int SCOOPSIZE = 150;
int scoops = 0;
int coneY = 320;


void makeIceCreamCone(){
     //noStroke();
     fill(188,126,49);
     triangle(190,320,310,300,255,500);
}


void addScoop(String flavor){
     noStroke();
     if(flavor.equalsIgnoreCase("chocolate")){
         fill(116,71,16);
     }
     else if(flavor.equalsIgnoreCase("Strawberry")){
         fill( 232 ,144,129);
     }
     else if(flavor.equalsIgnoreCase("Vanilla")){
         fill(245, 243, 227);
     } else{
         println("ERROR: We don't have the flavor "+ flavor); 
         return;
     }
     ellipse(width/2,coneY - 50 - (SCOOPSIZE*scoops)/2,SCOOPSIZE,SCOOPSIZE);
     scoops++;
}


void addSprinkle(int numberOfSprinkles){
    for(int i = 0; i < numberOfSprinkles; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2-40;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(2,9);
         int sprinkleHeight = (int)random(2,9);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
     }
}
