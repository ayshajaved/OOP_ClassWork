public class Demo{
public static void main(String args[]){

Department d1 = new Department("Computer science", "Sir Ali");
Department d2 = new Department("Software engineering", "Mam Ayesha");
Campus c1 = new Campus(d1,d2);
c1.display();
d1.setHod("Mam Maheen");
c1.display();






}








}