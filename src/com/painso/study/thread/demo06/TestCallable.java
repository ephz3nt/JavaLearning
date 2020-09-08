package com.painso.study.thread.demo06;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

// 使用实现了Callable接口的类重构图片下载
public class TestCallable implements Callable<Boolean> {
    private String url; // pictures url
    private String name;    // filename to saved

    public TestCallable() {

    }

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        Downloader downloader = new Downloader();
        downloader.downloader(url, name);
        System.out.println("downloaded file name: " + name);
        return true;
    }

    public static void main(String[] args) {
        TestCallable t1 = new TestCallable("https://i0.hdslb.com/bfs/archive/0bc73788fc375bf4f1101d9f5009917159a8c6b4.jpg@880w_388h_1c_95q", "1.jpg");
        TestCallable t2 = new TestCallable("https://i0.hdslb.com/bfs/archive/0bc73788fc375bf4f1101d9f5009917159a8c6b4.jpg@880w_388h_1c_95q", "2.jpg");
        TestCallable t3 = new TestCallable("https://i0.hdslb.com/bfs/archive/0bc73788fc375bf4f1101d9f5009917159a8c6b4.jpg@880w_388h_1c_95q", "3.jpg");
//            new Thread(new TestCallable("https://i0.hdslb.com/bfs/archive/0bc73788fc375bf4f1101d9f5009917159a8c6b4.jpg@880w_388h_1c_95q", i + ".jpg")).start();
        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> result1 = ser.submit(t1);
        Future<Boolean> result2 = ser.submit(t2);
        Future<Boolean> result3 = ser.submit(t3);
// 获取结果
        try {
            boolean r1 = result1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        try {
            boolean r2 = result1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        try {
            boolean r3 = result1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // 关闭服务
        ser.shutdownNow();

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