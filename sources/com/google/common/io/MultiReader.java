package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
class MultiReader extends Reader implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f30949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Reader f30950c;

    MultiReader(Iterator it) throws IOException {
        this.f30949b = it;
        m();
    }

    private void m() throws IOException {
        close();
        if (this.f30949b.hasNext()) {
            this.f30950c = ((CharSource) this.f30949b.next()).openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f30950c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f30950c = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.f30950c;
        if (reader == null) {
            return -1;
        }
        int i12 = reader.read(cArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        m();
        return read(cArr, i10, i11);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f30950c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j10) throws IOException {
        Preconditions.checkArgument(j10 >= 0, "n is negative");
        if (j10 > 0) {
            while (true) {
                Reader reader = this.f30950c;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j10);
                if (jSkip > 0) {
                    return jSkip;
                }
                m();
            }
        }
        return 0L;
    }
}
