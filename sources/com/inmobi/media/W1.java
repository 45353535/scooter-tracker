package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.W1;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class W1 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N1 f37924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f37925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N1 f37926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N1 f37927k;

    public W1(InMobiAudio.a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f36745c = callbacks;
    }

    public static final void a(W1 w12, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w12.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(W1 w12, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w12.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f36743a = (byte) 0;
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String str2 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c3903n92.d(str2, "AdManager state - CREATED");
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            String str3 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c3903n93.a(str3, "Ad load successful, providing callback");
        }
        this.f36746d.post(new Runnable() { // from class: w3.i5
            @Override // java.lang.Runnable
            public final void run() {
                W1.b(this.f107099b, info);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3845l1 f() {
        return m() ? this.f37926j : this.f37927k;
    }

    @Override // com.inmobi.media.Dk
    public final void g() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "submitAdLoadCalled " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 != null) {
            n12.O();
        }
    }

    public final void h() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "clear " + this);
        }
        p();
        N1 n12 = this.f37924h;
        if (n12 != null) {
            n12.d();
        }
        this.f37924h = null;
        N1 n13 = this.f37925i;
        if (n13 != null) {
            n13.d();
        }
        this.f37925i = null;
        this.f37926j = null;
        this.f37927k = null;
        this.f36744b = null;
    }

    public final void i() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "pause " + this);
        }
        N1 n12 = this.f37926j;
        if (n12 != null) {
            n12.W();
        }
    }

    public final void j() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        N1 n12 = this.f37924h;
        if (n12 != null) {
            n12.Y();
        }
        N1 n13 = this.f37925i;
        if (n13 != null) {
            n13.Y();
        }
    }

    public final void k() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "loadIntoView " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(n12.f38926l.f39711a))) {
            this.f36743a = (byte) 8;
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String str2 = X1.f37983a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c3903n92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n12.Z();
        }
    }

    public final void l() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "resume " + this);
        }
        N1 n12 = this.f37926j;
        if (n12 != null) {
            n12.X();
        }
    }

    public final boolean m() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "shouldUseForegroundUnit " + this);
        }
        N1 n12 = this.f37926j;
        Byte bValueOf = n12 != null ? Byte.valueOf(n12.f38916b) : null;
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String str2 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c3903n92.d(str2, "State - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "submitAdShowCalled " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 != null) {
            n12.Q();
        }
    }

    public final void o() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "swapAdUnits " + this);
        }
        N1 n12 = this.f37926j;
        if (Intrinsics.areEqual(n12, this.f37924h)) {
            this.f37926j = this.f37925i;
            this.f37927k = this.f37924h;
        } else if (Intrinsics.areEqual(n12, this.f37925i) || n12 == null) {
            this.f37926j = this.f37924h;
            this.f37927k = this.f37925i;
        }
    }

    public final void p() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        N1 n12 = this.f37924h;
        if (n12 != null) {
            n12.b0();
        }
        N1 n13 = this.f37925i;
        if (n13 != null) {
            n13.b0();
        }
    }

    public final boolean a(long j10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "checkForRefreshRate " + this);
        }
        if (this.f37927k == null) {
            return false;
        }
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) Y3.f38021a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.f37927k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = X1.f37983a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        N1 n12 = this.f37927k;
        Kb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n12 != null ? n12.f38926l : null) + ")");
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            N1 n13 = this.f37927k;
            c3903n92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n13 != null ? n13.f38926l : null) + ")");
        }
        return false;
    }

    public final void b(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "load 1 " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 != null && a("InMobi", String.valueOf(n12.f38926l.f39711a), this.f36745c) && n12.d((byte) 1)) {
            this.f36743a = (byte) 1;
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String str2 = X1.f37983a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c3903n92.d(str2, "AdManager state - LOADING");
            }
            this.f36747e = null;
            n12.c(adSize);
            n12.b(false);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.c(str, "onAdFetchSuccess " + this);
        }
        N1 n12 = this.f37927k;
        if ((n12 != null ? n12.b(0) : null) == null) {
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String str2 = X1.f37983a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c3903n92.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3845l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            String str3 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c3903n93.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.f36746d.post(new Runnable() { // from class: w3.j5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f107115b, info);
            }
        });
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI;
        C4093v0 c4093v0;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "displayAd " + this);
        }
        N1 n12 = this.f37926j;
        if (n12 == null || (gestureDetectorOnGestureListenerC3635ciI = n12.i()) == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3635ciI.getViewableAd();
        N1 n13 = this.f37926j;
        if (n13 != null && (c4093v0 = n13.f38926l) != null && c4093v0.f39720j) {
            gestureDetectorOnGestureListenerC3635ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3635ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a((Map) null);
        N1 n14 = this.f37927k;
        if (n14 != null) {
            n14.W();
        }
        if (viewGroup == null) {
            relativeLayout.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        N1 n15 = this.f37927k;
        if (n15 != null) {
            n15.d();
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void b() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "onAdShowFailed " + this);
        }
        this.f36746d.post(new Runnable() { // from class: w3.g5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f107063b);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "showAudioAd");
        }
        N1 n12 = this.f37926j;
        if (n12 != null && n12.f38916b == 7) {
            String str2 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c3903n92.b(str2, "ad is active");
            }
            N1 n13 = this.f37927k;
            if (n13 != null) {
                n13.e((short) 15);
                return;
            }
            return;
        }
        N1 n14 = this.f37927k;
        if (n14 != null) {
            C3903n9 c3903n93 = n14.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n93.c("l1", "canProceedToShow");
            }
            if (n14.z()) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                Kb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3903n9 c3903n94 = n14.f38923i;
                if (c3903n94 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n94.b("l1", "ad is expired");
                }
                n14.c0();
                return;
            }
            byte b10 = n14.f38916b;
            if (b10 == 1 || b10 == 2) {
                Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3903n9 c3903n95 = n14.f38923i;
                if (c3903n95 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n95.b("l1", "ad is not ready");
                }
                C3903n9 c3903n96 = n14.f38923i;
                if (c3903n96 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n96.a("l1", "callback - onShowFailure");
                }
                n14.e((short) 2152);
                return;
            }
            if (b10 == 3) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n14.e((short) 0);
                C3903n9 c3903n97 = n14.f38923i;
                if (c3903n97 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n97.a("l1", "callback - onShowFailure");
                }
                C3903n9 c3903n98 = n14.f38923i;
                if (c3903n98 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n98.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b10 == 8) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n14.e((short) 0);
                C3903n9 c3903n99 = n14.f38923i;
                if (c3903n99 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n99.a("l1", "callback - onShowFailure");
                }
                C3903n9 c3903n910 = n14.f38923i;
                if (c3903n910 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n910.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b10 == 0) {
                Kb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                n14.e((short) 0);
                C3903n9 c3903n911 = n14.f38923i;
                if (c3903n911 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n911.a("l1", "callback - onShowFailure");
                }
                C3903n9 c3903n912 = n14.f38923i;
                if (c3903n912 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n912.b("l1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "onAdDismissed " + this);
        }
        this.f36743a = (byte) 0;
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String str2 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c3903n92.d(str2, "AdManager state - CREATED");
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            c3903n93.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.R();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a(AbstractC3845l1 abstractC3845l1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.b(str, com.ironsource.Df.f40641b);
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public static final void a(W1 w12) {
        C3903n9 c3903n9 = w12.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = w12.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3903n9 c3903n92 = w12.f36748f;
        if (c3903n92 != null) {
            c3903n92.a();
        }
    }

    public final void a(final InMobiAudio audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.f36746d.post(new Runnable() { // from class: w3.h5
                    @Override // java.lang.Runnable
                    public final void run() {
                        W1.a(this.f107079b, audio);
                    }
                });
            }
        } catch (Exception e10) {
            N1 n12 = this.f37927k;
            if (n12 != null) {
                n12.e((short) 26);
            }
            String str2 = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c3903n92.b(str2, "Show failed with unexpected error: " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    public final void b(short s10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.b(str, "submitAdLoadFailed " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 != null) {
            n12.c((short) 15);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(short s10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String str = X1.f37983a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c3903n9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        N1 n12 = this.f37927k;
        if (n12 != null) {
            n12.b(s10);
        }
    }

    public final void a(Context context, Jg pubSettings, String adSize) {
        String m10Context;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        String str2 = X1.f37983a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        Intrinsics.checkNotNullParameter("audio", "mAdType");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        long j10 = pubSettings.f37141a;
        String str3 = pubSettings.f37142b;
        Map map = pubSettings.f37143c;
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        boolean z10 = pubSettings.f37144d;
        String str4 = pubSettings.f37147g;
        String str5 = pubSettings.f37145e;
        if (j10 != Long.MIN_VALUE) {
            if (map == null || (str = (String) map.get("tp")) == null) {
                str = "";
            }
            C4093v0 c4093v0 = new C4093v0(j10, str, "audio", str4);
            c4093v0.f39714d = str3;
            c4093v0.f39713c = map;
            Intrinsics.checkNotNullParameter(adSize, "<set-?>");
            c4093v0.f39718h = adSize;
            Intrinsics.checkNotNullParameter(m10Context, "<set-?>");
            c4093v0.f39719i = m10Context;
            c4093v0.f39717g = string;
            c4093v0.f39720j = z10;
            c4093v0.f39721k = str5;
            N1 n12 = this.f37924h;
            if (n12 != null && this.f37925i != null) {
                n12.a(context, c4093v0, this);
                N1 n13 = this.f37925i;
                if (n13 != null) {
                    n13.a(context, c4093v0, this);
                }
            } else {
                this.f37924h = new N1(context, c4093v0, this);
                this.f37925i = new N1(context, c4093v0, this);
                this.f37927k = this.f37924h;
            }
            String str6 = pubSettings.f37147g;
            if (str6 != null) {
                C3903n9 c3903n9 = this.f36748f;
                if (c3903n9 != null) {
                    c3903n9.a();
                }
                C3903n9 c3903n9A = Jh.a("audio", str6);
                this.f36748f = c3903n9A;
                if (c3903n9A != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    c3903n9A.a(str2, "adding audioAdUnit1 to reference tracker");
                }
                N1 n14 = this.f37924h;
                Intrinsics.checkNotNull(n14);
                Jh.a(n14, this.f36748f);
                C3903n9 c3903n92 = this.f36748f;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    c3903n92.a(str2, "adding audioAdUnit2 to reference tracker");
                }
                N1 n15 = this.f37925i;
                Intrinsics.checkNotNull(n15);
                Jh.a(n15, this.f36748f);
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(W1 w12, RelativeLayout relativeLayout) {
        w12.b(relativeLayout);
    }
}
