public class HanoiTower {
    static void hanoiTower(int n, char from_rod, char end_rod, char aux_rod){
        if(n==1){
            System.out.println("Move disk 1 from rod" + from_rod + "to rod" + end_rod);
        }
        hanoiTower(n-1,from_rod, aux_rod,end_rod);
        System.out.println("Move disk" + n + " to rod " + end_rod + " from rod "+ from_rod);
        hanoiTower(n-1, aux_rod, end_rod, from_rod);


    }
    public static void main(String args[])
    {
        int n = 4; // Number of disks
        hanoiTower(n, 'A', 'C', 'B');
    }
}
