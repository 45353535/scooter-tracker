package com.google.common.eventbus;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler {
    void handleException(Throwable th2, SubscriberExceptionContext subscriberExceptionContext);
}
