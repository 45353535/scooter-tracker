package b1;

import f1.l7;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5796c;

    public e(String str, String str2, String str3) {
        this.f5794a = b(str);
        this.f5795b = str2;
        this.f5796c = str3;
    }

    public final String a() {
        String str = this.f5795b;
        if (str == null || str.isEmpty()) {
            return this.f5794a;
        }
        return this.f5794a + " " + this.f5795b;
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(" ", "_");
        return strReplace.length() > 50 ? strReplace.substring(0, 50) : strReplace;
    }

    public l7 c() {
        if (this.f5794a == null) {
            return null;
        }
        String str = this.f5795b;
        if (str == null) {
            str = "";
        }
        String str2 = this.f5796c;
        return new l7(a(), str, str2 != null ? str2 : "");
    }
}
