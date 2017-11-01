package com.task.jettyRun;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;
/**

若想启动内嵌jetty的话
需要添加以下依赖 启动后删除否则外部web容器出现jsp识别错误
 <dependency>
      <groupId>org.mortbay.jetty</groupId>
      <artifactId>jsp-2.1-jetty</artifactId>
      <version>6.1.26</version>
    </dependency>
    或
<dependency>
     <groupId>org.eclipse.jetty</groupId>
     <artifactId>jetty-jsp</artifactId>
     <version>8.1.9.v20130131</version>
</dependency>
 */

public class RunTest {
    public static void main(String[] args) throws Exception {
        tt();
    }

    public static void tt() throws Exception {
        Server server = new Server();// 创建jetty web容器
        server.setStopAtShutdown(true);// 在退出程序是关闭服务
        Connector connector = new SelectChannelConnector();// 创建一个连接器
        connector.setHost("127.0.0.1");// ip地址
        connector.setPort(8080);// 连接的端口号
        server.addConnector(connector);// 添加连接
        QueuedThreadPool threadPool = new QueuedThreadPool();
        threadPool.setMaxThreads(3000);
        server.setThreadPool(threadPool);
        // 配置服务
        WebAppContext context = new WebAppContext();// 创建服务上下文
        context.setContextPath("");// 访问服务路径 http://{ip}:{port}/
        context.setConfigurationDiscovered(true);
        String baseDir = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath();
        context.setDescriptor(baseDir + File.separator + "/WEB-INF/web.xml");// 指明服务描述文件，就是web.xml
        context.setResourceBase(System.getProperty("user.dir")
                + "/src/main/webapp/");// 指定服务的资源根路径，配置文件的相对路径与服务根路径有关
        server.setHandler(context);// 添加处理try {
        server.start();// 开启服务
        server.join();


    }

}
