package classTest;

public class Bus {

    private int busNumber;
    private int passenger;
    private int income;
    private int cost = 1000;

    public int getCost() {
        return cost;
    }

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void printBusInfo() {
        System.out.println(busNumber + "번 버스");
        System.out.println("현재 승객 수: " + passenger);
        System.out.println("총 수익: " + income);
        System.out.println();
    }

    public void takeStudent() {
        passenger += 1;
        income += cost;
    }

    public void takeOffStudent() {
        passenger -= 1;
    }
}
