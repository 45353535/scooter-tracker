package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class r1 extends o8 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f65182t;

    public r1(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, int i10) {
        super(context, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f65180r = i10;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        if (str != null) {
            return new y7(this.context, this, adEventListener, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str);
        }
        Context context = this.context;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        lb lbVar5 = this.webViewCacheLoader;
        int i10 = this.f65180r;
        this.f65180r = i10 + 1;
        return new z7(context, this, adPreferences, adEventListener, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, i10);
    }
}
