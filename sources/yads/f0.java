package yads;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f110535a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f110536b = new w92(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110537c;

    static {
        new cp0() { // from class: yads.n6
            @Override // yads.cp0
            public final xo0[] a() {
                return f0.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        g0 g0Var = this.f110535a;
        g0Var.getClass();
        g0Var.f110999d = "0";
        g0Var.f111000e = ap0Var.a(0, 1);
        ap0Var.a();
        ap0Var.a(new mu2(-9223372036854775807L, 0L));
    }

    @Override // yads.xo0
    public final void release() {
    }

    @Override // yads.xo0
    public final int a(yo0 yo0Var, be2 be2Var) throws EOFException, InterruptedIOException {
        int iC = ((yc0) yo0Var).c(this.f110536b.f117356a, 0, 2786);
        if (iC == -1) {
            return -1;
        }
        this.f110536b.e(0);
        this.f110536b.d(iC);
        if (!this.f110537c) {
            this.f110535a.a(4, 0L);
            this.f110537c = true;
        }
        this.f110535a.a(this.f110536b);
        return 0;
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f110537c = false;
        this.f110535a.a();
    }

    public static /* synthetic */ xo0[] a() {
        return new xo0[]{new f0()};
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var;
        int iA;
        w92 w92Var = new w92(10);
        int i10 = 0;
        while (true) {
            yc0Var = (yc0) yo0Var;
            yc0Var.b(w92Var.f117356a, 0, 10, false);
            w92Var.e(0);
            if (w92Var.o() != 4801587) {
                break;
            }
            w92Var.e(w92Var.f117357b + 3);
            int iL = w92Var.l();
            i10 += iL + 10;
            yc0Var.a(false, iL);
        }
        yc0Var.f118154f = 0;
        yc0Var.a(false, i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            yc0Var.b(w92Var.f117356a, 0, 6, false);
            w92Var.e(0);
            if (w92Var.r() != 2935) {
                yc0Var.f118154f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                yc0Var.a(false, i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = w92Var.f117356a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iA = h0.a((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                }
                if (iA == -1) {
                    return false;
                }
                yc0Var.a(false, iA - 6);
            }
        }
    }
}
