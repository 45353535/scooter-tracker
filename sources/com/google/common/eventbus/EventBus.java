package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public class EventBus {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f30528f = Logger.getLogger(EventBus.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f30530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SubscriberExceptionHandler f30531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SubscriberRegistry f30532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Dispatcher f30533e;

    static final class LoggingHandler implements SubscriberExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LoggingHandler f30534a = new LoggingHandler();

        LoggingHandler() {
        }

        private static Logger a(SubscriberExceptionContext subscriberExceptionContext) {
            return Logger.getLogger(EventBus.class.getName() + "." + subscriberExceptionContext.getEventBus().identifier());
        }

        private static String b(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + '(' + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + subscriberExceptionContext.getSubscriber() + " when dispatching event: " + subscriberExceptionContext.getEvent();
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th2, SubscriberExceptionContext subscriberExceptionContext) {
            Logger loggerA = a(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (loggerA.isLoggable(level)) {
                loggerA.log(level, b(subscriberExceptionContext), th2);
            }
        }
    }

    public EventBus() {
        this("default");
    }

    final Executor a() {
        return this.f30530b;
    }

    void b(Throwable th2, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th2);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.f30531c.handleException(th2, subscriberExceptionContext);
        } catch (Throwable th3) {
            f30528f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th3, th2), th3);
        }
    }

    public final String identifier() {
        return this.f30529a;
    }

    public void post(Object obj) {
        Iterator itF = this.f30532d.f(obj);
        if (itF.hasNext()) {
            this.f30533e.a(obj, itF);
        } else {
            if (obj instanceof DeadEvent) {
                return;
            }
            post(new DeadEvent(this, obj));
        }
    }

    public void register(Object obj) {
        this.f30532d.g(obj);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.f30529a).toString();
    }

    public void unregister(Object obj) {
        this.f30532d.h(obj);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), Dispatcher.c(), LoggingHandler.f30534a);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), Dispatcher.c(), subscriberExceptionHandler);
    }

    EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.f30532d = new SubscriberRegistry(this);
        this.f30529a = (String) Preconditions.checkNotNull(str);
        this.f30530b = (Executor) Preconditions.checkNotNull(executor);
        this.f30533e = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.f30531c = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }
}
