public class sum_of_evenno {

        public static int evennumber(int start,int end){
            int sum=0;
            for(int i=start;i<=end;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            return sum;
        }
        public static void main(String[] args){
            System.out.println(evennumber(1,10));

        }
    }
