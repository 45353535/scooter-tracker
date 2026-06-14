package yads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f111812a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f111813b = new w92(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111814c;

    static {
        new cp0() { // from class: yads.c8
            @Override // yads.cp0
            public final xo0[] a() {
                return i0.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        j0 j0Var = this.f111812a;
        j0Var.getClass();
        j0Var.f112198d = "0";
        j0Var.f112199e = ap0Var.a(0, 1);
        ap0Var.a();
        ap0Var.a(new mu2(-9223372036854775807L, 0L));
    }

    @Override // yads.xo0
    public final void release() {
    }

    @Override // yads.xo0
    public final int a(yo0 yo0Var, be2 be2Var) throws EOFException, InterruptedIOException {
        int iC = ((yc0) yo0Var).c(this.f111813b.f117356a, 0, 16384);
        if (iC == -1) {
            return -1;
        }
        this.f111813b.e(0);
        this.f111813b.d(iC);
        if (!this.f111814c) {
            this.f111812a.a(4, 0L);
            this.f111814c = true;
        }
        this.f111812a.a(this.f111813b);
        return 0;
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f111814c = false;
        this.f111812a.a();
    }

    public static /* synthetic */ xo0[] a() {
        return new xo0[]{new i0()};
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var;
        int i10;
        w92 w92Var = new w92(10);
        int i11 = 0;
        while (true) {
            yc0Var = (yc0) yo0Var;
            yc0Var.b(w92Var.f117356a, 0, 10, false);
            w92Var.e(0);
            if (w92Var.o() != 4801587) {
                break;
            }
            w92Var.e(w92Var.f117357b + 3);
            int iL = w92Var.l();
            i11 += iL + 10;
            yc0Var.a(false, iL);
        }
        yc0Var.f118154f = 0;
        yc0Var.a(false, i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            yc0Var.b(w92Var.f117356a, 0, 7, false);
            w92Var.e(0);
            int iR = w92Var.r();
            if (iR == 44096 || iR == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = w92Var.f117356a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iR == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                yc0Var.a(false, i10 - 7);
            } else {
                yc0Var.f118154f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                yc0Var.a(false, i13);
                i12 = 0;
            }
        }
    }
}
