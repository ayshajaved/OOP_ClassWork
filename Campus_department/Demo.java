public class Demo{
public static void main(String args[]){

Department d1 = new Department("Computer science", "Sir Ali");
Department d2 = new Department("Software engineering", "Mam Ayesha");
Department d3 = new Department("Physics", "Sir hassan");
Department d4 = new Department("Biology", "Mam maheen");
Campus c1 = new Campus(d1,d2);
Campus c2 = new Campus(d3,d4);
University u = new University(c1, c2);
u.setUniversityName("Comsats");
u.details();
}
}