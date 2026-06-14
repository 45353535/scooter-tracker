package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f15789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15790b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f15789a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f15789a.b() - this.f15789a.c();
        if (jB > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f15790b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f15789a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f15789a.b(this.f15790b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.f15789a.a(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f15789a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f15789a.d();
    }
}
