




import java.util.*;

public class Train_Reservation {

    public static int calculatingCost(String train[], String user[]) {

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int train = sc.nextInt();
//        int t = train;
//        String trains[] = new String[3];
//        String coach[] = new String[6];
//        while (train-- > 0) {
//            for (int i = 0; i < trains.length; i++) {
//                trains[i] = sc.next();
//            }
//            for (int i = 0; i < coach.length; i++) {
//                coach[i] = sc.next();
//            }
//            int enterdata = sc.nextInt();
//            int count = 100000001;
//
//            while (enterdata-- > 0) {
//                String user[] = new String[5];
//                for(int i=0;i<user.length;i++){
//                    user[i]=sc.next();
//                }
//
//                int cost=Integer.parseInt(user[4]);
//                if(user[3]=="SL"){
//                    cost=cost*6;
//                }
//            }
//        }
        int trains = 2;
        String train1[] = {"17726", "Rajkot-0", "Mumbai-750"};
        String coach1[] = {"17726", "S1-72", "B1-72", "A1-48", "H-24"};
        String train2[] = {"37392", "Ahemdabad-0", "Surat-750"};
        String coach2[] = {"37392", "S1-15", "S2-20", "S3-50", "B1-36", "B2-48"};

        int enterdata = sc.nextInt();
        int count = 100000001;
        while (enterdata-- > 0) {
            String user[] = new String[5];
            for (int i = 0; i < 5; i++) {
                user[i] = sc.next();
            }
//          checking data for train 1 start point

            String t1 = "";
            int index1 = 0;
            for (int i = train1[1].length() - 1; i >= 0; i--) {
                if (train1[1].charAt(i) == '-') {
                    index1 = i;
                    break;
                }
            }
            t1 = train1[1].substring(0, index1);

//            checking for data train 1 destination point
            String t3 = "";
            index1 = 0;
            for (int i = 0; i < train1[2].length(); i++) {
                if (train1[2].charAt(i) == '-') {
                    index1 = i;
                    break;
                }
            }
            t3 = train1[2].substring(0, index1);
            int c3=Integer.parseInt(train1[2].substring(index1+1));
//            checking for data train 2 stating point
            String t2 = "";
            index1=0;
            for(int i=0;i<train2[1].length();i++){
                if(train2[1].charAt(i)=='-'){
                    index1=i;
                    break;
                }
            }
            t2 = train2[1].substring(0, index1);

//            checking for data train 2 destination point

            String t4 = "";
            index1 = 0;
            for (int i = 0; i < train2[2].length(); i++) {
                if (train2[2].charAt(i) == '-') {
                    index1 = i;
                    break;
                }
            }
            t4 = train2[2].substring(0, index1);
            int c4=Integer.parseInt(train2[2].substring(index1+1));
            int totalCost=0;
            int flag=0;
            if(t1.equals(user[0])){
                    if(t3.equals(user[1])){
                        if("SL".equals(user[3])){
                            totalCost = c3 * 1 * Integer.parseInt(user[4]);
                        }
                        else if("3A".equals(user[3])){
                            totalCost = c3 * 2 * Integer.parseInt(user[4]);
                        }
                        else if("2A".equals(user[3])){
                            totalCost = c3 * 3 * Integer.parseInt(user[4]);
                        }
                        else if("1A".equals(user[3])) {
                            totalCost = c3 * 4 * Integer.parseInt(user[4]);
                        }
                    }
                    else{
                        flag=1;
                        count--;
                        System.out.println("No Train Availabes");
                    }
            }
            else if(t2.equals(user[0])){
                    if(t2.equals(user[1])){
                        if("SL".equals(user[3])){
                            totalCost = c4 * 1 * Integer.parseInt(user[4]);
                        }
                        else if("3A".equals(user[3])){
                            totalCost = c4 * 2 * Integer.parseInt(user[4]);
                        }
                        else if("2A".equals(user[3])){
                            totalCost = c4 * 3 * Integer.parseInt(user[4]);
                        }
                        else if("1A".equals(user[3])) {
                            totalCost = c4 * 4 * Integer.parseInt(user[4]);
                        }
                    }
                    else{
                        flag=1;
                        count--;
                        System.out.println("No Train Availabes");
                    }
            }
            else{
                flag=1;
                count--;
                System.out.println("No Train Availabes");
            }
            if(flag==0){
                System.out.println(count+" "+totalCost);
            }

            count++;
        }
    }
}
