package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.y2;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f61623c = new q(65536);

    private static void a(r1 r1Var, v[] vVarArr, q qVar) throws IOException {
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                qVar.a();
                qVar.a(1, vVar.a());
                qVar.a(2, vVar.d());
                r1Var.a(38, qVar);
            }
        }
    }

    private static void a(r1 r1Var, e2 e2Var, e2[] e2VarArr, q qVar) throws IOException {
        if (e2Var != null) {
            qVar.a();
            qVar.a(1, e2Var.a());
            qVar.a(2, e2Var.b());
            qVar.a(3, e2Var.c());
            r1Var.a(39, qVar);
        }
        if (e2VarArr != null) {
            for (e2 e2Var2 : e2VarArr) {
                qVar.a();
                qVar.a(1, e2Var2.a());
                qVar.a(2, e2Var2.b());
                qVar.a(3, e2Var2.c());
                r1Var.a(39, qVar);
            }
        }
    }

    private void a(r1 r1Var, boolean z10, y2.a aVar, b3 b3Var, f0 f0Var, q2 q2Var) throws IOException {
        String str;
        String str2;
        Map map = aVar.f61949k.f61215e;
        if (z10 || map.isEmpty()) {
            str = null;
            str2 = null;
        } else {
            String str3 = (String) map.get("android_id");
            str2 = (String) map.get("mac");
            str = str3;
        }
        r1Var.a(1, "3.5.0");
        r1Var.a(2, aVar.f61939a);
        r1Var.a(3, q2Var.c());
        q1.a(r1Var, f0Var.f61483a, f0Var.f61485c, this.f61791a, this.f61792b);
        q1.a(r1Var, z10, b3Var, this.f61791a);
        q1.a(r1Var, str, str2, f0Var, this.f61791a, this.f61792b);
        if (!z10) {
            q1.a(r1Var, f0Var.f61488f, f0Var.f61484b, f0Var.f61485c, this.f61791a);
            q1.a(r1Var, f0Var.f61489g, this.f61791a);
        }
        a(r1Var, q2Var.b(), this.f61791a);
        a(r1Var, q2Var.a(), q2Var.d(), this.f61791a);
    }

    public synchronized byte[] a(boolean z10, y2.a aVar, b3 b3Var, q2 q2Var, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) throws Throwable {
        f0 f0VarA;
        try {
            if (context != null) {
                try {
                    f0VarA = g0.a().a(aVar.f61951m, aVar.f61945g, aVar.f61943e, z10, str, okHttpClientProvider, context);
                    this.f61623c.a();
                } catch (Exception e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                try {
                    a(this.f61623c, z10, aVar, b3Var, f0VarA, q2Var);
                    byte[] bArrC = this.f61623c.c();
                    this.f61623c.d();
                    a();
                    return bArrC;
                } catch (Exception e11) {
                    e = e11;
                    Exception exc = e;
                    x2.b("TimeSpentMessageBuilder: something went wrong while generating tick packet", exc);
                    throw new Exception(exc);
                }
            }
            x2.b("TimeSpentMessageBuilder: context is empty");
            throw new Exception("TimeSpentMessageBuilder: context is empty");
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
