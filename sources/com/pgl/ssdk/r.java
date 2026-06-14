package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j10, long j11) {
        return a(randomAccessFile.getChannel(), j10, j11);
    }

    public static q a(FileChannel fileChannel, long j10, long j11) {
        fileChannel.getClass();
        return new m(fileChannel, j10, j11);
    }
}
