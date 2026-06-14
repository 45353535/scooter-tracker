package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20225e;

    public final void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f20221a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            if (iAConfigManager.f20315u.f20484b.a(false, "use_js_inline")) {
                Application application = o.f23888a;
                if (application == null) {
                    IAlog.f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f20221a = System.currentTimeMillis();
                v0 v0Var = new v0(new g(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.a(this);
                iAConfigManager.f20313s.a(v0Var);
                iAConfigManager.f20313s.a(new v0(new h(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f20313s.a(new v0(new i(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                s sVar = iAConfigManager.f20315u;
                if (sVar == null || !sVar.f20484b.a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.f20313s.a(new v0(new j(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
