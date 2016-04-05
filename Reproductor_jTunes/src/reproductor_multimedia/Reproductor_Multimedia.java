package reproductor_multimedia;

public class Reproductor_Multimedia {

    public static void main(String[] args) {
        Login_Screen login_Screen = new Login_Screen();
        login_Screen.setVisible(true);

        Reproductor_Jtunes reproductor_Jtunes = new Reproductor_Jtunes();
        reproductor_Jtunes.setVisible(true);
    }
}
