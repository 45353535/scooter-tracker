package com.mobilefuse.sdk.exception;

import a.a;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aZ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0006H\u0086\bø\u0001\u0000\u001aN\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0006H\u0086\bø\u0001\u0000\u001an\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\b0\nH\u0086\bø\u0001\u0000\u001aT\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u00010\u0006H\u0086\bø\u0001\u0000\u001a<\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000e0\u0006H\u0086\bø\u0001\u0000\u001a<\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u000e0\u0006H\u0086\bø\u0001\u0000\u001aN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00010\u0012H\u0086\bø\u0001\u0000\u001a:\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00010\u0001\u001aH\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000e0\u0006H\u0086\bø\u0001\u0000\u001aH\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000e0\u0006H\u0086\bø\u0001\u0000\u001aA\u0010\u0016\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"flatMap", "Lcom/mobilefuse/sdk/exception/Either;", ExifInterface.LONGITUDE_EAST, "B", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, InneractiveMediationDefs.GENDER_FEMALE, "Lkotlin/Function1;", "map", "C", "eitherB", "Lkotlin/Function2;", "mapError", "T", "onError", "", "block", "onSuccess", "orElse", "Lkotlin/Function0;", "unwrapSuccess", "whenError", "whenSuccess", "withErrorFallback", "(Lcom/mobilefuse/sdk/exception/Either;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B> Either<E, B> flatMap(@NotNull Either<? extends E, ? extends A> flatMap, @NotNull Function1<? super A, ? extends Either<? extends E, ? extends B>> f10) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (flatMap instanceof ErrorResult) {
            return flatMap;
        }
        if (flatMap instanceof SuccessResult) {
            return f10.invoke((Object) ((SuccessResult) flatMap).getValue());
        }
        throw new m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B> Either<E, B> map(@NotNull Either<? extends E, ? extends A> map, @NotNull Function1<? super A, ? extends B> f10) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (map instanceof ErrorResult) {
            return map;
        }
        if (map instanceof SuccessResult) {
            return new SuccessResult(f10.invoke((Object) ((SuccessResult) map).getValue()));
        }
        throw new m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> mapError(@NotNull Either<? extends E, ? extends T> mapError, @NotNull Function1<? super E, ? extends Either<? extends E, ? extends T>> f10) {
        Intrinsics.checkNotNullParameter(mapError, "$this$mapError");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (mapError instanceof ErrorResult) {
            return f10.invoke((Object) ((ErrorResult) mapError).getValue());
        }
        if (mapError instanceof SuccessResult) {
            return mapError;
        }
        throw new m();
    }

    public static final <E, A> void onError(@NotNull Either<? extends E, ? extends A> onError, @NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(onError, "$this$onError");
        Intrinsics.checkNotNullParameter(block, "block");
        if (onError instanceof ErrorResult) {
            block.invoke((Object) ((ErrorResult) onError).getValue());
        }
    }

    public static final <E, A> void onSuccess(@NotNull Either<? extends E, ? extends A> onSuccess, @NotNull Function1<? super A, Unit> block) {
        Intrinsics.checkNotNullParameter(onSuccess, "$this$onSuccess");
        Intrinsics.checkNotNullParameter(block, "block");
        if (onSuccess instanceof SuccessResult) {
            block.invoke((Object) ((SuccessResult) onSuccess).getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A> Either<E, A> orElse(@NotNull Either<? extends E, ? extends A> orElse, @NotNull Function0<? extends Either<? extends E, ? extends A>> f10) {
        Intrinsics.checkNotNullParameter(orElse, "$this$orElse");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (orElse instanceof ErrorResult) {
            return f10.invoke();
        }
        if (orElse instanceof SuccessResult) {
            return orElse;
        }
        throw new m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A> Either<E, A> unwrapSuccess(@NotNull Either<? extends E, ? extends Either<? extends E, ? extends A>> unwrapSuccess) {
        Intrinsics.checkNotNullParameter(unwrapSuccess, "$this$unwrapSuccess");
        if (unwrapSuccess instanceof ErrorResult) {
            return unwrapSuccess;
        }
        if (!(unwrapSuccess instanceof SuccessResult)) {
            throw new m();
        }
        Either<E, A> either = (Either) ((SuccessResult) unwrapSuccess).getValue();
        if (either instanceof ErrorResult) {
            return either;
        }
        if (either instanceof SuccessResult) {
            return new SuccessResult(((SuccessResult) either).getValue());
        }
        throw new m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> whenError(@NotNull Either<? extends E, ? extends T> whenError, @NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(whenError, "$this$whenError");
        Intrinsics.checkNotNullParameter(block, "block");
        if (whenError instanceof ErrorResult) {
            block.invoke((Object) ((ErrorResult) whenError).getValue());
        }
        return whenError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> whenSuccess(@NotNull Either<? extends E, ? extends T> whenSuccess, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(whenSuccess, "$this$whenSuccess");
        Intrinsics.checkNotNullParameter(block, "block");
        if (whenSuccess instanceof SuccessResult) {
            block.invoke((Object) ((SuccessResult) whenSuccess).getValue());
        }
        return whenSuccess;
    }

    public static final <E, A> A withErrorFallback(@NotNull Either<? extends E, ? extends A> withErrorFallback, @NotNull Function1<? super E, ? extends A> f10) {
        Intrinsics.checkNotNullParameter(withErrorFallback, "$this$withErrorFallback");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (withErrorFallback instanceof ErrorResult) {
            return f10.invoke((Object) ((ErrorResult) withErrorFallback).getValue());
        }
        if (withErrorFallback instanceof SuccessResult) {
            return (A) ((SuccessResult) withErrorFallback).getValue();
        }
        throw new m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B, C> Either<E, C> map(@NotNull Either<? extends E, ? extends A> map, @NotNull Either<? extends E, ? extends B> eitherB, @NotNull Function2<? super A, ? super B, ? extends C> f10) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(eitherB, "eitherB");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (map instanceof ErrorResult) {
            return map;
        }
        if (map instanceof SuccessResult) {
            a aVar = (Object) ((SuccessResult) map).getValue();
            if (eitherB instanceof ErrorResult) {
                return eitherB;
            }
            if (eitherB instanceof SuccessResult) {
                return new SuccessResult(f10.invoke(aVar, (Object) ((SuccessResult) eitherB).getValue()));
            }
            throw new m();
        }
        throw new m();
    }
}
