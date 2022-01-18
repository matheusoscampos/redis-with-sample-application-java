package redis;

import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

public class Execute {

    public static void main(String[] args) {

        RedisURI redisURI = RedisURI.create("redis://batata123@127.0.0.1:6379");

        RedisClientImpl redisClient = new RedisClientImpl(redisURI);
        redisClient.checkConnection();

        RedisConnection<String, String> connection = redisClient.getConnection();
        connection.set("pais", "Brasil");
        String value = connection.get("pais");
        System.out.println(value);

        JedisClientImpl jedisClient = new JedisClientImpl("127.0.0.1", "batata123", 6379);
        jedisClient.checkConnection();
    }
}
