package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f23100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23101b = false;

    public b(File file) {
        this.f23100a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23101b) {
            return;
        }
        this.f23101b = true;
        this.f23100a.flush();
        try {
            this.f23100a.getFD().sync();
        } catch (IOException e10) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        this.f23100a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f23100a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f23100a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f23100a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f23100a.write(bArr, i10, i11);
    }
}
