package com.inmobi.media;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class T4 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f37757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC3790il.a(thread, error));
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f37757g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public T4(String str) {
        String eventId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(eventId, "toString(...)");
        Intrinsics.checkNotNullParameter("crashReporting", "component");
        Intrinsics.checkNotNullParameter("CatchEvent", "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        super(eventId, "crashReporting", "CatchEvent", str);
    }
}
