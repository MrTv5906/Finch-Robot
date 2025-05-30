int right = bird.getLine("R");
  int left = bird.getLine("L");
while(true){
 bird.setBeak(0,100,0);
  bird.setMotors(2,2);
  if(right <= 90 && left<=90){
    bird.setBeak(0,0,100);
    bird.setMotors(0,0);
  }
  else if(right <= 90){
   bird.setBeak(100,0,0);
   bird.setMotors(4,2);
 }
  else{
    bird.setBeak(0,100,100);
    bird.setMotors(2,4);
  }
  
}
