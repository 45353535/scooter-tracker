package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4557tf {
    public final void a(@NotNull Context context, @NotNull String appKey, @NotNull JSONObject initResponse, @NotNull String sdkVersion, @NotNull String testSuiteControllerUrl, @Nullable Boolean bool, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        Bf bf2 = Bf.f40456a;
        a(context, a(appKey, sdkVersion, bf2.c(context), bf2.a(context), bf2.b(context), bool, initResponse, z10, bf2.b(), bf2.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(com.google.android.exoplayer2.C.ENCODING_PCM_32BIT);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    @Nullable
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Bf.f40456a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(MapsKt.mapOf(TuplesKt.to(Ya.f42169o, "Android"), TuplesKt.to("appKey", str), TuplesKt.to("sdkVersion", str2), TuplesKt.to("bundleId", str3), TuplesKt.to("appName", str4), TuplesKt.to("appVersion", str5), TuplesKt.to("initResponse", jSONObject), TuplesKt.to("isRvManual", Boolean.valueOf(z10)), TuplesKt.to("generalProperties", jSONObject2), TuplesKt.to("adaptersVersion", jSONObject3), TuplesKt.to("metaData", jSONObject4), TuplesKt.to("gdprConsent", bool))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
