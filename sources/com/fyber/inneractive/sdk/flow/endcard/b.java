package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20646a = IAlog.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f20647b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f20648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f20649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20651f;

    public b(int i10, x0 x0Var) {
        this.f20648c = x0Var;
        this.f20651f = i10;
    }

    public abstract void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return f().b();
    }

    public abstract n c();

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.u uVar = this.f20648c.f21047g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f23345a = l();
        cVar.f23350f = i();
        boolean zB = b(uVar);
        Integer numValueOf = Integer.valueOf(a(uVar));
        if (zB) {
            cVar.f23348d = numValueOf;
        }
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        n nVar = this.f20649d;
        if (nVar != null) {
            nVar.destroy();
            this.f20649d = null;
        }
    }

    public void e() {
        a();
    }

    public final n f() {
        if (this.f20649d == null) {
            this.f20649d = c();
        }
        return this.f20649d;
    }

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public void m() {
        IAlog.a("%s loading success for %s", i(), this.f20646a);
    }

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar != null) {
            Boolean boolC = uVar.c("shouldEnableEndCardAutoClick");
            if (boolC != null ? boolC.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        n nVar = this.f20649d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f20646a);
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar != null) {
            Integer numA = uVar.a("autoClickDelay");
            int iIntValue = numA != null ? numA.intValue() : 3;
            if (iIntValue >= 0 && iIntValue <= 10) {
                return iIntValue;
            }
        }
        return 3;
    }
}
