import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC5 - Preserve Order with Unique Bogies");
        System.out.println("========================================\n");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // ---- ADD bogies ----
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // ---- ADD duplicate ----
        train.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation (No duplicates, Order preserved):");
        System.out.println(train);

        System.out.println("\nUC5 operations completed successfully...");
    }
}