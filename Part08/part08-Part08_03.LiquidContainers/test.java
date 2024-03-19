
import java.util.Scanner;

class LiquidContainers {
    int[] container= new int[2];

    LiquidContainers(){
        this.container[0]= 0;
        this.container[1]= 0;
    }

    public String toString(){
        return "First: "+ this.container[0]+ "/"+ "100"+ "\n"+ "Second: "+ this.container[1]+ "/"+ "100";
    }

    int[] add(String str){
        int liquid= Integer.valueOf(str);

        if(liquid> 0){
            this.container[0]+= liquid;
            if(this.container[0]> 100){
                this.container[0]= 100;
            }
        }
        return container;
    }

    int[] move(String str){
        int liquid= Integer.valueOf(str);

        if(liquid> 0){
            int diff= this.container[0]- liquid;

            if(diff< 0){
                this.container[1]+= this.container[0];
                this.container[0]= 0;            
            }
            else{
                this.container[1]+= liquid;
                this.container[0]= diff;
            }

            // remove excessive water from container 2:
            if(this.container[1]> 100){
                this.container[1]= 100;
            }
        }

        return container;
    }

    int[] remove(String str){
        int liquid= Integer.valueOf(str);

        if(liquid> 0){
            int diff= this.container[1]- liquid;

            this.container[1]= (diff> 0)? diff: 0;
        }

        return container;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainers lc= new LiquidContainers();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }  
            
        }
        scan.close();
    }
}
