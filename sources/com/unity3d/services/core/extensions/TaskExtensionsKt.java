package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ag\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "retryDelay", "", "retries", "", "scalingFactor", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fallbackException", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "withRetry", "(JIDLjava/lang/Exception;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskExtensionsKt {

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
    static final class AnonymousClass1<T> extends d {
        double D$0;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0123 -> B:45:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0140 -> B:49:0x014b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withRetry(long r20, int r22, double r23, @org.jetbrains.annotations.NotNull java.lang.Exception r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j10, int i10, double d10, Exception exc, Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = 5000;
        }
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        if ((i11 & 4) != 0) {
            d10 = 2.0d;
        }
        int i12 = i10;
        return withRetry(j10, i12, d10, exc, function2, continuation);
    }
}
