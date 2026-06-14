package j0;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f85452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f85453c;

    public h(String str, float f10, float f11) {
        this.f85451a = str;
        this.f85453c = f11;
        this.f85452b = f10;
    }

    public boolean a(String str) {
        if (this.f85451a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f85451a.endsWith("\r")) {
            String str2 = this.f85451a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
