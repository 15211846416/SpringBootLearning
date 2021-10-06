package com.example.demo.bufferDemo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledDirectByteBuf;

import java.nio.ByteBuffer;

/**
 * @author Yi
 * @date 2020/7/30 14:32
 * 采用内存池分配器创建直接缓冲区
 */
public class poolBufferDemo {
    public static void main(String[] args) {
        final  byte[] CONTENT = new byte[1024];
        int loop = 18000000;
        long startTime = System.currentTimeMillis();
        ByteBuf poolBuffer = null;
        for (int i = 0;i < loop;i++){
            poolBuffer = PooledByteBufAllocator.DEFAULT.directBuffer(1024);
            poolBuffer.writeBytes(CONTENT);
            poolBuffer.release();

        }
        long endTime = System.currentTimeMillis();
        System.out.println("内存池分配缓冲区耗时"+(endTime-startTime)+"ms");

        //非堆内存分配器创建直接缓冲区
        long startTime2 = System.currentTimeMillis();
        ByteBuf byteBuf = null;
        for (int i = 0;i < loop;i++){
            byteBuf = Unpooled.directBuffer(10);
            byteBuf.writeBytes(CONTENT);

        }
        endTime = System.currentTimeMillis();
        System.out.println("非内存池分配缓冲区耗时"+(endTime - startTime2)+"ms");
    }
}
