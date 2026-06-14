package com.appodeal.ads.modules.common.internal.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "", "releaseAwaiter", "", "launchAwaitingAsync", "timeout", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ServiceInitializationAwaiter {
    Object await(Continuation continuation);

    void launchAwaitingAsync(long timeout);

    void releaseAwaiter();
}
