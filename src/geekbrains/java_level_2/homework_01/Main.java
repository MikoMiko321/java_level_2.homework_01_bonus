package geekbrains.java_level_2.homework_01;

public class Main {

    public static void main(String[] args) {
	String myString = new String("rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj\n" +
            "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup\n" +
            "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz\n" +
            "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox\n" +
            "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf\n" +
            "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx\n" +
            "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz\n" +
            "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv\n" +
            "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c\n");
	int lineCounter = 0;
	int vowelCounter = 0;
	for(int i=0;i<myString.length();i++){
        System.out.print(myString.charAt(i));
	    if (myString.charAt(i)!='\n'){
            if (myString.charAt(i)=='a' || myString.charAt(i)=='i' || myString.charAt(i)=='u' || myString.charAt(i)=='e' || myString.charAt(i)=='o'){
                vowelCounter++;
            }
        } else {
            System.out.println("Number of vowels in line "+lineCounter+": "+vowelCounter);
            lineCounter++;
            vowelCounter=0;
        }
    }
    }
}
