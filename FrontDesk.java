public class FrontDesk {
    public void requestValet(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.performService(); 
    }

    public void requestHouseKeeping(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.performService();
    }

    public void requestCart(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.performService();  
    }
}
