package com.ruppyrup.emojiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmojiClientApplication {

    // only need if certificate not setup for localhost - First and Last name use localhost
//    static {
//        //for localhost testing only
//        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
//                new javax.net.ssl.HostnameVerifier(){
//
//                    public boolean verify(String hostname,
//                                          javax.net.ssl.SSLSession sslSession) {
//                        if (hostname.equals("localhost")) {
//                            return true;
//                        }
//                        return false;
//                    }
//                });
//    }
    public static void main(String[] args) {
        SpringApplication.run(EmojiClientApplication.class, args);
    }

}
