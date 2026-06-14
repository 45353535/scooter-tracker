package com.mobilefuse.sdk;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR:\u0010\f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R6\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/StabilityHelperBridge;", "", "<init>", "()V", "Ljava/lang/Class;", "senderClass", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "logException", "(Ljava/lang/Class;Ljava/lang/Throwable;)V", "Lkotlin/Function2;", "logExceptionFn", "Lkotlin/jvm/functions/Function2;", "getLogExceptionFn", "()Lkotlin/jvm/functions/Function2;", "setLogExceptionFn", "(Lkotlin/jvm/functions/Function2;)V", "", "registerExceptionHandlerVariableFn", "getRegisterExceptionHandlerVariableFn", "setRegisterExceptionHandlerVariableFn", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class StabilityHelperBridge {

    @NotNull
    public static final StabilityHelperBridge INSTANCE = new StabilityHelperBridge();

    @Nullable
    private static Function2<? super Class<?>, ? super Throwable, Unit> logExceptionFn;

    @Nullable
    private static Function2<? super String, ? super String, Unit> registerExceptionHandlerVariableFn;

    private StabilityHelperBridge() {
    }

    public static final void logException(@NotNull Class<?> senderClass, @NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(senderClass, "senderClass");
        Intrinsics.checkNotNullParameter(e10, "e");
        Function2<? super Class<?>, ? super Throwable, Unit> function2 = logExceptionFn;
        if (function2 == null || function2.invoke(senderClass, e10) == null) {
            DebuggingKt.logDebug$default(INSTANCE, "Stability log exception function is not configured. Will ignore an error: " + e10.getMessage(), null, 2, null);
            Unit unit = Unit.f93236a;
        }
    }

    @Nullable
    public final Function2<Class<?>, Throwable, Unit> getLogExceptionFn() {
        return logExceptionFn;
    }

    @Nullable
    public final Function2<String, String, Unit> getRegisterExceptionHandlerVariableFn() {
        return registerExceptionHandlerVariableFn;
    }

    public final void setLogExceptionFn(@Nullable Function2<? super Class<?>, ? super Throwable, Unit> function2) {
        logExceptionFn = function2;
    }

    public final void setRegisterExceptionHandlerVariableFn(@Nullable Function2<? super String, ? super String, Unit> function2) {
        registerExceptionHandlerVariableFn = function2;
    }
}
