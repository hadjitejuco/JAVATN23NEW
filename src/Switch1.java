//switch statement
public class Switch1 {
    public static void main(String[] args) {
        /*
        switch(expression){
            case value1 : 
                // code1
                break;
            case value2 : 
                // code2 
                break;
            case value3 : 
                // code3
                break;
            default:
                default statement     
        }
        */
        
        int day = 9;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("XXX");
        }

    }
}
