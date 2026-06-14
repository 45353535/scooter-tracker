package yads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class xj extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f117834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f117835b = false;

    public xj(File file) {
        this.f117834a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f117835b) {
            return;
        }
        this.f117835b = true;
        this.f117834a.flush();
        try {
            this.f117834a.getFD().sync();
        } catch (IOException e10) {
            uf1.d("AtomicFile", uf1.a("Failed to sync file descriptor:", e10));
        }
        this.f117834a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f117834a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f117834a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f117834a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f117834a.write(bArr, i10, i11);
    }
}
