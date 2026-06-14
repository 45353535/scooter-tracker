package com.appodeal.ads.ext;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0004*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000b\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Result;", "asSuccess", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "", "asFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/Function1;", InneractiveMediationDefs.GENDER_FEMALE, "flatMap", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "onAny", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "mapError", "transform", "recoverFromError", "ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResultExtKt {
    public static final <R> Object asFailure(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Result.Companion companion = Result.f93230c;
        return Result.b(d.a(th2));
    }

    public static final <T> Object asSuccess(T t10) {
        return Result.b(t10);
    }

    public static final <T, R> Object flatMap(Object obj, Function1<? super T, ? extends Result> f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Throwable thG = Result.g(obj);
        if (thG != null) {
            return Result.b(d.a(thG));
        }
        try {
            return f10.invoke(obj).l();
        } catch (Throwable th2) {
            Result.Companion companion = Result.f93230c;
            return Result.b(d.a(th2));
        }
    }

    public static final <T> Object mapError(Object obj, Function1<? super Throwable, ? extends Throwable> f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Throwable thG = Result.g(obj);
        return thG == null ? obj : Result.b(d.a(f10.invoke(thG)));
    }

    public static final <T> Object onAny(Object obj, Function0<Unit> f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        f10.invoke();
        return obj;
    }

    public static final <T> Object recoverFromError(Object obj, Function1<? super Throwable, ? extends Result> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thG = Result.g(obj);
        return thG == null ? obj : transform.invoke(thG).l();
    }
}
