package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class v4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65370a;

    public v4(Context context) {
        this.f65370a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        ANRRemoteConfig aNRRemoteConfigI = MetaData.E().i();
        f fVar = new f(aNRRemoteConfigI != null ? aNRRemoteConfigI.c() : 2000L, aNRRemoteConfigI != null && aNRRemoteConfigI.g());
        if (aNRRemoteConfigI != null && aNRRemoteConfigI.e()) {
            fVar.f64470b = new x3(aNRRemoteConfigI);
            fVar.f64469a = new com.startapp.sdk.adsbase.crashreport.a(this.f65370a, aNRRemoteConfigI.h(), aNRRemoteConfigI.a(), aNRRemoteConfigI.d());
            if (aNRRemoteConfigI.f()) {
                fVar.f64472d = new y3(this);
            }
            fVar.start();
        }
        return fVar;
    }
}
