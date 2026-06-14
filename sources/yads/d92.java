package yads;

import com.applovin.shadow.okio.Utf8;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class d92 extends l13 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f109842o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f109843p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109844n;

    public static boolean a(w92 w92Var, byte[] bArr) {
        int i10 = w92Var.f117358c;
        int i11 = w92Var.f117357b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        w92Var.a(bArr2, 0, bArr.length);
        w92Var.e(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.l13
    public final long a(w92 w92Var) {
        int i10;
        byte[] bArr = w92Var.f117356a;
        byte b10 = bArr[0];
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        return (((long) this.f112920i) * (((long) i10) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? 60000 : 10000 << i14)))) / 1000000;
    }

    @Override // yads.l13
    public final boolean a(w92 w92Var, long j10, j13 j13Var) {
        if (a(w92Var, f109842o)) {
            byte[] bArrCopyOf = Arrays.copyOf(w92Var.f117356a, w92Var.f117358c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = e92.a(bArrCopyOf);
            if (j13Var.f112218a != null) {
                return true;
            }
            xv0 xv0Var = new xv0();
            xv0Var.f117982k = "audio/opus";
            xv0Var.f117995x = i10;
            xv0Var.f117996y = 48000;
            xv0Var.f117984m = arrayListA;
            j13Var.f112218a = new yv0(xv0Var);
            return true;
        }
        if (a(w92Var, f109843p)) {
            if (j13Var.f112218a != null) {
                if (this.f109844n) {
                    return true;
                }
                this.f109844n = true;
                w92Var.e(w92Var.f117357b + 8);
                fr1 fr1VarA = jk3.a(y31.b(jk3.a(w92Var, false, false).f111245a));
                if (fr1VarA == null) {
                    return true;
                }
                yv0 yv0Var = j13Var.f112218a;
                yv0Var.getClass();
                xv0 xv0Var2 = new xv0(yv0Var);
                fr1 fr1Var = j13Var.f112218a.f118396k;
                if (fr1Var != null) {
                    er1[] er1VarArr = fr1Var.f110835b;
                    if (er1VarArr.length != 0) {
                        fr1VarA = new fr1((er1[]) w83.a((Object[]) fr1VarA.f110835b, (Object[]) er1VarArr));
                    }
                }
                xv0Var2.f117980i = fr1VarA;
                j13Var.f112218a = new yv0(xv0Var2);
                return true;
            }
            throw new IllegalStateException();
        }
        if (j13Var.f112218a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // yads.l13
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f109844n = false;
        }
    }
}
