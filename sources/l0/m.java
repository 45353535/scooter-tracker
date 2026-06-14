package l0;

/* JADX INFO: loaded from: classes5.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.b f93810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.b f93811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.n f93812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93813e;

    public m(String str, k0.b bVar, k0.b bVar2, k0.n nVar, boolean z10) {
        this.f93809a = str;
        this.f93810b = bVar;
        this.f93811c = bVar2;
        this.f93812d = nVar;
        this.f93813e = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.p(oVar, bVar, this);
    }

    public k0.b b() {
        return this.f93810b;
    }

    public String c() {
        return this.f93809a;
    }

    public k0.b d() {
        return this.f93811c;
    }

    public k0.n e() {
        return this.f93812d;
    }

    public boolean f() {
        return this.f93813e;
    }
}
