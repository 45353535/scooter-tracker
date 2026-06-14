package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public final class Ho implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f75884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75885b = "WebView interface setup failed because of an exception.";

    public Ho(Throwable th2) {
        this.f75884a = th2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f75884a, this.f75885b, new Object[0]);
    }
}
