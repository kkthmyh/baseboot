package com.kkthmyh.baseboot.redislock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author kkthmyh
 * @Date 2020/11/15 22:00
 * @Version 1.0
 * @Description 这里模拟了简易的减库存操作
 */
@RestController
@Slf4j
public class RedisLockController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/reduce-stock")
    public String reduceStock() {
        String lockKey = "lockKey";
        //利用redis的setnx命令，如果当前key不存在set成功返回1 ，key存在set失败返回0
        Boolean lock = stringRedisTemplate.opsForValue().setIfAbsent(lockKey, "test",10,TimeUnit.SECONDS);
            if (!lock) {
                return "error,线程占用！";
            }
        try {
            //获取redis中库存个数
            Integer stock = Integer.valueOf(stringRedisTemplate.opsForValue().get("stock"));
            if (stock > 0) {
                Integer newStock = stock - 1;
                stringRedisTemplate.opsForValue().set("stock", newStock.toString());
                log.info("扣减库存成功，当前库存：{}", newStock);
            } else {
                log.info("扣减库存失败当前库存：{}", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stringRedisTemplate.delete(lockKey);
        }

        return "end";
    }
}
