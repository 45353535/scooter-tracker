package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f21120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f21121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21122c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Partner f21123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f21124e;

    public e(Partner partner, m mVar) {
        this.f21123d = partner;
        this.f21124e = mVar;
    }

    public abstract void a();

    public void a(m mVar) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            AdSessionConfiguration adSessionConfigurationB = b();
            try {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f21123d, mVar, "", "");
            } catch (Throwable unused) {
                adSessionContextCreateHtmlAdSessionContext = null;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationB, adSessionContextCreateHtmlAdSessionContext);
            this.f21120a = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(mVar);
            this.f21120a.start();
        } catch (Throwable unused2) {
        }
    }

    public abstract AdSessionConfiguration b();

    public abstract void c();
}
