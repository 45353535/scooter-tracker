package sg.bigo.ads.ad.a;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ad.b.a.c;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.b.g;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g<IconAds, sg.bigo.ads.core.a.a> implements IconAds, d<IconAds> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f100125a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f100126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.api.d f100127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f100128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f100129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f100130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f100131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f100132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private sg.bigo.ads.api.d f100133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f100134l;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.a.a$a, reason: collision with other inner class name */
    static class C1204a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final c f100144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final sg.bigo.ads.api.d f100145b;

        public C1204a(c cVar, sg.bigo.ads.api.d dVar) {
            this.f100144a = cVar;
            this.f100145b = dVar;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            sg.bigo.ads.api.d dVar = this.f100145b;
            if (dVar != null) {
                dVar.b(this.f100144a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            sg.bigo.ads.api.d dVar = this.f100145b;
            if (dVar != null) {
                dVar.d(this.f100144a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            sg.bigo.ads.api.d dVar = this.f100145b;
            if (dVar != null) {
                dVar.a(this.f100144a, adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            sg.bigo.ads.api.d dVar = this.f100145b;
            if (dVar != null) {
                dVar.a(this.f100144a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            sg.bigo.ads.api.d dVar = this.f100145b;
            if (dVar != null) {
                dVar.c(this.f100144a);
            }
        }
    }

    public a(b bVar, f... fVarArr) {
        super(bVar);
        this.f100127e = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.ad.a.a.1
            @Override // sg.bigo.ads.api.d
            public final void a(@NonNull NativeAd nativeAd) {
                a.a(a.this, nativeAd);
                if (a.this.f100133k != null) {
                    a.this.f100133k.a(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void b(@NonNull NativeAd nativeAd) {
                if (a.this.f100133k != null) {
                    a.this.f100133k.b(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void c(@NonNull NativeAd nativeAd) {
                if (a.this.f100133k != null) {
                    a.this.f100133k.c(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void d(@NonNull NativeAd nativeAd) {
                if (a.this.f100133k != null) {
                    a.this.f100133k.d(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
                if (a.this.f100133k != null) {
                    a.this.f100133k.a(nativeAd, adError);
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        for (f fVar : fVarArr) {
            sg.bigo.ads.ad.b.b bVarA = sg.bigo.ads.ad.b.a.a(fVar);
            if (bVarA instanceof c) {
                arrayList.add((c) bVarA);
            }
        }
        c[] cVarArr = new c[arrayList.size()];
        k.a(arrayList, cVarArr);
        this.f100125a = cVarArr;
        this.f100128f = new AtomicBoolean(false);
        this.f100129g = new AtomicBoolean(false);
        this.f100130h = new AtomicBoolean(false);
        this.f100131i = new AtomicBoolean(false);
        this.f100132j = new AtomicBoolean(false);
        this.f100134l = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // sg.bigo.ads.api.b.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public sg.bigo.ads.core.a.a f() {
        for (c cVar : this.f100125a) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b() {
        if (this.f100128f.compareAndSet(false, true)) {
            Object obj = this.X;
            if (obj instanceof sg.bigo.ads.api.b.c) {
                this.f100134l = ((sg.bigo.ads.api.b.c) obj).l();
            }
            boolean zBooleanValue = false;
            for (c cVar : this.f100125a) {
                if (cVar != null) {
                    cVar.b();
                    zBooleanValue |= ((Boolean) cVar.b("is_cache", Boolean.FALSE)).booleanValue();
                }
            }
            sg.bigo.ads.core.d.b.a(this, zBooleanValue);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c() {
        if (this.f100129g.compareAndSet(false, true)) {
            for (c cVar : this.f100125a) {
                if (cVar != null) {
                    cVar.c();
                }
            }
            a("filled");
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final String d() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        for (c cVar : this.f100125a) {
            cVar.destroy();
        }
        sg.bigo.ads.core.d.b.a(f(), SystemClock.elapsedRealtime() - this.f100126d);
    }

    @Override // sg.bigo.ads.api.b.a
    public final long e() {
        h hVar = i.f102116a;
        if (hVar != null) {
            return hVar.i();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.b.a
    public final double g() {
        double dG = 0.0d;
        for (c cVar : this.f100125a) {
            dG += cVar.g();
        }
        return dG;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        sg.bigo.ads.core.a.a aVarF = f();
        return aVarF != null ? aVarF.b(str) : "";
    }

    @Override // sg.bigo.ads.api.IconAds
    public final NativeAd[] getNativeAds() {
        c[] cVarArr = this.f100125a;
        return (NativeAd[]) Arrays.copyOf(cVarArr, cVarArr.length);
    }

    @Override // sg.bigo.ads.api.b.g
    public final int h() {
        return this.f100134l;
    }

    @Override // sg.bigo.ads.api.b.g
    public final int i() {
        return this.f100125a.length;
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        for (c cVar : this.f100125a) {
            if (!cVar.isExpired()) {
                return false;
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.api.b.g
    public final int j() {
        int i10 = 0;
        for (c cVar : this.f100125a) {
            if (!cVar.J) {
                i10++;
            }
        }
        return i10;
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @Deprecated
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10, int i11, String str) {
        if (this.f100130h.compareAndSet(false, true)) {
            for (c cVar : this.f100125a) {
                if (cVar != null) {
                    cVar.a(i10, i11, str);
                }
            }
            sg.bigo.ads.core.d.b.a(this, i10, i11, str);
        }
    }

    @Override // sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(sg.bigo.ads.api.d dVar) {
        this.f100133k = dVar;
    }

    private void a(String str) {
        sg.bigo.ads.core.b.b.a().a(str, sg.bigo.ads.core.b.a.a(str, this.X.h(), this.X, null, null, null, null, this));
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(String str, String str2, int i10) {
        if (this.f100132j.compareAndSet(false, true)) {
            sg.bigo.ads.core.d.b.a(this, str, str2, i10);
        }
    }

    static /* synthetic */ void a(a aVar, NativeAd nativeAd) {
        if (aVar.f100131i.compareAndSet(false, true)) {
            aVar.f100126d = SystemClock.elapsedRealtime();
            aVar.a("impression");
            if (nativeAd instanceof c) {
                c cVar = (c) nativeAd;
                sg.bigo.ads.core.d.b.a(cVar.f100335b.f102178e, aVar, (String) cVar.b("show_proportion", ""), cVar.j(), ((Integer) cVar.b("render_style", 0)).intValue(), cVar.w(), ((Long) cVar.b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - cVar.f100345l, -1, -1, -1);
            }
        }
    }

    @Override // sg.bigo.ads.api.b.d
    public final void a(@NonNull final d.a<IconAds> aVar) {
        final HashSet hashSet = new HashSet(Arrays.asList(this.f100125a));
        final HashSet hashSet2 = new HashSet();
        final d.a<IconAds> aVar2 = new d.a<IconAds>() { // from class: sg.bigo.ads.ad.a.a.2
            private void a() {
                if (k.a(hashSet)) {
                    if (k.a(hashSet2)) {
                        aVar.a(a.this, 1020, 1500, "all icon ads are invalid.");
                    } else {
                        aVar.a(a.this);
                    }
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2) {
                a();
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                a();
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                a();
            }
        };
        for (c cVar : this.f100125a) {
            cVar.a((sg.bigo.ads.api.b.a) this);
            cVar.b("filled");
            cVar.b("impression");
            cVar.c("06002008");
            cVar.c("06002010");
            cVar.c("06002029");
            cVar.setAdInteractionListener(new C1204a(cVar, this.f100127e));
            cVar.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.a.a.3
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2) {
                    NativeAd nativeAd = (NativeAd) ad2;
                    hashSet.remove(nativeAd);
                    hashSet2.add(nativeAd);
                    aVar2.a(a.this);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                    hashSet.remove((NativeAd) ad2);
                    aVar2.a(a.this, i10, i11, str);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                    NativeAd nativeAd = (NativeAd) ad2;
                    hashSet.remove(nativeAd);
                    hashSet2.add(nativeAd);
                    aVar2.a(a.this, z10, i10, i11, str, z11);
                }
            });
        }
    }

    @Override // sg.bigo.ads.api.b.i
    public final sg.bigo.ads.api.core.b[] a() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f100125a) {
            arrayList.add(cVar.f());
        }
        sg.bigo.ads.api.core.b[] bVarArr = new sg.bigo.ads.api.core.b[arrayList.size()];
        k.a(arrayList, bVarArr);
        return bVarArr;
    }
}
