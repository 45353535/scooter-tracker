package com.yandex.div.internal.viewpool;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0004\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0001¨\u0006\u0004"}, d2 = {"floorTo", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "roundRoughly", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ProfilingSessionKt {
    private static final long floorTo(long j10, long j11) {
        return (j10 / j11) * j11;
    }

    @VisibleForTesting
    public static final long roundRoughly(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 < 100 ? floorTo(j10, 20L) : j10 < 1000 ? floorTo(j10, 100L) : j10 < 2000 ? floorTo(j10, 200L) : j10 < 5000 ? floorTo(j10, 500L) : j10 < 10000 ? floorTo(j10, 1000L) : j10 < 20000 ? floorTo(j10, 2000L) : j10 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? floorTo(j10, 5000L) : ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
    }
}
