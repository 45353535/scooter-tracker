package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4485pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4451na f44648a;

    public C4485pa(InterfaceC4451na interfaceC4451na) {
        this.f44648a = interfaceC4451na;
    }

    public void a(C4468oa c4468oa, JSONObject jSONObject) {
        this.f44648a.a(false, c4468oa.a(), jSONObject);
    }

    public void b(C4468oa c4468oa, JSONObject jSONObject) {
        this.f44648a.a(true, c4468oa.d(), jSONObject);
    }
}
