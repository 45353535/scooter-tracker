package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zg3 extends z23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f118669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f118670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118674g;

    public zg3(z43 z43Var) {
        super(z43Var);
        this.f118669b = new w92(pw1.f114801a);
        this.f118670c = new w92(4);
    }

    public final boolean a(w92 w92Var) throws y23 {
        int iM = w92Var.m();
        int i10 = (iM >> 4) & 15;
        int i11 = iM & 15;
        if (i11 != 7) {
            throw new y23(he2.a("Video format not supported: ", i11));
        }
        this.f118674g = i10;
        return i10 != 5;
    }

    public final boolean a(long j10, w92 w92Var) throws ba2 {
        int iM = w92Var.m();
        byte[] bArr = w92Var.f117356a;
        int i10 = w92Var.f117357b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (((bArr[i10] & 255) << 24) >> 8);
        int i13 = i10 + 3;
        w92Var.f117357b = i13;
        long j11 = (((long) ((bArr[i11] & 255) | i12)) * 1000) + j10;
        if (iM == 0 && !this.f118672e) {
            byte[] bArr2 = new byte[w92Var.f117358c - i13];
            w92 w92Var2 = new w92(bArr2);
            w92Var.a(bArr2, 0, w92Var.f117358c - w92Var.f117357b);
            ml mlVarA = ml.a(w92Var2);
            this.f118671d = mlVarA.f113545b;
            xv0 xv0Var = new xv0();
            xv0Var.f117982k = "video/avc";
            xv0Var.f117979h = mlVarA.f113549f;
            xv0Var.f117987p = mlVarA.f113546c;
            xv0Var.f117988q = mlVarA.f113547d;
            xv0Var.f117991t = mlVarA.f113548e;
            xv0Var.f117984m = mlVarA.f113544a;
            this.f118528a.a(new yv0(xv0Var));
            this.f118672e = true;
            return false;
        }
        if (iM != 1 || !this.f118672e) {
            return false;
        }
        int i14 = this.f118674g == 1 ? 1 : 0;
        if (!this.f118673f && i14 == 0) {
            return false;
        }
        byte[] bArr3 = this.f118670c.f117356a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i15 = 4 - this.f118671d;
        int i16 = 0;
        while (w92Var.f117358c - w92Var.f117357b > 0) {
            w92Var.a(this.f118670c.f117356a, i15, this.f118671d);
            this.f118670c.e(0);
            int iP = this.f118670c.p();
            this.f118669b.e(0);
            this.f118528a.a(4, this.f118669b);
            this.f118528a.a(iP, w92Var);
            i16 = i16 + 4 + iP;
        }
        this.f118528a.a(j11, i14, i16, 0, null);
        this.f118673f = true;
        return true;
    }
}
