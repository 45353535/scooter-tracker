package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f37702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Semaphore f37703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f37704c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("LogSingle", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f37702a = kotlinx.coroutines.i.a(eg.w0.c(executorServiceNewSingleThreadExecutor));
        f37703b = new Semaphore(1);
        f37704c = new AtomicBoolean(false);
    }
}
