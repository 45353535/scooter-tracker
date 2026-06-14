package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.ironsource.C4240b4;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class wd extends gb implements com.startapp.sdk.adsbase.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f65471d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65473c;

    public wd(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f65472b = UUID.randomUUID().toString();
        this.f65473c = lbVar10;
        if (f65471d == null) {
            f65471d = vi.a(context);
        }
    }

    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        ((vb) this.f65473c.a()).a(this.f65472b).f65344c = "&position=".concat(h0.a());
        ActivityExtra activityExtra = this.activityExtra;
        boolean z10 = activityExtra != null && activityExtra.a();
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.context, (Class<?>) List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", z10);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra(C4240b4.i.L, h0.a());
        intent.putExtra("listModelUuid", this.f65472b);
        intent.addFlags(343932928);
        try {
            this.context.startActivity(intent);
            if (!i0.f64666f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return new f8(this.context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.f65473c);
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
