package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Hj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f75872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75873b;

    public Hj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f75872a = pluginErrorDetails;
        this.f75873b = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.getPluginExtension().reportError(this.f75872a, this.f75873b);
    }
}
