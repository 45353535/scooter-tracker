package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23959b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f23960c;

    public e0(i0 i0Var) {
        this.f23960c = i0Var;
    }

    public final void a() {
        try {
            i0 i0Var = this.f23960c;
            i0Var.getClass();
            IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(i0Var));
            if (this.f23958a != null) {
                i0 i0Var2 = this.f23960c;
                i0Var2.getClass();
                IAlog.a("%sunregistering broadcast receiver", IAlog.a(i0Var2));
                this.f23958a.unregisterReceiver(this);
                this.f23958a = null;
            }
        } catch (Throwable th2) {
            IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th2.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB;
        if (this.f23958a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iB = com.fyber.inneractive.sdk.util.o.b()) == this.f23959b) {
            return;
        }
        this.f23959b = iB;
        i0 i0Var = this.f23960c;
        m mVar = i0Var.f23971b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.f24004n0);
            i0Var.f23971b.getViewTreeObserver().addOnPreDrawListener(i0Var.f24004n0);
        }
    }
}
