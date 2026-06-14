package l0;

/* JADX INFO: loaded from: classes5.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.o f93815b;

    public n(String str, k0.o oVar) {
        this.f93814a = str;
        this.f93815b = oVar;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.q(oVar, bVar, this);
    }

    public k0.o b() {
        return this.f93815b;
    }

    public String c() {
        return this.f93814a;
    }
}
