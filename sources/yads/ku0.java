package yads;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ku0 extends l13 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public nu0 f112857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ju0 f112858o;

    @Override // yads.l13
    public final long a(w92 w92Var) {
        int i10;
        int i11;
        int iM;
        byte[] bArr = w92Var.f117356a;
        int i12 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i13 = (bArr[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            w92Var.e(w92Var.f117357b + 4);
            w92Var.s();
        }
        switch (i13) {
            case 1:
                i12 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i13 - 2;
                i11 = 576;
                i12 = i11 << i10;
                break;
            case 6:
                iM = w92Var.m();
                i12 = iM + 1;
                break;
            case 7:
                iM = w92Var.r();
                i12 = iM + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i13 - 8;
                i11 = 256;
                i12 = i11 << i10;
                break;
        }
        w92Var.e(0);
        return i12;
    }

    @Override // yads.l13
    public final boolean a(w92 w92Var, long j10, j13 j13Var) {
        byte[] bArr = w92Var.f117356a;
        nu0 nu0Var = this.f112857n;
        if (nu0Var == null) {
            nu0 nu0Var2 = new nu0(17, bArr);
            this.f112857n = nu0Var2;
            j13Var.f112218a = nu0Var2.a(Arrays.copyOfRange(bArr, 9, w92Var.f117358c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Ascii.DEL) == 3) {
            mu0 mu0VarA = iu0.a(w92Var);
            nu0 nu0Var3 = new nu0(nu0Var.f114034a, nu0Var.f114035b, nu0Var.f114036c, nu0Var.f114037d, nu0Var.f114038e, nu0Var.f114040g, nu0Var.f114041h, nu0Var.f114043j, mu0VarA, nu0Var.f114045l);
            this.f112857n = nu0Var3;
            this.f112858o = new ju0(nu0Var3, mu0VarA);
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        ju0 ju0Var = this.f112858o;
        if (ju0Var != null) {
            ju0Var.f112462c = j10;
            j13Var.f112219b = ju0Var;
        }
        j13Var.f112218a.getClass();
        return false;
    }

    @Override // yads.l13
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f112857n = null;
            this.f112858o = null;
        }
    }
}
