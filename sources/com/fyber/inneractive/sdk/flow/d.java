package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f20636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f20637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20638c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f20639d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f20637b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f20636a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f20636a;
            if (handler != null) {
                handler.removeCallbacks(this.f20639d);
            }
            this.f20636a.getLooper().quitSafely();
            this.f20636a = null;
        }
    }
}
