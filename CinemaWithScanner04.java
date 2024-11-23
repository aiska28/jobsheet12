import java.util.Scanner;

public class CinemaWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String [] [] audience = new String[4] [];
        // int column = 0;
        // int row = 0;
        // String name;
        // String next;
        
        // while (true) {
        //     System.out.print("Enter a name: ");
        //     name = sc.nextLine();
        //     System.out.print("Enter row number: ");
        //     row = sc.nextInt();
        //     System.out.print("Enter column number: ");
        //     column = sc.nextInt();
        //     sc.nextLine();
            
        //     //audience[row - 1][column - 1] = name;
        //     System.out.print("Are there any other audiences to be added? (y/n): ");
        //     next = sc.nextLine();
            
        //     if (next.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }
         
        System.out.println("---------MODIF--------");

        String[][] audience = new String[4][4];
        int column = 0;
        int row = 0;
        String name;
        String next;
        int choice = 0; 
        
        
        while (choice != 3) {
            System.out.println("\nMenu:");
            
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        sc.nextLine();
        
                    if (row < 1 || row > 4 || column < 1 || column > 4) {
                        System.out.println("Invalid row or column number. Please enter values between 1 and 4.");
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        if (row < 1 || row > 5 || column < 1 || column > 5) {
                            audience[row - 1][column - 1] = name;
                            System.out.println("your booking is successful, please make payment.");
                        } else if (row < 1 || row > 4 || column < 1 || column > 4) {
                            System.out.println("Invalid row or column number. Please enter values between 1 and 4.");
                        }
                        break;
                        //continue;
                    }

                    audience[row - 1][column - 1] = name;
                    
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = sc.nextLine();
                    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
    
                case 2:
                    System.out.println("\nAudience List:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (audience[i][j] != null) {
                                System.out.print(audience[i][j] + "\t");
                            } else {
                                System.out.print("***\t");
                            }
                        }
                        System.out.println();
                    }
                    break;   
                case 3: 
                System.out.println("Exiting program...");
                    break;
            
                default:
                System.out.println("Invalid choice. Please try again.");
                    break;
            } 
        }
    }
}