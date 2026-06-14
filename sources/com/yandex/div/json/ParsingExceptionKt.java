package com.yandex.div.json;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\b\u001a%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0010\u001a3\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000b\u0010\u0016\u001a\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0006\u001a+\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\f\u001a3\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u0016\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001f\u001a;\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010 \u001a3\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0010\u001a#\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010!\u001a/\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\"\u0010#\u001a+\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010$\u001a1\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010(\u001a!\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010)\u001a%\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+\u001a+\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060,j\u0002`-H\u0000¢\u0006\u0004\b*\u0010.\u001a3\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060,j\u0002`-H\u0000¢\u0006\u0004\b*\u0010/\"\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lorg/json/JSONObject;", "json", "", C4240b4.i.W, "Lcom/yandex/div/json/ParsingException;", "missingValue", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/yandex/div/json/ParsingException;", "path", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/json/ParsingException;", "", "value", "typeMismatch", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "Lorg/json/JSONArray;", "", FirebaseAnalytics.Param.INDEX, "(Lorg/json/JSONArray;Ljava/lang/String;ILjava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "expressionKey", "rawExpression", "wrongTypeValue", "", "cause", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(ILjava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "templateId", "templateNotFound", "T", "invalidValue", "wrongValue", "trimLength", "(Ljava/lang/Object;)Ljava/lang/String;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(Lorg/json/JSONArray;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "resolveFailed", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "expression", "variableName", "missingVariable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "dependencyFailed", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/ParsingException;)Lcom/yandex/div/json/ParsingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Exception;)Lcom/yandex/div/json/ParsingException;", "(Lorg/json/JSONArray;Ljava/lang/String;ILjava/lang/Exception;)Lcom/yandex/div/json/ParsingException;", "SILENT_PARSING_EXCEPTION", "Lcom/yandex/div/json/ParsingException;", "getSILENT_PARSING_EXCEPTION", "()Lcom/yandex/div/json/ParsingException;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ParsingExceptionKt {

    @NotNull
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingException parsingException) {
        Intrinsics.checkNotNull(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' is missing", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "Undefined variable '" + str3 + "' at \"" + str + "\": \"" + str2 + '\"', th2, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return missingVariable(str, th2);
    }

    @NotNull
    public static final <T> ParsingException resolveFailed(@NotNull String str, T t10, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' could not be resolved", th2, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return resolveFailed(str, obj, th2);
    }

    @NotNull
    public static final ParsingException templateNotFound(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, "Template '" + str + "' is missing!", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    private static final String trimLength(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() <= 100) {
            return strValueOf;
        }
        return StringsKt.J1(strValueOf, 97) + APSSharedUtil.TRUNCATE_SEPARATOR;
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value for key '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        return typeMismatch(str, str2, obj, th2);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + str + "' is failed to create", exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "No variable could be resolved for '" + str, th2, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException invalidValue(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Field '" + str + "' with expression '" + str2 + "' received wrong value: '" + obj + '\'', th2, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull String str, @NotNull String str2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' at path '" + str2 + "' is missing", null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONArray jSONArray, @NotNull String str, int i10, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i10 + " position of '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray jSONArray, @NotNull String str, int i10, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i10 + " position of '" + str + "' is failed to create", exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10, @NotNull Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", th2, new JsonObject(jSONObject), null, 16, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th2) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Expression '" + str + "': '" + str2 + "' received value of wrong type: '" + obj + '\'', th2, null, null, 24, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i10, T t10, @NotNull Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", th2, new JsonArray(jSONArray), null, 16, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(int i10, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Item builder data at " + i10 + " position has wrong type: " + obj.getClass().getName(), null, null, null, 28, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i10, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at path '" + str + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, @NotNull String str2, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' at path '" + str2 + "' is not valid", null, null, null, 28, null);
    }
}
