package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes10.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedOutputStream f47095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileDescriptor f47096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f47097c;

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f47097c = randomAccessFile;
        this.f47096b = randomAccessFile.getFD();
        this.f47095a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.f47095a.close();
        this.f47097c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.f47095a.flush();
        this.f47096b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j10) throws IOException {
        this.f47097c.seek(j10);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f47095a.write(bArr, i10, i11);
    }
}
