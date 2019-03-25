package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class StrategyDemo {

    public static void main(final String[] args) throws NoSuchAlgorithmException {

        SecretKeyGenerationStrategy generationStrategy = new AesKeyGenerationStrategy();

        final SecretKeyGenerator secretKeyGenerator = new SecretKeyGenerator(generationStrategy);

        SecretKey secretKey = secretKeyGenerator.generate();
        System.out.println(secretKey.getAlgorithm());
        secretKey = secretKeyGenerator.generate();
        System.out.println(secretKey.getAlgorithm());

        generationStrategy = new DesKeyGenerationStrategy();
        secretKeyGenerator.setSecretKeyGenerationStrategy(generationStrategy);

        secretKey = generationStrategy.generate();
        System.out.println(secretKey.getAlgorithm());

        generationStrategy = new HmacSHA256KeyGenerationStrategy();
        secretKeyGenerator.setSecretKeyGenerationStrategy(generationStrategy);

        secretKey = generationStrategy.generate();
        System.out.println(secretKey.getAlgorithm());


    }
}
