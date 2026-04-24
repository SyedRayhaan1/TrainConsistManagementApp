import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================\n");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ---- ADD (with duplicates intentionally) ----
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds + "\n");

        System.out.println("Total Unique Bogies: " + bogieIds.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}