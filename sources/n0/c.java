package n0;

/* JADX INFO: loaded from: classes5.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95022b;

    c(String str) {
        this.f95022b = str;
    }

    public String g() {
        return ".temp" + this.f95022b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f95022b;
    }
}
