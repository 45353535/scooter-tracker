package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
class EventBus implements Subscriber, Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31803a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f31804b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f31805c;

    EventBus(Executor executor) {
        this.f31805c = executor;
    }

    private synchronized Set c(Event event) {
        Map map;
        try {
            map = (Map) this.f31803a.get(event.getType());
        } catch (Throwable th2) {
            throw th2;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    void b() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f31804b;
                if (queue != null) {
                    this.f31804b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                publish((Event) it.next());
            }
        }
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            try {
                Queue queue = this.f31804b;
                if (queue != null) {
                    queue.add(event);
                    return;
                }
                for (final Map.Entry entry : c(event)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.firebase.components.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((EventHandler) entry.getKey()).handle(event);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        try {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.f31803a.containsKey(cls)) {
                this.f31803a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f31803a.get(cls)).put(eventHandler, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.f31803a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f31803a.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.f31803a.remove(cls);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.f31805c, eventHandler);
    }
}
