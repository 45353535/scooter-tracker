package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f21307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21308e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f21304a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f21305b = new JSONArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21309f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21310g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f21306c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f21310g) {
            this.f21310g = true;
            this.f21306c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f21306c.getLooper(), this);
            this.f21307d = d1Var;
            this.f21309f = true;
            this.f21308e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f21307d.removeMessages(12312329);
            }
            long j10 = this.f21308e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f21307d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j10));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
