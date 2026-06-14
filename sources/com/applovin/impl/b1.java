package com.applovin.impl;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f8395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f8396c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f8397d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f8399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8400c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f8398a;
            String str2 = ((c) obj).f8398a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f8398a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f8398a + "', countdownStepMillis=" + this.f8400c + '}';
        }

        private c(String str, long j10, b bVar) {
            this.f8398a = str;
            this.f8400c = j10;
            this.f8399b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f8399b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f8400c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f8398a;
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8395b = handler;
        this.f8394a = kVar.O();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f8396c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8394a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f8397d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8394a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8394a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f8397d.incrementAndGet();
        this.f8395b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8394a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f8396c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f8395b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8394a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f8396c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f8397d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8394a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8394a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8394a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i10) {
        this.f8395b.postDelayed(new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8800b.b(cVar, i10);
            }
        }, cVar.b());
    }
}
