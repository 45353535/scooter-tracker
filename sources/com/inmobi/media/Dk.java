package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Dk;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Dk extends AbstractC3721g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f36743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f36744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PublisherCallbacks f36745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f36746d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdMetaInfo f36747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3903n9 f36748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WatermarkData f36749g;

    public static final void a(AbstractC3845l1 abstractC3845l1, Dk dk, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3845l1 != null) {
            abstractC3845l1.b((byte) 1);
        }
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3903n9 c3903n92 = dk.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public final void b(final AbstractC3845l1 abstractC3845l1, final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onLoadFailure " + this);
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n92.d("Dk", "AdManager state - LOAD_FAILED");
        }
        this.f36743a = (byte) 3;
        this.f36746d.post(new Runnable() { // from class: w3.p
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(abstractC3845l1, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void c() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdWillShow " + this);
        }
        byte b10 = this.f36743a;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f36746d.post(new Runnable() { // from class: w3.q
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f107251b);
            }
        });
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n92.d("Dk", "AdManager state - WILL_DISPLAY");
        }
        this.f36743a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void e() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onUserLeftApplication " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.r
            @Override // java.lang.Runnable
            public final void run() {
                Dk.c(this.f107270b);
            }
        });
    }

    public abstract AbstractC3845l1 f();

    public void g() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "submitAdLoadCalled " + this);
        }
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.O();
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdFetchFailed " + this);
        }
        this.f36743a = (byte) 3;
        this.f36746d.post(new Runnable() { // from class: w3.s
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107286b, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public void b(AdMetaInfo info) {
        AbstractC3845l1 abstractC3845l1F;
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdFetchSuccess " + this);
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n92.d("Dk", "AdManager state - FETCHED");
        }
        this.f36743a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.f36745c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (abstractC3845l1F = f()) == null) {
            return;
        }
        abstractC3845l1F.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdLoadSucceeded " + this);
        }
        this.f36747e = info;
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.b((byte) 1);
        }
    }

    public static final void a(Dk dk, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3903n9 c3903n92 = dk.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public static final void c(Dk dk) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public static final void b(Dk dk) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public void a(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdDisplayed " + this);
        }
        if (this.f36743a != 5) {
            this.f36747e = info;
            this.f36746d.post(new Runnable() { // from class: w3.u
                @Override // java.lang.Runnable
                public final void run() {
                    Dk.a(this.f107327b, info);
                }
            });
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n92.d("Dk", "AdManager state - DISPLAYED");
            }
            this.f36743a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void b(final HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdRewardActionCompleted " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.o
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f107212b, rewards);
            }
        });
    }

    public static final void b(Dk dk, Map map) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(Dk dk, AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public void a(AbstractC3845l1 abstractC3845l1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdLoadFailed " + this);
        }
        b(abstractC3845l1, status);
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(final HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdInteraction " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.m
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107173b, params);
            }
        });
    }

    public static final void a(Dk dk, Map map) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "getSignals " + this);
        }
        if (f() != null) {
            this.f36745c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C3804ja c3804ja;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "load " + this);
        }
        if (Intrinsics.areEqual(this.f36744b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n92.a("Dk", "Cannot call load(byte[]) API after load() API is called");
            }
            C3854la c3854la = (C3854la) this;
            b(c3854la.f38964h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3804ja c3804ja2 = c3854la.f38964h;
            if (c3804ja2 != null) {
                c3804ja2.b((short) 2140);
                return;
            }
            return;
        }
        this.f36744b = Boolean.FALSE;
        this.f36743a = (byte) 1;
        C3903n9 logger = this.f36748f;
        if (logger != null && (c3804ja = ((C3854la) this).f38964h) != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3804ja.f38923i = logger;
            C3591b0 c3591b0 = c3804ja.f38935u;
            c3591b0.getClass();
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3591b0.f38235f = logger;
        }
        C3854la c3854la2 = (C3854la) this;
        C3804ja c3804ja3 = c3854la2.f38964h;
        if (c3804ja3 == null || !c3804ja3.d((byte) 1)) {
            return;
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n93.a("Dk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f36745c = callbacks;
        C3804ja c3804ja4 = c3854la2.f38964h;
        if (c3804ja4 != null) {
            c3804ja4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.f36749g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            c3903n9.c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f36745c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            Kb.a((byte) 1, "Dk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                c3903n92.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3845l1 abstractC3845l1F = f();
            if (abstractC3845l1F != null) {
                abstractC3845l1F.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f36743a;
        if (b10 == 8) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                c3903n93.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3845l1 abstractC3845l1F2 = f();
            if (abstractC3845l1F2 != null) {
                abstractC3845l1F2.b((short) 2002);
            }
            return false;
        }
        if (b10 == 1) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3903n9 c3903n94 = this.f36748f;
            if (c3903n94 != null) {
                c3903n94.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3845l1 abstractC3845l1F3 = f();
            if (abstractC3845l1F3 != null) {
                abstractC3845l1F3.b((short) 2001);
            }
            return false;
        }
        if (b10 != 5) {
            return true;
        }
        Kb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3903n9 c3903n95 = this.f36748f;
        if (c3903n95 != null) {
            c3903n95.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3845l1 abstractC3845l1F4 = f();
        if (abstractC3845l1F4 != null) {
            abstractC3845l1F4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String tag, String placementString) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "canRender " + this);
        }
        byte b10 = this.f36743a;
        if (b10 == 1) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n92.b("Dk", "adload in progress");
            }
            AbstractC3845l1 abstractC3845l1F = f();
            if (abstractC3845l1F != null) {
                abstractC3845l1F.c((short) 2129);
            }
            return false;
        }
        if (b10 == 8) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n93.b("Dk", "ad loading into view is in progress");
            }
            AbstractC3845l1 abstractC3845l1F2 = f();
            if (abstractC3845l1F2 != null) {
                abstractC3845l1F2.c((short) 2164);
            }
            return false;
        }
        if (b10 != 5) {
            if (b10 == 7) {
                return true;
            }
            C3903n9 c3903n94 = this.f36748f;
            if (c3903n94 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n94.b("Dk", "ad in illegal state");
            }
            AbstractC3845l1 abstractC3845l1F3 = f();
            if (abstractC3845l1F3 != null) {
                abstractC3845l1F3.c((short) 2165);
            }
            AbstractC3845l1 abstractC3845l1F4 = f();
            if (abstractC3845l1F4 != null) {
                abstractC3845l1F4.J();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Kb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3903n9 c3903n95 = this.f36748f;
        if (c3903n95 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n95.b("Dk", "ad active before renderAd");
        }
        AbstractC3845l1 abstractC3845l1F5 = f();
        if (abstractC3845l1F5 != null) {
            abstractC3845l1F5.c((short) 2130);
        }
        AbstractC3845l1 abstractC3845l1F6 = f();
        if (abstractC3845l1F6 != null) {
            abstractC3845l1F6.J();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public void a() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdDismissed " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.l
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107157b);
            }
        });
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public static final void a(Dk dk) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3903n9 c3903n92 = dk.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n92.b("Dk", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(final C3740gk c3740gk) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "onAdImpression " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.k
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107131b, c3740gk);
            }
        });
    }

    public static final void a(Dk dk, C3740gk c3740gk) {
        if (dk.f36745c == null) {
            C3903n9 c3903n9 = dk.f36748f;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3903n9.b("Dk", "callback is null");
            }
            if (c3740gk != null) {
                c3740gk.b();
                return;
            }
            return;
        }
        C3903n9 c3903n92 = dk.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n92.a("Dk", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c3740gk);
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(final V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.f36746d.post(new Runnable() { // from class: w3.t
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107306b, audioStatusInternal);
            }
        });
    }

    public static final void a(Dk dk, V1 v12) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onAudioStatusChanged - " + v12.f37874a);
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v12);
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(final String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f36746d.post(new Runnable() { // from class: w3.n
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f107193b, log);
            }
        });
    }

    public static final void a(Dk dk, String str) {
        C3903n9 c3903n9 = dk.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.a("Dk", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = dk.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3903n9.c("Dk", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.b(s10);
        }
    }
}
