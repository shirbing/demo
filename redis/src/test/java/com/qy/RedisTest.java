package com.qy;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
    @Test
    public void tString(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("wang88");
        System.out.println(jedis.ping());
        jedis.set("names","小鸣");
        jedis.set("age","20");
        System.out.println(jedis.get("names"));

        jedis.lpush("addlist","beijing");
        jedis.lpush("addlist","shanghai");
        System.out.println(jedis.lrange("addlist",0,-1));


    }
}
