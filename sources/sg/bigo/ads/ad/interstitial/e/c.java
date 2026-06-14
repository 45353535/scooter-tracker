package sg.bigo.ads.ad.interstitial.e;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f101139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.a f101140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.c f101141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.h.a f101142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconAds f101143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101144f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f101146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f101147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f101148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f101149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f101150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f101151m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f101145g = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f101152n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f101153o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f101154p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<NativeAd> f101155q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<NativeAd> f101156r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<Integer, Boolean> f101157s = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<Integer, Boolean> f101158t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    List<Integer> f101159u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    List<Integer> f101160v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final sg.bigo.ads.api.d f101161w = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.1
        private int a(@NonNull NativeAd nativeAd, @NonNull List<NativeAd> list) {
            c cVar = c.this;
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(cVar.f101154p ? cVar.f101140b : cVar.f101141c);
            int iIndexOf = list.indexOf(nativeAd);
            if (iA == 0) {
                return 0;
            }
            return iIndexOf / iA;
        }

        @Override // sg.bigo.ads.api.d
        public final void b(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
            n nVar = c.this.f101150l;
            if (nVar != null) {
                nVar.b();
                c.this.f101150l = null;
            }
            n nVar2 = c.this.f101151m;
            if (nVar2 != null) {
                nVar2.b();
                c.this.f101151m = null;
            }
        }

        @Override // sg.bigo.ads.api.d
        public final void c(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void d(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.ad.interstitial.e.a.b bVar;
            List<Integer> list;
            List<NativeAd> list2;
            Map<Integer, Boolean> map;
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad impression.");
            c cVar = c.this;
            if (cVar.f101154p) {
                bVar = cVar.f101140b;
                list = cVar.f101159u;
                list2 = cVar.f101155q;
                map = cVar.f101157s;
            } else {
                bVar = cVar.f101141c;
                list = cVar.f101160v;
                list2 = cVar.f101156r;
                map = cVar.f101158t;
            }
            c.a(bVar, list, list2, map, a(nativeAd, list2));
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad error, code=" + adError.getCode() + ", message=" + adError.getMessage());
        }
    };

    public static class a implements IconAdsRequest.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101172a;

        private a() {
            this.f101172a = 1;
        }

        @Override // sg.bigo.ads.api.IconAdsRequest.b
        public final int a() {
            return this.f101172a;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f101173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f101174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ViewGroup f101175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.ad.interstitial.e.a.b f101176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f101177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f101178f;

        private b(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
            this.f101175c = viewGroup;
            this.f101176d = bVar;
            this.f101173a = 0L;
            this.f101174b = false;
            this.f101177e = false;
            this.f101178f = false;
        }

        final ValueAnimator a(@Nullable Integer num) {
            if (num == null) {
                return null;
            }
            return sg.bigo.ads.common.w.b.a(this.f101175c, num.intValue(), new b.a() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f101179a = 300;

                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return this.f101179a;
                }
            });
        }

        protected abstract boolean a();

        public final void b() {
            this.f101174b = true;
            this.f101177e = false;
            this.f101175c.removeCallbacks(this);
        }

        public final void c() {
            this.f101177e = false;
            this.f101178f = true;
            this.f101175c.removeCallbacks(this);
        }

        public final boolean d() {
            if (this.f101174b || this.f101177e) {
                return false;
            }
            this.f101177e = true;
            this.f101178f = false;
            if (this.f101173a == 0) {
                this.f101173a = SystemClock.elapsedRealtime();
            }
            this.f101175c.postDelayed(this, Math.max(this.f101176d.j() - (SystemClock.elapsedRealtime() - this.f101173a), 0L));
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f101174b && !this.f101178f && a()) {
                this.f101174b = true;
            }
            this.f101177e = false;
        }

        /* synthetic */ b(ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.e.a.b bVar, byte b10) {
            this(viewGroup, bVar);
        }

        protected final void a(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable Integer num, final sg.bigo.ads.ad.interstitial.e.a aVar) {
            u.b(view);
            viewGroup.addView(view);
            sg.bigo.ads.common.e.a.a(view, 100.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            final ValueAnimator valueAnimatorA = a(num);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.1f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.2
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    b.this.a(aVar);
                }

                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    ValueAnimator valueAnimator = valueAnimatorA;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            view.startAnimation(translateAnimation);
        }

        protected void a(final sg.bigo.ads.ad.interstitial.e.a aVar) {
            if (aVar != null && aVar.f101109c > 0) {
                aVar.f101108b.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.ad.interstitial.e.a aVar2 = aVar;
                        aVar2.f101108b.setFlipInterval(aVar2.f101109c);
                        aVar.f101108b.c();
                    }
                });
            }
        }
    }

    public c(@NonNull s sVar, @NonNull m mVar, @Nullable sg.bigo.ads.ad.interstitial.h.a aVar) {
        this.f101139a = sVar;
        this.f101140b = new sg.bigo.ads.ad.interstitial.e.a.a(mVar);
        this.f101141c = new sg.bigo.ads.ad.interstitial.e.a.c(mVar, aVar == null || aVar.g());
        this.f101142d = aVar;
    }

    static /* synthetic */ List a(IconAds iconAds) {
        if (!(iconAds instanceof sg.bigo.ads.ad.a.a)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.ad.b.a.c cVar : ((sg.bigo.ads.ad.a.a) iconAds).f100125a) {
            if (!cVar.isExpired() && !cVar.f100342i) {
                if (cVar.I) {
                    arrayList.add(cVar);
                } else if (!cVar.J) {
                    arrayList2.add(cVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.ad.b.a.c[] cVarArr = new sg.bigo.ads.ad.b.a.c[arrayList.size()];
        sg.bigo.ads.common.utils.k.a(arrayList, cVarArr);
        return Arrays.asList(cVarArr);
    }

    private void d() {
        b();
        sg.bigo.ads.ad.interstitial.e.a aVar = this.f101148j;
        if (aVar != null) {
            aVar.f101108b.d();
            u.b(this.f101148j.f101107a);
        }
        this.f101148j = null;
    }

    public final void b() {
        b bVar = this.f101146h;
        if (bVar != null) {
            bVar.b();
        }
        this.f101146h = null;
    }

    public final void c() {
        b bVar = this.f101147i;
        if (bVar != null) {
            bVar.b();
        }
        this.f101147i = null;
    }

    static /* synthetic */ n a(c cVar, final sg.bigo.ads.ad.interstitial.e.a.b bVar, final List list) {
        int iO;
        if (bVar == null || !bVar.a() || (iO = bVar.o()) < 0) {
            return null;
        }
        return new n(r.f102828a.a(iO)) { // from class: sg.bigo.ads.ad.interstitial.e.c.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                NativeAd nativeAd = (NativeAd) list.get(0);
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    sg.bigo.ads.ad.b.a.c cVar2 = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    if (cVar2.f100340g) {
                        return;
                    }
                    cVar2.a((sg.bigo.ads.common.i) null, bVar.b(), 22);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
    }

    public static void b(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar == null) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            int i10 = aVar.f101109c;
            if (i10 > 0) {
                aVar.f101108b.setFlipInterval(i10);
                aVar.f101108b.c();
            }
        }
    }

    public final void a(ViewGroup viewGroup, final int i10) {
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f101139a.f(), i10);
        this.f101154p = true;
        if (viewGroup == null) {
            a(this.f101140b, "endPageView is null", i10);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(this.f101140b)) {
            a(this.f101140b, "config is invalid", i10);
            return;
        }
        if (!a(i10)) {
            a(this.f101140b, "icon request hasScene return false", i10);
            return;
        }
        d();
        b bVar = new b(viewGroup, this.f101140b) { // from class: sg.bigo.ads.ad.interstitial.e.c.3
            {
                byte b10 = 0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
            
                if (r3 == 2) goto L34;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            protected final boolean a() {
                /*
                    Method dump skipped, instruction units count: 227
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.c.AnonymousClass3.a():boolean");
            }
        };
        this.f101146h = bVar;
        bVar.d();
    }

    public final void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, String str, int i10) {
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this.f101139a.f(), str, i10, bVar.i(), this.f101153o, bVar.f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.e.a.b r7, java.util.List r8, java.util.List r9, java.util.Map r10, int r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.c.a(sg.bigo.ads.ad.interstitial.e.a.b, java.util.List, java.util.List, java.util.Map, int):void");
    }

    public static void a(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar != null) {
            aVar.f101108b.d();
        } else if (bVar != null) {
            bVar.c();
        }
    }

    static /* synthetic */ void a(c cVar, int i10) {
        Ad ad2 = cVar.f101143e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f102141b = i10;
        }
    }

    static /* synthetic */ void a(c cVar, sg.bigo.ads.ad.interstitial.e.a.b bVar, int i10, List list) {
        if (bVar == null || list == null) {
            return;
        }
        sg.bigo.ads.core.d.b.a(cVar.f101139a.f(), i10, bVar.i(), cVar.f101153o, list.size(), bVar.f(), bVar.a());
    }

    static /* synthetic */ void a(c cVar, boolean z10) {
        Ad ad2 = cVar.f101143e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f102142c = z10;
        }
    }

    final boolean a() {
        s sVar = this.f101139a;
        return sVar.f100342i || sVar.H().f100342i;
    }

    public final boolean a(int i10) {
        return (this.f101144f & i10) == i10;
    }
}
