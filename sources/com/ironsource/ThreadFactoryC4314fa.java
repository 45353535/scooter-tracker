package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
final class ThreadFactoryC4314fa implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f43102a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r10) {
        Intrinsics.checkNotNullParameter(r10, "r");
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f43102a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return new Thread(r10, str);
    }
}
