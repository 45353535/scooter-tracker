package com.my.target;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ga implements s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa f59764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f59765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f59766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final da f59767d;

    public ga(fa faVar, e1 e1Var, da daVar, Context context) {
        this.f59764a = faVar;
        this.f59765b = e1Var;
        this.f59767d = daVar;
        this.f59766c = new WeakReference(context.getApplicationContext());
    }

    @Override // com.my.target.s8
    public void a(r8 r8Var) {
        b4 b4Var;
        if (this.f59767d == null) {
            gb.a("ShoppablePostMessageHandler hasn't shoppableAdsData");
            return;
        }
        if (!r8Var.f60750a.equals("shoppable")) {
            gb.a("ShoppablePostMessageHandler has wrong postMessage type");
            return;
        }
        if (!r8Var.f60751b.equals("click")) {
            gb.a("ShoppablePostMessageHandler has wrong postMessage action");
            return;
        }
        ha haVarA = new ia().a(r8Var.f60752c);
        if (haVarA == null) {
            gb.a("ShoppablePostMessageHandler has wrong parse post message params");
            return;
        }
        String str = haVarA.f59831a;
        Context context = (Context) this.f59766c.get();
        if (context == null) {
            gb.a("ShoppablePostMessageHandler hasn't context");
            return;
        }
        Iterator it = this.f59767d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                b4Var = null;
                break;
            } else {
                b4Var = (b4) it.next();
                if (str.equals(b4Var.f59433id)) {
                    break;
                }
            }
        }
        if (b4Var == null) {
            gb.a("ShoppablePostMessageHandler cannot find internalShoppableAdsData by id");
            return;
        }
        bb.b(b4Var.f59279a, "click", 2, context);
        b4 b4Var2 = b4Var;
        this.f59765b.a(this.f59764a, b4Var2.deeplink, b4Var2.deeplinkFallbackUrl, b4Var2.url, context);
    }
}
