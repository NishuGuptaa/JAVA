import java.util.*;

public class a19ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> List2 = new ArrayList<>();

        // // O(1) T.C.
        // list.add(10);
        // list.add(20);
        // list.add(90);
        // list.add(200);
        // list.add(760);
        // System.out.println(list);
        // System.out.println(list.size());

        // for(int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // // O(n)
        // list.add(1, 300);
        // System.out.println(list);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        list.remove(1); // O(n)
        list.remove(list.size() - 1); // last index O(1)
        System.out.println(list);

        for(int val : list){
            System.out.println(val);
        }
    }
}
