package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends BufferedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f23915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f23915a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f23915a.getAndAdd(i12);
        }
        return i12;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f23915a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        long jSkip;
        jSkip = super.skip(j10);
        this.f23915a.addAndGet((int) jSkip);
        return jSkip;
    }
}
