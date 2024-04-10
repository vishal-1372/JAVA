import java.io.*;
import java.util.*;

class First {
    Scanner sc = new Scanner(System.in);

    First() {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Create File");
            System.out.println("2. File Name");
            System.out.println("3. File Path");
            System.out.println("4. Check if File can be Read");
            System.out.println("5. Check if File can be Written");
            System.out.println("6. Write to File");
            System.out.println("7. Read from File");
            System.out.println("8. Rename File");
            System.out.println("9. Delete File");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createFile();
                    break;
                case 2:
                    getFileName();
                    break;
                case 3:
                    getFilePath();
                    break;
                case 4:
                    checkIfFileCanRead();
                    break;
                case 5:
                    checkIfFileCanWrite();
                    break;
                case 6:
                    writeFile();
                    break;
                case 7:
                    readFile();
                    break;
                case 8:
                    renameFile();
                    break;
                case 9:
                    deleteFile();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);
        sc.close();
    }

    private void createFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        try {
            if (file.createNewFile())
                System.out.println("File created successfully.");
            else
                System.out.println("File already exists.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private void getFileName() {
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();
        File file = new File(filePath);
        System.out.println("File name: " + file.getName());
    }

    private void getFilePath() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println("File path: " + file.getAbsolutePath());
    }

    private void checkIfFileCanRead() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println(file.canRead() ? "File can be read." : "File cannot be read.");
    }

    private void checkIfFileCanWrite() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println(file.canWrite() ? "File can be written to." : "File cannot be written to.");
    }

    private void writeFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.print("Enter content to write: ");
            String content = sc.nextLine();
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void readFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            System.out.println("File content:");
            while ((character = reader.read()) != -1)
                System.out.print((char) character);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void renameFile() {
        System.out.print("Enter current file name: ");
        String currentFileName = sc.nextLine();
        System.out.print("Enter new file name: ");
        String newFileName = sc.nextLine();
        File file = new File(currentFileName);
        System.out.println(file.renameTo(new File(newFileName)) ? "File renamed successfully." :
                "Failed to rename the file. Check if the file exists.");
    }

    private void deleteFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.delete())
            System.out.println("File deleted successfully.");
        else
            System.out.println("Failed to delete the file. Check if the file exists.");
    }
}

public class MenuD {
    public static void main(String[] args) {
        new First();
    }
}
