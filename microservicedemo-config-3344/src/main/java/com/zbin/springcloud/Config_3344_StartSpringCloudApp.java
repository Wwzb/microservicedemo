package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * com.zbin.springcloud.Config_3344_StartSpringCloudApp
 *
 * @author Zbin
 * @date 2019/03/19
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

  public static void main(String[] args) {
    SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
  }

}
