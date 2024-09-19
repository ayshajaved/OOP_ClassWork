public class Driver {
    public static void main(String[] args) {
        Artist a1 = new Artist();
        a1.displayArtistinfo();
        // Create artwork objects
        ArtWork artwork1 = new ArtWork("Ayat-ul-Kursi", 2000, a1);
        artwork1.displayArtWork();
        System.out.println();
        ArtWork artwork2 = new ArtWork("Natural mountain Scenery", 2010);
        artwork2.displayArtWork();
        System.out.println();
        // Deep copying artwork
        ArtWork artwork3 = new ArtWork(artwork1);
        artwork3.displayArtWork();
        System.out.println();        
        // Shallow copying artwork
        ArtWork artwork4 = artwork1;
        artwork4.displayArtWork();
        System.out.println();
        // Modify artist's name and see changes
        a1.setArtistname("Maheen Fatima");
        System.out.println("Printing changed Artist Artwork!");
        artwork1.displayArtWork();
        System.out.println("--------------------");
        artwork2.displayArtWork();
        System.out.println("--------------------");
        artwork3.displayArtWork();
        System.out.println("--------------------");

    }
}