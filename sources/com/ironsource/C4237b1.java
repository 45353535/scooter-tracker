package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4237b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f42447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f42448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.a f42449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42453g;

    public C4237b1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f42447a = networkSettings;
        this.f42448b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f42452f = iOptInt;
        this.f42450d = iOptInt == 2;
        this.f42451e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f42453g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f42449c = aVar;
    }

    public String a() {
        return this.f42447a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f42449c;
    }

    public JSONObject c() {
        return this.f42448b;
    }

    public int d() {
        return this.f42452f;
    }

    public int e() {
        return this.f42453g;
    }

    public String f() {
        return this.f42447a.getProviderName();
    }

    public String g() {
        return this.f42447a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f42447a;
    }

    public String i() {
        return this.f42447a.getSubProviderId();
    }

    public boolean j() {
        return this.f42450d;
    }

    public boolean k() {
        return this.f42451e;
    }
}
