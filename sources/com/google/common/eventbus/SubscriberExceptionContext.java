package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public class SubscriberExceptionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EventBus f30539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f30542d;

    SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.f30539a = (EventBus) Preconditions.checkNotNull(eventBus);
        this.f30540b = Preconditions.checkNotNull(obj);
        this.f30541c = Preconditions.checkNotNull(obj2);
        this.f30542d = (Method) Preconditions.checkNotNull(method);
    }

    public Object getEvent() {
        return this.f30540b;
    }

    public EventBus getEventBus() {
        return this.f30539a;
    }

    public Object getSubscriber() {
        return this.f30541c;
    }

    public Method getSubscriberMethod() {
        return this.f30542d;
    }
}
