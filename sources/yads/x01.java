package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x01 implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c30 f117663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w01 f117665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f117666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117667e;

    public x01(d13 d13Var, int i10, w01 w01Var) {
        fi.a(i10 > 0);
        this.f117663a = d13Var;
        this.f117664b = i10;
        this.f117665c = w01Var;
        this.f117666d = new byte[1];
        this.f117667e = i10;
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        this.f117663a.a(e63Var);
    }

    @Override // yads.c30
    public final Map c() {
        return this.f117663a.c();
    }

    @Override // yads.c30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f117663a.e();
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        if (this.f117667e == 0) {
            int i12 = 0;
            if (this.f117663a.c(this.f117666d, 0, 1) != -1) {
                int i13 = (this.f117666d[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iC = this.f117663a.c(bArr2, i12, i14);
                        if (iC != -1) {
                            i12 += iC;
                            i14 -= iC;
                        }
                    }
                    while (i13 > 0 && bArr2[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        w01 w01Var = this.f117665c;
                        w92 w92Var = new w92(i13, bArr2);
                        uh2 uh2Var = (uh2) w01Var;
                        long jMax = !uh2Var.f116653l ? uh2Var.f116650i : Math.max(uh2Var.f116654m.a(true), uh2Var.f116650i);
                        int i15 = w92Var.f117358c - w92Var.f117357b;
                        hq2 hq2Var = uh2Var.f116652k;
                        hq2Var.getClass();
                        hq2Var.a(i15, w92Var);
                        hq2Var.a(jMax, 1, i15, 0, (y43) null);
                        uh2Var.f116653l = true;
                    }
                }
                this.f117667e = this.f117664b;
            }
            return -1;
        }
        int iC2 = this.f117663a.c(bArr, i10, Math.min(this.f117667e, i11));
        if (iC2 != -1) {
            this.f117667e -= iC2;
        }
        return iC2;
    }

    @Override // yads.c30
    public final long a(h30 h30Var) {
        throw new UnsupportedOperationException();
    }
}
