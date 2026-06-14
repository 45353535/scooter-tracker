package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class ji implements Runnable, i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f64793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e9 f64796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t8 f64797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f64798f;

    public ji(lb lbVar, lb lbVar2, String str, e9 e9Var) {
        this.f64793a = lbVar;
        this.f64794b = lbVar2;
        this.f64795c = str;
        this.f64796d = e9Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        this.f64798f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hf hfVar = (hf) this.f64793a.a();
            q8 q8Var = (q8) this.f64794b.a();
            String str = this.f64795c;
            ki kiVar = new ki();
            kiVar.J = hfVar.a(kiVar);
            p8 p8Var = new p8(q8Var, kiVar.a(str));
            p8Var.f65094e = this;
            p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(kiVar.Z);
            t8 t8VarA = p8Var.a();
            this.f64797e = t8VarA;
            e9 e9Var = this.f64796d;
            if (e9Var != null) {
                e9Var.a(this.f64795c, t8VarA, this.f64798f);
            }
        } catch (Throwable th2) {
            try {
                this.f64798f = th2;
                g9.a(th2);
            } finally {
                e9 e9Var2 = this.f64796d;
                if (e9Var2 != null) {
                    e9Var2.a(this.f64795c, this.f64797e, this.f64798f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, e9 e9Var) {
        try {
            com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
            ((Executor) aVarA.A.a()).execute(new ji(aVarA.f64182i, aVarA.f64187n, str, e9Var));
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            if (e9Var == null) {
                return false;
            }
            e9Var.a(str, (Object) null, th2);
            return false;
        }
    }
}
