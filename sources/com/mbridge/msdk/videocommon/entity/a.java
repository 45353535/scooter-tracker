package com.mbridge.msdk.videocommon.entity;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53258b;

    public a(String str, String str2) {
        this.f53257a = str;
        this.f53258b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID), jSONObject.optString("placementId"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
