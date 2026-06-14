package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
final class ListenerCallQueue<L> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LazyLogger f31511b = new LazyLogger(ListenerCallQueue.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31512a = DesugarCollections.synchronizedList(new ArrayList());

    interface Event<L> {
        void call(L l10);
    }

    private static final class PerListenerQueue<L> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f31513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f31514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Queue f31515d = Queues.newArrayDeque();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Queue f31516e = Queues.newArrayDeque();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f31517f;

        PerListenerQueue(Object obj, Executor executor) {
            this.f31513b = Preconditions.checkNotNull(obj);
            this.f31514c = (Executor) Preconditions.checkNotNull(executor);
        }

        synchronized void a(Event event, Object obj) {
            this.f31515d.add(event);
            this.f31516e.add(obj);
        }

        void b() throws Exception {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.f31517f) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f31517f = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                try {
                    this.f31514c.execute(this);
                } catch (Exception e10) {
                    synchronized (this) {
                        this.f31517f = false;
                        ListenerCallQueue.f31511b.a().log(Level.SEVERE, "Exception while running callbacks for " + this.f31513b + " on " + this.f31514c, (Throwable) e10);
                        throw e10;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.call(r9.f31513b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.f31511b.a().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f31513b + " " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2b
                boolean r2 = r9.f31517f     // Catch: java.lang.Throwable -> L1f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue r2 = r9.f31515d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue r3 = r9.f31516e     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L24
                r9.f31517f = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L57
            L1f:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L57
            L24:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r4 = r9.f31513b     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                r2.call(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                goto L0
            L2b:
                r2 = move-exception
                goto L60
            L2d:
                r2 = move-exception
                com.google.common.util.concurrent.LazyLogger r4 = com.google.common.util.concurrent.ListenerCallQueue.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = r9.f31513b     // Catch: java.lang.Throwable -> L2b
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                r6.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2b
                goto L0
            L57:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L5e
                throw r1     // Catch: java.lang.Throwable -> L59
            L59:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L60
            L5e:
                r1 = move-exception
                goto L57
            L60:
                if (r1 == 0) goto L6a
                monitor-enter(r9)
                r9.f31517f = r0     // Catch: java.lang.Throwable -> L67
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                goto L6a
            L67:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                throw r0
            L6a:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue.run():void");
        }
    }

    ListenerCallQueue() {
    }

    private void b(Event event, Object obj) {
        Preconditions.checkNotNull(event, "event");
        Preconditions.checkNotNull(obj, "label");
        synchronized (this.f31512a) {
            try {
                Iterator it = this.f31512a.iterator();
                while (it.hasNext()) {
                    ((PerListenerQueue) it.next()).a(event, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(L l10, Executor executor) {
        Preconditions.checkNotNull(l10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.f31512a.add(new PerListenerQueue(l10, executor));
    }

    public void dispatch() throws Exception {
        for (int i10 = 0; i10 < this.f31512a.size(); i10++) {
            ((PerListenerQueue) this.f31512a.get(i10)).b();
        }
    }

    public void enqueue(Event<L> event) {
        b(event, event);
    }

    public void enqueue(Event<L> event, String str) {
        b(event, str);
    }
}
