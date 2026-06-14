package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f76514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ym f76515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5128gn f76516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5128gn f76517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f76518e;

    public Ti(Revenue revenue, PublicLogger publicLogger) {
        this.f76518e = publicLogger;
        this.f76514a = revenue;
        this.f76515b = new Ym(30720, "revenue payload", publicLogger);
        this.f76516c = new C5128gn(new Ym(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f76517d = new C5128gn(new C4973an(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
