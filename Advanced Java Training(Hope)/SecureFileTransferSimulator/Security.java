public class Security {

    public String encrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    public String decrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }
}
