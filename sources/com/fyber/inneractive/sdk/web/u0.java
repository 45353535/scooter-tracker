package com.fyber.inneractive.sdk.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f24048a;

    public u0(v0 v0Var) {
        this.f24048a = v0Var;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f24048a.f24066q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f24048a.f24066q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f24048a;
        v0Var.f24053d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.f24059j;
        if (str != null) {
            v0Var.f24071v.set(true);
            v0Var.f24070u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.f24051b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                for (com.fyber.inneractive.sdk.ignite.r rVar : hVar.f21076h) {
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.f21070b;
                    Bundle bundle = hVar.f21071c;
                    hVar.f21072d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.f24057h;
            if (vVar != null && !v0Var.f24067r && (mVar2 = v0Var.f24053d) != null) {
                v0Var.f24067r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f24048a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.f24057h;
        if (vVar2 == null || v0Var2.f24067r || (mVar = v0Var2.f24053d) == null) {
            return;
        }
        v0Var2.f24067r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f24048a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.f24053d = mVar2;
        v0Var.f24051b.a(v0Var.f24052c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f24055f, mVar2, v0Var.f24057h.f20988a));
        v0 v0Var2 = this.f24048a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.f24057h;
        if (vVar == null || v0Var2.f24068s || (mVar = v0Var2.f24053d) == null) {
            return;
        }
        v0Var2.f24068s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f24048a.f24072w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f24048a.f24072w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f24048a.f24052c)) {
            v0 v0Var = this.f24048a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f24048a.f24056g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f23888a.getPackageManager().getLaunchIntentForPackage(this.f24048a.f24052c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f24048a;
            launchIntentForPackage.setClassName(v0Var2.f24052c, v0Var2.f24056g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f24048a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f24048a.f24052c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            com.fyber.inneractive.sdk.util.o.f23888a.startActivity(launchIntentForPackage);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f24048a.f24057h;
            if (vVar != null) {
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f20988a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f21035a, wVar.f21036b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f24048a.f24073x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f24048a.f24073x = true;
    }
}
