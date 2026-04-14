import java.util.*;

public class Transfer {

    public List<String> send(List<String> chunks, Security sec) {
        List<String> encryptedChunks = new ArrayList<>();

        Iterator<String> it = chunks.iterator();

        while (it.hasNext()) {
            String chunk = it.next();
            String encrypted = sec.encrypt(chunk);
            encryptedChunks.add(encrypted);

            System.out.println("Sending: " + encrypted);
        }

        return encryptedChunks;
    }
}
