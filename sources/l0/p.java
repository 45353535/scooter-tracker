package l0;

import android.graphics.Path;

/* JADX INFO: loaded from: classes5.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f93820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f93821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.a f93822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.d f93823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f93824f;

    public p(String str, boolean z10, Path.FillType fillType, k0.a aVar, k0.d dVar, boolean z11) {
        this.f93821c = str;
        this.f93819a = z10;
        this.f93820b = fillType;
        this.f93822d = aVar;
        this.f93823e = dVar;
        this.f93824f = z11;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.g(oVar, bVar, this);
    }

    public k0.a b() {
        return this.f93822d;
    }

    public Path.FillType c() {
        return this.f93820b;
    }

    public String d() {
        return this.f93821c;
    }

    public k0.d e() {
        return this.f93823e;
    }

    public boolean f() {
        return this.f93824f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f93819a + '}';
    }
}
