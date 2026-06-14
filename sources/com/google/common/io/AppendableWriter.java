package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
class AppendableWriter extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Appendable f30836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30837c;

    AppendableWriter(Appendable appendable) {
        this.f30836b = (Appendable) Preconditions.checkNotNull(appendable);
    }

    private void m() throws IOException {
        if (this.f30837c) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30837c = true;
        Appendable appendable = this.f30836b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        m();
        Appendable appendable = this.f30836b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        m();
        this.f30836b.append(new String(cArr, i10, i11));
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        m();
        this.f30836b.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        m();
        this.f30836b.append(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        m();
        this.f30836b.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        m();
        this.f30836b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        m();
        this.f30836b.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        Preconditions.checkNotNull(str);
        m();
        this.f30836b.append(str, i10, i11 + i10);
    }
}
