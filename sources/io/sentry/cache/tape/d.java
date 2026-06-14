package io.sentry.cache.tape;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.C4240b4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Closeable, Iterable, AutoCloseable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f83348n = new byte[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    RandomAccessFile f83349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final File f83350c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f83352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f83353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b f83354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f83355h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f83358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f83359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f83360m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f83351d = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f83356i = new byte[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f83357j = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f83361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f83362b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f83363c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f83361a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileS = d.s(this.f83361a);
            try {
                return new d(this.f83361a, randomAccessFileS, this.f83362b, this.f83363c);
            } catch (Throwable th2) {
                randomAccessFileS.close();
                throw th2;
            }
        }

        public a b(int i10) {
            this.f83363c = i10;
            return this;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f83364c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f83365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f83366b;

        b(long j10, int i10) {
            this.f83365a = j10;
            this.f83366b = i10;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f83365a + ", length=" + this.f83366b + C4240b4.j.f42674e;
        }
    }

    private final class c implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f83367b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f83368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f83369d;

        c() {
            this.f83368c = d.this.f83354g.f83365a;
            this.f83369d = d.this.f83357j;
        }

        private void a() {
            if (d.this.f83357j != this.f83369d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f83360m) {
                throw new IllegalStateException("closed");
            }
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f83367b;
            d dVar = d.this;
            if (i10 >= dVar.f83353f) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarZ = dVar.z(this.f83368c);
                    byte[] bArr = new byte[bVarZ.f83366b];
                    long jU0 = d.this.u0(bVarZ.f83365a + 4);
                    this.f83368c = jU0;
                    if (!d.this.n0(jU0, bArr, 0, bVarZ.f83366b)) {
                        this.f83367b = d.this.f83353f;
                        return d.f83348n;
                    }
                    this.f83368c = d.this.u0(bVarZ.f83365a + 4 + ((long) bVarZ.f83366b));
                    this.f83367b++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) d.q(e10));
                } catch (OutOfMemoryError unused) {
                    d.this.e0();
                    this.f83367b = d.this.f83353f;
                    return d.f83348n;
                }
            } catch (IOException e11) {
                throw ((Error) d.q(e11));
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f83360m) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f83367b != d.this.f83353f;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f83367b != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.W();
                this.f83369d = d.this.f83357j;
                this.f83367b--;
            } catch (IOException e10) {
                throw ((Error) d.q(e10));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) throws IOException {
        this.f83350c = file;
        this.f83349b = randomAccessFile;
        this.f83358k = z10;
        this.f83359l = i10;
        M();
    }

    private void M() throws IOException {
        this.f83349b.seek(0L);
        this.f83349b.readFully(this.f83356i);
        this.f83352e = U(this.f83356i, 4);
        this.f83353f = R(this.f83356i, 12);
        long jU = U(this.f83356i, 16);
        long jU2 = U(this.f83356i, 24);
        if (this.f83352e > this.f83349b.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f83352e + ", Actual length: " + this.f83349b.length());
        }
        if (this.f83352e > 32) {
            this.f83354g = z(jU);
            this.f83355h = z(jU2);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f83352e + ") is invalid.");
        }
    }

    private static int R(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private static long U(byte[] bArr, int i10) {
        return ((((long) bArr[i10]) & 255) << 56) + ((((long) bArr[i10 + 1]) & 255) << 48) + ((((long) bArr[i10 + 2]) & 255) << 40) + ((((long) bArr[i10 + 3]) & 255) << 32) + ((((long) bArr[i10 + 4]) & 255) << 24) + ((((long) bArr[i10 + 5]) & 255) << 16) + ((((long) bArr[i10 + 6]) & 255) << 8) + (((long) bArr[i10 + 7]) & 255);
    }

    private long V() {
        return this.f83352e - t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() throws IOException {
        this.f83349b.close();
        this.f83350c.delete();
        this.f83349b = s(this.f83350c);
        M();
    }

    private void i0(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = f83348n;
            int iMin = (int) Math.min(j11, bArr.length);
            r0(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
        }
    }

    private void p(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jV = V();
        if (jV >= j13) {
            return;
        }
        long j14 = this.f83352e;
        do {
            jV += j14;
            j14 <<= 1;
        } while (jV < j13);
        s0(j14);
        b bVar = this.f83355h;
        long jU0 = u0(bVar.f83365a + 4 + ((long) bVar.f83366b));
        if (jU0 <= this.f83354g.f83365a) {
            FileChannel channel = this.f83349b.getChannel();
            channel.position(this.f83352e);
            j11 = jU0 - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.f83355h.f83365a;
        long j16 = this.f83354g.f83365a;
        if (j15 < j16) {
            long j17 = (this.f83352e + j15) - 32;
            x0(j14, this.f83353f, j16, j17);
            this.f83355h = new b(j17, this.f83355h.f83366b);
            j12 = j14;
        } else {
            x0(j14, this.f83353f, j16, j15);
            j12 = j14;
        }
        this.f83352e = j12;
        if (this.f83358k) {
            i0(32L, j11);
        }
    }

    private void r0(long j10, byte[] bArr, int i10, int i11) throws IOException {
        long jU0 = u0(j10);
        long j11 = ((long) i11) + jU0;
        long j12 = this.f83352e;
        if (j11 <= j12) {
            this.f83349b.seek(jU0);
            this.f83349b.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - jU0);
        this.f83349b.seek(jU0);
        this.f83349b.write(bArr, i10, i12);
        this.f83349b.seek(32L);
        this.f83349b.write(bArr, i10 + i12, i11 - i12);
    }

    static RandomAccessFile s(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileY = y(file2);
            try {
                randomAccessFileY.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFileY.seek(0L);
                randomAccessFileY.writeInt(-2147483647);
                randomAccessFileY.writeLong(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFileY.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFileY.close();
                throw th2;
            }
        }
        return y(file);
    }

    private void s0(long j10) throws IOException {
        this.f83349b.setLength(j10);
        this.f83349b.getChannel().force(true);
    }

    private long t0() {
        if (this.f83353f == 0) {
            return 32L;
        }
        b bVar = this.f83355h;
        long j10 = bVar.f83365a;
        long j11 = this.f83354g.f83365a;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) bVar.f83366b) + 32 : (((j10 + 4) + ((long) bVar.f83366b)) + this.f83352e) - j11;
    }

    private void x0(long j10, int i10, long j11, long j12) throws IOException {
        this.f83349b.seek(0L);
        y0(this.f83356i, 0, -2147483647);
        z0(this.f83356i, 4, j10);
        y0(this.f83356i, 12, i10);
        z0(this.f83356i, 16, j11);
        z0(this.f83356i, 24, j12);
        this.f83349b.write(this.f83356i, 0, 32);
    }

    private static RandomAccessFile y(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private static void y0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void z0(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public void W() throws IOException {
        b0(1);
    }

    public void b0(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f83353f) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f83353f) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f83353f + ").");
        }
        b bVar = this.f83354g;
        long j10 = bVar.f83365a;
        int iR = bVar.f83366b;
        long j11 = 0;
        int i11 = 0;
        long j12 = j10;
        while (i11 < i10) {
            j11 += (long) (iR + 4);
            long jU0 = u0(j12 + 4 + ((long) iR));
            if (!n0(jU0, this.f83356i, 0, 4)) {
                return;
            }
            iR = R(this.f83356i, 0);
            i11++;
            j12 = jU0;
        }
        x0(this.f83352e, this.f83353f - i10, j12, this.f83355h.f83365a);
        this.f83353f -= i10;
        this.f83357j++;
        this.f83354g = new b(j12, iR);
        if (this.f83358k) {
            i0(j10, j11);
        }
    }

    public void clear() throws IOException {
        if (this.f83360m) {
            throw new IllegalStateException("closed");
        }
        x0(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, 0, 0L, 0L);
        if (this.f83358k) {
            this.f83349b.seek(32L);
            this.f83349b.write(f83348n, 0, 4064);
        }
        this.f83353f = 0;
        b bVar = b.f83364c;
        this.f83354g = bVar;
        this.f83355h = bVar;
        if (this.f83352e > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            s0(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        }
        this.f83352e = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        this.f83357j++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f83360m = true;
        this.f83349b.close();
    }

    public boolean isEmpty() {
        return this.f83353f == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    boolean n0(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            long jU0 = u0(j10);
            long j11 = ((long) i11) + jU0;
            long j12 = this.f83352e;
            if (j11 <= j12) {
                this.f83349b.seek(jU0);
                this.f83349b.readFully(bArr, i10, i11);
                return true;
            }
            int i12 = (int) (j12 - jU0);
            this.f83349b.seek(jU0);
            this.f83349b.readFully(bArr, i10, i12);
            this.f83349b.seek(32L);
            this.f83349b.readFully(bArr, i10 + i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            e0();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            e0();
            return false;
        }
    }

    public void o(byte[] bArr, int i10, int i11) throws IOException {
        long jU0;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f83360m) {
            throw new IllegalStateException("closed");
        }
        if (w()) {
            W();
        }
        p(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jU0 = 32;
        } else {
            b bVar = this.f83355h;
            jU0 = u0(bVar.f83365a + 4 + ((long) bVar.f83366b));
        }
        b bVar2 = new b(jU0, i11);
        y0(this.f83356i, 0, i11);
        r0(bVar2.f83365a, this.f83356i, 0, 4);
        r0(bVar2.f83365a + 4, bArr, i10, i11);
        x0(this.f83352e, this.f83353f + 1, zIsEmpty ? bVar2.f83365a : this.f83354g.f83365a, bVar2.f83365a);
        this.f83355h = bVar2;
        this.f83353f++;
        this.f83357j++;
        if (zIsEmpty) {
            this.f83354g = bVar2;
        }
    }

    public int size() {
        return this.f83353f;
    }

    public String toString() {
        return "QueueFile{file=" + this.f83350c + ", zero=" + this.f83358k + ", length=" + this.f83352e + ", size=" + this.f83353f + ", first=" + this.f83354g + ", last=" + this.f83355h + '}';
    }

    long u0(long j10) {
        long j11 = this.f83352e;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public boolean w() {
        return this.f83359l != -1 && size() == this.f83359l;
    }

    b z(long j10) {
        return j10 == 0 ? b.f83364c : !n0(j10, this.f83356i, 0, 4) ? b.f83364c : new b(j10, R(this.f83356i, 0));
    }

    static Throwable q(Throwable th2) throws Throwable {
        throw th2;
    }
}
