package com.yandex.div.evaluable.function;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a*\u0010\b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000\u001a&\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0000\u001a0\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002\u001a8\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u0015"}, d2 = {"evaluate", "", C4240b4.g.f42579b, "", "args", "", "isMethod", "", "evaluateSafe", POBCoreNativeConstants.NATIVE_FALLBACK_URL, "defaultFallback", "throwDictException", "", PglCryptUtils.KEY_MESSAGE, "throwException", "throwMissingPropertyException", "propName", "throwWrongTypeException", "expected", "Lcom/yandex/div/evaluable/EvaluableType;", "actual", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DictFunctionsKt {
    @NotNull
    public static final Object evaluate(@NotNull String functionName, @NotNull List<? extends Object> args, boolean z10) {
        Object objB;
        Object objB2;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        JSONObject jSONObject = (JSONObject) CollectionsKt.first((List) args);
        int size = args.size() - 1;
        for (int i10 = 1; i10 < size; i10++) {
            Object obj = args.get(i10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            try {
                Result.Companion companion = Result.f93230c;
                Intrinsics.checkNotNull(jSONObject);
                Object objOpt = jSONObject.opt(str);
                jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                objB2 = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB2 = Result.b(d.a(th2));
            }
            if (Result.g(objB2) != null) {
                throwMissingPropertyException(functionName, args, str, z10);
                throw new g();
            }
        }
        Object objLast = CollectionsKt.last(args);
        Intrinsics.checkNotNull(objLast, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) objLast;
        try {
            Result.Companion companion3 = Result.f93230c;
            Intrinsics.checkNotNull(jSONObject);
            objB = Result.b(jSONObject.get(str2));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.f93230c;
            objB = Result.b(d.a(th3));
        }
        if (Result.g(objB) == null) {
            Intrinsics.checkNotNullExpressionValue(objB, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return objB;
        }
        throwMissingPropertyException(functionName, args, str2, z10);
        throw new g();
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull List<? extends Object> args, @NotNull Object fallback, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        int i10 = !z10 ? 1 : 0;
        Object obj = args.get(i10);
        JSONObject jSONObjectOptJSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObjectOptJSONObject != null) {
            int size = args.size() - 1;
            for (int i11 = i10 + 1; i11 < size; i11++) {
                Object obj2 = args.get(i11);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject((String) obj2);
                if (jSONObjectOptJSONObject != null) {
                }
            }
            Object objLast = CollectionsKt.last(args);
            Intrinsics.checkNotNull(objLast, "null cannot be cast to non-null type kotlin.String");
            return jSONObjectOptJSONObject.opt((String) objLast);
        }
        return fallback;
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateSafe(list, obj, z10);
    }

    @NotNull
    public static final Void throwDictException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        ArrayFunctionsKt.throwException$default("dict", functionName, args, message, false, 16, null);
        throw new g();
    }

    @NotNull
    public static final Void throwException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z10) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = z10 ? "" : "<dict>, ";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(CollectionsKt.joinToString$default(args.subList(1, args.size()), null, functionName + '(' + str, ")", 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.DictFunctionsKt$throwException$signature$1
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

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z10) {
        throwException(str, list, "Missing property \"" + str2 + "\" in the dict.", z10);
        throw new g();
    }

    @NotNull
    public static final Void throwWrongTypeException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull EvaluableType expected, @NotNull Object actual, boolean z10) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        throwException(functionName, args, "Incorrect value type: expected " + expected.getTypeName() + ", got " + (!Intrinsics.areEqual(actual, JSONObject.NULL) ? !(actual instanceof Number) ? !(actual instanceof JSONObject) ? actual instanceof JSONArray ? "Array" : actual.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z10);
        throw new g();
    }
}
