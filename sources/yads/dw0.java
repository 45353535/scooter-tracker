package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z43 f110086a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a53 f110089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ae0 f110090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f110091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f110092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f110093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f110094i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f110097l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t43 f110087b = new t43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f110088c = new w92();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w92 f110095j = new w92(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w92 f110096k = new w92();

    public dw0(z43 z43Var, a53 a53Var, ae0 ae0Var) {
        this.f110086a = z43Var;
        this.f110089d = a53Var;
        this.f110090e = ae0Var;
        a(a53Var, ae0Var);
    }

    public final s43 a() {
        if (!this.f110097l) {
            return null;
        }
        t43 t43Var = this.f110087b;
        ae0 ae0Var = t43Var.f116051a;
        int i10 = w83.f117341a;
        int i11 = ae0Var.f108649a;
        s43 s43Var = t43Var.f116063m;
        if (s43Var == null) {
            s43[] s43VarArr = this.f110089d.f108566a.f115316k;
            s43Var = s43VarArr == null ? null : s43VarArr[i11];
        }
        if (s43Var == null || !s43Var.f115696a) {
            return null;
        }
        return s43Var;
    }

    public final void b() {
        t43 t43Var = this.f110087b;
        t43Var.f116054d = 0;
        t43Var.f116066p = 0L;
        t43Var.f116067q = false;
        t43Var.f116061k = false;
        t43Var.f116065o = false;
        t43Var.f116063m = null;
        this.f110091f = 0;
        this.f110093h = 0;
        this.f110092g = 0;
        this.f110094i = 0;
        this.f110097l = false;
    }

    public final int a(int i10, int i11) {
        w92 w92Var;
        s43 s43VarA = a();
        if (s43VarA == null) {
            return 0;
        }
        int length = s43VarA.f115699d;
        if (length != 0) {
            w92Var = this.f110087b.f116064n;
        } else {
            byte[] bArr = s43VarA.f115700e;
            int i12 = w83.f117341a;
            w92 w92Var2 = this.f110096k;
            int length2 = bArr.length;
            w92Var2.f117356a = bArr;
            w92Var2.f117358c = length2;
            w92Var2.f117357b = 0;
            length = bArr.length;
            w92Var = w92Var2;
        }
        t43 t43Var = this.f110087b;
        boolean z10 = t43Var.f116061k && t43Var.f116062l[this.f110091f];
        boolean z11 = z10 || i11 != 0;
        w92 w92Var3 = this.f110095j;
        w92Var3.f117356a[0] = (byte) ((z11 ? 128 : 0) | length);
        w92Var3.e(0);
        this.f110086a.a(1, this.f110095j);
        this.f110086a.a(length, w92Var);
        if (!z11) {
            return length + 1;
        }
        if (!z10) {
            this.f110088c.c(8);
            w92 w92Var4 = this.f110088c;
            byte[] bArr2 = w92Var4.f117356a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            this.f110086a.a(8, w92Var4);
            return length + 9;
        }
        w92 w92Var5 = this.f110087b.f116064n;
        int iR = w92Var5.r();
        w92Var5.e(w92Var5.f117357b - 2);
        int i13 = (iR * 6) + 2;
        if (i11 != 0) {
            this.f110088c.c(i13);
            byte[] bArr3 = this.f110088c.f117356a;
            w92Var5.a(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
            w92Var5 = this.f110088c;
        }
        this.f110086a.a(i13, w92Var5);
        return length + 1 + i13;
    }

    public final void a(a53 a53Var, ae0 ae0Var) {
        this.f110089d = a53Var;
        this.f110090e = ae0Var;
        this.f110086a.a(a53Var.f108566a.f115311f);
        b();
    }
}
