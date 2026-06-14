package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Gj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f75832a;

    public Gj(PluginErrorDetails pluginErrorDetails) {
        this.f75832a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.getPluginExtension().reportUnhandledException(this.f75832a);
    }
}
