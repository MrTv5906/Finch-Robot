int right = bird.getLine("R");
  int left = bird.getLine("L");
while(true){
 bird.setBeak(0,100,0);
  bird.setMotors(1,1);
  if(right <= 10){
   bird.setBeak(100,0,0);
   bird.setMotors(2,1);
 }
  if(left<=10){
    bird.setBeak(0,100,100);
    bird.setMotors(1,2);
  }
}
