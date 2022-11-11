import javax.swing.JOptionPane;

public class uklArray {

    public static void main(String[] args) {
        String Input;
        Input = JOptionPane.showInputDialog(null, "Masukkan nama anda");

        String nama[][] = {
                { "Hanif", "2409117", "X RPL 4" },
                { "Bagas", "9876982", "X TKJ 2" },
                { "Celine", "1176542", "X TKJ 4" },
                { "Ubay", "9544421", "X RPL 1" },
                { "Qila", "7612253", "X RPL 3" },
                { "Mika", "6254782", "X RPL 6" },
        };
        boolean terdaftar = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (Input.equalsIgnoreCase(nama[i][j])) {
                    JOptionPane.showMessageDialog(null, "Nama anda: " + nama[i][0] + "\n" + "Nisn anda: " + nama[i][1]
                            + "\n" + "Kelas anda: " + nama[i][2]);
                    terdaftar = true;
                }
            }
        }

        if (terdaftar == false) {
            JOptionPane.showMessageDialog(null, "Mohon maaf nama anda tidak terdaftar");
        }
    }
}
