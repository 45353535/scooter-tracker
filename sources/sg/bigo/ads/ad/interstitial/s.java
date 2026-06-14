package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.ad.b.c;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.common.p.h;

/* JADX INFO: loaded from: classes4.dex */
public class s extends k<sg.bigo.ads.core.a.a> {

    @NonNull
    protected sg.bigo.ads.ad.b.b B;

    @Nullable
    public sg.bigo.ads.ad.interstitial.a.b C;

    @Nullable
    public sg.bigo.ads.ad.interstitial.a.a D;

    @Nullable
    l E;

    @Nullable
    private b F;
    private final a G;
    private final Map<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.multi_img.b> H;
    private final Map<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.multi_img.b> I;

    class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        AdInteractionListener f101730a;

        a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f101730a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
            k.b bVar = ((k) s.this).f101410z;
            if (bVar != null) {
                bVar.E();
            }
            if (s.this.E != null) {
                s.this.E.f101427k = SystemClock.elapsedRealtime();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f101730a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            k.b bVar;
            if (this.f101730a != null) {
                if (adError.getCode() == 2002 && s.this.p()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f101730a.onAdError(adError);
                }
            }
            if (adError.getCode() != 2002 || (bVar = ((k) s.this).f101410z) == null) {
                return;
            }
            bVar.b(adError.getMessage());
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            if (this.f101730a != null) {
                if (s.this.B instanceof sg.bigo.ads.ad.b.a.a.b) {
                    sg.bigo.ads.ad.b.a.a.b bVar = (sg.bigo.ads.ad.b.a.a.b) s.this.B;
                    AdInteractionListener adInteractionListener = this.f101730a;
                    if (adInteractionListener != null && !bVar.Q) {
                        bVar.Q = true;
                        adInteractionListener.onAdImpression();
                    }
                } else {
                    this.f101730a.onAdImpression();
                }
            }
            if (s.this.E != null) {
                s.this.E.f101428l = SystemClock.elapsedRealtime();
            }
            sg.bigo.ads.ad.interstitial.multi_img.b bVarF = s.this.F();
            if (bVarF != null) {
                bVarF.b();
            }
            sg.bigo.ads.ad.interstitial.multi_img.b bVarG = s.this.G();
            if (bVarG != null) {
                bVarG.b();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            if (this.f101730a != null) {
                if (!(s.this.B instanceof sg.bigo.ads.ad.b.a.a.b)) {
                    this.f101730a.onAdOpened();
                    return;
                }
                sg.bigo.ads.ad.b.a.a.b bVar = (sg.bigo.ads.ad.b.a.a.b) s.this.B;
                AdInteractionListener adInteractionListener = this.f101730a;
                if (adInteractionListener == null || bVar.R) {
                    return;
                }
                bVar.R = true;
                adInteractionListener.onAdOpened();
            }
        }
    }

    class b implements sg.bigo.ads.ad.b.a.a.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<sg.bigo.ads.ad.b.b, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> f101732a;

        private b() {
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.b] */
        @Override // sg.bigo.ads.ad.b.a.a.a
        public final void a(NativeAd nativeAd, sg.bigo.ads.api.a.l lVar) {
            if (this.f101732a == null) {
                this.f101732a = new HashMap();
            }
            if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) nativeAd;
                sg.bigo.ads.api.a.m mVarE = ((sg.bigo.ads.core.a.a) bVar.f()).e();
                if (mVarE == null || 1 != mVarE.a("endpage.companion_first")) {
                    return;
                }
                this.f101732a.put(bVar, s.a(s.this, true, bVar, lVar, bVar.f(), false));
            }
        }

        /* synthetic */ b(s sVar, byte b10) {
            this();
        }
    }

    public s(@NonNull sg.bigo.ads.api.core.f fVar) {
        sg.bigo.ads.api.core.b bVar;
        sg.bigo.ads.api.a.m mVarE;
        int iA;
        super(fVar);
        a aVar = new a();
        this.G = aVar;
        this.H = new HashMap();
        this.I = new HashMap();
        sg.bigo.ads.ad.b.b bVarA = null;
        if (fVar != null && (bVar = fVar.f102174a) != null && (mVarE = bVar.e()) != null && ((33 == (iA = mVarE.a("video_play_page.ad_component_layout")) && !fVar.f102174a.ar()) || (6 == iA && fVar.f102174a.ar()))) {
            int iW = fVar.f102174a.w();
            if (iW == 1) {
                bVarA = new sg.bigo.ads.ad.b.a.f(fVar);
            } else if (iW == 2) {
                bVarA = new sg.bigo.ads.ad.b.a.g(fVar);
            }
        }
        bVarA = bVarA == null ? sg.bigo.ads.ad.b.a.a(fVar) : bVarA;
        if (bVarA == null) {
            throw new IllegalArgumentException("Illegal adx type.");
        }
        this.B = bVarA;
        bVarA.a(true);
        if (this.B instanceof sg.bigo.ads.ad.b.a.a.b) {
            b bVar2 = new b(this, (byte) 0);
            this.F = bVar2;
            ((sg.bigo.ads.ad.b.a.a.b) this.B).P = bVar2;
        }
        sg.bigo.ads.ad.b.b bVar3 = this.B;
        if (bVar3 instanceof sg.bigo.ads.ad.b.c) {
            ((sg.bigo.ads.ad.b.c) bVar3).L = new c.b() { // from class: sg.bigo.ads.ad.interstitial.s.1
                @Override // sg.bigo.ads.ad.b.c.b
                public final void a(String str) {
                    k.b bVar4 = ((k) s.this).f101410z;
                    if (bVar4 != null) {
                        bVar4.b(str);
                    }
                }
            };
        }
        this.B.setAdInteractionListener(aVar);
        a((sg.bigo.ads.api.b.a) bVarA);
    }

    static /* synthetic */ Pair a(s sVar, boolean z10, NativeAd nativeAd, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.core.b bVar, boolean z11) {
        sg.bigo.ads.core.f.a.p pVar;
        sg.bigo.ads.api.a.l lVar2;
        sg.bigo.ads.api.core.b bVar2;
        Ad ad2 = z10 ? nativeAd : sVar;
        boolean z12 = nativeAd instanceof sg.bigo.ads.ad.b.c;
        sg.bigo.ads.core.player.c cVar = z12 ? ((sg.bigo.ads.ad.b.c) nativeAd).I : null;
        if (z12) {
            pVar = ((sg.bigo.ads.ad.b.c) nativeAd).J;
            bVar2 = bVar;
            lVar2 = lVar;
        } else {
            pVar = null;
            lVar2 = lVar;
            bVar2 = bVar;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar3 = new sg.bigo.ads.ad.interstitial.a.b(ad2, lVar2, bVar2, cVar, pVar);
        sg.bigo.ads.api.core.b bVar4 = bVar2;
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar3.f100654a, ad2, lVar2, bVar4, z12 ? ((sg.bigo.ads.ad.b.c) nativeAd).I : null, z12 ? ((sg.bigo.ads.ad.b.c) nativeAd).J : null);
        int i10 = bVar3.f100654a ? 1 : aVar.f100586a ? 2 : 0;
        if (bVar4.e() != null && z11) {
            i10 = bVar4.h() ? i10 : 0;
        }
        bVar4.d(i10);
        bVar4.e((bVar3.f100654a || (aVar.f100587b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) ? 1 : 2);
        return new Pair(bVar3, aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final boolean B() {
        return ((sg.bigo.ads.core.a.a) this.B.f()).aR();
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return K() ? sg.bigo.ads.ad.interstitial.i.a.class : this.B instanceof sg.bigo.ads.api.b.e ? L() ? sg.bigo.ads.ad.interstitial.g.d.class : sg.bigo.ads.ad.interstitial.g.a.c.class : B() ? J() ? sg.bigo.ads.ad.interstitial.k.a.class : y.class : x.class;
    }

    @Nullable
    public final sg.bigo.ads.ad.interstitial.multi_img.b F() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar instanceof sg.bigo.ads.ad.b.a.a.b) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVarB = this.H.get(bVar);
        if (bVarB == null) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.B.f();
            if (aVar != null) {
                bVarB = sg.bigo.ads.ad.interstitial.multi_img.b.b(this.B, aVar.e());
            }
            if (bVarB != null) {
                this.H.put(this.B, bVarB);
            }
        }
        return bVarB;
    }

    @Nullable
    public final sg.bigo.ads.ad.interstitial.multi_img.b G() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar instanceof sg.bigo.ads.ad.b.a.a.b) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVarA = this.I.get(bVar);
        if (bVarA == null) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.B.f();
            if (aVar != null) {
                bVarA = sg.bigo.ads.ad.interstitial.multi_img.b.a(this.B, aVar.e());
            }
            if (bVarA != null) {
                this.I.put(this.B, bVarA);
            }
        }
        return bVarA;
    }

    @NonNull
    public final sg.bigo.ads.ad.b.b H() {
        sg.bigo.ads.ad.b.b bVar;
        sg.bigo.ads.ad.b.b bVar2 = this.B;
        return (!(bVar2 instanceof sg.bigo.ads.ad.b.a.a.b) || (bVar = ((sg.bigo.ads.ad.b.a.a.b) bVar2).I) == null) ? bVar2 : bVar;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.core.a.a f() {
        return (sg.bigo.ads.core.a.a) this.B.f();
    }

    protected final boolean J() {
        return ((sg.bigo.ads.core.a.a) this.B.f()).aS();
    }

    protected boolean K() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        return (bVar instanceof sg.bigo.ads.ad.b.a.f) || (bVar instanceof sg.bigo.ads.ad.b.a.g);
    }

    protected final boolean L() {
        Ad ad2 = this.B;
        return (ad2 instanceof sg.bigo.ads.api.b.e) && ((sg.bigo.ads.api.b.e) ad2).L() == 3;
    }

    public final sg.bigo.ads.ad.interstitial.a.b M() {
        s sVar;
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar instanceof sg.bigo.ads.ad.b.c) {
            sg.bigo.ads.ad.b.c cVar = (sg.bigo.ads.ad.b.c) bVar;
            sVar = this;
            sVar.C = new sg.bigo.ads.ad.interstitial.a.b(sVar, this.f100335b.f102175b, ((sg.bigo.ads.core.a.a) cVar.f()).br(), this.f100335b.f102174a, cVar.I, cVar.J);
        } else {
            sVar = this;
        }
        return sVar.C;
    }

    public final Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> b(sg.bigo.ads.ad.b.b bVar) {
        Map<sg.bigo.ads.ad.b.b, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> map;
        b bVar2 = this.F;
        if (bVar2 == null || bVar == null || (map = bVar2.f101732a) == null) {
            return null;
        }
        return map.get(bVar);
    }

    @Override // sg.bigo.ads.api.b.a
    public final sg.bigo.ads.api.core.o b_() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        return bVar != null ? bVar.b_() : this.f102140ac;
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.B.destroy();
        b bVar = this.F;
        if (bVar != null) {
            Map<sg.bigo.ads.ad.b.b, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> map = bVar.f101732a;
            if (map != null) {
                Iterator<sg.bigo.ads.ad.b.b> it = map.keySet().iterator();
                while (it.hasNext()) {
                    Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pair = bVar.f101732a.get(it.next());
                    if (pair != null) {
                        sg.bigo.ads.ad.interstitial.a.b bVar2 = (sg.bigo.ads.ad.interstitial.a.b) pair.first;
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        sg.bigo.ads.ad.interstitial.a.a aVar = (sg.bigo.ads.ad.interstitial.a.a) pair.second;
                        if (aVar != null) {
                            aVar.e();
                        }
                    }
                }
                bVar.f101732a.clear();
            }
            this.F = null;
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        return bVar != null ? bVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final boolean p() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        return (bVar != null && bVar.p()) || super.p();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        this.G.f101730a = adInteractionListener;
    }

    @Override // sg.bigo.ads.ad.c
    public final void u() {
        this.B.u();
    }

    @Override // sg.bigo.ads.ad.c
    public final sg.bigo.ads.controller.landing.c y() {
        sg.bigo.ads.ad.b.b bVar = this.B;
        return bVar != null ? bVar.y() : super.y();
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.B.b(str, valuetype);
    }

    public final void c(sg.bigo.ads.ad.b.b bVar) {
        Map<sg.bigo.ads.ad.b.b, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> map;
        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pairRemove;
        b bVar2 = this.F;
        if (bVar2 == null || bVar == null || (map = bVar2.f101732a) == null || (pairRemove = map.remove(bVar)) == null) {
            return;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar3 = (sg.bigo.ads.ad.interstitial.a.b) pairRemove.first;
        if (bVar3 != null) {
            bVar3.e();
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = (sg.bigo.ads.ad.interstitial.a.a) pairRemove.second;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b(int i10) {
        super.b(i10);
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10) {
        super.a(i10);
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar != null) {
            bVar.b(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(int i10, int i11) {
        super.a(i10, i11);
        l lVar = this.E;
        if (lVar != null) {
            lVar.f101435s = true;
            lVar.f101429m = SystemClock.elapsedRealtime();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected void b(@NonNull final d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.a.m mVarE;
        sg.bigo.ads.api.a.m mVarE2;
        sg.bigo.ads.api.a.m mVarE3;
        sg.bigo.ads.api.a.m mVarE4;
        sg.bigo.ads.ad.b.b bVar = this.B;
        sg.bigo.ads.api.a.m mVarE5 = f().e();
        boolean z10 = true;
        if ((mVarE5 == null || (mVarE5.a("video_play_page.cta_color") != 3 && mVarE5.a("video_play_page.background_colour") != 3 && mVarE5.a("video_play_page.mediaview_colour") != 3 && mVarE5.a("video_play_page.ad_component_colour") != 3)) && (((mVarE = f().e()) == null || mVarE.a("mid_page.cta_color") != 3) && (((mVarE2 = f().e()) == null || (mVarE2.a("endpage.cta_color") != 3 && mVarE2.a("endpage.background_colour") != 3 && mVarE2.a("endpage.mediaview_colour") != 3)) && (((mVarE3 = f().e()) == null || (mVarE3.a("layer.cta_color") != 3 && mVarE3.a("layer.mediaview_colour") != 3)) && ((mVarE4 = f().e()) == null || (mVarE4.a("video_play_page.is_widget") != 1 && mVarE4.a("endpage.is_widget") != 1)))))) {
            z10 = false;
        }
        bVar.b(z10);
        this.B.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.interstitial.s.2
            private void a(int i10, int i11, String str) {
                s sVar = s.this;
                if (sVar.f100338e || sVar.f100339f) {
                    return;
                }
                aVar.a(sVar, i10, i11, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                a(i10, i11, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, boolean z11, int i10, int i11, String str, boolean z12) {
                NativeAd nativeAd = (NativeAd) ad2;
                s sVar = s.this;
                if (sVar.f100338e || sVar.f100339f || !(nativeAd instanceof sg.bigo.ads.ad.b.c)) {
                    return;
                }
                if (((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.b.c) nativeAd).f()).bh() != null || z11) {
                    a(nativeAd);
                } else if (z12) {
                    a(i10, i11, str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // sg.bigo.ads.api.b.d.a
            public void a(NativeAd nativeAd) {
                sg.bigo.ads.api.core.f fVar = s.this.f100335b;
                if (!(nativeAd instanceof sg.bigo.ads.api.b.f) && (s.this.C == null || s.this.D == null)) {
                    Pair pairA = s.a(s.this, false, nativeAd, fVar.f102175b, fVar.f102174a, true);
                    s.this.C = (sg.bigo.ads.ad.interstitial.a.b) pairA.first;
                    s.this.D = (sg.bigo.ads.ad.interstitial.a.a) pairA.second;
                }
                s sVar = s.this;
                if (sVar.f100338e || sVar.f100339f) {
                    return;
                }
                s.a(sVar, sVar.B);
                aVar.a(s.this);
            }
        }, 0);
    }

    public final void a(sg.bigo.ads.ad.b.b bVar) {
        sg.bigo.ads.ad.b.b bVar2 = this.B;
        if (bVar2 instanceof sg.bigo.ads.ad.b.a.a.b) {
            ((sg.bigo.ads.ad.b.a.a.b) bVar2).I = bVar;
        }
    }

    static /* synthetic */ void a(s sVar, sg.bigo.ads.ad.b.b bVar) {
        if (bVar == null || (bVar instanceof sg.bigo.ads.ad.b.a.a.b)) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) bVar.f();
        sg.bigo.ads.api.a.m mVarE = aVar.e();
        sg.bigo.ads.ad.interstitial.multi_img.b bVarB = sg.bigo.ads.ad.interstitial.multi_img.b.b(bVar, mVarE);
        if (bVarB != null) {
            sVar.H.put(bVar, bVarB);
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVarA = sg.bigo.ads.ad.interstitial.multi_img.b.a(bVar, mVarE);
        if (bVarA != null) {
            sVar.I.put(bVar, bVarA);
        }
        if (bVarB == null && bVarA == null) {
            return;
        }
        if (bVarB != null && bVarB.f101456g == 1) {
            bVarB.b();
            return;
        }
        if (bVarA != null && bVarA.f101456g == 1) {
            bVarA.b();
            return;
        }
        if (bVarB != null && bVarB.f101456g == 2) {
            sVar.a(aVar, bVarB);
        } else {
            if (bVarA == null || bVarA.f101456g != 2) {
                return;
            }
            sVar.a(aVar, bVarA);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.controller.landing.c cVar) {
        super.a(cVar);
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    private void a(sg.bigo.ads.core.a.a aVar, final sg.bigo.ads.ad.interstitial.multi_img.b bVar) {
        if (!aVar.aR()) {
            if (h.a.f102684a.a(aVar.aT())) {
                return;
            }
            bVar.b();
            return;
        }
        final sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
        final String strAP = aVar.aP();
        final ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.ad.interstitial.s.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                if (!bool.booleanValue()) {
                    bVar.b();
                }
            }
        };
        if (bVarA.f104588b.get()) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.2

                /* JADX INFO: renamed from: a */
                final /* synthetic */ ValueCallback f104602a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ String f104603b;

                public AnonymousClass2(final ValueCallback valueCallback2, final String strAP2) {
                    valueCallback = valueCallback2;
                    str = strAP2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ValueCallback valueCallback2 = valueCallback;
                    sg.bigo.ads.common.h.b bVar2 = b.this.f104593g;
                    String str = str;
                    valueCallback2.onReceiveValue(Boolean.valueOf(sg.bigo.ads.common.h.b.a(bVar2.f102482a, str) || sg.bigo.ads.common.h.b.a(bVar2.f102484c, str)));
                }
            });
        } else {
            valueCallback2.onReceiveValue(Boolean.FALSE);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        sg.bigo.ads.ad.b.b bVar = this.B;
        if (bVar != null) {
            bVar.a(z10, z11);
        }
    }
}
