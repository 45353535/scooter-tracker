package com.unity3d.ads.core.domain;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.core.log.DeviceLog;
import eg.c0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Leg/c0;", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements c0 {
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(c0.b bVar) {
        super(bVar);
    }

    @Override // eg.c0
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + exception.getMessage());
    }
}
