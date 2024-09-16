public class University{
private String u_name;

public void setUniversityName(String Uname){
u_name = Uname;
}

Campus c1;
Campus c2;
University(Campus c1, Campus c2){
this.c1 = c1;
this.c2 = c2;
}

public void details(){
System.out.println("University name is "+ u_name);
c1.display();
c2.display();


}
}