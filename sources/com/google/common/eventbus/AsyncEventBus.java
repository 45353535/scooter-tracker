package com.google.common.eventbus;

import com.google.common.eventbus.EventBus;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String str, Executor executor) {
        super(str, executor, Dispatcher.b(), EventBus.LoggingHandler.f30534a);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super("default", executor, Dispatcher.b(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super("default", executor, Dispatcher.b(), EventBus.LoggingHandler.f30534a);
    }
}
