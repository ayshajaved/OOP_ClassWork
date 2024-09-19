public class ArtWork{

//Instance Attributes
private String artWorkTitle;
private int yearOfArtWork;

//composition
private Artist artist;
	//constructor overloading
public ArtWork(String title, int year, Artist artist){
this.artWorkTitle = title;
this.yearOfArtWork = year;
this.artist = artist;
}

public ArtWork(String title, int year){
this.artWorkTitle = title;
this.yearOfArtWork = year;
artist = new Artist();
}
//copy constructor
ArtWork(ArtWork art){
    this.artWorkTitle = art.getArtWorkTitle(); // Correct logic
    this.yearOfArtWork = art.getArtWorkYear();
    this.artist = new Artist();  // Deep copy of the artist
    this.artist.setArtistname(art.getArtist()); // Copy artist's name
}

//getters
public String getArtWorkTitle(){
	return artWorkTitle;
}

public int getArtWorkYear(){
return yearOfArtWork;
}

public String getArtist(){
return artist.getArtistname();
}
public void displayArtWork(){
System.out.println("The ArtWork is: "+getArtWorkTitle()+"\n"+"It is made in year: "+getArtWorkYear()+"\n"+"This Masterpiece is made by: "+getArtist());
}
}
