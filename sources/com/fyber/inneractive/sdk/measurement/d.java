package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21094b;

    public d(e eVar, Context context) {
        this.f21094b = eVar;
        this.f21093a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.f21093a);
            this.f21094b.f21099e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            e.a(this.f21094b, this.f21093a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
            Omid.getVersion();
        } catch (Throwable th2) {
            IAlog.a("Failed starting omsdk with exception %s", th2.getLocalizedMessage());
            this.f21094b.getClass();
            z.a(th2.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th2.getMessage(), null, null);
        }
    }
}
