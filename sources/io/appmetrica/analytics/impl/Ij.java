package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Ij implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f75949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f75951c;

    public Ij(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f75949a = str;
        this.f75950b = str2;
        this.f75951c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.getPluginExtension().reportError(this.f75949a, this.f75950b, this.f75951c);
    }
}
