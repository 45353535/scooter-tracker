package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7 f84440a;

    public x6(z7 z7Var) {
        this.f84440a = (z7) io.sentry.util.w.c(z7Var, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.s c(Throwable th2, io.sentry.protocol.l lVar, Long l10, List list, boolean z10) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(list);
            if (z10) {
                c0Var.e(Boolean.TRUE);
            }
            sVar.n(c0Var);
        }
        sVar.o(l10);
        sVar.p(name);
        sVar.l(lVar);
        sVar.m(name2);
        sVar.r(message);
        return sVar;
    }

    private List e(Deque deque) {
        return new ArrayList(deque);
    }

    Deque a(Throwable th2) {
        return b(th2, new AtomicInteger(-1), new HashSet(), new ArrayDeque(), null);
    }

    Deque b(Throwable th2, AtomicInteger atomicInteger, HashSet hashSet, Deque deque, String str) {
        io.sentry.protocol.l lVar;
        Thread threadCurrentThread;
        Throwable th3;
        boolean zI;
        Deque deque2 = deque;
        String str2 = str;
        int i10 = atomicInteger.get();
        Throwable cause = th2;
        while (cause != null) {
            HashSet hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i11 = 0;
            if (cause instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                lVar = aVar.d();
                Throwable thH = aVar.h();
                threadCurrentThread = aVar.g();
                zI = aVar.i();
                th3 = thH;
            } else {
                lVar = new io.sentry.protocol.l();
                threadCurrentThread = Thread.currentThread();
                th3 = cause;
                zI = false;
            }
            io.sentry.protocol.l lVar2 = lVar;
            deque2.addFirst(c(th3, lVar2, Long.valueOf(threadCurrentThread.getId()), this.f84440a.a(th3.getStackTrace(), Boolean.FALSE.equals(lVar2.l())), zI));
            if (lVar2.k() == null) {
                lVar2.q(str2);
            }
            if (atomicInteger.get() >= 0) {
                lVar2.p(Integer.valueOf(i10));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            lVar2.n(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i11 < length) {
                    b(suppressed[i11], atomicInteger, hashSet2, deque2, "suppressed");
                    i11++;
                    hashSet2 = hashSet;
                    deque2 = deque;
                }
            }
            cause = th3.getCause();
            str2 = null;
            deque2 = deque;
            i10 = iIncrementAndGet;
        }
        return deque;
    }

    public List d(Throwable th2) {
        return e(a(th2));
    }

    public List f(io.sentry.protocol.d0 d0Var, io.sentry.protocol.l lVar, Throwable th2) {
        io.sentry.protocol.c0 c0VarN = d0Var.n();
        if (c0VarN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th2, lVar, d0Var.l(), c0VarN.d(), true));
        return arrayList;
    }
}
