package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
class Subscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EventBus f30535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f30536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f30537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f30538d;

    @VisibleForTesting
    static final class SynchronizedSubscriber extends Subscriber {
        @Override // com.google.common.eventbus.Subscriber
        void e(Object obj) {
            synchronized (this) {
                super.e(obj);
            }
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }
    }

    public static /* synthetic */ void a(Subscriber subscriber, Object obj) {
        subscriber.getClass();
        try {
            subscriber.e(obj);
        } catch (InvocationTargetException e10) {
            subscriber.f30535a.b(e10.getCause(), subscriber.b(obj));
        }
    }

    private SubscriberExceptionContext b(Object obj) {
        return new SubscriberExceptionContext(this.f30535a, obj, this.f30536b, this.f30537c);
    }

    static Subscriber c(EventBus eventBus, Object obj, Method method) {
        return f(method) ? new Subscriber(eventBus, obj, method) : new SynchronizedSubscriber(eventBus, obj, method);
    }

    private static boolean f(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    final void d(final Object obj) {
        this.f30538d.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                Subscriber.a(this.f30549b, obj);
            }
        });
    }

    void e(Object obj) throws InvocationTargetException {
        try {
            this.f30537c.invoke(this.f30536b, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e10) {
            throw new Error("Method became inaccessible: " + obj, e10);
        } catch (IllegalArgumentException e11) {
            throw new Error("Method rejected target/argument: " + obj, e11);
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof Error)) {
                throw e12;
            }
            throw ((Error) e12.getCause());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            if (this.f30536b == subscriber.f30536b && this.f30537c.equals(subscriber.f30537c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30537c.hashCode() + 31) * 31) + System.identityHashCode(this.f30536b);
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
        this.f30535a = eventBus;
        this.f30536b = Preconditions.checkNotNull(obj);
        this.f30537c = method;
        method.setAccessible(true);
        this.f30538d = eventBus.a();
    }
}
