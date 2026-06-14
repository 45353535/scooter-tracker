package com.mobilefuse.sdk.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000e*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0018"}, d2 = {"jsonValueToBoolean", "", "value", "", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "jsonValueToDouble", "", "(Ljava/lang/Object;)Ljava/lang/Double;", "jsonValueToInt", "", "(Ljava/lang/Object;)Ljava/lang/Integer;", "getBooleanOrNull", "Lorg/json/JSONObject;", "name", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getDoubleOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "getFloatOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "getIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getStringOrNull", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class JSONObjectGetValueOrNullKt {
    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JSONObject getBooleanOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getBooleanOrNull, "$this$getBooleanOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToBoolean(getBooleanOrNull.opt(name));
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JSONObject getDoubleOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getDoubleOrNull, "$this$getDoubleOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToDouble(getDoubleOrNull.opt(name));
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JSONObject getFloatOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getFloatOrNull, "$this$getFloatOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        Double dJsonValueToDouble = jsonValueToDouble(getFloatOrNull.opt(name));
        if (dJsonValueToDouble != null) {
            return Float.valueOf((float) dJsonValueToDouble.doubleValue());
        }
        return null;
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JSONObject getIntOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getIntOrNull, "$this$getIntOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToInt(getIntOrNull.opt(name));
    }

    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject getStringOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getStringOrNull, "$this$getStringOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        String value = getStringOrNull.optString(name, "");
        Intrinsics.checkNotNullExpressionValue(value, "value");
        if (value.length() == 0) {
            return null;
        }
        return value;
    }

    private static final Boolean jsonValueToBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringsKt.N(str, "true", true)) {
                return Boolean.TRUE;
            }
            if (StringsKt.N(str, "false", true)) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    private static final Double jsonValueToDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final Integer jsonValueToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
