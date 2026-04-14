import java.util.*;

public class FileHandler {

    public List<String> splitFile(String data, int size) {
        List<String> chunks = new ArrayList<>();

        for (int i = 0; i < data.length(); i += size) {
            chunks.add(data.substring(i, Math.min(i + size, data.length())));
        }

        return chunks;
    }
}
