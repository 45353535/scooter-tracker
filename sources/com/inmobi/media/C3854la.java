package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3854la;
import com.ironsource.C4424m2;
import com.ironsource.C4488pd;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3854la extends Dk {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38963j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3804ja f38964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38965i;

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a() throws JSONException {
        this.f36746d.post(new Runnable() { // from class: w3.t9
            @Override // java.lang.Runnable
            public final void run() {
                C3854la.a(this.f107324b);
            }
        });
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f36743a = (byte) 0;
        this.f36744b = null;
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            c3804ja.d();
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public final void b(PublisherCallbacks callbacks) {
        C3804ja c3804ja;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (this.f36745c == null) {
            this.f36745c = callbacks;
        }
        if (Intrinsics.areEqual(this.f36744b, Boolean.FALSE)) {
            C3804ja c3804ja2 = this.f38964h;
            if (c3804ja2 != null) {
                c3804ja2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3903n9 c3903n9 = this.f36748f;
            if (c3903n9 != null) {
                c3903n9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Kb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.f38965i) {
            C3804ja c3804ja3 = this.f38964h;
            if (c3804ja3 != null) {
                c3804ja3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.f36744b = Boolean.TRUE;
        C3804ja c3804ja4 = this.f38964h;
        if (c3804ja4 == null || !a("InMobi", String.valueOf(c3804ja4.f38926l), callbacks) || (c3804ja = this.f38964h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f36745c;
        if (c3804ja.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f36743a = (byte) 1;
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                C3804ja c3804ja5 = this.f38964h;
                c3903n93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3804ja5 != null ? c3804ja5.f38926l : null));
            }
            C3804ja c3804ja6 = this.f38964h;
            Kb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3804ja6 != null ? c3804ja6.f38926l : null));
            C3804ja c3804ja7 = this.f38964h;
            if (c3804ja7 != null) {
                c3804ja7.e(this);
            }
            C3804ja c3804ja8 = this.f38964h;
            if (c3804ja8 != null) {
                c3804ja8.C();
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void c(AdMetaInfo info) throws JSONException {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f38964h != null) {
            d(info);
            return;
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b10 = this.f36743a;
        if (b10 == 8 || b10 == 1) {
            b((AbstractC3845l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b10 == 2) {
            Kb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                c3903n93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b10 != 5) {
            Kb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3903n9 c3903n94 = this.f36748f;
            if (c3903n94 != null) {
                c3903n94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Kb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3903n9 c3903n95 = this.f36748f;
        if (c3903n95 != null) {
            c3903n95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            c3804ja.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.c("InterstitialUnifiedAdManager", C4488pd.f44653f);
        }
        super.c(adMetaInfo);
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f36743a = (byte) 2;
        this.f36746d.post(new Runnable() { // from class: w3.q9
            @Override // java.lang.Runnable
            public final void run() {
                C3854la.b(this.f107265b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3845l1 f() {
        return this.f38964h;
    }

    public final boolean h() throws JSONException {
        byte b10 = this.f36743a;
        if (b10 == 1) {
            C3903n9 c3903n9 = this.f36748f;
            if (c3903n9 != null) {
                c3903n9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b10 == 7) {
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b10 != 5) {
            if (!this.f38965i) {
                return true;
            }
            C3804ja c3804ja = this.f38964h;
            if (c3804ja != null) {
                c3804ja.d((short) 2149);
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                c3903n93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C3804ja c3804ja2 = this.f38964h;
        if (c3804ja2 != null) {
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c3804ja2.f38926l);
            C3903n9 c3903n94 = this.f36748f;
            if (c3903n94 != null) {
                C3804ja c3804ja3 = this.f38964h;
                c3903n94.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c3804ja3 != null ? c3804ja3.f38926l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() {
        C3804ja c3804ja;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", Reporting.EventType.RENDER);
        }
        C3804ja c3804ja2 = this.f38964h;
        if (c3804ja2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c3804ja2.f38916b == 4 && this.f36747e != null) {
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.f36747e;
            Intrinsics.checkNotNull(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.f38965i) {
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                c3903n93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.f38964h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3804ja c3804ja3 = this.f38964h;
            if (c3804ja3 != null) {
                c3804ja3.c((short) 2128);
                return;
            }
            return;
        }
        com.inmobi.media.ads.network.common.model.Ad adB = c3804ja2.b(0);
        C3804ja c3804ja4 = this.f38964h;
        boolean zA = a("InMobi", String.valueOf(c3804ja4 != null ? c3804ja4.f38926l : null));
        if (adB == null) {
            C3903n9 c3903n94 = this.f36748f;
            if (c3903n94 != null) {
                c3903n94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.f38964h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3804ja c3804ja5 = this.f38964h;
            if (c3804ja5 != null) {
                c3804ja5.b((short) 2166);
            }
        }
        if (this.f36747e == null) {
            C3903n9 c3903n95 = this.f36748f;
            if (c3903n95 != null) {
                c3903n95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.f38964h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3804ja c3804ja6 = this.f38964h;
            if (c3804ja6 != null) {
                c3804ja6.b((short) 2167);
            }
        }
        if (adB == null || !zA) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f36745c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3804ja = this.f38964h) != null) {
            c3804ja.d((byte) 1);
        }
        C3903n9 c3903n96 = this.f36748f;
        if (c3903n96 != null) {
            c3903n96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f36743a = (byte) 8;
        C3804ja c3804ja7 = this.f38964h;
        if (c3804ja7 != null) {
            c3804ja7.X();
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void d() throws JSONException {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            byte b10 = c3804ja.f38916b;
            if (b10 != 6 && b10 != 7) {
                a(true, (short) 2159);
            } else {
                c3804ja.f(this);
            }
        }
    }

    public static final void a(C3854la c3854la) {
        C3903n9 c3903n9 = c3854la.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3854la.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3854la c3854la, AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = c3854la.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3854la.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z10, short s10) throws JSONException {
        C3804ja c3804ja;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s10 != 0 && (c3804ja = this.f38964h) != null) {
            c3804ja.d(s10);
        }
        this.f36746d.post(new Runnable() { // from class: w3.s9
            @Override // java.lang.Runnable
            public final void run() {
                C3854la.c(this.f107300b);
            }
        });
        if (z10) {
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f36743a = (byte) 6;
            C3804ja c3804ja2 = this.f38964h;
            if (c3804ja2 != null) {
                c3804ja2.d();
            }
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            c3903n93.a();
        }
    }

    public static final void c(C3854la c3854la) {
        C3903n9 c3903n9 = c3854la.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3854la.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3903n9 c3903n92 = c3854la.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
        C3804ja c3804ja = c3854la.f38964h;
        if (c3804ja != null) {
            c3804ja.b((byte) 4);
        }
    }

    public final void a(Activity activity) {
        Pj pj;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", C4424m2.f43623v);
        }
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null && (pj = c3804ja.H) != null) {
            pj.f37550b = true;
        }
        if (c3804ja != null) {
            c3804ja.Q();
        }
        if (h()) {
            if (!W6.a()) {
                if (this.f38964h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C3804ja c3804ja2 = this.f38964h;
            if (c3804ja2 == null || !c3804ja2.d((byte) 4)) {
                return;
            }
            this.f38965i = true;
            C3804ja c3804ja3 = this.f38964h;
            if (c3804ja3 != null) {
                c3804ja3.a(this, activity);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void b() throws JSONException {
        this.f36746d.post(new Runnable() { // from class: w3.r9
            @Override // java.lang.Runnable
            public final void run() {
                C3854la.b(this.f107280b);
            }
        });
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f36743a = (byte) 6;
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            c3804ja.d();
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public final void a(Jg pubSettings, Context context, boolean z10, String logType) {
        C3804ja c3804ja;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI;
        C3804ja c3804ja2;
        String str;
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.f38964h == null) {
            Intrinsics.checkNotNullParameter("int", "mAdType");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            long j10 = pubSettings.f37141a;
            String str2 = pubSettings.f37142b;
            Map map = pubSettings.f37143c;
            String str3 = pubSettings.f37147g;
            String str4 = pubSettings.f37145e;
            if (j10 != Long.MIN_VALUE) {
                if (map == null || (str = (String) map.get("tp")) == null) {
                    str = "";
                }
                C4093v0 c4093v0 = new C4093v0(j10, str, "int", str3);
                c4093v0.f39714d = str2;
                c4093v0.f39713c = map;
                Intrinsics.checkNotNullParameter("", "<set-?>");
                c4093v0.f39718h = "";
                Intrinsics.checkNotNullParameter("activity", "<set-?>");
                c4093v0.f39719i = "activity";
                c4093v0.f39717g = string;
                c4093v0.f39720j = false;
                c4093v0.f39721k = str4;
                this.f38964h = new C3804ja(context, c4093v0, this);
            } else {
                throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
        }
        if (z10) {
            g();
        }
        String str5 = pubSettings.f37147g;
        if (str5 != null) {
            C3903n9 c3903n9 = this.f36748f;
            if (c3903n9 != null) {
                c3903n9.a();
            }
            C3903n9 c3903n9A = Jh.a(logType, str5);
            this.f36748f = c3903n9A;
            if (c3903n9A != null) {
                c3903n9A.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3903n9 logger = this.f36748f;
            if (logger != null && (c3804ja2 = this.f38964h) != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3804ja2.f38923i = logger;
                C3591b0 c3591b0 = c3804ja2.f38935u;
                c3591b0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3591b0.f38235f = logger;
            }
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3804ja c3804ja3 = this.f38964h;
            Intrinsics.checkNotNull(c3804ja3);
            Jh.a(c3804ja3, this.f36748f);
        }
        C3804ja c3804ja4 = this.f38964h;
        if (c3804ja4 != null) {
            c3804ja4.a(context);
        }
        C3804ja c3804ja5 = this.f38964h;
        if (c3804ja5 != null) {
            c3804ja5.a(pubSettings.f37143c);
        }
        C3804ja c3804ja6 = this.f38964h;
        if (c3804ja6 != null) {
            c3804ja6.K();
        }
        if (pubSettings.f37144d && (c3804ja = this.f38964h) != null && (gestureDetectorOnGestureListenerC3635ciI = c3804ja.i()) != null) {
            c3804ja.G = true;
            gestureDetectorOnGestureListenerC3635ciI.k();
        }
        WatermarkData watermarkData = this.f36749g;
        if (watermarkData != null) {
            C3804ja c3804ja7 = this.f38964h;
            if (c3804ja7 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c3804ja7.A = watermarkData;
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ = c3804ja7.q();
                if (gestureDetectorOnGestureListenerC3635ciQ != null) {
                    gestureDetectorOnGestureListenerC3635ciQ.setWatermark(watermarkData);
                }
            }
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                c3903n93.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.f36747e = info;
        if (this.f38964h == null) {
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC3845l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.f36746d.post(new Runnable() { // from class: w3.u9
            @Override // java.lang.Runnable
            public final void run() {
                C3854la.a(this.f107338b, info);
            }
        });
    }

    public static final void b(C3854la c3854la) {
        C3903n9 c3903n9 = c3854la.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3854la.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3804ja c3804ja = c3854la.f38964h;
        if (c3804ja != null) {
            c3804ja.b((byte) 4);
        }
    }

    public static final void b(C3854la c3854la, AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = c3854la.f36748f;
        if (c3903n9 != null) {
            c3903n9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3854la.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            c3804ja.R();
        }
        this.f38965i = false;
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3804ja c3804ja = this.f38964h;
        if (c3804ja != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3804ja.A = watermarkData;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ = c3804ja.q();
            if (gestureDetectorOnGestureListenerC3635ciQ != null) {
                gestureDetectorOnGestureListenerC3635ciQ.setWatermark(watermarkData);
            }
        }
    }
}
