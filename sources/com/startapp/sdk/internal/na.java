package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.C4240b4;
import com.ironsource.V5;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class na extends o8 implements com.startapp.sdk.adsbase.f {
    public na(Context context, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, placement, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable, java.lang.Boolean[]] */
    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        int i10;
        String strA = h0.a();
        if (b() && AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED) && strA.equals("back")) {
            setNotDisplayedReason(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!i0.f64666f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (a() == null) {
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            return false;
        }
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        ActivityExtra activityExtra = this.activityExtra;
        boolean z10 = activityExtra != null && activityExtra.a();
        Intent intent = new Intent(this.context, (Class<?>) OverlayActivity.class);
        intent.putExtra(V5.c.f41891a, "exit.html");
        String[] strArr = this.f65004i;
        String strConcat = "&position=".concat(h0.a());
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (str2 != null && !"".equals(str2)) {
                strArr[i11] = strArr[i11] + strConcat;
            }
        }
        synchronized (kh.class) {
            int i12 = kh.f64832a;
            i10 = i12 < Integer.MAX_VALUE ? i12 + 1 : 1;
            kh.f64832a = i10;
            HashMap map = kh.f64833b;
            if (map.containsKey(Integer.valueOf(i10))) {
                throw new IllegalStateException();
            }
            map.put(Integer.valueOf(i10), this);
        }
        intent.putExtra("tracking", strArr);
        intent.putExtra("trackingClickUrl", this.f65002g);
        intent.putExtra("packageNames", this.f64996a);
        intent.putExtra("htmlUuid", this.f64997b);
        intent.putExtra("smartRedirect", this.f65003h);
        intent.putExtra("browserEnabled", this.f65011p);
        intent.putExtra("placement", this.placement.getIndex());
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("ad", i10);
        intent.putExtra("videoAd", b());
        intent.putExtra("fullscreen", z10);
        int i13 = this.f65000e;
        if (i13 == 0) {
            i13 = this.context.getResources().getConfiguration().orientation;
        }
        intent.putExtra("orientation", i13);
        intent.putExtra("activityShouldLockOrientation", this.f65001f);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("closingUrl", this.f65009n);
        intent.putExtra("rewardDuration", this.f65007l);
        intent.putExtra("rewardedHideTimer", this.f65008m);
        Long l10 = this.f65005j;
        if (l10 != null) {
            intent.putExtra("delayImpressionSeconds", l10);
        }
        Long l11 = this.f65006k;
        if (l11 != null) {
            intent.putExtra("delayCloseInterval", l11);
        }
        intent.putExtra("sendRedirectHops", (Serializable) this.f65010o);
        intent.putExtra(C4240b4.i.L, strA);
        intent.addFlags(343932928);
        if (((h6) this.consentManager.a()).f64604e) {
            ((h6) this.consentManager.a()).f64603d = intent;
            return true;
        }
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e10) {
            Log.e("StartAppSDK", "Failed to show Ad for placement " + this.placement, e10);
            ((p) this.adCacheManager.a()).a(this.placement);
            return false;
        } catch (Throwable th2) {
            kh.a(i10, Object.class);
            g9.a(th2);
            return false;
        }
    }

    public boolean b() {
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final void setVideoCancelCallBack(boolean z10) {
        super.setVideoCancelCallBack(z10);
    }
}
