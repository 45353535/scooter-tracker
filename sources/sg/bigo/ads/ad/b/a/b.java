package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.ad.b.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.f.a.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends sg.bigo.ads.ad.b.c {
    private a O;
    private d.a<NativeAd> P;
    private boolean Q;
    private boolean R;
    private boolean S;

    public b(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.Q = false;
        this.R = false;
        this.S = false;
        this.O = new a(fVar);
    }

    static /* synthetic */ void b(b bVar) {
        bVar.R = true;
        if (!bVar.S || bVar.f100342i) {
            return;
        }
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.d(b.this);
                if (((sg.bigo.ads.ad.b.c) b.this).J == null || ((sg.bigo.ads.ad.b.b) b.this).E == null) {
                    return;
                }
                b bVar2 = b.this;
                b.super.a(((sg.bigo.ads.ad.b.b) bVar2).E);
            }
        });
    }

    static /* synthetic */ void d(b bVar) {
        MediaView mediaView = ((sg.bigo.ads.ad.b.b) bVar).E;
        if (mediaView != null) {
            View viewFindViewWithTag = mediaView.findViewWithTag("blur_image_view");
            ((sg.bigo.ads.ad.b.b) bVar).E.removeAllViews();
            if (viewFindViewWithTag != null) {
                u.a(viewFindViewWithTag, ((sg.bigo.ads.ad.b.b) bVar).E, null, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void A() {
        this.O.a(this.P, 0);
        b.InterfaceC1207b interfaceC1207b = ((sg.bigo.ads.ad.b.b) this).A;
        if (interfaceC1207b != null) {
            interfaceC1207b.a();
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    @NonNull
    public final k H() {
        return new k(0, 1);
    }

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void a() {
        super.a();
        this.O.a();
    }

    @Override // sg.bigo.ads.ad.c
    public final String j() {
        View view = this.f100336c;
        return view == null ? "" : view.getWidth() > this.f100336c.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i10, viewArr);
        this.S = true;
        mediaView.setMediaAreaClickable(true);
        mediaView.b().a(false);
        u.a(this.f100336c, ((sg.bigo.ads.ad.b.b) this).B);
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void h() {
        if (((sg.bigo.ads.ad.b.b) this).f100197z > 0) {
            a("attach_render_cost", Long.valueOf(SystemClock.elapsedRealtime() - ((sg.bigo.ads.ad.b.b) this).f100197z));
        }
        super.h();
    }

    static /* synthetic */ void a(b bVar) {
        bVar.Q = true;
        if (!bVar.S || bVar.R || bVar.f100342i) {
            return;
        }
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                if (((sg.bigo.ads.ad.b.b) b.this).E != null) {
                    b.d(b.this);
                    b.this.O.a(((sg.bigo.ads.ad.b.b) b.this).E);
                }
            }
        });
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b
    public final void a(@Nullable final MediaView mediaView) {
        Runnable runnable;
        if (mediaView == null) {
            return;
        }
        if (this.R && ((sg.bigo.ads.ad.b.c) this).J != null) {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.super.a(mediaView);
                }
            };
        } else if (!this.Q) {
            return;
        } else {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.this.O.a(mediaView);
                }
            };
        }
        sg.bigo.ads.common.n.d.b(runnable);
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b
    public final void a(@NonNull final d.a<NativeAd> aVar, int i10) {
        d.a<NativeAd> aVar2 = new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.a.b.1
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2) {
                NativeAd nativeAd = (NativeAd) ad2;
                aVar.a(nativeAd);
                if (nativeAd instanceof a) {
                    b.a(b.this);
                } else if (nativeAd instanceof b) {
                    b.b(b.this);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, int i11, int i12, String str) {
                aVar.a((NativeAd) ad2, i11, i12, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i11, int i12, String str, boolean z11) {
            }
        };
        this.P = aVar2;
        super.a(aVar2, i10);
    }
}
