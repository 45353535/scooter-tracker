package yads;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class do2 extends BufferedOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f110004a;

    public do2(FileOutputStream fileOutputStream, int i10) {
        super(fileOutputStream, i10);
    }

    public final void a(OutputStream outputStream) {
        if (!this.f110004a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f110004a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f110004a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = w83.f117341a;
        throw th;
    }

    public do2(xj xjVar) {
        super(xjVar);
    }
}
