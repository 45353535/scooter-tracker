package yads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import com.google.common.primitives.UnsignedBytes;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class nh1 implements xo0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f113876c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f113877d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f113878e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f113879f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final UUID f113880g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Map f113881h0;
    public wf1 C;
    public wf1 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pk0 f113882a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f113883a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k93 f113884b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ap0 f113885b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f113886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w92 f113888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w92 f113889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w92 f113890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w92 f113891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w92 f113892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w92 f113893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w92 f113894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w92 f113895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w92 f113896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w92 f113897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f113898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f113899p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public mh1 f113904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f113905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f113907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f113908y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f113900q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f113901r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f113902s = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f113903t = -9223372036854775807L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f113909z = -1;
    public long A = -1;
    public long B = -9223372036854775807L;

    static {
        new cp0() { // from class: yads.vr
            @Override // yads.cp0
            public final xo0[] a() {
                return nh1.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
        f113876c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f113877d0 = w83.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f113878e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f113879f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f113880g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        kh1.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        kh1.a(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f113881h0 = DesugarCollections.unmodifiableMap(map);
    }

    public nh1(wc0 wc0Var, int i10) {
        this.f113882a = wc0Var;
        wc0Var.a(new lh1(this));
        this.f113887d = (i10 & 1) == 0;
        this.f113884b = new k93();
        this.f113886c = new SparseArray();
        this.f113890g = new w92(4);
        this.f113891h = new w92(ByteBuffer.allocate(4).putInt(-1).array());
        this.f113892i = new w92(4);
        this.f113888e = new w92(pw1.f114801a);
        this.f113889f = new w92(4);
        this.f113893j = new w92();
        this.f113894k = new w92();
        this.f113895l = new w92(8);
        this.f113896m = new w92();
        this.f113897n = new w92();
        this.L = new int[1];
    }

    public final void a(int i10) throws ba2 {
        if (this.f113904u != null) {
            return;
        }
        throw new ba2("Element " + i10 + " must be in a TrackEntry", null, true, 1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0a76  */
    /* JADX WARN: Type inference failed for: r2v160 */
    /* JADX WARN: Type inference failed for: r2v161, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r30) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 3292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nh1.b(int):void");
    }

    @Override // yads.xo0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.mh1 r23, long r24, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nh1.a(yads.mh1, long, int, int, int):void");
    }

    public static byte[] a(String str, long j10, long j11) {
        if (j10 != -9223372036854775807L) {
            int i10 = (int) (j10 / 3600000000L);
            long j12 = j10 - (((long) i10) * 3600000000L);
            int i11 = (int) (j12 / 60000000);
            long j13 = j12 - (((long) i11) * 60000000);
            int i12 = (int) (j13 / 1000000);
            return w83.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f113885b0 = ap0Var;
    }

    @Override // yads.xo0
    public final int a(yo0 yo0Var, be2 be2Var) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            yc0 yc0Var = (yc0) yo0Var;
            zA = ((wc0) this.f113882a).a(yc0Var);
            if (zA) {
                long j10 = yc0Var.f118152d;
                if (this.f113908y) {
                    this.A = j10;
                    be2Var.f108980a = this.f113909z;
                    this.f113908y = false;
                } else if (this.f113905v) {
                    long j11 = this.A;
                    if (j11 != -1) {
                        be2Var.f108980a = j11;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f113886c.size(); i10++) {
            mh1 mh1Var = (mh1) this.f113886c.valueAt(i10);
            mh1Var.X.getClass();
            m63 m63Var = mh1Var.T;
            if (m63Var != null) {
                z43 z43Var = mh1Var.X;
                y43 y43Var = mh1Var.f113486j;
                if (m63Var.f113335c > 0) {
                    z43Var.a(m63Var.f113336d, m63Var.f113337e, m63Var.f113338f, m63Var.f113339g, y43Var);
                    m63Var.f113335c = 0;
                }
            }
        }
        return -1;
    }

    public final void a(yc0 yc0Var, int i10) throws EOFException, InterruptedIOException {
        w92 w92Var = this.f113890g;
        if (w92Var.f117358c >= i10) {
            return;
        }
        byte[] bArr = w92Var.f117356a;
        if (bArr.length < i10) {
            w92Var.a(Math.max(bArr.length * 2, i10));
        }
        w92 w92Var2 = this.f113890g;
        byte[] bArr2 = w92Var2.f117356a;
        int i11 = w92Var2.f117358c;
        yc0Var.a(bArr2, i11, i10 - i11, false);
        this.f113890g.d(i10);
    }

    public final long a(long j10) throws ba2 {
        long j11 = this.f113901r;
        if (j11 != -9223372036854775807L) {
            return w83.a(j10, j11, 1000L);
        }
        throw new ba2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((wc0) this.f113882a).a();
        k93 k93Var = this.f113884b;
        k93Var.f112656b = 0;
        k93Var.f112657c = 0;
        b();
        for (int i10 = 0; i10 < this.f113886c.size(); i10++) {
            m63 m63Var = ((mh1) this.f113886c.valueAt(i10)).T;
            if (m63Var != null) {
                m63Var.f113334b = false;
                m63Var.f113335c = 0;
            }
        }
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        fz2 fz2Var = new fz2();
        yc0 yc0Var = (yc0) yo0Var;
        long j10 = yc0Var.f118151c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        yc0Var.b(fz2Var.f110992a.f117356a, 0, 4, false);
        long jN = fz2Var.f110992a.n();
        fz2Var.f110993b = 4;
        while (true) {
            if (jN != 440786851) {
                int i11 = fz2Var.f110993b + 1;
                fz2Var.f110993b = i11;
                if (i11 == i10) {
                    break;
                }
                yc0Var.b(fz2Var.f110992a.f117356a, 0, 1, false);
                jN = ((jN << 8) & (-256)) | ((long) (fz2Var.f110992a.f117356a[0] & 255));
            } else {
                long jA = fz2Var.a(yc0Var);
                long j12 = fz2Var.f110993b;
                if (jA != Long.MIN_VALUE && (j10 == -1 || j12 + jA < j10)) {
                    while (true) {
                        long j13 = fz2Var.f110993b;
                        long j14 = j12 + jA;
                        if (j13 < j14) {
                            if (fz2Var.a(yc0Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = fz2Var.a(yc0Var);
                            if (jA2 < 0 || jA2 > SieveCacheKt.NodeLinkMask) {
                                break;
                            }
                            if (jA2 != 0) {
                                int i12 = (int) jA2;
                                yc0Var.a(false, i12);
                                fz2Var.f110993b += i12;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int a(yc0 yc0Var, mh1 mh1Var, int i10, boolean z10) throws ba2, EOFException, InterruptedIOException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(mh1Var.f113478b)) {
            a(yc0Var, f113876c0, i10);
            int i12 = this.T;
            b();
            return i12;
        }
        if ("S_TEXT/ASS".equals(mh1Var.f113478b)) {
            a(yc0Var, f113878e0, i10);
            int i13 = this.T;
            b();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(mh1Var.f113478b)) {
            a(yc0Var, f113879f0, i10);
            int i14 = this.T;
            b();
            return i14;
        }
        z43 z43Var = mh1Var.X;
        if (!this.V) {
            if (mh1Var.f113484h) {
                this.O &= -1073741825;
                if (!this.W) {
                    yc0Var.a(this.f113890g.f117356a, 0, 1, false);
                    this.S++;
                    byte b10 = this.f113890g.f117356a[0];
                    if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                        this.Z = b10;
                        this.W = true;
                    } else {
                        throw new ba2("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z11 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f113883a0) {
                        yc0Var.a(this.f113895l.f117356a, 0, 8, false);
                        this.S += 8;
                        this.f113883a0 = true;
                        w92 w92Var = this.f113890g;
                        w92Var.f117356a[0] = (byte) ((z11 ? 128 : 0) | 8);
                        w92Var.e(0);
                        z43Var.a(1, this.f113890g);
                        this.T++;
                        this.f113895l.e(0);
                        z43Var.a(8, this.f113895l);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            yc0Var.a(this.f113890g.f117356a, 0, 1, false);
                            this.S++;
                            this.f113890g.e(0);
                            this.Y = this.f113890g.m();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        this.f113890g.c(i15);
                        yc0Var.a(this.f113890g.f117356a, 0, i15, false);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f113898o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f113898o = ByteBuffer.allocate(i16);
                        }
                        this.f113898o.position(0);
                        this.f113898o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int iP = this.f113890g.p();
                            if (i17 % 2 == 0) {
                                this.f113898o.putShort((short) (iP - i18));
                            } else {
                                this.f113898o.putInt(iP - i18);
                            }
                            i17++;
                            i18 = iP;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f113898o.putInt(i19);
                        } else {
                            this.f113898o.putShort((short) i19);
                            this.f113898o.putInt(0);
                        }
                        w92 w92Var2 = this.f113896m;
                        w92Var2.f117356a = this.f113898o.array();
                        w92Var2.f117358c = i16;
                        w92Var2.f117357b = 0;
                        z43Var.a(i16, this.f113896m);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = mh1Var.f113485i;
                if (bArr != null) {
                    w92 w92Var3 = this.f113893j;
                    int length = bArr.length;
                    w92Var3.f117356a = bArr;
                    w92Var3.f117358c = length;
                    w92Var3.f117357b = 0;
                }
            }
            if (!"A_OPUS".equals(mh1Var.f113478b) ? mh1Var.f113482f > 0 : z10) {
                this.O |= 268435456;
                this.f113897n.c(0);
                int i20 = (this.f113893j.f117358c + i10) - this.S;
                this.f113890g.c(4);
                w92 w92Var4 = this.f113890g;
                byte[] bArr2 = w92Var4.f117356a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                z43Var.a(4, w92Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + this.f113893j.f117358c;
        if (!"V_MPEG4/ISO/AVC".equals(mh1Var.f113478b) && !"V_MPEGH/ISO/HEVC".equals(mh1Var.f113478b)) {
            m63 m63Var = mh1Var.T;
            if (m63Var != null) {
                if (this.f113893j.f117358c == 0) {
                    m63Var.a(yc0Var);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                w92 w92Var5 = this.f113893j;
                int i24 = w92Var5.f117358c - w92Var5.f117357b;
                if (i24 > 0) {
                    iA2 = Math.min(i23, i24);
                    z43Var.a(iA2, this.f113893j);
                } else {
                    iA2 = z43Var.a(yc0Var, i23, false);
                }
                this.S += iA2;
                this.T += iA2;
            }
        } else {
            byte[] bArr3 = this.f113889f.f117356a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i25 = mh1Var.Y;
            int i26 = 4 - i25;
            while (this.S < i21) {
                int i27 = this.U;
                if (i27 == 0) {
                    w92 w92Var6 = this.f113893j;
                    int iMin = Math.min(i25, w92Var6.f117358c - w92Var6.f117357b);
                    yc0Var.a(bArr3, i26 + iMin, i25 - iMin, false);
                    if (iMin > 0) {
                        this.f113893j.a(bArr3, i26, iMin);
                    }
                    this.S += i25;
                    this.f113889f.e(0);
                    this.U = this.f113889f.p();
                    this.f113888e.e(0);
                    z43Var.a(4, this.f113888e);
                    this.T += 4;
                } else {
                    w92 w92Var7 = this.f113893j;
                    int i28 = w92Var7.f117358c - w92Var7.f117357b;
                    if (i28 > 0) {
                        iA = Math.min(i27, i28);
                        z43Var.a(iA, this.f113893j);
                    } else {
                        iA = z43Var.a(yc0Var, i27, false);
                    }
                    this.S += iA;
                    this.T += iA;
                    this.U -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(mh1Var.f113478b)) {
            this.f113891h.e(0);
            z43Var.a(4, this.f113891h);
            this.T += 4;
        }
        int i29 = this.T;
        b();
        return i29;
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f113883a0 = false;
        this.f113893j.c(0);
    }

    public final void a(yc0 yc0Var, byte[] bArr, int i10) throws EOFException, InterruptedIOException {
        int length = bArr.length + i10;
        w92 w92Var = this.f113894k;
        byte[] bArr2 = w92Var.f117356a;
        if (bArr2.length < length) {
            w92Var.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        yc0Var.a(this.f113894k.f117356a, bArr.length, i10, false);
        this.f113894k.e(0);
        this.f113894k.d(length);
    }

    public static xo0[] a() {
        return new xo0[]{new nh1(new wc0(), 0)};
    }
}
