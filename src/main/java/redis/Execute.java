package redis;

import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

public class Execute {

    public static void main(String[] args) {

        // Credencias definidas no docker-compose da imagem
        RedisURI redisURI = RedisURI.create("redis://batata123@127.0.0.1:6379");

        // Conectando com o RedisClient
        RedisClientImpl redisClient = new RedisClientImpl(redisURI);
        redisClient.checkConnection();

        // Inserção de um dado de exemplo com o redis client:
        RedisConnection<String, String> connection = redisClient.getConnection();
        connection.set("pais", "Brasil");
        String value = connection.get("pais");
        System.out.println(value);

        // Conectando com o JedisClient
        JedisClientImpl jedisClient = new JedisClientImpl("127.0.0.1", "batata123", 6379);
        jedisClient.checkConnection();
    }
}
