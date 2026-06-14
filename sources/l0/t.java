package l0;

/* JADX INFO: loaded from: classes5.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f93851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.b f93852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.b f93853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.b f93854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f93855f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a g(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, k0.b bVar, k0.b bVar2, k0.b bVar3, boolean z10) {
        this.f93850a = str;
        this.f93851b = aVar;
        this.f93852c = bVar;
        this.f93853d = bVar2;
        this.f93854e = bVar3;
        this.f93855f = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.u(bVar, this);
    }

    public k0.b b() {
        return this.f93853d;
    }

    public String c() {
        return this.f93850a;
    }

    public k0.b d() {
        return this.f93854e;
    }

    public k0.b e() {
        return this.f93852c;
    }

    public a f() {
        return this.f93851b;
    }

    public boolean g() {
        return this.f93855f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f93852c + ", end: " + this.f93853d + ", offset: " + this.f93854e + "}";
    }
}
