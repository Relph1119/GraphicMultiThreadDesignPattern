# 记录自己学习《图解Java多线程设计模式》这本书的全部过程
本书上传的所有代码都是可以运行的，在此附上本书源码地址： [http://www.ituring.com.cn/book/1812](http://www.ituring.com.cn/book/1812)<br/>
在此向本书作者和译者表示感谢

## 运行环境 ##
Eclipse版本：Oxygen.2 Release (4.7.2)<br/>
JDK版本：jdk1.7.0_79

## 代码结构 ##
![](https://i.imgur.com/dzh62mX.png)
<pre>
src\com\gdp
+---activeObject---------------------------主动对象模式
+---balking--------------------------------停止返回模式
+---future---------------------------------等待返回模式
+---builder--------------------------------建造者模式
+---guardedSuspension----------------------保护性暂挂模式
+---immutable------------------------------不可变模式
+---introduction1--------------------------主动对象模式
+---producerConsumer-----------------------生产者消费者模式
+---readWriteLock--------------------------读取端复数锁模式
+---singleThreadedExecution----------------临界区模式
+---threadPerMessage-----------------------每个消息一个线程模式
+---threadSpecificStorage------------------线程独有的存储库模式
+---twoPhaseTermination--------------------分两阶段终止模式
+---workerThread---------------------------线程池模式
images-------------------------------------运行结果截图
static-------------------------------------程序中需要用到的静态资源（程序中已经写好读取路径）
</pre>
## 运行结果 ##
### 第一章-Single Threaded Execution（临界区）模式 ###
![](https://i.imgur.com/345SuR8.png)

### 第二章-Immutable（不可变）模式 ###
![](https://i.imgur.com/Et3BXoE.png)

### 第三章-Guarded Suspension（保护性暂挂）模式 ###
![](https://i.imgur.com/E5o1fhI.png)

### 第四章-Blaking（停止返回）模式 ###
![](https://i.imgur.com/h9VnXtP.png)

### 第五章-Producer Consumer（生产者消费者）模式 ###
![](https://i.imgur.com/L3lWEnA.png)

### 第六章-Read-Write Lock（读取端复数锁）模式 ###
![](https://i.imgur.com/Hgk8yoH.png)

### 第七章-Thread-Per-Message（每个消息一个线程）模式 ###
![](https://i.imgur.com/J2BSzEU.png)

### 第八章-Worker Thread（线程池）模式 ###
![](https://i.imgur.com/KxL8W1l.png)

### 第九章-Future（等待返回）模式 ###
![](https://i.imgur.com/S44YhDW.png)

### 第十章-Two-Phase Termination（分两阶段终止）模式 ###
![](https://i.imgur.com/16erZ8s.png)

### 第十一章-Thread-Specific Storage（线程独有的存储库）模式 ###
![](https://i.imgur.com/6rPq7hz.png)

### 第十二章-Active Object（主动对象）模式 ###
![](https://i.imgur.com/ze9rxCG.png)

## 总结 ##
1. Single Threaded Execution模式：对临界区的代码进行多线程保护，用synchronized关键字来保护临界区。
2. Immutable模式：该模式不需要使用synchronized进行保护，能够提高性能。典型代表是String类。
3. Guarded Suspension模式：多线程版本的if，用守护条件对线程的执行目标处理进行保护。
4. Blaking模式：对象本身拥有状态，如果符合自身状态，就执行处理，否则便不会执行。
5. Producer Consumer模式：将数据放入消息队列中，进行数据处理，在Channel中执行互斥处理。
6. Read-Write Lock模式：将读写分离，并互斥处理读写。
7. Thread-Per-Message模式：这个也是代理模式的一种，委托端和执行端是不同的线程，可以进行消息的异步发送。
8. Worker Thread模式：这个模式也被称作为背景模式，保存多个工人线程的场所。
9. Future模式：使用该模式，可以在不用降低响应性的前提下获取处理结果。
10. Two-Phase Termination模式：优雅地结束线程，采用interrupt进行线程的终止。
11. Thread-Specific Storage模式：线程之前的数据不会共享，每个线程都存有自己的上下文。
12. Active Object模式：接收来自外部的异步请求，能够自由的调度请求，可以单线程执行实际的处理，可以返回执行结果，并拥有独立的线程。

## 心得 ##
1. 通过学习多线程模式，加深了对多线程编程的了解。
2. 最后一个模式Active Object很像Kafka的消息队列模式，该模式是多种模式的组合，里面包括了生产者消费者模式，等待返回模式，线程池模式，存储库模式。
3. Java的多线程编程的库非常强大，本书中介绍的还只是Java5的。现如今的Java8/9已经包括了很大的功能库。以下链接是JDK1.7.0_79版本并发包的源码分析：[https://www.cnblogs.com/yulinfeng/category/998911.html](https://www.cnblogs.com/yulinfeng/category/998911.html)