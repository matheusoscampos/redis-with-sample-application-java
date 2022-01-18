package redis;

import redis.clients.jedis.Jedis;
import redis.interfaces.RedisConnectionInterface;

public class JedisClientImpl implements RedisConnectionInterface {

    private Jedis jedis;
    private String password;

    public JedisClientImpl(String hostname, String password, int port) {
        jedis = new Jedis(hostname, port);
        this.password = password;
    }

    @Override
    public void checkConnection() {
        try {
            jedis.auth(password);
            System.out.println("Connected to Redis with Jedis!");
        }catch (RuntimeException ex){
            throw ex;
        }
    }
}
