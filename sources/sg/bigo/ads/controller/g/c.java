package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.controller.b.d f103707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg.bigo.ads.common.g f103708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.api.b f103709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sg.bigo.ads.api.a.l f103710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> f103711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f103712f;

    public c(sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        this.f103707a = dVar;
        this.f103708b = gVar;
        this.f103709c = bVar;
        this.f103710d = lVar;
        this.f103711e = eVar;
        bVar.a(gVar.Q(), gVar.R(), gVar.S());
        this.f103712f = sg.bigo.ads.common.y.a.a();
    }

    @Override // sg.bigo.ads.controller.g.i
    public final int a() {
        return this.f103712f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // sg.bigo.ads.controller.g.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.g.c.b():void");
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.b k() {
        return this.f103709c;
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.a.l l() {
        return this.f103710d;
    }

    private void a(int i10, int i11, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar = this.f103711e;
        if (eVar != null) {
            eVar.a(this.f103712f, i10, i11, str, this.f103710d);
        }
    }
}
