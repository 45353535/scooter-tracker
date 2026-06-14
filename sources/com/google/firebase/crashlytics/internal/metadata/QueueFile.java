package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.C4240b4;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
class QueueFile implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f32181h = Logger.getLogger(QueueFile.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RandomAccessFile f32182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f32183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Element f32185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Element f32186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f32187g = new byte[16];

    static class Element {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Element f32191c = new Element(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f32192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f32193b;

        Element(int i10, int i11) {
            this.f32192a = i10;
            this.f32193b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f32192a + ", length = " + this.f32193b + C4240b4.j.f42674e;
        }
    }

    private final class ElementInputStream extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32195c;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            QueueFile.n(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f32195c;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            QueueFile.this.y(this.f32194b, bArr, i10, i11);
            this.f32194b = QueueFile.this.R(this.f32194b + i11);
            this.f32195c -= i11;
            return i11;
        }

        private ElementInputStream(Element element) {
            this.f32194b = QueueFile.this.R(element.f32192a + 4);
            this.f32195c = element.f32193b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f32195c == 0) {
                return -1;
            }
            QueueFile.this.f32182b.seek(this.f32194b);
            int i10 = QueueFile.this.f32182b.read();
            this.f32194b = QueueFile.this.R(this.f32194b + 1);
            this.f32195c--;
            return i10;
        }
    }

    public interface ElementReader {
        void read(InputStream inputStream, int i10) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            m(file);
        }
        this.f32182b = o(file);
        q();
    }

    private void M(int i10) throws IOException {
        this.f32182b.setLength(i10);
        this.f32182b.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(int i10) {
        int i11 = this.f32183c;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void U(int i10, int i11, int i12, int i13) throws IOException {
        W(this.f32187g, i10, i11, i12, i13);
        this.f32182b.seek(0L);
        this.f32182b.write(this.f32187g);
    }

    private static void V(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void W(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            V(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void h(int i10) throws IOException {
        int i11 = i10 + 4;
        int iW = w();
        if (iW >= i11) {
            return;
        }
        int i12 = this.f32183c;
        do {
            iW += i12;
            i12 <<= 1;
        } while (iW < i11);
        M(i12);
        Element element = this.f32186f;
        int iR = R(element.f32192a + 4 + element.f32193b);
        if (iR < this.f32185e.f32192a) {
            FileChannel channel = this.f32182b.getChannel();
            channel.position(this.f32183c);
            long j10 = iR - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f32186f.f32192a;
        int i14 = this.f32185e.f32192a;
        if (i13 < i14) {
            int i15 = (this.f32183c + i13) - 16;
            U(i12, this.f32184d, i14, i15);
            this.f32186f = new Element(i15, this.f32186f.f32193b);
        } else {
            U(i12, this.f32184d, i14, i13);
        }
        this.f32183c = i12;
    }

    private static void m(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileO = o(file2);
        try {
            randomAccessFileO.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            randomAccessFileO.seek(0L);
            byte[] bArr = new byte[16];
            W(bArr, 4096, 0, 0, 0);
            randomAccessFileO.write(bArr);
            randomAccessFileO.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileO.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile o(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private Element p(int i10) throws IOException {
        if (i10 == 0) {
            return Element.f32191c;
        }
        this.f32182b.seek(i10);
        return new Element(i10, this.f32182b.readInt());
    }

    private void q() throws IOException {
        this.f32182b.seek(0L);
        this.f32182b.readFully(this.f32187g);
        int iS = s(this.f32187g, 0);
        this.f32183c = iS;
        if (iS <= this.f32182b.length()) {
            this.f32184d = s(this.f32187g, 4);
            int iS2 = s(this.f32187g, 8);
            int iS3 = s(this.f32187g, 12);
            this.f32185e = p(iS2);
            this.f32186f = p(iS3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f32183c + ", Actual length: " + this.f32182b.length());
    }

    private static int s(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int w() {
        return this.f32183c - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iR = R(i10);
        int i13 = iR + i12;
        int i14 = this.f32183c;
        if (i13 <= i14) {
            this.f32182b.seek(iR);
            this.f32182b.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iR;
        this.f32182b.seek(iR);
        this.f32182b.readFully(bArr, i11, i15);
        this.f32182b.seek(16L);
        this.f32182b.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void z(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iR = R(i10);
        int i13 = iR + i12;
        int i14 = this.f32183c;
        if (i13 <= i14) {
            this.f32182b.seek(iR);
            this.f32182b.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iR;
        this.f32182b.seek(iR);
        this.f32182b.write(bArr, i11, i15);
        this.f32182b.seek(16L);
        this.f32182b.write(bArr, i11 + i15, i12 - i15);
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        try {
            U(4096, 0, 0, 0);
            this.f32184d = 0;
            Element element = Element.f32191c;
            this.f32185e = element;
            this.f32186f = element;
            if (this.f32183c > 4096) {
                M(4096);
            }
            this.f32183c = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f32182b.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int iR = this.f32185e.f32192a;
        for (int i10 = 0; i10 < this.f32184d; i10++) {
            Element elementP = p(iR);
            elementReader.read(new ElementInputStream(elementP), elementP.f32193b);
            iR = R(elementP.f32192a + 4 + elementP.f32193b);
        }
    }

    public boolean hasSpaceFor(int i10, int i11) {
        return (usedBytes() + 4) + i10 <= i11;
    }

    public synchronized boolean isEmpty() {
        return this.f32184d == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.f32185e;
        int i10 = element.f32193b;
        byte[] bArr = new byte[i10];
        y(element.f32192a + 4, bArr, 0, i10);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f32184d == 1) {
                clear();
            } else {
                Element element = this.f32185e;
                int iR = R(element.f32192a + 4 + element.f32193b);
                y(iR, this.f32187g, 0, 4);
                int iS = s(this.f32187g, 0);
                U(this.f32183c, this.f32184d - 1, iR, this.f32186f.f32192a);
                this.f32184d--;
                this.f32185e = new Element(iR, iS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int size() {
        return this.f32184d;
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f32183c);
        sb2.append(", size=");
        sb2.append(this.f32184d);
        sb2.append(", first=");
        sb2.append(this.f32185e);
        sb2.append(", last=");
        sb2.append(this.f32186f);
        sb2.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                boolean f32188a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i10) throws IOException {
                    if (this.f32188a) {
                        this.f32188a = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i10);
                }
            });
        } catch (IOException e10) {
            f32181h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public int usedBytes() {
        if (this.f32184d == 0) {
            return 16;
        }
        Element element = this.f32186f;
        int i10 = element.f32192a;
        int i11 = this.f32185e.f32192a;
        return i10 >= i11 ? (i10 - i11) + 4 + element.f32193b + 16 : (((i10 + 4) + element.f32193b) + this.f32183c) - i11;
    }

    public synchronized void add(byte[] bArr, int i10, int i11) throws IOException {
        int iR;
        try {
            n(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            h(i11);
            boolean zIsEmpty = isEmpty();
            if (zIsEmpty) {
                iR = 16;
            } else {
                Element element = this.f32186f;
                iR = R(element.f32192a + 4 + element.f32193b);
            }
            Element element2 = new Element(iR, i11);
            V(this.f32187g, 0, i11);
            z(element2.f32192a, this.f32187g, 0, 4);
            z(element2.f32192a + 4, bArr, i10, i11);
            U(this.f32183c, this.f32184d + 1, zIsEmpty ? element2.f32192a : this.f32185e.f32192a, element2.f32192a);
            this.f32186f = element2;
            this.f32184d++;
            if (zIsEmpty) {
                this.f32185e = element2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.f32184d > 0) {
            elementReader.read(new ElementInputStream(this.f32185e), this.f32185e.f32193b);
        }
    }
}
