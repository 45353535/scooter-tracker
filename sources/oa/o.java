package oa;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96617c;

    private o(int i10, int i11, String str) {
        this.f96615a = i10;
        this.f96616b = i11;
        this.f96617c = str;
    }

    public static o a(q9.d0 d0Var) {
        String str;
        d0Var.X(2);
        int iH = d0Var.H();
        int i10 = iH >> 1;
        int iH2 = ((d0Var.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iH2 < 10 ? ".0" : ".");
        sb2.append(iH2);
        return new o(i10, iH2, sb2.toString());
    }
}
