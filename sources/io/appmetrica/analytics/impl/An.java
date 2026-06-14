package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class An implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f75559a = new CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Iterator it = this.f75559a.iterator();
        while (it.hasNext()) {
            ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th2);
        }
    }
}
