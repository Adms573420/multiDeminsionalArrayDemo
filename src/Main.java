public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[4][3];

        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Balikesir";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Nigde";
        sehirler[2][0] = "Diyarbakir";
        sehirler[2][1] = "Sanliurfa";
        sehirler[2][2] = "Gaziantep";
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
