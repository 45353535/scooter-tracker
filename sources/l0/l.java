package l0;

/* JADX INFO: loaded from: classes5.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.o f93805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.o f93806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.b f93807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93808e;

    public l(String str, k0.o oVar, k0.o oVar2, k0.b bVar, boolean z10) {
        this.f93804a = str;
        this.f93805b = oVar;
        this.f93806c = oVar2;
        this.f93807d = bVar;
        this.f93808e = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.o(oVar, bVar, this);
    }

    public k0.b b() {
        return this.f93807d;
    }

    public String c() {
        return this.f93804a;
    }

    public k0.o d() {
        return this.f93805b;
    }

    public k0.o e() {
        return this.f93806c;
    }

    public boolean f() {
        return this.f93808e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f93805b + ", size=" + this.f93806c + '}';
    }
}
