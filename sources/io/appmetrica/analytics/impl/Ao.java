package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Do f75560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Do f75561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bo f75562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f75563d;

    public Ao(Do r12, Do r22, Bo bo) {
        this.f75560a = r12;
        this.f75561b = r22;
        this.f75562c = bo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f75563d == null) {
                JSONObject jSONObjectA = this.f75562c.a(a(this.f75560a), a(this.f75561b));
                this.f75563d = jSONObjectA;
                a(jSONObjectA);
            }
            jSONObject = this.f75563d;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public static JSONObject a(Do r12) {
        try {
            String strA = r12.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f75560a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f75561b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
