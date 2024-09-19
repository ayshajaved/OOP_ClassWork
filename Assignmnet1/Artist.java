//Art Gallery Program
public class Artist{
	private String artistName;   //Fullname of artist

//Default Constructor
Artist(){
	artistName = "AyeshaJaved";
}

//getter 
public String getArtistname(){
return this.artistName;
}

public void setArtistname(String n){
this.artistName = n;

}

//Method to display the Artist Information
public void displayArtistinfo(){
System.out.println(getArtistname()+" is the wellknown Artist!");
}
}