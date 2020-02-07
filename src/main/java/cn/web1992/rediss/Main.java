package cn.web1992.rediss;

import redis.clients.jedis.Jedis;

import java.io.IOException;

/**
 * @author web1992
 * @date 2020/1/26  22:13
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Jedis jedis = new Jedis("10.148.3.10", 12345);
        Jedis jedis = new Jedis("127.0.0.1",12345);

        String a = jedis.get("b");


        System.out.println(" a is " + a);
//        System.in.read();
        jedis.auth("redis");//验证密码,如果需要验证的话
//        // STRING 操作
//        //SET key value将字符串值value关联到key。
//        jedis.set("name", "wangjun1");
//        jedis.set("id", "123456");
//        jedis.set("address", "guangzhou");
//        //SETEX key seconds value将值value关联到key，并将key的生存时间设为seconds(以秒为单位)。
//        jedis.setex("foo", 5, "haha");
//        //MSET key value [key value ...]同时设置一个或多个key-value对。
//        jedis.mset("haha","111","xixi","222");
//        //redis.flushAll();清空所有的key
//        System.out.println(jedis.dbSize());//dbSize是多少个key的个数
//        //APPEND key value如果key已经存在并且是一个字符串，APPEND命令将value追加到key原来的值之后。
//        jedis.append("foo", "00");//如果key已经存在并且是一个字符串，APPEND命令将value追加到key原来的值之后。
//        //GET key 返回key所关联的字符串值
//        jedis.get("foo");
//        //MGET key [key ...] 返回所有(一个或多个)给定key的值
//        List list = jedis.mget("haha","xixi");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
    }
}
