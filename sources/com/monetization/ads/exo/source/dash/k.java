package com.monetization.ads.exo.source.dash;

import android.os.Handler;
import yads.ba2;
import yads.dq2;
import yads.fa0;
import yads.fr1;
import yads.hq2;
import yads.ir1;
import yads.ke;
import yads.m71;
import yads.sl0;
import yads.w83;
import yads.w92;
import yads.y20;
import yads.y43;
import yads.yv0;
import yads.z43;
import yads.zv0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements z43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hq2 f58998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zv0 f58999b = new zv0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ir1 f59000c = new ir1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f59001d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f59002e;

    public k(l lVar, ke keVar) {
        this.f59002e = lVar;
        this.f58998a = hq2.a(keVar);
    }

    @Override // yads.z43
    public final void a(yv0 yv0Var) {
        this.f58998a.a(yv0Var);
    }

    @Override // yads.z43
    public /* synthetic */ int b(y20 y20Var, int i10, boolean z10) {
        return m71.a(this, y20Var, i10, z10);
    }

    @Override // yads.z43
    public final int a(y20 y20Var, int i10, boolean z10) {
        return this.f58998a.b(y20Var, i10, z10);
    }

    @Override // yads.z43
    public /* synthetic */ void b(int i10, w92 w92Var) {
        m71.b(this, i10, w92Var);
    }

    @Override // yads.z43
    public final void a(int i10, w92 w92Var) {
        this.f58998a.b(i10, w92Var);
    }

    @Override // yads.z43
    public final void a(long j10, int i10, int i11, int i12, y43 y43Var) {
        long jA;
        ir1 ir1Var;
        long jF;
        this.f58998a.a(j10, i10, i11, i12, y43Var);
        while (this.f58998a.a(false)) {
            this.f59000c.b();
            if (this.f58998a.a(this.f58999b, (fa0) this.f59000c, 0, false) == -4) {
                this.f59000c.c();
                ir1Var = this.f59000c;
            } else {
                ir1Var = null;
            }
            if (ir1Var != null) {
                long j11 = ir1Var.f110672f;
                fr1 fr1VarA = this.f59002e.f59005d.a(ir1Var);
                if (fr1VarA != null) {
                    sl0 sl0Var = (sl0) fr1VarA.f110835b[0];
                    String str = sl0Var.f115856b;
                    String str2 = sl0Var.f115857c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jF = w83.f(w83.a(sl0Var.f115860f));
                        } catch (ba2 unused) {
                            jF = -9223372036854775807L;
                        }
                        if (jF != -9223372036854775807L) {
                            i iVar = new i(j11, jF);
                            Handler handler = this.f59002e.f59006e;
                            handler.sendMessage(handler.obtainMessage(1, iVar));
                        }
                    }
                }
            }
        }
        hq2 hq2Var = this.f58998a;
        dq2 dq2Var = hq2Var.f111680a;
        synchronized (hq2Var) {
            int i13 = hq2Var.f111698s;
            jA = i13 == 0 ? -1L : hq2Var.a(i13);
        }
        dq2Var.a(jA);
    }
}
