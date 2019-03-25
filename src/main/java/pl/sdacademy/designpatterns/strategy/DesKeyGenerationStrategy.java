package pl.sdacademy.designpatterns.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class DesKeyGenerationStrategy implements SecretKeyGenerationStrategy {

    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        final KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        return keyGenerator.generateKey();
    }
}
