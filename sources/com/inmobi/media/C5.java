package com.inmobi.media;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class C5 extends FilterOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D5 f36656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(D5 d52, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f36656a = d52;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f36656a.f36710c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f36656a.f36710c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        try {
            ((FilterOutputStream) this).out.write(i10);
        } catch (IOException unused) {
            this.f36656a.f36710c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        } catch (IOException unused) {
            this.f36656a.f36710c = true;
        }
    }
}
