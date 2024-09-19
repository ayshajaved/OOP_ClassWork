public class Driver{
	public static void main(String []args){
Artist a1 = new Artist();
a1.displayArtistinfo();
ArtWork artwork1 = new ArtWork("Ayat-ul-kursi", 2000, a1);
artwork1.displayArtWork();
Artwork artwork2 = new ArtWork("Natural mountain Sceenery", 2010);
artwork2.displayArtWork();

//deep copying artwork
ArtWork artwork3 = new ArtWork(artwork1);
artwork3.displayArtWork();

//shallow copying artwork
ArtWork artwork4 = artwork1;
artwork4.displayArtWork();

a1.setArtistname("Maheen fatima");
artwork1.displayArtWork();
artwork2.displayArtWork();
artwork3.displayArtWork();





}
	











}