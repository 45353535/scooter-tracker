package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4308f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43085a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4325g4 c4325g4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f43085a, c4325g4.b(), a(c4325g4.c()), b(c4325g4));
    }

    private static String b(C4325g4 c4325g4) {
        return (c4325g4.d() == null || c4325g4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4325g4.d(), c4325g4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
