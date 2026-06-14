package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113099a;

    public li0(String str) {
        this.f113099a = str;
    }

    public static li0 a(w92 w92Var) {
        String str;
        w92Var.e(w92Var.f117357b + 2);
        int iM = w92Var.m();
        int i10 = iM >> 1;
        int iM2 = ((w92Var.m() >> 3) & 31) | ((iM & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iM2 >= 10 ? "." : ".0");
        sb2.append(iM2);
        return new li0(sb2.toString());
    }
}
