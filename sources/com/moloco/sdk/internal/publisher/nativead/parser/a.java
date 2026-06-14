package com.moloco.sdk.internal.publisher.nativead.parser;

import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final a.AbstractC0672a.C0673a a(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        Integer numValueOf2 = jSONObject.has(POBCoreNativeConstants.NATIVE_LENGTH) ? Integer.valueOf(jSONObject.getInt(POBCoreNativeConstants.NATIVE_LENGTH)) : null;
        String string = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0672a.C0673a(i10, z10, numValueOf, numValueOf2, string);
    }

    public final a.c b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.has(POBCoreNativeConstants.NATIVE_FALLBACK_URL) ? jSONObject.getString(POBCoreNativeConstants.NATIVE_FALLBACK_URL) : null;
        List listH = h(jSONObject.optJSONArray("clicktrackers"));
        Intrinsics.checkNotNull(string);
        return new a.c(string, listH, string2);
    }

    public final Object c(String nativeOrtbString) {
        Intrinsics.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(nativeOrtbString);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            }
            Result.Companion companion = Result.f93230c;
            return Result.b(new com.moloco.sdk.internal.publisher.nativead.model.a(jSONObject.has(POBCoreNativeConstants.NATIVE_VERSION) ? jSONObject.getString(POBCoreNativeConstants.NATIVE_VERSION) : null, d(jSONObject.optJSONArray(POBCoreNativeConstants.NATIVE_ASSETS)), b(jSONObject.optJSONObject(POBCoreNativeConstants.NATIVE_LINK)), h(jSONObject.optJSONArray(POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER)), f(jSONObject.optJSONArray(POBCoreNativeConstants.NATIVE_EVENT_TRACKERS)), jSONObject.has("privacy") ? jSONObject.getString("privacy") : null));
        } catch (Exception e10) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(e10));
        }
    }

    public final List d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.has("id")) {
                int i11 = jSONObject.getInt("id");
                boolean z10 = jSONObject.optInt(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, 0) == 1;
                Object objG = g(jSONObject.optJSONObject("title"), i11, z10);
                if (objG == null && (objG = e(jSONObject.optJSONObject(POBCoreNativeConstants.NATIVE_IMAGE), i11, z10)) == null && (objG = i(jSONObject.optJSONObject("video"), i11, z10)) == null) {
                    objG = a(jSONObject.optJSONObject("data"), i11, z10);
                }
                if (objG != null) {
                    arrayList.add(objG);
                }
            }
        }
        return arrayList;
    }

    public final a.AbstractC0672a.b e(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        String string = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0672a.b(i10, z10, numValueOf, string, jSONObject.has(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH) ? Integer.valueOf(jSONObject.getInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) : null, jSONObject.has("h") ? Integer.valueOf(jSONObject.getInt("h")) : null);
    }

    public final List f(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(new a.b(jSONObject.getInt("event"), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final a.AbstractC0672a.c g(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0672a.c(i10, z10, string, jSONObject.has(POBCoreNativeConstants.NATIVE_LENGTH) ? Integer.valueOf(jSONObject.getInt(POBCoreNativeConstants.NATIVE_LENGTH)) : null);
    }

    public final List h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public final a.AbstractC0672a.d i(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("vasttag");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0672a.d(i10, z10, string);
    }
}
