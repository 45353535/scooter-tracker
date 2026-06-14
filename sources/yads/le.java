package yads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class le implements xo0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f113049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f113050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f113051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f113052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113053t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f113057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f113060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f113061h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f113063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f113064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ap0 f113065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z43 f113066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public nu2 f113067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f113068o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113055b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f113054a = new byte[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113062i = -1;

    static {
        new cp0() { // from class: yads.oi
            @Override // yads.cp0
            public final xo0[] a() {
                return le.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
        f113049p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f113050q = iArr;
        f113051r = w83.c("#!AMR\n");
        f113052s = w83.c("#!AMR-WB\n");
        f113053t = iArr[8];
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f113065l = ap0Var;
        this.f113066m = ap0Var.a(0, 1);
        ap0Var.a();
    }

    @Override // yads.xo0
    public final void release() {
    }

    public final int a(yc0 yc0Var) throws ba2 {
        boolean z10;
        yc0Var.f118154f = 0;
        yc0Var.b(this.f113054a, 0, 1, false);
        byte b10 = this.f113054a[0];
        if ((b10 & 131) > 0) {
            throw new ba2(he2.a("Invalid padding bits for frame header ", b10), null, true, 1);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f113056c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f113050q[i10] : f113049p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f113056c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new ba2(sb2.toString(), null, true, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r20, yads.be2 r21) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.le.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f113057d = 0L;
        this.f113058e = 0;
        this.f113059f = 0;
        if (j10 != 0) {
            nu2 nu2Var = this.f113067n;
            if (nu2Var instanceof sy) {
                sy syVar = (sy) nu2Var;
                this.f113064k = sy.a(syVar.f115977e, j10, syVar.f115974b);
                return;
            }
        }
        this.f113064k = 0L;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var = (yc0) yo0Var;
        byte[] bArr = f113051r;
        yc0Var.f118154f = 0;
        byte[] bArr2 = new byte[bArr.length];
        yc0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f113056c = false;
            yc0Var.a(bArr.length);
            return true;
        }
        byte[] bArr3 = f113052s;
        yc0Var.f118154f = 0;
        byte[] bArr4 = new byte[bArr3.length];
        yc0Var.b(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f113056c = true;
        yc0Var.a(bArr3.length);
        return true;
    }

    public static xo0[] a() {
        return new xo0[]{new le()};
    }
}
