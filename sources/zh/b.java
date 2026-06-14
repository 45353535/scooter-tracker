package zh;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f119524c;

    b(int i10, String str) {
        this.f119523b = i10;
        this.f119524c = str;
    }

    public int g() {
        return this.f119523b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f119524c;
    }
}
