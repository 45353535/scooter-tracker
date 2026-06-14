package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3804ja;
import com.inmobi.media.EnumC3571a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3804ja extends AbstractC3845l1 {
    public int F;
    public boolean G;
    public final Pj H;
    public Function0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3804ja(Context context, C4093v0 adPlacement, C3854la c3854la) {
        super(context, adPlacement, c3854la);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        this.H = new Pj();
        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
        long j10 = adPlacement.f39711a;
        a(context, adPlacement, c3854la);
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.K();
    }

    public static final void c(C3804ja c3804ja) {
        c3804ja.g(c3804ja.m());
    }

    public static final Unit d(C3804ja c3804ja) throws JSONException {
        c3804ja.Y();
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void C() {
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void F() {
        super.F();
        if (!Intrinsics.areEqual(s(), "html") && !Intrinsics.areEqual(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.f38916b == 2) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                c3903n9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.f38926l);
            }
            AbstractC3721g1 abstractC3721g1M = m();
            if (abstractC3721g1M != null) {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3903n92.a("ja", "callback - onFetchSuccess");
                }
                c(abstractC3721g1M);
                return;
            }
            c((short) 2188);
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n93.b("ja", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void I() throws JSONException {
        super.I();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void K() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.K();
    }

    public final boolean V() throws JSONException {
        if (E()) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M == null || h(abstractC3721g1M)) {
            return false;
        }
        if (4 == this.f38916b) {
            if (!z()) {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3903n92.a("ja", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3721g1 abstractC3721g1M2 = m();
                if (abstractC3721g1M2 == null) {
                    C3903n9 c3903n93 = this.f38923i;
                    if (c3903n93 != null) {
                        c3903n93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(abstractC3721g1M2);
                    d(abstractC3721g1M2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        D();
        return true;
    }

    public final int W() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        if (adSetR != null) {
            int podSuccessCount = adSetR.getPodSuccessCount();
            Integer numValueOf = Integer.valueOf(podSuccessCount);
            if (podSuccessCount < 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        AdSet adSetR2 = r();
        if (adSetR2 != null && (ads = adSetR2.getAds()) != null) {
            int size = ads.size();
            Integer numValueOf2 = size > 0 ? Integer.valueOf(size) : null;
            if (numValueOf2 != null) {
                return numValueOf2.intValue();
            }
        }
        return 1;
    }

    public final void X() throws JSONException {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.f38926l.f39716f, "AB") && (adConfig = this.f38917c) != null && adConfig.getSkipNetCheckHB()) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", "renderAd without internet check");
            }
            Y();
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n92.a("ja", "renderAd");
        }
        a(new Function0() { // from class: w3.s8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3804ja.d(this.f107299b);
            }
        }, new Function1() { // from class: w3.t8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3804ja.a(this.f107323b, (EnumC3571a6) obj);
            }
        });
    }

    public final void Y() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n9.a("ja", "renderAdPostInternetCheck");
        }
        super.I();
        this.F = 0;
        try {
            if (M()) {
                return;
            }
            C3994r1 c3994r1 = this.f38940z;
            c3994r1.getClass();
            c3994r1.f39429g = SystemClock.elapsedRealtime();
            String strS = s();
            if (!Intrinsics.areEqual(strS, "html") && !Intrinsics.areEqual(strS, "htmlUrl")) {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3903n92.a("ja", "Cannot handle markupType: " + s());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.q8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3804ja.e(this.f107264b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n93.a("ja", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void Z() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n9.d("ja", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3994r1 c3994r1 = this.f38940z;
        c3994r1.getClass();
        c3994r1.f39431i = SystemClock.elapsedRealtime();
        P();
        S();
        this.H.f37549a = true;
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n92.a("ja", "signaling Success");
            }
            d(abstractC3721g1M);
        }
    }

    @Override // com.inmobi.media.InterfaceC4118w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    public final void a0() {
        MetaInfo metaInfo;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.c("l1", "submitAdNotReady " + this);
        }
        Pj pj = this.H;
        C3994r1 c3994r1 = this.f38940z;
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        String creativeType = (adP == null || (metaInfo = adP.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet adSetR = r();
        Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.getIsRewarded()) : null;
        String strS = s();
        String impressionId = null;
        Boolean bool = boolValueOf;
        byte b10 = this.f38916b;
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null) {
            impressionId = adP2.getImpressionId();
        }
        C4043t0 adNotReadyMetadata = new C4043t0(c3994r1, creativeType, bool, strS, b10, impressionId);
        pj.getClass();
        Intrinsics.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j10 = c3994r1.f39425c;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("errorCode", Short.valueOf(b10 == 0 ? (short) 2204 : b10 == 1 ? (short) 2282 : b10 == 2 ? (short) 2283 : b10 == 3 ? (short) 2284 : b10 == 6 ? (short) 2285 : b10 == 7 ? (short) 2209 : b10 == 8 ? (short) 2242 : (short) 2210));
        map.put("markupType", strS);
        if (creativeType != null) {
            map.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        if (bool != null) {
            map.put("isRewarded", bool);
        }
        String strA = c3994r1.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", c3994r1.f39423a.l());
        map.put("networkType", C4148x5.m());
        map.put("plId", Long.valueOf(c3994r1.f39423a.f38926l.f39711a));
        map.put("isAdLoaded", Boolean.valueOf(pj.f37549a));
        String str = c3994r1.f39423a.f38926l.f39716f;
        if (str != null) {
            map.put("plType", str);
        }
        Wj wj = Wj.f37959a;
        Wj.b("AdNotReady", map, EnumC3585ak.f38215a);
    }

    public final short b(Context context) {
        try {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC3635ci container = i();
            if (container == null) {
                return (short) 2155;
            }
            if (Intrinsics.areEqual("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f36523k;
            Intrinsics.checkNotNullParameter(container, "container");
            int iHashCode = container.hashCode();
            InMobiAdActivity.f36523k.put(iHashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3903n9 obj = this.f38923i;
            if (obj != null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                HashMap map = P8.f37526a;
                String key = string.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                P8.f37526a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strS = s();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", Intrinsics.areEqual(strS, "html") ? 200 : Intrinsics.areEqual(strS, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.f38933s) {
                if (this.f38931q == -1) {
                    this.f38931q = System.currentTimeMillis();
                }
                if (this.f38929o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = Ji.f37157a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (Exception e10) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                c3903n92.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
            return (short) 2154;
        }
    }

    public final void b0() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            c3903n9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.f38926l);
        }
        h();
        Z();
    }

    public final void e(short s10) {
        if (this.f38916b == 2) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                c3903n9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.f38926l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    public final void f(AbstractC3721g1 abstractC3721g1) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n9.c("ja", "handleAdScreenDismissed " + ((int) this.f38916b));
        }
        byte b10 = this.f38916b;
        if (b10 == 7) {
            int i10 = this.F - 1;
            this.F = i10;
            if (i10 == 1) {
                c((byte) 6);
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3903n92.d("ja", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (b10 == 6 || b10 == 8) {
            this.F--;
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                c3903n93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.f38926l);
            }
            if (abstractC3721g1 != null) {
                abstractC3721g1.a();
                return;
            }
            C3903n9 c3903n94 = this.f38923i;
            if (c3903n94 != null) {
                c3903n94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public final void g(AbstractC3721g1 abstractC3721g1) {
        byte b10 = this.f38916b;
        if (b10 != 6) {
            if (b10 == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1) {
            c((byte) 7);
            return;
        }
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            c3903n9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.f38926l);
        }
        if (abstractC3721g1 != null) {
            b((byte) 4);
            a(abstractC3721g1);
        }
    }

    public final boolean h(AbstractC3721g1 abstractC3721g1) {
        byte b10 = this.f38916b;
        if (b10 == 1) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                c3903n9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f38926l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b10 == 7 || b10 == 6) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                c3903n92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f38926l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        if (Intrinsics.areEqual("html", s()) || Intrinsics.areEqual("htmlUrl", s())) {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                c3903n93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f38926l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC3721g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final String l() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void o(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        super.o(gestureDetectorOnGestureListenerC3635ci);
        if (!this.f38933s) {
            if (this.f38916b == 2) {
                b((byte) 1);
                b0();
                return;
            }
            return;
        }
        int iIndexOf = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        if (iIndexOf < this.f38930p) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + this.f38930p);
                return;
            }
            return;
        }
        this.f38932r.add(Integer.valueOf(iIndexOf));
        if (this.f38916b == 2) {
            int iW = W();
            for (int i10 = 0; i10 < iW && i10 < this.f38922h.size(); i10++) {
                if (this.f38922h.get(i10) == null || !this.f38932r.contains(Integer.valueOf(i10))) {
                    return;
                }
            }
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n92.a("ja", "Providing success based on index " + iIndexOf);
            }
            b((byte) 1);
            this.f38930p = 0;
            b0();
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void p(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.f38933s || !a(renderView)) {
            U();
        }
        super.p(renderView);
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final GestureDetectorOnGestureListenerC3635ci q() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (this.f38922h.size() <= 0 || this.f38930p >= this.f38922h.size()) ? null : (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38930p);
        if (this.G && gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.k();
        }
        return gestureDetectorOnGestureListenerC3635ci;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final byte t() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void a(byte[] bArr) {
        if (V()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void d() throws JSONException {
        super.d();
        this.I = null;
    }

    public final void a(final C3854la c3854la, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC3721g1) c3854la, (Context) activity);
        } else {
            ((Wb) AbstractC3925o6.f39166e.getValue()).f37946a.post(new Runnable() { // from class: w3.p8
                @Override // java.lang.Runnable
                public final void run() {
                    C3804ja.a(this.f107242b, c3854la, activity);
                }
            });
        }
    }

    public static final void e(C3804ja c3804ja) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c3804ja.N();
        if (c3804ja.f38933s) {
            AdSet adSetR = c3804ja.r();
            int size = (adSetR == null || (ads = adSetR.getAds()) == null) ? 0 : ads.size();
            for (int i10 = 1; i10 < size; i10++) {
                c3804ja.f38929o++;
                c3804ja.N();
            }
        }
    }

    public static final void a(C3804ja c3804ja, AbstractC3721g1 abstractC3721g1, Context context) {
        c3804ja.a(abstractC3721g1, context);
    }

    public static final void a(final C3804ja c3804ja, final GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Context context) {
        final int iIndexOf = c3804ja.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        ArrayList list = c3804ja.f38922h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = c3804ja.b(context);
        if (sB != 0) {
            c3804ja.e(iIndexOf);
        }
        c3804ja.b(iIndexOf, sB == 0);
        Handler handler = c3804ja.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.l8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3804ja.a(gestureDetectorOnGestureListenerC3635ci, c3804ja, iIndexOf);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final synchronized void e(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.r8
                @Override // java.lang.Runnable
                public final void run() {
                    C3804ja.b(this.f107279b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final synchronized void f(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.n8
                @Override // java.lang.Runnable
                public final void run() {
                    C3804ja.c(this.f107206b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.InterfaceC4118w0
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.f38933s) {
            Integer num = (Integer) this.f38932r.higher(Integer.valueOf(this.f38922h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    public final void a(AbstractC3721g1 abstractC3721g1, Context context) {
        if (abstractC3721g1 == null) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                c3903n9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        Function0 function0 = this.I;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        byte b10 = this.f38916b;
        if (b10 == 8) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n92.b("ja", "unload has been called on this ad. Dont show. ");
            }
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            Kb.a((byte) 2, "ja", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (b10 == 4) {
            e(abstractC3721g1);
            c((byte) 6);
            if (z()) {
                a((short) 2153);
                c((byte) 0);
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = i();
                if (gestureDetectorOnGestureListenerC3635ciI != null) {
                    gestureDetectorOnGestureListenerC3635ciI.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = n();
            }
            short sB = b(context);
            if (sB != 0) {
                a(sB);
                return;
            } else {
                abstractC3721g1.c();
                return;
            }
        }
        Kb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n93.b("ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
        Kb.a((byte) 1, "ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.InterfaceC4118w0
    public final void b() {
        if (this.f38933s) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", "Closing the ad as closeAll is called");
            }
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.o8
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C3804ja.a(this.f107225b);
                    }
                });
            }
        }
    }

    public static final void b(C3804ja c3804ja) {
        c3804ja.f(c3804ja.m());
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.InterfaceC4118w0
    public final boolean a(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.f38933s) {
            if (((Integer) this.f38932r.higher(Integer.valueOf(this.f38922h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.InterfaceC3889mk
    public final void a(byte b10) throws JSONException {
        if (b10 == 1) {
            if (this.f38933s) {
                if (this.f38916b == 2) {
                    C3903n9 c3903n9 = this.f38923i;
                    if (c3903n9 != null) {
                        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                        c3903n9.b("ja", "RenderView time out");
                    }
                    int iW = W();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iW) {
                            break;
                        }
                        if (!this.f38932r.contains(Integer.valueOf(i11))) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    }
                    a((GestureDetectorOnGestureListenerC3635ci) null, Integer.valueOf(i10), 2);
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.InterfaceC4118w0
    public final void a(int i10, final GestureDetectorOnGestureListenerC3635ci renderView, final Context context) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.f38933s) {
            C3903n9 c3903n9 = this.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3903n9.a("ja", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.f38932r.contains(Integer.valueOf(i10)) && i10 > this.f38922h.indexOf(renderView) && i10 < this.f38922h.size() && this.f38922h.get(i10) != null && ((gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(i10)) == null || gestureDetectorOnGestureListenerC3635ci.B0)) {
            if (context == null) {
                context = n();
            }
            super.a(i10, renderView, context);
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.u8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3804ja.a(this.f107335b, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n92.a("ja", "Cannot show an pod ad with invalid index passed");
        }
        b(this.f38922h.indexOf(renderView), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(com.inmobi.media.C3804ja r2, com.inmobi.media.EnumC3571a6 r3) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            java.lang.String r1 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L31
            r1 = 21
            if (r3 == r1) goto L2e
            switch(r3) {
                case 12: goto L2b;
                case 13: goto L28;
                case 14: goto L25;
                case 15: goto L22;
                case 16: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L31
        L1f:
            r3 = 2127(0x84f, float:2.98E-42)
            goto L33
        L22:
            r3 = 2126(0x84e, float:2.979E-42)
            goto L33
        L25:
            r3 = 2125(0x84d, float:2.978E-42)
            goto L33
        L28:
            r3 = 2124(0x84c, float:2.976E-42)
            goto L33
        L2b:
            r3 = 2123(0x84b, float:2.975E-42)
            goto L33
        L2e:
            r3 = 2229(0x8b5, float:3.123E-42)
            goto L33
        L31:
            r3 = 2122(0x84a, float:2.974E-42)
        L33:
            r1 = 1
            r2.a(r0, r1, r3)
            kotlin.Unit r2 = kotlin.Unit.f93236a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3804ja.a(com.inmobi.media.ja, com.inmobi.media.a6):kotlin.Unit");
    }

    @Override // com.inmobi.media.AbstractC3845l1
    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, short s10) throws JSONException {
        super.a(gestureDetectorOnGestureListenerC3635ci, s10);
        if (this.f38933s) {
            int iIndexOf = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
            if (iIndexOf < W()) {
                a(gestureDetectorOnGestureListenerC3635ci, (Integer) null, s10 == 2137 ? 1 : 3);
                e(s10);
            }
            a(iIndexOf, true);
            return;
        }
        e(s10);
    }

    public static final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, C3804ja c3804ja, int i10) throws JSONException {
        gestureDetectorOnGestureListenerC3635ci.l();
        c3804ja.a(i10, false);
    }

    public static final void a(C3804ja c3804ja) throws JSONException {
        c3804ja.e();
        C3903n9 c3903n9 = c3804ja.f38923i;
        if (c3903n9 != null) {
            c3903n9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c3804ja.f38926l);
        }
        if (c3804ja.m() != null) {
            AbstractC3721g1 abstractC3721g1M = c3804ja.m();
            if (abstractC3721g1M != null) {
                abstractC3721g1M.a();
                return;
            }
            return;
        }
        C3903n9 c3903n92 = c3804ja.f38923i;
        if (c3903n92 != null) {
            c3903n92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC3845l1, com.inmobi.media.AbstractC3686ei
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, boolean z10) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z10);
        byte b10 = this.f38916b;
        if (b10 == 4) {
            final short s10 = z10 ? (short) 2220 : (short) 2219;
            this.I = new Function0() { // from class: w3.m8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3804ja.a(this.f107186b, s10);
                }
            };
            return;
        }
        if (b10 != 6) {
            if (b10 == 7) {
                short s11 = z10 ? (short) 2224 : (short) 2223;
                Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3903n9 c3903n9 = this.f38923i;
                if (c3903n9 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3903n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z10, s11);
                renderView.x();
                f(m());
                return;
            }
            return;
        }
        short s12 = z10 ? (short) 2222 : (short) 2221;
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n92.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.x();
        if (this.F == 0) {
            a(s12);
        } else {
            renderView.a(z10, s12);
            f(m());
        }
    }

    public static final Unit a(C3804ja c3804ja, short s10) {
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3903n9 c3903n9 = c3804ja.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3903n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c3804ja.a(s10);
        c3804ja.I = null;
        return Unit.f93236a;
    }
}
