package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24036a;

    public r(i0 i0Var) {
        this.f24036a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f24036a;
        if (i0Var.V == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f24036a.V = new e0(this.f24036a);
                if (com.fyber.inneractive.sdk.util.o.a(this.f24036a.f23971b) != null) {
                    i0 i0Var2 = this.f24036a;
                    e0 e0Var = i0Var2.V;
                    Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var2.f23971b);
                    i0 i0Var3 = e0Var.f23960c;
                    i0Var3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(i0Var3));
                    e0Var.f23958a = contextA;
                    contextA.registerReceiver(e0Var, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e10) {
                i0 i0Var4 = this.f24036a;
                i0Var4.getClass();
                IAlog.f("%sfailed registering orientation broadcast recevier", IAlog.a(i0Var4));
                if (IAlog.f23840a >= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
