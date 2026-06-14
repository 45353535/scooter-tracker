package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f19962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f19963b;

    public q(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f19963b = new CountDownLatch(1);
        com.facebook.s.t().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.b(this.f19960b, callable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(q this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.f19962a = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f19963b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
