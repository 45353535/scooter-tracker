package sg.bigo.ads.controller.a.b;

import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.a.j;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.controller.a.b f103261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f103262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.controller.b.d f103263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f103264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.controller.e.e f103265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f103266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f103267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f103268h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f103269a = new d();
    }

    public final void a(String str, j jVar, j jVar2) {
        c cVar;
        if (str == null || jVar == null || jVar2 == null || !i.f102116a.x() || i.f102116a.y() <= 0 || i.f102116a.z() <= 0 || i.f102116a.A() <= 0 || this.f103261a == null) {
            return;
        }
        if (str.equals("/Ad/GetSDKConfig")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f103266f == null) {
                this.f103266f = new e(this.f103261a, this.f103262b, this.f103263c, this.f103264d);
            }
            cVar = this.f103266f;
        } else if (str.equals("/Ad/ReportUniBaina")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f103267g == null) {
                this.f103267g = new b(this.f103261a, this.f103262b, this.f103263c, this.f103264d);
            }
            cVar = this.f103267g;
        } else {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f103268h == null) {
                this.f103268h = new sg.bigo.ads.controller.a.b.a(this.f103261a, this.f103262b, this.f103263c, this.f103264d);
            }
            cVar = this.f103268h;
            ((sg.bigo.ads.controller.a.b.a) cVar).f103246a = this.f103265e;
        }
        cVar.c();
    }

    public final void a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar, sg.bigo.ads.controller.e.e eVar) {
        this.f103261a = bVar;
        this.f103262b = gVar;
        this.f103263c = dVar;
        this.f103264d = hVar;
        this.f103265e = eVar;
    }
}
