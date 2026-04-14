import java.util.*;

public class Receiver {

    public String receive(List<String> encryptedChunks, Security sec) {
        StringBuilder result = new StringBuilder();

        Iterator<String> it = encryptedChunks.iterator();

        while (it.hasNext()) {
            String encrypted = it.next();
            String decrypted = sec.decrypt(encrypted);

            result.append(decrypted);
        }

        return result.toString();
    }
}
