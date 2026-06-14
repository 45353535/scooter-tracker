package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5308o f76047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f76048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f76049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K5 f76050d;

    public L5(C5308o c5308o) {
        this(c5308o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f76049c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f76047a.a(applicationContext);
            this.f76047a.registerListener(this.f76050d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f76049c = applicationContext;
        }
    }

    public L5(C5308o c5308o, IReporter iReporter) {
        this.f76047a = c5308o;
        this.f76048b = iReporter;
        this.f76050d = new K5(this);
    }

    public /* synthetic */ L5(C5308o c5308o, int i10) {
        this(c5308o, AbstractC5509w1.a());
    }

    public final synchronized Context a() {
        return this.f76049c;
    }
}
