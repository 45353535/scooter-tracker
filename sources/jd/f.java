package jd;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f85814b;

    public f(String str) {
        this.f85813a = str;
    }

    public String toString() {
        if (this.f85814b == null) {
            this.f85814b = this.f85813a + " @" + Integer.toHexString(hashCode());
        }
        return this.f85814b;
    }
}
