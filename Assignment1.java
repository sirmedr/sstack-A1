import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many lines you want: ");
        int getNum = scan.nextInt();
        menu();
        int getOption = scan.nextInt();
        switch(getOption){
            case 1:
                System.out.println("Right Triangle");
                rTri(getNum);
                break;
            case 2:
                System.out.println("Inverted Right Triangle");
                iRTri(getNum);
                break;
            case 3:
                System.out.println("Symmetrical Triangle");
                sTri(getNum);
                break;
            case 4:
                System.out.println("Inverted Symmetrical Triangle");
                iSTri(getNum);
                break;
            default:
                System.out.println("Wrong selection");
        }
    }
    public static void rTri(int getNum){
        String output="";
        for(int i = 0;i<getNum;i++){
            output = "-"+output;
            System.out.println(output);
        }
    }
    public static void iRTri(int getNum){
        String output="";
        for(int i = getNum;i>=0;i--){
            if(i>0)
                output = "-"+output;
            else{
                System.out.println(output);
                getNum--;
                i = getNum+1;
                output = "";
            }
        }
    }
    public static void sTri(int getNum){
        String output="-";
        for(int i = 0;i<getNum;i++){
           for(int j = 0;j<getNum-i;j++)
               System.out.print(" ");
            if(i!=0)
                output = "--"+output;
            System.out.println(output);
        }
    }
    public static void iSTri(int getNum){
        String output = "-";
        int line = getNum;
        for(int k=0;k<getNum;k++){
            for(int i = 0; i<line;i++){
                if(i!=0)
                    output="--"+output;
            }
            for(int j = line;j<getNum;j++)
            {
                System.out.print(" ");
            }
        System.out.println(output);
        output="-";
        line--;
        }
    }
    public static void menu()
    {
        System.out.println("Choose an option\n1. Right Triangle\n"
                + "2. Inverted Right Triangle\n3. Symmetrical Triangle\n"
                + "4. Inverted Symmetrical Triangle");
    }
}
