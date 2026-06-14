package vh;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements g, f, Cloneable, ByteChannel, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f106814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106815c;

    public static final class a implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f106816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g0 f106817c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f106819e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f106818d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f106820f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f106821g = -1;

        public final void c(g0 g0Var) {
            this.f106817c = g0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f106816b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f106816b = null;
            c(null);
            this.f106818d = -1L;
            this.f106819e = null;
            this.f106820f = -1;
            this.f106821g = -1;
        }
    }

    public static final class c extends OutputStream implements AutoCloseable {
        c() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            e.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            e.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    private final void W(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            g0 g0VarR0 = r0(1);
            int i10 = inputStream.read(g0VarR0.f106833a, g0VarR0.f106835c, (int) Math.min(j10, 8192 - g0VarR0.f106835c));
            if (i10 == -1) {
                if (g0VarR0.f106834b == g0VarR0.f106835c) {
                    this.f106814b = g0VarR0.b();
                    h0.b(g0VarR0);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            g0VarR0.f106835c += i10;
            long j11 = i10;
            this.f106815c += j11;
            j10 -= j11;
        }
    }

    @Override // vh.f
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        g0 g0VarR0 = r0(4);
        byte[] bArr = g0VarR0.f106833a;
        int i11 = g0VarR0.f106835c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        g0VarR0.f106835c = i11 + 4;
        b0(e0() + 4);
        return this;
    }

    public e B0(int i10) {
        return writeInt(vh.b.f(i10));
    }

    @Override // vh.g
    public long C(h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return M(bytes, 0L);
    }

    @Override // vh.f
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public e writeShort(int i10) {
        g0 g0VarR0 = r0(2);
        byte[] bArr = g0VarR0.f106833a;
        int i11 = g0VarR0.f106835c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        g0VarR0.f106835c = i11 + 2;
        b0(e0() + 2);
        return this;
    }

    public e D0(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return writeUtf8(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public e E0(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return D0(string, 0, string.length(), charset);
    }

    @Override // vh.f
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public e writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // vh.f
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public e writeUtf8(String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                g0 g0VarR0 = r0(1);
                byte[] bArr = g0VarR0.f106833a;
                int i12 = g0VarR0.f106835c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = g0VarR0.f106835c;
                int i15 = (i12 + i10) - i14;
                g0VarR0.f106835c = i14 + i15;
                b0(e0() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    g0 g0VarR02 = r0(2);
                    byte[] bArr2 = g0VarR02.f106833a;
                    int i16 = g0VarR02.f106835c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarR02.f106835c = i16 + 2;
                    b0(e0() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    g0 g0VarR03 = r0(3);
                    byte[] bArr3 = g0VarR03.f106833a;
                    int i17 = g0VarR03.f106835c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarR03.f106835c = i17 + 3;
                    b0(e0() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        g0 g0VarR04 = r0(4);
                        byte[] bArr4 = g0VarR04.f106833a;
                        int i20 = g0VarR04.f106835c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        g0VarR04.f106835c = i20 + 4;
                        b0(e0() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // vh.j0
    public void H(e source, long j10) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        vh.b.b(source.e0(), 0L, j10);
        while (j10 > 0) {
            g0 g0Var2 = source.f106814b;
            Intrinsics.checkNotNull(g0Var2);
            int i10 = g0Var2.f106835c;
            Intrinsics.checkNotNull(source.f106814b);
            if (j10 < i10 - r1.f106834b) {
                g0 g0Var3 = this.f106814b;
                if (g0Var3 != null) {
                    Intrinsics.checkNotNull(g0Var3);
                    g0Var = g0Var3.f106839g;
                } else {
                    g0Var = null;
                }
                if (g0Var != null && g0Var.f106837e) {
                    if ((((long) g0Var.f106835c) + j10) - ((long) (g0Var.f106836d ? 0 : g0Var.f106834b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        g0 g0Var4 = source.f106814b;
                        Intrinsics.checkNotNull(g0Var4);
                        g0Var4.f(g0Var, (int) j10);
                        source.b0(source.e0() - j10);
                        b0(e0() + j10);
                        return;
                    }
                }
                g0 g0Var5 = source.f106814b;
                Intrinsics.checkNotNull(g0Var5);
                source.f106814b = g0Var5.e((int) j10);
            }
            g0 g0Var6 = source.f106814b;
            Intrinsics.checkNotNull(g0Var6);
            long j11 = g0Var6.f106835c - g0Var6.f106834b;
            source.f106814b = g0Var6.b();
            g0 g0Var7 = this.f106814b;
            if (g0Var7 == null) {
                this.f106814b = g0Var6;
                g0Var6.f106839g = g0Var6;
                g0Var6.f106838f = g0Var6;
            } else {
                Intrinsics.checkNotNull(g0Var7);
                g0 g0Var8 = g0Var7.f106839g;
                Intrinsics.checkNotNull(g0Var8);
                g0Var8.c(g0Var6).a();
            }
            source.b0(source.e0() - j11);
            b0(e0() + j11);
            j10 -= j11;
        }
    }

    public e H0(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            g0 g0VarR0 = r0(2);
            byte[] bArr = g0VarR0.f106833a;
            int i11 = g0VarR0.f106835c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            g0VarR0.f106835c = i11 + 2;
            b0(e0() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            g0 g0VarR02 = r0(3);
            byte[] bArr2 = g0VarR02.f106833a;
            int i12 = g0VarR02.f106835c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            g0VarR02.f106835c = i12 + 3;
            b0(e0() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + vh.b.j(i10));
        }
        g0 g0VarR03 = r0(4);
        byte[] bArr3 = g0VarR03.f106833a;
        int i13 = g0VarR03.f106835c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        g0VarR03.f106835c = i13 + 4;
        b0(e0() + 4);
        return this;
    }

    public long M(h bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.K() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long jE0 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            return -1L;
        }
        if (e0() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (g0Var.f106835c - g0Var.f106834b)) + jE0;
                if (j12 > j11) {
                    break;
                }
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                jE0 = j12;
            }
            byte[] bArrV = bytes.v();
            byte b10 = bArrV[0];
            int iK = bytes.K();
            long jE02 = (e0() - ((long) iK)) + 1;
            while (jE0 < jE02) {
                byte[] bArr = g0Var.f106833a;
                int iMin = (int) Math.min(g0Var.f106835c, (((long) g0Var.f106834b) + jE02) - jE0);
                i10 = (int) ((((long) g0Var.f106834b) + j11) - jE0);
                while (i10 < iMin) {
                    if (bArr[i10] == b10 && wh.a.b(g0Var, i10 + 1, bArrV, 1, iK)) {
                    }
                    i10++;
                }
                jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                j11 = jE0;
            }
            return -1L;
        }
        jE0 = e0();
        while (jE0 > j11) {
            g0Var = g0Var.f106839g;
            Intrinsics.checkNotNull(g0Var);
            jE0 -= (long) (g0Var.f106835c - g0Var.f106834b);
        }
        byte[] bArrV2 = bytes.v();
        byte b11 = bArrV2[0];
        int iK2 = bytes.K();
        long jE03 = (e0() - ((long) iK2)) + 1;
        while (jE0 < jE03) {
            byte[] bArr2 = g0Var.f106833a;
            long j13 = jE03;
            int iMin2 = (int) Math.min(g0Var.f106835c, (((long) g0Var.f106834b) + jE03) - jE0);
            i10 = (int) ((((long) g0Var.f106834b) + j11) - jE0);
            while (i10 < iMin2) {
                if (bArr2[i10] != b11 || !wh.a.b(g0Var, i10 + 1, bArrV2, 1, iK2)) {
                    i10++;
                }
            }
            jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            j11 = jE0;
            jE03 = j13;
        }
        return -1L;
        return ((long) (i10 - g0Var.f106834b)) + jE0;
    }

    public long R(h targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long jE0 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            return -1L;
        }
        if (e0() - j10 < j10) {
            jE0 = e0();
            while (jE0 > j10) {
                g0Var = g0Var.f106839g;
                Intrinsics.checkNotNull(g0Var);
                jE0 -= (long) (g0Var.f106835c - g0Var.f106834b);
            }
            if (targetBytes.K() == 2) {
                byte bL = targetBytes.l(0);
                byte bL2 = targetBytes.l(1);
                while (jE0 < e0()) {
                    byte[] bArr = g0Var.f106833a;
                    i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
                    int i12 = g0Var.f106835c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bL || b10 == bL2) {
                            i11 = g0Var.f106834b;
                        } else {
                            i10++;
                        }
                    }
                    jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                    g0Var = g0Var.f106838f;
                    Intrinsics.checkNotNull(g0Var);
                    j10 = jE0;
                }
            } else {
                byte[] bArrV = targetBytes.v();
                while (jE0 < e0()) {
                    byte[] bArr2 = g0Var.f106833a;
                    i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
                    int i13 = g0Var.f106835c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrV) {
                            if (b11 == b12) {
                                i11 = g0Var.f106834b;
                            }
                        }
                        i10++;
                    }
                    jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                    g0Var = g0Var.f106838f;
                    Intrinsics.checkNotNull(g0Var);
                    j10 = jE0;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (g0Var.f106835c - g0Var.f106834b)) + jE0;
            if (j11 > j10) {
                break;
            }
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            jE0 = j11;
        }
        if (targetBytes.K() == 2) {
            byte bL3 = targetBytes.l(0);
            byte bL4 = targetBytes.l(1);
            while (jE0 < e0()) {
                byte[] bArr3 = g0Var.f106833a;
                i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
                int i14 = g0Var.f106835c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bL3 || b13 == bL4) {
                        i11 = g0Var.f106834b;
                    } else {
                        i10++;
                    }
                }
                jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                j10 = jE0;
            }
        } else {
            byte[] bArrV2 = targetBytes.v();
            while (jE0 < e0()) {
                byte[] bArr4 = g0Var.f106833a;
                i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
                int i15 = g0Var.f106835c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrV2) {
                        if (b14 == b15) {
                            i11 = g0Var.f106834b;
                        }
                    }
                    i10++;
                }
                jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                j10 = jE0;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + jE0;
    }

    @Override // vh.g
    public long T(j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long jE0 = e0();
        if (jE0 > 0) {
            sink.H(this, jE0);
        }
        return jE0;
    }

    public boolean U(long j10, h bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || e0() - j10 < i11 || bytes.K() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (z(((long) i12) + j10) != bytes.l(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final e V(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        W(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // vh.g
    public long a0(h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return R(targetBytes, 0L);
    }

    public final void b0(long j10) {
        this.f106815c = j10;
    }

    public final long e0() {
        return this.f106815c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e0() != eVar.e0()) {
            return false;
        }
        if (e0() == 0) {
            return true;
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        g0 g0Var2 = eVar.f106814b;
        Intrinsics.checkNotNull(g0Var2);
        int i10 = g0Var.f106834b;
        int i11 = g0Var2.f106834b;
        long j10 = 0;
        while (j10 < e0()) {
            long jMin = Math.min(g0Var.f106835c - i10, g0Var2.f106835c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (g0Var.f106833a[i10] != g0Var2.f106833a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == g0Var.f106835c) {
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                i10 = g0Var.f106834b;
            }
            if (i11 == g0Var2.f106835c) {
                g0Var2 = g0Var2.f106838f;
                Intrinsics.checkNotNull(g0Var2);
                i11 = g0Var2.f106834b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // vh.g
    public boolean exhausted() {
        return this.f106815c == 0;
    }

    public int hashCode() {
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = g0Var.f106835c;
            for (int i12 = g0Var.f106834b; i12 < i11; i12++) {
                i10 = (i10 * 31) + g0Var.f106833a[i12];
            }
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
        } while (g0Var != this.f106814b);
        return i10;
    }

    @Override // vh.f
    public long i(l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public final h i0() {
        if (e0() <= SieveCacheKt.NodeLinkMask) {
            return n0((int) e0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + e0()).toString());
    }

    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // vh.g
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final void n() throws EOFException {
        skip(e0());
    }

    public final h n0(int i10) {
        if (i10 == 0) {
            return h.f106841f;
        }
        vh.b.b(e0(), 0L, i10);
        g0 g0Var = this.f106814b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(g0Var);
            int i14 = g0Var.f106835c;
            int i15 = g0Var.f106834b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            g0Var = g0Var.f106838f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        g0 g0Var2 = this.f106814b;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(g0Var2);
            bArr[i16] = g0Var2.f106833a;
            i11 += g0Var2.f106835c - g0Var2.f106834b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = g0Var2.f106834b;
            g0Var2.f106836d = true;
            i16++;
            g0Var2 = g0Var2.f106838f;
        }
        return new i0(bArr, iArr);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return q();
    }

    @Override // vh.f
    public OutputStream outputStream() {
        return new c();
    }

    public final long p() {
        long jE0 = e0();
        if (jE0 == 0) {
            return 0L;
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        g0 g0Var2 = g0Var.f106839g;
        Intrinsics.checkNotNull(g0Var2);
        int i10 = g0Var2.f106835c;
        return (i10 >= 8192 || !g0Var2.f106837e) ? jE0 : jE0 - ((long) (i10 - g0Var2.f106834b));
    }

    @Override // vh.g
    public g peek() {
        return x.d(new d0(this));
    }

    public final e q() {
        e eVar = new e();
        if (e0() == 0) {
            return eVar;
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        g0 g0VarD = g0Var.d();
        eVar.f106814b = g0VarD;
        g0VarD.f106839g = g0VarD;
        g0VarD.f106838f = g0VarD;
        for (g0 g0Var2 = g0Var.f106838f; g0Var2 != g0Var; g0Var2 = g0Var2.f106838f) {
            g0 g0Var3 = g0VarD.f106839g;
            Intrinsics.checkNotNull(g0Var3);
            Intrinsics.checkNotNull(g0Var2);
            g0Var3.c(g0Var2.d());
        }
        eVar.b0(e0());
        return eVar;
    }

    public final g0 r0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        g0 g0Var = this.f106814b;
        if (g0Var != null) {
            Intrinsics.checkNotNull(g0Var);
            g0 g0Var2 = g0Var.f106839g;
            Intrinsics.checkNotNull(g0Var2);
            return (g0Var2.f106835c + i10 > 8192 || !g0Var2.f106837e) ? g0Var2.c(h0.c()) : g0Var2;
        }
        g0 g0VarC = h0.c();
        this.f106814b = g0VarC;
        g0VarC.f106839g = g0VarC;
        g0VarC.f106838f = g0VarC;
        return g0VarC;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), g0Var.f106835c - g0Var.f106834b);
        sink.put(g0Var.f106833a, g0Var.f106834b, iMin);
        int i10 = g0Var.f106834b + iMin;
        g0Var.f106834b = i10;
        this.f106815c -= (long) iMin;
        if (i10 == g0Var.f106835c) {
            this.f106814b = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }

    @Override // vh.g
    public byte readByte() throws EOFException {
        if (e0() == 0) {
            throw new EOFException();
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106834b;
        int i11 = g0Var.f106835c;
        int i12 = i10 + 1;
        byte b10 = g0Var.f106833a[i10];
        b0(e0() - 1);
        if (i12 != i11) {
            g0Var.f106834b = i12;
            return b10;
        }
        this.f106814b = g0Var.b();
        h0.b(g0Var);
        return b10;
    }

    @Override // vh.g
    public byte[] readByteArray() {
        return readByteArray(e0());
    }

    @Override // vh.g
    public h readByteString() {
        return readByteString(e0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new vh.e().y0(r8).x0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // vh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.e.readDecimalLong():long");
    }

    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // vh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.e0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            vh.g0 r6 = r14.f106814b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.f106833a
            int r8 = r6.f106834b
            int r9 = r6.f106835c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            vh.e r0 = new vh.e
            r0.<init>()
            vh.e r0 = r0.writeHexadecimalUnsignedLong(r4)
            vh.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = vh.b.i(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            vh.g0 r7 = r6.b()
            r14.f106814b = r7
            vh.h0.b(r6)
            goto La1
        L9f:
            r6.f106834b = r8
        La1:
            if (r1 != 0) goto La7
            vh.g0 r6 = r14.f106814b
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.e0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b0(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.e.readHexadecimalUnsignedLong():long");
    }

    @Override // vh.g
    public int readInt() throws EOFException {
        if (e0() < 4) {
            throw new EOFException();
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106834b;
        int i11 = g0Var.f106835c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = g0Var.f106833a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        b0(e0() - 4);
        if (i14 != i11) {
            g0Var.f106834b = i14;
            return i15;
        }
        this.f106814b = g0Var.b();
        h0.b(g0Var);
        return i15;
    }

    @Override // vh.g
    public int readIntLe() {
        return vh.b.f(readInt());
    }

    public long readLong() throws EOFException {
        if (e0() < 8) {
            throw new EOFException();
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106834b;
        int i11 = g0Var.f106835c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = g0Var.f106833a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        b0(e0() - 8);
        if (i13 != i11) {
            g0Var.f106834b = i13;
            return j11;
        }
        this.f106814b = g0Var.b();
        h0.b(g0Var);
        return j11;
    }

    @Override // vh.g
    public long readLongLe() {
        return vh.b.g(readLong());
    }

    @Override // vh.g
    public short readShort() throws EOFException {
        if (e0() < 2) {
            throw new EOFException();
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106834b;
        int i11 = g0Var.f106835c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = g0Var.f106833a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        b0(e0() - 2);
        if (i14 == i11) {
            this.f106814b = g0Var.b();
            h0.b(g0Var);
        } else {
            g0Var.f106834b = i14;
        }
        return (short) i15;
    }

    @Override // vh.g
    public short readShortLe() {
        return vh.b.h(readShort());
    }

    @Override // vh.g
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.f106815c, charset);
    }

    public String readUtf8() {
        return readString(this.f106815c, Charsets.UTF_8);
    }

    @Override // vh.g
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return wh.a.c(this, jIndexOf);
        }
        if (e0() != 0) {
            return readUtf8(e0());
        }
        return null;
    }

    @Override // vh.g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // vh.g
    public boolean request(long j10) {
        return this.f106815c >= j10;
    }

    @Override // vh.g
    public void require(long j10) throws EOFException {
        if (this.f106815c < j10) {
            throw new EOFException();
        }
    }

    public final e s(e out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        vh.b.b(e0(), j12, j11);
        if (j11 != 0) {
            out.b0(out.e0() + j11);
            g0 g0Var = this.f106814b;
            while (true) {
                Intrinsics.checkNotNull(g0Var);
                int i10 = g0Var.f106835c;
                int i11 = g0Var.f106834b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                g0Var = g0Var.f106838f;
            }
            g0 g0Var2 = g0Var;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.checkNotNull(g0Var2);
                g0 g0VarD = g0Var2.d();
                int i12 = g0VarD.f106834b + ((int) j12);
                g0VarD.f106834b = i12;
                g0VarD.f106835c = Math.min(i12 + ((int) j13), g0VarD.f106835c);
                g0 g0Var3 = out.f106814b;
                if (g0Var3 == null) {
                    g0VarD.f106839g = g0VarD;
                    g0VarD.f106838f = g0VarD;
                    out.f106814b = g0VarD;
                } else {
                    Intrinsics.checkNotNull(g0Var3);
                    g0 g0Var4 = g0Var3.f106839g;
                    Intrinsics.checkNotNull(g0Var4);
                    g0Var4.c(g0VarD);
                }
                j13 -= (long) (g0VarD.f106835c - g0VarD.f106834b);
                g0Var2 = g0Var2.f106838f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public e r(h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.T(this, 0, byteString.K());
        return this;
    }

    @Override // vh.g
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            g0 g0Var = this.f106814b;
            if (g0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, g0Var.f106835c - g0Var.f106834b);
            long j11 = iMin;
            b0(e0() - j11);
            j10 -= j11;
            int i10 = g0Var.f106834b + iMin;
            g0Var.f106834b = i10;
            if (i10 == g0Var.f106835c) {
                this.f106814b = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    @Override // vh.g
    public boolean t(long j10, h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return U(j10, bytes, 0, bytes.K());
    }

    @Override // vh.f
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // vh.l0
    public m0 timeout() {
        return m0.f106880e;
    }

    public String toString() {
        return i0().toString();
    }

    @Override // vh.f
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        vh.b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            g0 g0VarR0 = r0(1);
            int iMin = Math.min(i12 - i10, 8192 - g0VarR0.f106835c);
            int i13 = i10 + iMin;
            ArraysKt.copyInto(source, g0VarR0.f106833a, g0VarR0.f106835c, i10, i13);
            g0VarR0.f106835c += iMin;
            i10 = i13;
        }
        b0(e0() + j10);
        return this;
    }

    @Override // vh.g
    public int w0(a0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iE = wh.a.e(this, options, false, 2, null);
        if (iE == -1) {
            return -1;
        }
        skip(options.i()[iE].K());
        return iE;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public e writeByte(int i10) {
        g0 g0VarR0 = r0(1);
        byte[] bArr = g0VarR0.f106833a;
        int i11 = g0VarR0.f106835c;
        g0VarR0.f106835c = i11 + 1;
        bArr[i11] = (byte) i10;
        b0(e0() + 1);
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public e writeDecimalLong(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        g0 g0VarR0 = r0(i10);
        byte[] bArr = g0VarR0.f106833a;
        int i11 = g0VarR0.f106835c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = wh.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        g0VarR0.f106835c += i10;
        b0(e0() + ((long) i10));
        return this;
    }

    public final byte z(long j10) {
        vh.b.b(e0(), j10, 1L);
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (e0() - j10 < j10) {
            long jE0 = e0();
            while (jE0 > j10) {
                g0Var = g0Var.f106839g;
                Intrinsics.checkNotNull(g0Var);
                jE0 -= (long) (g0Var.f106835c - g0Var.f106834b);
            }
            Intrinsics.checkNotNull(g0Var);
            return g0Var.f106833a[(int) ((((long) g0Var.f106834b) + j10) - jE0)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (g0Var.f106835c - g0Var.f106834b)) + j11;
            if (j12 > j10) {
                Intrinsics.checkNotNull(g0Var);
                return g0Var.f106833a[(int) ((((long) g0Var.f106834b) + j10) - j11)];
            }
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            j11 = j12;
        }
    }

    @Override // vh.f
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public e writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        g0 g0VarR0 = r0(i10);
        byte[] bArr = g0VarR0.f106833a;
        int i11 = g0VarR0.f106835c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = wh.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        g0VarR0.f106835c += i10;
        b0(e0() + ((long) i10));
        return this;
    }

    public static final class b extends InputStream implements AutoCloseable {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.e0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.e0() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return e.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public long indexOf(byte b10, long j10, long j11) {
        g0 g0Var;
        int i10;
        long jE0 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + e0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > e0()) {
            j11 = e0();
        }
        if (j10 == j11 || (g0Var = this.f106814b) == null) {
            return -1L;
        }
        if (e0() - j10 < j10) {
            jE0 = e0();
            while (jE0 > j10) {
                g0Var = g0Var.f106839g;
                Intrinsics.checkNotNull(g0Var);
                jE0 -= (long) (g0Var.f106835c - g0Var.f106834b);
            }
            while (jE0 < j11) {
                byte[] bArr = g0Var.f106833a;
                int iMin = (int) Math.min(g0Var.f106835c, (((long) g0Var.f106834b) + j11) - jE0);
                i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
                g0Var = g0Var.f106838f;
                Intrinsics.checkNotNull(g0Var);
                j10 = jE0;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (g0Var.f106835c - g0Var.f106834b)) + jE0;
            if (j12 > j10) {
                break;
            }
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            jE0 = j12;
        }
        while (jE0 < j11) {
            byte[] bArr2 = g0Var.f106833a;
            int iMin2 = (int) Math.min(g0Var.f106835c, (((long) g0Var.f106834b) + j11) - jE0);
            i10 = (int) ((((long) g0Var.f106834b) + j10) - jE0);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            jE0 += (long) (g0Var.f106835c - g0Var.f106834b);
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            j10 = jE0;
        }
        return -1L;
        return ((long) (i10 - g0Var.f106834b)) + jE0;
    }

    @Override // vh.g
    public byte[] readByteArray(long j10) throws EOFException {
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (e0() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // vh.g
    public h readByteString(long j10) throws EOFException {
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (e0() < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new h(readByteArray(j10));
        }
        h hVarN0 = n0((int) j10);
        skip(j10);
        return hVarN0;
    }

    public String readString(long j10, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f106815c < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        g0 g0Var = this.f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106834b;
        if (((long) i10) + j10 > g0Var.f106835c) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(g0Var.f106833a, i10, i11, charset);
        int i12 = g0Var.f106834b + i11;
        g0Var.f106834b = i12;
        this.f106815c -= j10;
        if (i12 == g0Var.f106835c) {
            this.f106814b = g0Var.b();
            h0.b(g0Var);
        }
        return str;
    }

    @Override // vh.g
    public String readUtf8(long j10) throws EOFException {
        return readString(j10, Charsets.UTF_8);
    }

    @Override // vh.g
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return wh.a.c(this, jIndexOf);
        }
        if (j11 < e0() && z(j11 - 1) == 13 && z(j11) == 10) {
            return wh.a.c(this, j11);
        }
        e eVar = new e();
        s(eVar, 0L, Math.min(32, e0()));
        throw new EOFException("\\n not found: limit=" + Math.min(e0(), j10) + " content=" + eVar.readByteString().r() + (char) 8230);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            g0 g0VarR0 = r0(1);
            int iMin = Math.min(i10, 8192 - g0VarR0.f106835c);
            source.get(g0VarR0.f106833a, g0VarR0.f106835c, iMin);
            i10 -= iMin;
            g0VarR0.f106835c += iMin;
        }
        this.f106815c += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        vh.b.b(sink.length, i10, i11);
        g0 g0Var = this.f106814b;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, g0Var.f106835c - g0Var.f106834b);
        byte[] bArr = g0Var.f106833a;
        int i12 = g0Var.f106834b;
        ArraysKt.copyInto(bArr, sink, i10, i12, i12 + iMin);
        g0Var.f106834b += iMin;
        b0(e0() - ((long) iMin));
        if (g0Var.f106834b == g0Var.f106835c) {
            this.f106814b = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }

    @Override // vh.g
    public e buffer() {
        return this;
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // vh.f, vh.j0, java.io.Flushable
    public void flush() {
    }

    @Override // vh.g, vh.f
    public e getBuffer() {
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e emit() {
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e emitCompleteSegments() {
        return this;
    }

    @Override // vh.l0
    public long read(e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (e0() == 0) {
            return -1L;
        }
        if (j10 > e0()) {
            j10 = e0();
        }
        sink.H(this, j10);
        return j10;
    }
}
