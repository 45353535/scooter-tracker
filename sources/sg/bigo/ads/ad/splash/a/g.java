package sg.bigo.ads.ad.splash.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.List;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b f101990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.a f101991c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f101995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.ad.splash.b f101996h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101989a = c.a.f101953a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101992d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f101993e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101994f = false;

    static class a implements sg.bigo.ads.ad.banner.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f101999a = 13;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f102000b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.ad.splash.b f102001c;

        public a(@NonNull sg.bigo.ads.ad.splash.b bVar) {
            this.f102001c = bVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            this.f102001c.c(this.f102000b);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
            this.f102001c.f102047z.a(iVar, this.f101999a, this.f102000b, dVar);
        }
    }

    public g(@NonNull final sg.bigo.ads.ad.splash.b bVar, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar2) {
        p pVar;
        l lVar2;
        sg.bigo.ads.api.core.b bVar3;
        int i10 = 0;
        int i11 = 1;
        this.f101995g = 0;
        this.f101996h = bVar;
        sg.bigo.ads.ad.b.b bVar4 = bVar.f102047z;
        boolean z10 = bVar4 instanceof sg.bigo.ads.ad.b.c;
        sg.bigo.ads.core.player.c cVar = z10 ? ((sg.bigo.ads.ad.b.c) bVar4).I : null;
        if (z10) {
            pVar = ((sg.bigo.ads.ad.b.c) bVar4).J;
            bVar3 = bVar2;
            lVar2 = lVar;
        } else {
            pVar = null;
            lVar2 = lVar;
            bVar3 = bVar2;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar5 = new sg.bigo.ads.ad.interstitial.a.b(bVar4, lVar2, bVar3, cVar, pVar);
        this.f101990b = bVar5;
        sg.bigo.ads.api.core.b bVar6 = bVar3;
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar5.f100654a, bVar4, lVar2, bVar6, z10 ? ((sg.bigo.ads.ad.b.c) bVar4).I : null, z10 ? ((sg.bigo.ads.ad.b.c) bVar4).J : null);
        this.f101991c = aVar;
        if (this.f101990b.f100654a) {
            i10 = 1;
        } else if (aVar.f100586a) {
            i10 = 2;
        }
        this.f101995g = i10;
        bVar6.d(i10);
        if (!this.f101990b.f100654a && !(this.f101991c.f100587b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) {
            i11 = 2;
        }
        bVar6.e(i11);
        sg.bigo.ads.ad.interstitial.a.b bVar7 = this.f101990b;
        if (bVar7 != null) {
            bVar7.a(new a(bVar));
            this.f101990b.a(bVar.f100335b.f102179f);
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f101991c;
        if (aVar2 != null) {
            aVar2.a(new a(bVar));
            this.f101991c.a(new c.a() { // from class: sg.bigo.ads.ad.splash.a.g.1
                @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                    bVar.f102047z.a(iVar, 15, 9, dVar);
                }
            });
            this.f101991c.a(bVar.f100335b.f102179f);
        }
    }

    private boolean f() {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f101990b;
        if (bVar == null || !bVar.f100654a || !bVar.b()) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f101990b;
        return (bVar2.f100655b || bVar2.f100659f.f100599i == null) ? false : true;
    }

    private boolean g() {
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f101991c;
        return aVar != null && aVar.f100586a && aVar.b() && this.f101991c.a() != null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f101989a = c.a.f101956d;
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f101990b;
        if (bVar != null) {
            bVar.e();
            this.f101990b = null;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f101991c;
        if (aVar != null) {
            aVar.e();
            this.f101991c = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f101989a;
    }

    public final boolean e() {
        return f() || g();
    }

    public final void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f101990b;
        if (bVar != null) {
            bVar.a(runnable);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
        if (z10) {
            if (this.f101994f) {
                sg.bigo.ads.ad.interstitial.a.b bVar = this.f101990b;
                if (bVar != null) {
                    bVar.f100659f.c();
                    return;
                }
                return;
            }
            sg.bigo.ads.ad.interstitial.a.a aVar = this.f101991c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (this.f101994f) {
            sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f101990b;
            if (bVar2 != null) {
                bVar2.f100659f.d();
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f101991c;
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        int i11;
        this.f101989a = z10 ? c.a.f101954b : c.a.f101955c;
        if (z10) {
            if (this.f101993e == 2) {
                viewGroup.removeViewAt(1);
            }
            if (f()) {
                View view = this.f101990b.f100659f.f100599i;
                viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
                if (view != null) {
                    view.setTag(19);
                }
                this.f101990b.a(1);
                this.f101992d = true;
                this.f101994f = true;
                i11 = 5;
            } else {
                View viewA = this.f101991c.a();
                viewGroup.addView(viewA, 1, new FrameLayout.LayoutParams(-1, -1));
                if (viewA != null) {
                    viewA.setTag(20);
                }
                this.f101991c.a(1);
                this.f101992d = true;
                i11 = 7;
            }
            int i12 = this.f101993e == 2 ? 9 : 8;
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f101996h.f102047z.f(), i11, i10);
            this.f101996h.f102047z.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i12, null);
        }
    }
}
