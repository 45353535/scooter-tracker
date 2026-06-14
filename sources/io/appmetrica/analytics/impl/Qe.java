package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Qe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f76313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Te f76314b;

    public Qe(Te te2, PluginErrorDetails pluginErrorDetails) {
        this.f76314b = te2;
        this.f76313a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f76314b.f76511d.get()).getPluginExtension().reportUnhandledException(this.f76313a);
    }
}
