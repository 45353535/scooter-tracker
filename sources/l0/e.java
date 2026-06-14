package l0;

import android.graphics.Path;

/* JADX INFO: loaded from: classes5.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f93726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f93727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.c f93728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.d f93729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.f f93730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0.f f93731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f93732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k0.b f93733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k0.b f93734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f93735j;

    public e(String str, g gVar, Path.FillType fillType, k0.c cVar, k0.d dVar, k0.f fVar, k0.f fVar2, k0.b bVar, k0.b bVar2, boolean z10) {
        this.f93726a = gVar;
        this.f93727b = fillType;
        this.f93728c = cVar;
        this.f93729d = dVar;
        this.f93730e = fVar;
        this.f93731f = fVar2;
        this.f93732g = str;
        this.f93733h = bVar;
        this.f93734i = bVar2;
        this.f93735j = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.h(oVar, iVar, bVar, this);
    }

    public k0.f b() {
        return this.f93731f;
    }

    public Path.FillType c() {
        return this.f93727b;
    }

    public k0.c d() {
        return this.f93728c;
    }

    public g e() {
        return this.f93726a;
    }

    public String f() {
        return this.f93732g;
    }

    public k0.d g() {
        return this.f93729d;
    }

    public k0.f h() {
        return this.f93730e;
    }

    public boolean i() {
        return this.f93735j;
    }
}
