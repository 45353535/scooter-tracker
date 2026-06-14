package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Re implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f76348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Te f76350c;

    public Re(Te te2, PluginErrorDetails pluginErrorDetails, String str) {
        this.f76350c = te2;
        this.f76348a = pluginErrorDetails;
        this.f76349b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f76350c.f76511d.get()).getPluginExtension().reportError(this.f76348a, this.f76349b);
    }
}
