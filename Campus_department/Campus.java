public class Campus{
Department cs;
Department se;

//parametrized constructor
Campus(Department d1, Department d2){
cs = d1;
se = d2;
}
public void display(){
	System.out.println("Department1\n"+"department name is: "+ cs.getName()+"\nThe hod is: "+ cs.getHod());

	System.out.println("Department2\n"+"department name is: "+ se.getName()+"\nThe hod is: "+ se.getHod());

} 








}