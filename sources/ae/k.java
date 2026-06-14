package ae;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4268b;

    public k(String str) {
        this.f4267a = str;
    }

    public String toString() {
        if (this.f4268b == null) {
            this.f4268b = this.f4267a + " @" + Integer.toHexString(hashCode());
        }
        return this.f4268b;
    }
}
