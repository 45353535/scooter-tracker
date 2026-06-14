package l0;

/* JADX INFO: loaded from: classes5.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.h f93830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93831d;

    public r(String str, int i10, k0.h hVar, boolean z10) {
        this.f93828a = str;
        this.f93829b = i10;
        this.f93830c = hVar;
        this.f93831d = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.r(oVar, bVar, this);
    }

    public String b() {
        return this.f93828a;
    }

    public k0.h c() {
        return this.f93830c;
    }

    public boolean d() {
        return this.f93831d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f93828a + ", index=" + this.f93829b + '}';
    }
}
