package y;

/* JADX INFO: loaded from: classes5.dex */
public enum a {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f108208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f108209c;

    a(boolean z10, boolean z11) {
        this.f108208b = z10;
        this.f108209c = z11;
    }

    public final boolean g() {
        return this.f108208b;
    }

    public final boolean h() {
        return this.f108209c;
    }
}
