package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5498vf implements Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f78452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f78453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Y7 f78456e;

    public C5498vf(@Nullable String str, @NonNull JSONObject jSONObject, boolean z10, boolean z11, @NonNull Y7 y72) {
        this.f78452a = str;
        this.f78453b = jSONObject;
        this.f78454c = z10;
        this.f78455d = z11;
        this.f78456e = y72;
    }

    @Override // io.appmetrica.analytics.impl.Z7
    @NonNull
    public final Y7 a() {
        return this.f78456e;
    }

    @Nullable
    public final JSONObject b() {
        if (!this.f78454c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f78452a);
            if (this.f78453b.length() > 0) {
                jSONObject.put("additionalParams", this.f78453b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f78452a);
            jSONObject.put("additionalParams", this.f78453b);
            jSONObject.put("wasSet", this.f78454c);
            jSONObject.put("autoTracking", this.f78455d);
            jSONObject.put("source", this.f78456e.f76699a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f78452a + "', additionalParameters=" + this.f78453b + ", wasSet=" + this.f78454c + ", autoTrackingEnabled=" + this.f78455d + ", source=" + this.f78456e + '}';
    }

    @NonNull
    public static C5498vf a(@Nullable JSONObject jSONObject) {
        Y7 y72;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i10 = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        Y7[] y7ArrValues = Y7.values();
        int length = y7ArrValues.length;
        while (true) {
            if (i10 >= length) {
                y72 = null;
                break;
            }
            y72 = y7ArrValues[i10];
            if (Intrinsics.areEqual(y72.f76699a, strOptStringOrNull2)) {
                break;
            }
            i10++;
        }
        if (y72 == null) {
            y72 = Y7.f76694b;
        }
        return new C5498vf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, y72);
    }
}
