package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* JADX INFO: loaded from: classes11.dex */
public final class wg implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65478a;

    public wg(Context context) {
        this.f65478a = context;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        MetaData.E().a(this);
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        if (z10) {
            com.startapp.sdk.adsbase.g.f64054d = null;
            com.startapp.sdk.adsbase.g.f64055e = null;
            com.startapp.sdk.adsbase.g.f(this.f65478a);
        }
        MetaData.E().a(this);
    }
}
