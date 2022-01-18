package redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;
import redis.interfaces.RedisConnectionInterface;

import java.util.Objects;

public class RedisClientImpl implements RedisConnectionInterface {

    private RedisClient redisClient;
    private RedisConnection<String, String> connection;

    public RedisClientImpl(RedisURI redisURI) {
        this.redisClient = new RedisClient(redisURI);
    }

    @Override
    public void checkConnection() {
        try {
            redisClient.connect();
            System.out.println("Connected to Redis with RedisClient!");
        }catch (RuntimeException ex){
            throw ex;
        }
    }

    public RedisConnection<String, String> getConnection(){
        try{
            if(Objects.isNull(connection)) connection = redisClient.connect();
            return connection;
        }catch (RuntimeException ex){
            throw ex;
        }
    }
}
