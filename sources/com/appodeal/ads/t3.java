package com.appodeal.ads;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14860a;

    public static Struct a(JSONObject jSONObject) throws JSONException {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            builderNewBuilder.putFields(next, b(obj));
        }
        Struct structBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(structBuild, "build(...)");
        return structBuild;
    }

    public static Value b(Object obj) throws JSONException {
        if (obj instanceof String) {
            Value valueBuild = Value.newBuilder().setStringValue((String) obj).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild, "build(...)");
            return valueBuild;
        }
        if (obj instanceof Integer) {
            Value valueBuild2 = Value.newBuilder().setNumberValue(((Number) obj).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild2, "build(...)");
            return valueBuild2;
        }
        if (obj instanceof Long) {
            Value valueBuild3 = Value.newBuilder().setNumberValue(((Number) obj).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild3, "build(...)");
            return valueBuild3;
        }
        if (obj instanceof Float) {
            Value valueBuild4 = Value.newBuilder().setNumberValue(((Number) obj).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild4, "build(...)");
            return valueBuild4;
        }
        if (obj instanceof Double) {
            Value valueBuild5 = Value.newBuilder().setNumberValue(((Number) obj).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild5, "build(...)");
            return valueBuild5;
        }
        if (obj instanceof Boolean) {
            Value valueBuild6 = Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild6, "build(...)");
            return valueBuild6;
        }
        if (obj instanceof JSONObject) {
            Value.Builder builderNewBuilder = Value.newBuilder();
            builderNewBuilder.mergeStructValue(a((JSONObject) obj));
            Value valueBuild7 = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(valueBuild7, "build(...)");
            return valueBuild7;
        }
        if (!(obj instanceof JSONArray)) {
            Value defaultInstance = Value.getDefaultInstance();
            Intrinsics.checkNotNull(defaultInstance);
            return defaultInstance;
        }
        JSONArray jSONArray = (JSONArray) obj;
        Value.Builder builderNewBuilder2 = Value.newBuilder();
        ListValue.Builder builderNewBuilder3 = ListValue.newBuilder();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = jSONArray.get(i10);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            builderNewBuilder3.addValues(b(obj2));
        }
        builderNewBuilder2.mergeListValue(builderNewBuilder3.build());
        Value valueBuild8 = builderNewBuilder2.build();
        Intrinsics.checkNotNullExpressionValue(valueBuild8, "build(...)");
        return valueBuild8;
    }
}
