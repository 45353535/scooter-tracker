package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class V2 implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W2 f76579a;

    public V2(W2 w22) {
        this.f76579a = w22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f76579a) {
            try {
                W2 w22 = this.f76579a;
                w22.f76611b = intent;
                Iterator it = w22.f76610a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
