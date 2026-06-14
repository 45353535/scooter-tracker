package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f75969a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PublicLogger f75970b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f75970b;
            if (publicLogger == null) {
                this.f75969a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
