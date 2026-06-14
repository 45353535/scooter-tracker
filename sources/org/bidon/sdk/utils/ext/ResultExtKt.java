package org.bidon.sdk.utils.ext;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"asSuccess", "Lkotlin/Result;", "T", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "asFailure", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "onAny", "action", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "mapFailure", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResultExtKt {
    @NotNull
    public static final <T> Object asFailure(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Result.Companion companion = Result.f93230c;
        return Result.b(d.a(th2));
    }

    @NotNull
    public static final <T> Object asSuccess(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return Result.b(t10);
    }

    @NotNull
    public static final <T> Object mapFailure(@NotNull Object obj, @NotNull Function1<? super Throwable, ? extends Throwable> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return Result.i(obj) ? asFailure(action.invoke(Result.g(obj))) : obj;
    }

    @NotNull
    public static final <T> Object onAny(@NotNull Object obj, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke();
        return obj;
    }
}
