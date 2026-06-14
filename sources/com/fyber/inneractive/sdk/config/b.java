package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f20323a;

    public b(e eVar) {
        this.f20323a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        e eVar = this.f20323a;
        if (eVar.f20342a.compareAndSet(false, true)) {
            if (eVar.f20342a.get() && eVar.f20344c != null) {
                IAlog.a("startCounting", new Object[0]);
                v1 v1Var = eVar.f20344c;
                v1Var.getClass();
                t1 t1Var = new t1(v1Var);
                v1Var.f23918c = t1Var;
                v1Var.f23919d = false;
                t1Var.sendEmptyMessage(1932593528);
            }
            IAlog.a("Pause signal", new Object[0]);
        }
        return true;
    }
}
