package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    private SecretKeyGenerationStrategy secretKeyGenerationStrategy;

    public SecretKeyGenerator(final SecretKeyGenerationStrategy secretKeyGenerationStrategy) {
        this.secretKeyGenerationStrategy = secretKeyGenerationStrategy;
    }

    public void setSecretKeyGenerationStrategy(final SecretKeyGenerationStrategy secretKeyGenerationStrategy) {
        this.secretKeyGenerationStrategy = secretKeyGenerationStrategy;
    }

    public SecretKey create() throws NoSuchAlgorithmException {
        return secretKeyGenerationStrategy.generate();
    }
}
