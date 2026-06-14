package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.sessions.FirebaseSessions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import pf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_MESSAGE, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$2 extends k implements Function2<String, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    /* synthetic */ Object f33467s;

    RemoteSettings$updateSettings$2$2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.f33467s = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.g();
        if (this.f33466r != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        Log.e(FirebaseSessions.TAG, "Error failed to fetch the remote configs: " + ((String) this.f33467s));
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(Unit.f93236a);
    }
}
