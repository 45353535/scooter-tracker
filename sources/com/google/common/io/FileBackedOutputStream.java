package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
public final class FileBackedOutputStream extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteSource f30924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f30925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MemoryOutput f30926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f30927g;

    private static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        byte[] m() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public FileBackedOutputStream(int i10) {
        this(i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream m() {
        if (this.f30927g != null) {
            return new FileInputStream(this.f30927g);
        }
        Objects.requireNonNull(this.f30926f);
        return new ByteArrayInputStream(this.f30926f.m(), 0, this.f30926f.getCount());
    }

    private void n(int i10) throws IOException {
        MemoryOutput memoryOutput = this.f30926f;
        if (memoryOutput == null || memoryOutput.getCount() + i10 <= this.f30922b) {
            return;
        }
        File fileB = TempFileCreator.f30962a.b("FileBackedOutputStream");
        if (this.f30923c) {
            fileB.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            fileOutputStream.write(this.f30926f.m(), 0, this.f30926f.getCount());
            fileOutputStream.flush();
            this.f30925e = fileOutputStream;
            this.f30927g = fileB;
            this.f30926f = null;
        } catch (IOException e10) {
            fileB.delete();
            throw e10;
        }
    }

    public ByteSource asByteSource() {
        return this.f30924d;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f30925e.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f30925e.flush();
    }

    public synchronized void reset() throws IOException {
        try {
            close();
            MemoryOutput memoryOutput = this.f30926f;
            if (memoryOutput == null) {
                this.f30926f = new MemoryOutput();
            } else {
                memoryOutput.reset();
            }
            this.f30925e = this.f30926f;
            File file = this.f30927g;
            if (file != null) {
                this.f30927g = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } catch (Throwable th2) {
            if (this.f30926f == null) {
                this.f30926f = new MemoryOutput();
            } else {
                this.f30926f.reset();
            }
            this.f30925e = this.f30926f;
            File file2 = this.f30927g;
            if (file2 != null) {
                this.f30927g = null;
                if (!file2.delete()) {
                    throw new IOException("Could not delete: " + file2);
                }
            }
            throw th2;
        } finally {
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) throws IOException {
        n(1);
        this.f30925e.write(i10);
    }

    public FileBackedOutputStream(int i10, boolean z10) {
        Preconditions.checkArgument(i10 >= 0, "fileThreshold must be non-negative, but was %s", i10);
        this.f30922b = i10;
        this.f30923c = z10;
        MemoryOutput memoryOutput = new MemoryOutput();
        this.f30926f = memoryOutput;
        this.f30925e = memoryOutput;
        if (z10) {
            this.f30924d = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.1
                protected void finalize() {
                    try {
                        FileBackedOutputStream.this.reset();
                    } catch (Throwable th2) {
                        th2.printStackTrace(System.err);
                    }
                }

                @Override // com.google.common.io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.m();
                }
            };
        } else {
            this.f30924d = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.2
                @Override // com.google.common.io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.m();
                }
            };
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        n(i11);
        this.f30925e.write(bArr, i10, i11);
    }
}
