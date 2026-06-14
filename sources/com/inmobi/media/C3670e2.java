package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3670e2;
import com.inmobi.media.core.config.models.AdConfig;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3670e2 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38488h = "InMobi";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38489i = C3670e2.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3567a2 f38490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C3567a2 f38491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3567a2 f38492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3567a2 f38493m;

    public final boolean a(long j10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "checkForRefreshRate " + this);
        }
        C3567a2 c3567a2 = this.f38493m;
        if (c3567a2 == null) {
            return false;
        }
        AdConfig adConfig = c3567a2.f38917c;
        Intrinsics.checkNotNull(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String TAG2 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.b(TAG2, "Early refresh request");
        }
        b(this.f38493m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG3 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        C3567a2 c3567a22 = this.f38493m;
        Kb.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3567a22 != null ? c3567a22.f38926l : null) + ")");
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            String TAG4 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            C3567a2 c3567a23 = this.f38493m;
            c3903n93.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3567a23 != null ? c3567a23.f38926l : null) + ")");
        }
        return false;
    }

    public final void b(InMobiBanner inMobiBanner) {
        C4093v0 c4093v0;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "displayInternal " + this);
        }
        C3567a2 c3567a2 = this.f38492l;
        if (c3567a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = c3567a2.i();
        if (!androidx.activity.s.a(gestureDetectorOnGestureListenerC3635ciI)) {
            gestureDetectorOnGestureListenerC3635ciI = null;
        }
        if (gestureDetectorOnGestureListenerC3635ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3635ciI.getViewableAd();
        C3567a2 c3567a22 = this.f38492l;
        if (c3567a22 != null && (c4093v0 = c3567a22.f38926l) != null && c4093v0.f39720j) {
            gestureDetectorOnGestureListenerC3635ciI.k();
        }
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3635ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f36743a = (byte) 0;
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String TAG2 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.a(TAG2, "Ad load successful, providing callback");
        }
        this.f36746d.post(new Runnable() { // from class: w3.z6
            @Override // java.lang.Runnable
            public final void run() {
                C3670e2.b(this.f107413b, info);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3845l1 f() {
        return q() ? this.f38492l : this.f38493m;
    }

    public final void h() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C3567a2 c3567a2;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "canScheduleRefresh " + this);
        }
        C3567a2 c3567a22 = this.f38493m;
        if (c3567a22 == null) {
            return false;
        }
        byte b10 = c3567a22.f38916b;
        if (b10 != 4 && b10 != 1 && b10 != 2 && ((c3567a2 = this.f38492l) == null || c3567a2.f38916b != 7)) {
            return true;
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String TAG2 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "clear " + this);
        }
        t();
        C3567a2 c3567a2 = this.f38490j;
        if (c3567a2 != null) {
            c3567a2.d();
        }
        this.f38490j = null;
        C3567a2 c3567a22 = this.f38491k;
        if (c3567a22 != null) {
            c3567a22.d();
        }
        this.f38491k = null;
        this.f36748f = null;
        this.f38492l = null;
        this.f38493m = null;
        this.f36744b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "defaultRefreshInterval " + this);
        }
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F == null || (adConfig = abstractC3845l1F.f38917c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        String TAG = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.areEqual(this.f38492l, this.f38490j);
        String TAG2 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Intrinsics.areEqual(this.f38493m, this.f38490j);
        String TAG3 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        Intrinsics.areEqual(this.f38492l, this.f38491k);
        String TAG4 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Intrinsics.areEqual(this.f38493m, this.f38491k);
        String TAG5 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        Objects.toString(this.f38490j);
        String TAG6 = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        Objects.toString(this.f38491k);
        C3567a2 c3567a2 = this.f38492l;
        return c3567a2 != null && c3567a2.f38916b == 7;
    }

    public final void m() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "pause " + this);
        }
        C3567a2 c3567a2 = this.f38492l;
        if (c3567a2 != null) {
            c3567a2.W();
        }
    }

    public final void n() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        C3567a2 c3567a2 = this.f38490j;
        if (c3567a2 != null) {
            c3567a2.Y();
        }
        C3567a2 c3567a22 = this.f38491k;
        if (c3567a22 != null) {
            c3567a22.Y();
        }
    }

    public final void o() {
        C3567a2 c3567a2;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "render " + this);
        }
        C3567a2 c3567a22 = this.f38493m;
        if (c3567a22 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.f38488h, String.valueOf(c3567a22.f38926l.f39711a))) {
            PublisherCallbacks publisherCallbacks = this.f36745c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3567a2 = this.f38493m) != null) {
                c3567a2.d((byte) 1);
            }
            this.f36743a = (byte) 8;
            c3567a22.Z();
        }
    }

    public final void p() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "resume " + this);
        }
        C3567a2 c3567a2 = this.f38492l;
        if (c3567a2 != null) {
            c3567a2.X();
        }
    }

    public final boolean q() {
        C3567a2 c3567a2 = this.f38492l;
        Byte bValueOf = c3567a2 != null ? Byte.valueOf(c3567a2.f38916b) : null;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "submitAdShowFail " + this);
        }
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.d((short) 2239);
        }
    }

    public final void s() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "swapAdUnits " + this);
        }
        C3567a2 c3567a2 = this.f38492l;
        if (c3567a2 == null) {
            this.f38492l = this.f38490j;
            this.f38493m = this.f38491k;
        } else if (Intrinsics.areEqual(c3567a2, this.f38490j)) {
            this.f38492l = this.f38491k;
            this.f38493m = this.f38490j;
        } else if (Intrinsics.areEqual(c3567a2, this.f38491k)) {
            this.f38492l = this.f38490j;
            this.f38493m = this.f38491k;
        }
    }

    public final void t() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        C3567a2 c3567a2 = this.f38490j;
        if (c3567a2 != null) {
            c3567a2.b0();
        }
        C3567a2 c3567a22 = this.f38491k;
        if (c3567a22 != null) {
            c3567a22.b0();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.f36747e = info;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C3567a2 c3567a2 = this.f38493m;
        if ((c3567a2 != null ? c3567a2.b(0) : null) == null) {
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String TAG2 = this.f38489i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3845l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C3903n9 c3903n93 = this.f36748f;
        if (c3903n93 != null) {
            String TAG3 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3903n93.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.f36746d.post(new Runnable() { // from class: w3.x6
            @Override // java.lang.Runnable
            public final void run() {
                C3670e2.a(this.f107377b, info);
            }
        });
    }

    public final void a(InMobiBanner banner) {
        C4093v0 c4093v0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "displayAd " + this);
        }
        C3567a2 c3567a2 = this.f38492l;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = c3567a2 != null ? c3567a2.i() : null;
        if (!androidx.activity.s.a(gestureDetectorOnGestureListenerC3635ciI)) {
            gestureDetectorOnGestureListenerC3635ciI = null;
        }
        if (gestureDetectorOnGestureListenerC3635ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3635ciI.getViewableAd();
        C3567a2 c3567a22 = this.f38492l;
        if (c3567a22 != null && (c4093v0 = c3567a22.f38926l) != null && c4093v0.f39720j) {
            gestureDetectorOnGestureListenerC3635ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3635ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        C3567a2 c3567a23 = this.f38493m;
        if (c3567a23 != null) {
            c3567a23.W();
        }
        C3567a2 c3567a24 = this.f38492l;
        if (c3567a24 != null && c3567a24.f38916b == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        C3567a2 c3567a25 = this.f38493m;
        if (c3567a25 != null) {
            c3567a25.d();
        }
    }

    public static final void b(C3670e2 c3670e2, AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = c3670e2.f36748f;
        if (c3903n9 != null) {
            String TAG = c3670e2.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3670e2.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c3670e2.b((short) 2184);
        }
    }

    public final void b(short s10) {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "submitAdLoadFailed " + this);
        }
        AbstractC3845l1 abstractC3845l1F = f();
        if (abstractC3845l1F != null) {
            abstractC3845l1F.c(s10);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfig;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "getRefreshInterval " + this);
        }
        C3567a2 c3567a2 = this.f38493m;
        return (c3567a2 == null || (adConfig = c3567a2.f38917c) == null) ? i11 : i10 < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i10;
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z10) {
        C3567a2 c3567a2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "load 1 " + this);
        }
        if (Intrinsics.areEqual(this.f36744b, Boolean.FALSE)) {
            b(this.f38493m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3567a2 c3567a22 = this.f38493m;
            if (c3567a22 != null) {
                c3567a22.b((short) 2006);
            }
            Kb.a((byte) 1, this.f38488h, "Cannot call load() API after calling load(byte[])");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String TAG2 = this.f38489i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.f36744b = Boolean.TRUE;
        if (this.f36745c == null) {
            this.f36745c = callbacks;
        }
        C3567a2 c3567a23 = this.f38493m;
        if (c3567a23 == null || !a(this.f38488h, String.valueOf(c3567a23.f38926l), callbacks) || (c3567a2 = this.f38493m) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f36745c;
        if (c3567a2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3903n9 c3903n93 = this.f36748f;
            if (c3903n93 != null) {
                String TAG3 = this.f38489i;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c3903n93.d(TAG3, "AdManager state - LOADING");
            }
            this.f36743a = (byte) 1;
            this.f36747e = null;
            C3567a2 c3567a24 = this.f38493m;
            Intrinsics.checkNotNull(c3567a24);
            c3567a24.c(adSize);
            C3567a2 c3567a25 = this.f38493m;
            Intrinsics.checkNotNull(c3567a25);
            c3567a25.b(z10);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        C3567a2 c3567a2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "load 2 " + this);
        }
        if (Intrinsics.areEqual(this.f36744b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3903n9 c3903n92 = this.f36748f;
            if (c3903n92 != null) {
                String TAG2 = this.f38489i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3903n92.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.f36744b = Boolean.FALSE;
        this.f36743a = (byte) 1;
        this.f36745c = callbacks;
        if (this.f38493m != null) {
            C3567a2 c3567a22 = this.f38492l;
            if ((c3567a22 == null || !c3567a22.B()) && (c3567a2 = this.f38493m) != null && c3567a2.d((byte) 1)) {
                C3903n9 c3903n93 = this.f36748f;
                if (c3903n93 != null) {
                    String TAG3 = this.f38489i;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    c3903n93.a(TAG3, "timer started - load banner");
                }
                C3567a2 c3567a23 = this.f38493m;
                if (c3567a23 != null) {
                    c3567a23.D();
                }
                C3567a2 c3567a24 = this.f38493m;
                if (c3567a24 != null) {
                    c3567a24.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3721g1
    public final void a() {
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onAdDismissed " + this);
        }
        this.f36743a = (byte) 0;
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String TAG2 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C3670e2 c3670e2, AdMetaInfo adMetaInfo) {
        C3903n9 c3903n9 = c3670e2.f36748f;
        if (c3903n9 != null) {
            String TAG = c3670e2.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3670e2.f36745c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3903n9 c3903n92 = c3670e2.f36748f;
        if (c3903n92 != null) {
            String TAG2 = c3670e2.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC3721g1
    public final void a(int i10, final int i11, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        ViewParent parent;
        C3903n9 c3903n9 = this.f36748f;
        if (c3903n9 != null) {
            String TAG = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3903n9.c(TAG, "onShowNextPodAd " + this);
        }
        C3903n9 c3903n92 = this.f36748f;
        if (c3903n92 != null) {
            String TAG2 = this.f38489i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3903n92.a(TAG2, "on Show next pod ad index: " + i10);
        }
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3635ci.getParent();
            } catch (Exception unused) {
                C3567a2 c3567a2 = this.f38492l;
                if (c3567a2 != null) {
                    c3567a2.e(i11);
                }
                C3567a2 c3567a22 = this.f38492l;
                if (c3567a22 != null) {
                    c3567a22.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C3567a2 c3567a23 = this.f38492l;
            if (c3567a23 != null) {
                c3567a23.b(i11, true);
            }
            b(inMobiBanner);
            this.f36746d.post(new Runnable() { // from class: w3.y6
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3670e2.a(this.f107395b, i11);
                }
            });
            return;
        }
        C3567a2 c3567a24 = this.f38492l;
        if (c3567a24 != null) {
            c3567a24.e(i11);
        }
        C3567a2 c3567a25 = this.f38492l;
        if (c3567a25 != null) {
            c3567a25.b(i11, false);
        }
    }

    public final void a(Context context, Jg pubSettings, String adSize) {
        String m10Context;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter("banner", "logType");
        String TAG = this.f38489i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.checkNotNullParameter("banner", "mAdType");
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
            C4093v0 c4093v0 = new C4093v0(j10, str, "banner", str4);
            c4093v0.f39714d = str3;
            c4093v0.f39713c = map;
            Intrinsics.checkNotNullParameter(adSize, "<set-?>");
            c4093v0.f39718h = adSize;
            Intrinsics.checkNotNullParameter(m10Context, "<set-?>");
            c4093v0.f39719i = m10Context;
            c4093v0.f39717g = string;
            c4093v0.f39720j = z10;
            c4093v0.f39721k = str5;
            String str6 = pubSettings.f37147g;
            if (str6 != null) {
                C3903n9 c3903n9 = this.f36748f;
                if (c3903n9 != null) {
                    c3903n9.a();
                }
                this.f36748f = Jh.a("banner", str6);
            }
            C3567a2 c3567a2 = this.f38490j;
            if (c3567a2 != null && this.f38491k != null) {
                c3567a2.a(context, c4093v0, this);
                C3567a2 c3567a22 = this.f38491k;
                if (c3567a22 != null) {
                    c3567a22.a(context, c4093v0, this);
                }
            } else {
                this.f38490j = new C3567a2(context, c4093v0, this);
                C3567a2 c3567a23 = new C3567a2(context, c4093v0, this);
                this.f38491k = c3567a23;
                this.f38493m = this.f38490j;
                this.f38492l = c3567a23;
            }
            C3903n9 logger = this.f36748f;
            if (logger != null) {
                C3567a2 c3567a24 = this.f38490j;
                if (c3567a24 != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c3567a24.f38923i = logger;
                    C3591b0 c3591b0 = c3567a24.f38935u;
                    c3591b0.getClass();
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c3591b0.f38235f = logger;
                }
                C3567a2 c3567a25 = this.f38491k;
                if (c3567a25 != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c3567a25.f38923i = logger;
                    C3591b0 c3591b02 = c3567a25.f38935u;
                    c3591b02.getClass();
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c3591b02.f38235f = logger;
                }
                C3903n9 c3903n92 = this.f36748f;
                if (c3903n92 != null) {
                    String str7 = this.f38489i;
                    str2 = "TAG";
                    Intrinsics.checkNotNullExpressionValue(str7, str2);
                    c3903n92.a(str7, "adding mBannerAdUnit1 to reference tracker");
                } else {
                    str2 = "TAG";
                }
                Ab ab2 = Jh.f37148a;
                C3567a2 c3567a26 = this.f38490j;
                Intrinsics.checkNotNull(c3567a26);
                Jh.a(c3567a26, this.f36748f);
                C3903n9 c3903n93 = this.f36748f;
                if (c3903n93 != null) {
                    String str8 = this.f38489i;
                    Intrinsics.checkNotNullExpressionValue(str8, str2);
                    c3903n93.a(str8, "adding mBannerAdUnit2 to reference tracker");
                }
                C3567a2 c3567a27 = this.f38491k;
                Intrinsics.checkNotNull(c3567a27);
                Jh.a(c3567a27, this.f36748f);
            }
            WatermarkData watermarkData = this.f36749g;
            if (watermarkData != null) {
                C3567a2 c3567a28 = this.f38490j;
                if (c3567a28 != null) {
                    Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c3567a28.A = watermarkData;
                    GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ = c3567a28.q();
                    if (gestureDetectorOnGestureListenerC3635ciQ != null) {
                        gestureDetectorOnGestureListenerC3635ciQ.setWatermark(watermarkData);
                    }
                }
                C3567a2 c3567a29 = this.f38491k;
                if (c3567a29 != null) {
                    Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c3567a29.A = watermarkData;
                    GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ2 = c3567a29.q();
                    if (gestureDetectorOnGestureListenerC3635ciQ2 != null) {
                        gestureDetectorOnGestureListenerC3635ciQ2.setWatermark(watermarkData);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(C3670e2 c3670e2, int i10) throws JSONException {
        C3567a2 c3567a2 = c3670e2.f38492l;
        if (c3567a2 != null) {
            c3567a2.a(i10, false);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3567a2 c3567a2 = this.f38490j;
        if (c3567a2 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3567a2.A = watermarkData;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ = c3567a2.q();
            if (gestureDetectorOnGestureListenerC3635ciQ != null) {
                gestureDetectorOnGestureListenerC3635ciQ.setWatermark(watermarkData);
            }
        }
        C3567a2 c3567a22 = this.f38491k;
        if (c3567a22 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3567a22.A = watermarkData;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciQ2 = c3567a22.q();
            if (gestureDetectorOnGestureListenerC3635ciQ2 != null) {
                gestureDetectorOnGestureListenerC3635ciQ2.setWatermark(watermarkData);
            }
        }
    }
}
