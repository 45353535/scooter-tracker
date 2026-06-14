package com.monetization.ads.exo.source.dash;

import yads.c43;
import yads.d6;
import yads.f43;
import yads.fi;
import yads.kk1;
import yads.p20;
import yads.rk1;
import yads.sa2;
import yads.w83;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends f43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f58983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f58984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f58985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f58986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f58987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p20 f58988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rk1 f58989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kk1 f58990l;

    public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, p20 p20Var, rk1 rk1Var, kk1 kk1Var) {
        fi.b(p20Var.f114529d == (kk1Var != null));
        this.f58981c = j10;
        this.f58982d = j11;
        this.f58983e = j12;
        this.f58984f = i10;
        this.f58985g = j13;
        this.f58986h = j14;
        this.f58987i = j15;
        this.f58988j = p20Var;
        this.f58989k = rk1Var;
        this.f58990l = kk1Var;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        fi.a(i10, a());
        String str = z10 ? ((sa2) this.f58988j.f114538m.get(i10)).f115730a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f58984f + i10) : null;
        long jA = w83.a(this.f58988j.b(i10));
        long jA2 = w83.a(((sa2) this.f58988j.f114538m.get(i10)).f115731b - ((sa2) this.f58988j.f114538m.get(0)).f115731b) - this.f58985g;
        c43Var.getClass();
        return c43Var.a(str, numValueOf, 0, jA, jA2, d6.f109796h, false);
    }

    @Override // yads.f43
    public final int b() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    @Override // yads.f43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.e43 a(int r41, yads.e43 r42, long r43) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.b.a(int, yads.e43, long):yads.e43");
    }

    @Override // yads.f43
    public final int a() {
        return this.f58988j.f114538m.size();
    }

    @Override // yads.f43
    public final int a(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f58984f) >= 0 && iIntValue < a()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // yads.f43
    public final Object a(int i10) {
        fi.a(i10, a());
        return Integer.valueOf(this.f58984f + i10);
    }
}
