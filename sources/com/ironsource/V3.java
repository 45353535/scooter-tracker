package com.ironsource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class V3 implements InterfaceC4549t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4532s7 f41864a;

    protected V3(JSONObject jSONObject, Context context) {
        this.f41864a = a(jSONObject, context);
        Logger.i(V3.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.f41864a.getClass().getSimpleName());
    }

    @Override // com.ironsource.InterfaceC4549t7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC4549t7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f41864a.a(context);
    }

    @Override // com.ironsource.InterfaceC4549t7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f41864a.b(context);
    }

    public JSONObject a(Context context) {
        return this.f41864a.c(context);
    }

    public void b() {
        this.f41864a.a();
    }

    private InterfaceC4532s7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C4240b4.j.f42679g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (!B1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new BroadcastReceiverStrategy(this);
        }
        return new C4316fc(this);
    }
}
