package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    private static final class ImmediateDispatcher extends Dispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ImmediateDispatcher f30518a = new ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void a(Object obj, Iterator it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                ((Subscriber) it.next()).d(obj);
            }
        }
    }

    private static final class LegacyAsyncDispatcher extends Dispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue f30519a;

        private static final class EventWithSubscriber {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f30520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Subscriber f30521b;

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
                this.f30520a = obj;
                this.f30521b = subscriber;
            }
        }

        private LegacyAsyncDispatcher() {
            this.f30519a = Queues.newConcurrentLinkedQueue();
        }

        @Override // com.google.common.eventbus.Dispatcher
        void a(Object obj, Iterator it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.f30519a.add(new EventWithSubscriber(obj, (Subscriber) it.next()));
            }
            while (true) {
                EventWithSubscriber eventWithSubscriber = (EventWithSubscriber) this.f30519a.poll();
                if (eventWithSubscriber == null) {
                    return;
                } else {
                    eventWithSubscriber.f30521b.d(eventWithSubscriber.f30520a);
                }
            }
        }
    }

    private static final class PerThreadQueuedDispatcher extends Dispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadLocal f30522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadLocal f30523b;

        private static final class Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f30526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator f30527b;

            private Event(Object obj, Iterator it) {
                this.f30526a = obj;
                this.f30527b = it;
            }
        }

        private PerThreadQueuedDispatcher() {
            this.f30522a = new ThreadLocal<Queue<Event>>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Queue initialValue() {
                    return Queues.newArrayDeque();
                }
            };
            this.f30523b = new ThreadLocal<Boolean>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }

        @Override // com.google.common.eventbus.Dispatcher
        void a(Object obj, Iterator it) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(it);
            Queue queue = (Queue) this.f30522a.get();
            Objects.requireNonNull(queue);
            Queue queue2 = queue;
            queue2.offer(new Event(obj, it));
            if (((Boolean) this.f30523b.get()).booleanValue()) {
                return;
            }
            this.f30523b.set(Boolean.TRUE);
            while (true) {
                try {
                    Event event = (Event) queue2.poll();
                    if (event == null) {
                        return;
                    }
                    while (event.f30527b.hasNext()) {
                        ((Subscriber) event.f30527b.next()).d(event.f30526a);
                    }
                } finally {
                    this.f30523b.remove();
                    this.f30522a.remove();
                }
            }
        }
    }

    Dispatcher() {
    }

    static Dispatcher b() {
        return new LegacyAsyncDispatcher();
    }

    static Dispatcher c() {
        return new PerThreadQueuedDispatcher();
    }

    abstract void a(Object obj, Iterator it);
}
