package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBExternalUserId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62397c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f62398d;

    public POBExternalUserId(@NonNull String str, @NonNull String str2) {
        this.f62395a = str;
        this.f62396b = str2;
    }

    public int getAtype() {
        return this.f62397c;
    }

    @Nullable
    public JSONObject getExtension() {
        return this.f62398d;
    }

    @NonNull
    public String getId() {
        return this.f62396b;
    }

    @NonNull
    public String getSource() {
        return this.f62395a;
    }

    public void setAtype(int i10) {
        this.f62397c = i10;
    }

    public void setExtension(@Nullable JSONObject jSONObject) {
        this.f62398d = jSONObject;
    }
}
