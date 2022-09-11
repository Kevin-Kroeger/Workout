public class Lyrics {

    public static String printUrl(String pSongname, String pArtist){
        //Großbuchstaben in Kleinbuchstaben umwandlen
        pArtist = pArtist.toLowerCase();
        pSongname = pSongname.toLowerCase();

        //Umwandeln der Leerzeichen in Unterstriche
        pArtist= pArtist.replaceAll(" ", "_");
        pSongname = pSongname.replaceAll(" ", "_");

        //Url
        String url = "http://lyrics.wikia.com/api.php?func=getSong&artist=" + pArtist + "&song=" + pSongname ;
        return url;
    }
}
