public class HotelApp {
    public static void main(String[] args) {
        FrontDesk FD = new FrontDesk();

        FD.requestValet("NEU 0215");

        FD.requestHouseKeeping(143);

        FD.requestCart(3);
    }
}

