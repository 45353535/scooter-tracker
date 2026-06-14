package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.v;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes10.dex */
public class k extends h<String> implements v.a {
    private final j<String> C;

    public k(int i10, String str, String str2, long j10, j<String> jVar) {
        super(i10, str, 0, str2, j10);
        this.C = jVar;
        a((v.a) this);
    }

    private void b(v<String> vVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.b(this, vVar, vVar.f51994c.f51861a);
            } catch (Exception e10) {
                q0.b(h.B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.t
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected v<String> a(q qVar) {
        try {
            v<String> vVarA = v.a(new String(qVar.f51917b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
            a(vVarA, qVar);
            return vVarA;
        } catch (Throwable th2) {
            q0.b(h.B, "parseNetworkResponse error: ", th2);
            v<String> vVarA2 = v.a(new a0(th2));
            b(vVarA2);
            return vVarA2;
        }
    }

    private void a(v<String> vVar, q qVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.a(this, vVar, qVar);
            } catch (Exception e10) {
                q0.b(h.B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.v.a
    public void a(b0 b0Var) {
        b(v.a(b0Var));
    }
}
