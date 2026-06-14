package com.yandex.div.evaluable.function;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0002\u001a(\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a \u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a8\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a8\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0003H\u0000ø\u0001\u0000\u001a\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"checkIndexOfBoundException", "", C4240b4.g.f42579b, "", "args", "", "", "isMethod", "", "evaluateArray", "evaluateSafe", "throwArrayException", "", PglCryptUtils.KEY_MESSAGE, "throwArrayWrongTypeException", "expected", "Lcom/yandex/div/evaluable/EvaluableType;", "actual", "throwException", "type", "safeConvertToColor", "Lcom/yandex/div/evaluable/types/Color;", "safeConvertToUrl", "Lcom/yandex/div/evaluable/types/Url;", "(Ljava/lang/String;)Ljava/lang/String;", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ArrayFunctionsKt {
    private static final void checkIndexOfBoundException(String str, List<? extends Object> list, boolean z10) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue < length) {
            return;
        }
        throwArrayException(str, list, "Requested index (" + jLongValue + ") out of bounds array size (" + length + ").", z10);
        throw new g();
    }

    static /* synthetic */ void checkIndexOfBoundException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        checkIndexOfBoundException(str, list, z10);
    }

    @NotNull
    public static final Object evaluateArray(@NotNull String functionName, @NotNull List<? extends Object> args, boolean z10) throws JSONException {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        checkIndexOfBoundException(functionName, args, z10);
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = args.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        Intrinsics.checkNotNullExpressionValue(obj3, "array.get(index.toInt())");
        return obj3;
    }

    public static /* synthetic */ Object evaluateArray$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateArray(str, list, z10);
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull String functionName, @NotNull List<? extends Object> args) {
        Object objB;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Result.Companion companion = Result.f93230c;
            checkIndexOfBoundException$default(functionName, args, false, 4, null);
            Object obj = args.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = args.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            objB = Result.b(((JSONArray) obj).get((int) ((Long) obj2).longValue()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            return null;
        }
        return objB;
    }

    @Nullable
    public static final Color safeConvertToColor(@Nullable String str) {
        Object objB;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Color.m7659boximpl(Color.INSTANCE.m7669parseC4zCDoM(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (Color) (Result.i(objB) ? null : objB);
    }

    @Nullable
    public static final String safeConvertToUrl(@Nullable String str) {
        Object objB;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Url.m7670boximpl(Url.INSTANCE.m7677fromVcSV9u8(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Url url = (Url) objB;
        if (url != null) {
            return url.getValue();
        }
        return null;
    }

    @NotNull
    public static final Void throwArrayException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z10) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        throwException("array", functionName, args, message, z10);
        throw new g();
    }

    public static /* synthetic */ Void throwArrayException$default(String str, List list, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return throwArrayException(str, list, str2, z10);
    }

    public static final void throwArrayWrongTypeException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull EvaluableType expected, @NotNull Object actual, boolean z10) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        throwArrayException(functionName, args, "Incorrect value type: expected " + expected.getTypeName() + ", got " + (!Intrinsics.areEqual(actual, JSONObject.NULL) ? !(actual instanceof Number) ? !(actual instanceof JSONObject) ? actual instanceof JSONArray ? "Array" : actual.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z10);
        throw new g();
    }

    @NotNull
    public static final Void throwException(@NotNull String type, @NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        if (z10) {
            str = "";
        } else {
            str = '<' + type + ">, ";
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(CollectionsKt.joinToString$default(args.subList(1, args.size()), null, functionName + '(' + str, ")", 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.ArrayFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EvaluableExceptionKt.toMessageFormat(it);
            }
        }, 25, null), message, null, 4, null);
        throw new g();
    }

    public static /* synthetic */ Void throwException$default(String str, String str2, List list, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return throwException(str, str2, list, str3, z10);
    }
}
