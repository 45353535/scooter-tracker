package yads;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class cl extends z23 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f109436e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109439d;

    public cl(z43 z43Var) {
        super(z43Var);
    }

    public final boolean a(w92 w92Var) throws y23 {
        if (this.f109437b) {
            w92Var.e(w92Var.f117357b + 1);
        } else {
            int iM = w92Var.m();
            int i10 = (iM >> 4) & 15;
            this.f109439d = i10;
            if (i10 == 2) {
                int i11 = f109436e[(iM >> 2) & 3];
                xv0 xv0Var = new xv0();
                xv0Var.f117982k = "audio/mpeg";
                xv0Var.f117995x = 1;
                xv0Var.f117996y = i11;
                this.f118528a.a(new yv0(xv0Var));
                this.f109438c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                xv0 xv0Var2 = new xv0();
                xv0Var2.f117982k = str;
                xv0Var2.f117995x = 1;
                xv0Var2.f117996y = 8000;
                this.f118528a.a(new yv0(xv0Var2));
                this.f109438c = true;
            } else if (i10 != 10) {
                throw new y23("Audio format not supported: " + this.f109439d);
            }
            this.f109437b = true;
        }
        return true;
    }

    public final boolean a(long j10, w92 w92Var) throws ba2 {
        if (this.f109439d == 2) {
            int i10 = w92Var.f117358c - w92Var.f117357b;
            this.f118528a.a(i10, w92Var);
            this.f118528a.a(j10, 1, i10, 0, null);
            return true;
        }
        int iM = w92Var.m();
        if (iM == 0 && !this.f109438c) {
            int i11 = w92Var.f117358c - w92Var.f117357b;
            byte[] bArr = new byte[i11];
            w92Var.a(bArr, 0, i11);
            a aVarA = b.a(new v92(i11, bArr), false);
            xv0 xv0Var = new xv0();
            xv0Var.f117982k = "audio/mp4a-latm";
            xv0Var.f117979h = aVarA.f108501c;
            xv0Var.f117995x = aVarA.f108500b;
            xv0Var.f117996y = aVarA.f108499a;
            xv0Var.f117984m = Collections.singletonList(bArr);
            this.f118528a.a(new yv0(xv0Var));
            this.f109438c = true;
            return false;
        }
        if (this.f109439d == 10 && iM != 1) {
            return false;
        }
        int i12 = w92Var.f117358c - w92Var.f117357b;
        this.f118528a.a(i12, w92Var);
        this.f118528a.a(j10, 1, i12, 0, null);
        return true;
    }
}
