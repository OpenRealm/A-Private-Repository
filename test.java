class Entree {
    public void entre(String entree1, String entree2, String entree3, int entree1p, int entree2p, int entree3p) {
        System.out.println(" ENTREES :\n\n  " + entree1 + " : " + entree1p + "$.\n  " + entree2 + " : " + entree2p + "$.\n  " + entree3 + " : " + entree3p + "$.\n");
    }
}
public class Menu extends Entree {
    public void plats(String plat1, String plat2, String plat3, int plat1p, int plat2p, int plat3p) {
        System.out.println(" PLATS :\n\n  " + plat1 + " : " + plat1p + "$.\n  " + plat2 + " : " + plat2p + "$.\n  " + plat3 + " : " + plat3p + "$.\n");
    }
    public void desserts(String des1, String des2, String des3, int des1p, int des2p, int des3p) {
        System.out.println(" DESSERTS :\n\n  " + des1 + " : " + des1p + "$.\n  " + des2 + " : " + des2p + "$.\n  " + des3 + " : " + des3p + "$.\n");
    }
    public static void main(String[] args) {
        System.out.println("MENU :\n");
        Menu entree = new Menu();
        entree.entre("Salade", "Charcuterie", "Apero", 3, 5, 11);
        Menu platss = new Menu();
        platss.plats("Pizza", "Burger", "Pates", 12, 13, 11);
        Menu dessert = new Menu();
        dessert.desserts("Tiramisu", "Gateau", "Glace", 5, 6, 4);
    }
}
