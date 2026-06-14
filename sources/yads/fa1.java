package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fa1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110677c;

    public fa1(String str, String str2) {
        super(str);
        this.f110676b = str;
        this.f110677c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f110676b;
    }
}
