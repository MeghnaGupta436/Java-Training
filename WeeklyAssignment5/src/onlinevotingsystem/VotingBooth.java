package onlinevotingsystem;
//imports
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.lang.NumberFormatException;

/**
 * class to handle voting to candidates by different users
 */
class VotingBooth{
    static Scanner scanner = new Scanner(System.in);

    /**
     * method to cast a vote to candidate
     * @param voterId voterId of voter
     * @param candidateCsvPath candidatecsv file path
     * @param avisoftEmployeesCsvPath avisoftEmployees file path
     */
    public static void castVote(String voterId, String candidateCsvPath, String avisoftEmployeesCsvPath) {
        //check if the user is eligible to vote(above18)
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(avisoftEmployeesCsvPath))) {
            String line;
            String dateOfBirth = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(voterId))
                    dateOfBirth = parts[3];
            }
            // Parse the date of birth string into a LocalDate object
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate voterDateOfBirthParsed = LocalDate.parse(dateOfBirth, formatter);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the age of the person
            int age = currentDate.getYear() - voterDateOfBirthParsed.getYear();

            // Check if the person is greater than 18 years old
            if (currentDate.getMonthValue() < voterDateOfBirthParsed.getMonthValue() ||
                    (currentDate.getMonthValue() == voterDateOfBirthParsed.getMonthValue() &&
                            currentDate.getDayOfMonth() < voterDateOfBirthParsed.getDayOfMonth())) {
                age--; // Adjust age if birthday hasn't occurred yet this year
            }

            // Check if the person is greater than 18 years old
            if (age < 18) {
                System.out.println("You are not eligible to vote (under 18)");
                return;
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found while trying to display candidate");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        //display the candidates list with symbols
        displayCandidatesToVote(candidateCsvPath);
        System.out.println("Enter your choice:");
        String selectedCandidateSymbol = scanner.next();
        //add vote in candidateCSV file
        addVoteToCandidateCsv(selectedCandidateSymbol,candidateCsvPath);
        //Update isVoted in avisoftEmployeeCsv
        updateIsVotedInAvisoftEmployees(voterId, avisoftEmployeesCsvPath);
    }

    /**
     * method to display the candidates listed with their symbols
     * @param candidateCsvPath path of candidatecsv file
     */
    public static void displayCandidatesToVote(String candidateCsvPath) {
        System.out.println("Enter a symbol from below to vote: ");
        // Read all lines from the CSV file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(candidateCsvPath))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println(parts[1] + "  " + parts[2] + "----->" + parts[4]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found while trying to display candidate");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * method to add a vote to candidatecsv file
     * @param selectedCandidateSymbol the candidate symbol selected that user wants to vote
     * @param candidateCsvPath path of candidatecsv file
     */
    public static void addVoteToCandidateCsv(String selectedCandidateSymbol, String candidateCsvPath){
        // Read all lines from the CSV file
        List<String[]> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(candidateCsvPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                // If the line corresponds to the candidate we want to edit, update it
                if (parts.length > 0 && parts[4].equals(selectedCandidateSymbol)) {
                    int votes = Integer.parseInt(parts[5]) + 1;
                    parts[5] = String.valueOf(votes);
                    lines.add(parts);
                } else {
                    lines.add(parts);
                }
            }
        }
        catch(NumberFormatException numberFormatException) {
            System.out.println("Invalid input while parsing string to integer.");

        }
        catch(FileNotFoundException fileNotFoundException){
            System.out.println("File not found while trying to add vote to candidate");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the updated contents back to the CSV file
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(candidateCsvPath))) {
            for (String[] parts : lines) {
                String line = String.join(",", parts);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found while trying to add vote to candidate");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * mehthod to update the isVoted property of voter to true
     * @param voterId voterId of voter
     * @param avisoftEmployeesCsvPath avisoftEmployeescsv file path
     */
    public static void updateIsVotedInAvisoftEmployees(String voterId, String avisoftEmployeesCsvPath){
        // Read all lines from the CSV file
        System.out.println(voterId);
        List<String[]> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(avisoftEmployeesCsvPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                // If the line corresponds to the candidate we want to edit, update it
                if (parts.length > 0 && parts[0].equals(voterId)) {
                    parts[4] = "true";
                    lines.add(parts);
                } else {
                    lines.add(parts);
                }
            }
        }
        catch(FileNotFoundException fileNotFoundException){
            System.out.println("File not found while trying to update isVoted");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the updated contents back to the CSV file
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(avisoftEmployeesCsvPath))) {
            for (String[] parts : lines) {
                String line = String.join(",", parts);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found while trying to update isVoted");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Vote casted successfully");
    }
}