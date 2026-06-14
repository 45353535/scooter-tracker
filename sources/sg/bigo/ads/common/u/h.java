package sg.bigo.ads.common.u;

/* JADX INFO: loaded from: classes4.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f102775c;

    public h(int i10, String str) {
        this.f102773a = i10;
        this.f102774b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f102775c;
        return exc != null ? exc.getMessage() : this.f102774b;
    }
}
