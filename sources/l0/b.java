package l0;

/* JADX INFO: loaded from: classes5.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.o f93720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.f f93721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93723e;

    public b(String str, k0.o oVar, k0.f fVar, boolean z10, boolean z11) {
        this.f93719a = str;
        this.f93720b = oVar;
        this.f93721c = fVar;
        this.f93722d = z10;
        this.f93723e = z11;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.f(oVar, bVar, this);
    }

    public String b() {
        return this.f93719a;
    }

    public k0.o c() {
        return this.f93720b;
    }

    public k0.f d() {
        return this.f93721c;
    }

    public boolean e() {
        return this.f93723e;
    }

    public boolean f() {
        return this.f93722d;
    }
}
