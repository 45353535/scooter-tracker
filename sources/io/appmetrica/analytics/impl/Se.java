package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public final class Se implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f76443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Te f76444d;

    public Se(Te te2, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f76444d = te2;
        this.f76441a = str;
        this.f76442b = str2;
        this.f76443c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f76444d.f76511d.get()).getPluginExtension().reportError(this.f76441a, this.f76442b, this.f76443c);
    }
}
