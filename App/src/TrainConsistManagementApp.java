import java.util.LinkedList;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC4 - Maintain Train Bogie Order");
        System.out.println("========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ---- ADD bogies ----
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train + "\n");

        // ---- INSERT in middle ----
        train.add(2, "Pantry Car");

        System.out.println("After Adding Pantry Car at position 2:");
        System.out.println(train + "\n");

        // ---- REMOVE first and last ----
        train.removeFirst();
        train.removeLast();

        System.out.println("After Removing First and Last Bogies:");
        System.out.println(train + "\n");

        // Final Output
        System.out.println("Final Train Consist:");
        System.out.println(train);

        System.out.println("\nUC4 operations completed successfully...");
    }
}