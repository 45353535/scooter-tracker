package com.inmobi.media;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class S4 extends AbstractC4048t5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f37693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4073u5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37693b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f37693b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f39575a.a(new T4(t10, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f37693b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
