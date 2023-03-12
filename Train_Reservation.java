
import java.util.*;
// MileStone 1
public class Train_Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> Train = new ArrayList<>();
        ArrayList<String> Coach = new ArrayList<>();
        while (n-- > 0) {
            String s1 = sc.next();
            s1 += sc.nextLine();
            String s2 = sc.nextLine();
            Train.add(s1);
            Coach.add(s2);
        }
        int count = 100000001;
        while (true) {
            String user[] = new String[5];
            for (int i = 0; i < user.length; i++) {
                user[i] = sc.next();
            }
            int c=0;
            
            
            for (int i = 0; i < Train.size(); i++) {
                String train[] = Train.get(i).split(" ");
                int index = 0;
                String start = "";
                for (int j = 0; j < train[1].length(); j++) {
                    if (train[1].charAt(j) == '-') {
                        index = j;
                        break;
                    }
                }
                start = train[1].substring(0, index);
                String destination = "";
                index = 0;
                for (int j = 0; j < train[2].length(); j++) {
                    if (train[2].charAt(j) == '-') {
                        index = j;
                        break;
                    }
                }
                destination = train[2].substring(0, index);
                int price = 0;
                for (int j = 0; j < train[2].length(); j++) {
                    if (train[2].charAt(j) == '-') {
                        index = j;
                        break;
                    }
                }
                int Cost = 0;
                price = Integer.parseInt(train[2].substring(index + 1));
                int flag = 0;
                if (user[0].equals(start) && user[1].equals(destination)) {
                    if (user[3].equals("SL")) {
                        flag = 1;
                        Cost = 1 * price * Integer.parseInt(user[4]);
                    } else if (user[3].equals("3A")) {
                        flag = 1;
                        Cost = 2 * price * Integer.parseInt(user[4]);
                    } else if (user[3].equals("2A")) {
                        flag = 1;
                        Cost = 3 * price * Integer.parseInt(user[4]);
                    } else if (user[3].equals("1A")) {
                        
                        flag = 1;
                        Cost = 4 * price * Integer.parseInt(user[4]);
                    }
                }
                else{
                    c++;
                } 
               
                if(c==Train.size()){
                    System.out.println("No Trains Available");
                }
                if (flag == 1) {
                    System.out.println(count + " " + Cost);
                    count++;
                }
            }
            
        }
        
    }
}
