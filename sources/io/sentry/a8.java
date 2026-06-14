package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7 f82234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f82235b;

    public a8(z7 z7Var, v7 v7Var) {
        this.f82234a = (z7) io.sentry.util.w.c(z7Var, "The SentryStackTraceFactory is required.");
        this.f82235b = (v7) io.sentry.util.w.c(v7Var, "The SentryOptions is required");
    }

    private io.sentry.protocol.d0 d(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread) {
        io.sentry.protocol.d0 d0Var = new io.sentry.protocol.d0();
        d0Var.w(thread.getName());
        d0Var.x(Integer.valueOf(thread.getPriority()));
        d0Var.u(Long.valueOf(thread.getId()));
        d0Var.s(Boolean.valueOf(thread.isDaemon()));
        d0Var.z(thread.getState().name());
        d0Var.q(Boolean.valueOf(z10));
        List listA = this.f82234a.a(stackTraceElementArr, false);
        if (this.f82235b.isAttachStacktrace() && listA != null && !listA.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(listA);
            c0Var.e(Boolean.TRUE);
            d0Var.y(c0Var);
        }
        return d0Var;
    }

    List a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false);
    }

    List b(List list, boolean z10) {
        return c(Thread.getAllStackTraces(), list, z10);
    }

    List c(Map map, List list, boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            arrayList.add(d((thread == threadCurrentThread && !z10) || !(list == null || !list.contains(Long.valueOf(thread.getId())) || z10), (StackTraceElement[]) entry.getValue(), (Thread) entry.getKey()));
        }
        return arrayList;
    }
}
