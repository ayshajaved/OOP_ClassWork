public class Department{
private String name;
private String hod;
//parametrized constructor
Department(String name, String hod){
this.name = name;
this.hod = hod;
}
String getName(){
return name;
}
String getHod(){
return hod;
}
void setName(String n){
this.name= n;
}
void setHod(String h){
this.hod =  h;
}
}