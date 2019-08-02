public class ServerNameGenerator {
    private String[] adjs = {"anxious","remarkable","guilty","strong","pleasant","broken","exciting","unable","different","dangerous"};
    private String[] nouns = {"celery","salmon","cardboard","broccoli","biosphere","tamale","asparagus","zebra","banana","anchovy"};
    public String randomString (String[] array) {
        return array[(int) Math.floor(Math.random())*array.length];
    }

    public static String nameGen(String[] array) {
        int sng = (int) Math.floor(Math.random()*array.length);
        return array[sng];
    }



    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        for (int i = 0; i < 10; i++)
        System.out.printf("%s-%s\n", nameGen(sng.adjs), nameGen(sng.nouns));
    }
}
