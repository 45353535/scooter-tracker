package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 extends gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64306c;

    public b1(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, int i10) {
        super(context, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f64305b = i10;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        int i10 = this.f64305b;
        this.f64305b = i10 + 1;
        return new x7(context, this, adPreferences, adEventListener, lbVar, lbVar2, lbVar3, lbVar4, i10);
    }
}
