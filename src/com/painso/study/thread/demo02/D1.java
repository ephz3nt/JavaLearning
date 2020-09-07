package com.painso.study.thread.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// exercise 1: multiple thread download pictures
public class D1 extends Thread {
    private String url; // pictures url
    private String name;    // filename to saved

    public D1() {

    }

    public D1(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        Downloader downloader = new Downloader();
        downloader.downloader(url, name);
        System.out.println("downloaded file name: " + name);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new D1("https://i0.hdslb.com/bfs/archive/0bc73788fc375bf4f1101d9f5009917159a8c6b4.jpg@880w_388h_1c_95q", i + ".jpg").start();
        }
    }
}


// downloader
class Downloader {
    // downloader method
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}