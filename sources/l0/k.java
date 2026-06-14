package l0;

/* JADX INFO: loaded from: classes5.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f93790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.b f93791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.o f93792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.b f93793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0.b f93794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0.b f93795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k0.b f93796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k0.b f93797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f93798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f93799k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f93803b;

        a(int i10) {
            this.f93803b = i10;
        }

        public static a g(int i10) {
            for (a aVar : values()) {
                if (aVar.f93803b == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, k0.b bVar, k0.o oVar, k0.b bVar2, k0.b bVar3, k0.b bVar4, k0.b bVar5, k0.b bVar6, boolean z10, boolean z11) {
        this.f93789a = str;
        this.f93790b = aVar;
        this.f93791c = bVar;
        this.f93792d = oVar;
        this.f93793e = bVar2;
        this.f93794f = bVar3;
        this.f93795g = bVar4;
        this.f93796h = bVar5;
        this.f93797i = bVar6;
        this.f93798j = z10;
        this.f93799k = z11;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.n(oVar, bVar, this);
    }

    public k0.b b() {
        return this.f93794f;
    }

    public k0.b c() {
        return this.f93796h;
    }

    public String d() {
        return this.f93789a;
    }

    public k0.b e() {
        return this.f93795g;
    }

    public k0.b f() {
        return this.f93797i;
    }

    public k0.b g() {
        return this.f93791c;
    }

    public k0.o h() {
        return this.f93792d;
    }

    public k0.b i() {
        return this.f93793e;
    }

    public a j() {
        return this.f93790b;
    }

    public boolean k() {
        return this.f93798j;
    }

    public boolean l() {
        return this.f93799k;
    }
}
