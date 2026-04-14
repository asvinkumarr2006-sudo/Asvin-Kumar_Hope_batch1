import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file content: ");
        String data = sc.nextLine();

        FileHandler fh = new FileHandler();
        Security sec = new Security();
        Transfer transfer = new Transfer();
        Receiver receiver = new Receiver();

        List<String> chunks = fh.splitFile(data, 4);

        List<String> encrypted = transfer.send(chunks, sec);

        String output = receiver.receive(encrypted, sec);

        System.out.println("Received File: " + output);
    }
}
