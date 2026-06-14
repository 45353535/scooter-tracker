package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$1 extends k implements Function2<JSONObject, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    /* synthetic */ Object f33464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RemoteSettings f33465t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation continuation) {
        super(2, continuation);
        this.f33465t = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.f33465t, continuation);
        remoteSettings$updateSettings$2$1.f33464s = obj;
        return remoteSettings$updateSettings$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.f93236a);
    }
}
