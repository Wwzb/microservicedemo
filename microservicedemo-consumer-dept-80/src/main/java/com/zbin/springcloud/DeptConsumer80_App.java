package com.zbin.springcloud;

import com.zbin.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * com.zbin.springcloud.DeptConsumer80_App
 *
 * @author Zbin
 * @date 2019/03/13
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICEDEMO-DEPT", configuration = MyRule.class)
public class DeptConsumer80_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_App.class, args);
  }

}
