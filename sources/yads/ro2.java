package yads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ro2 extends cx0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final si2 f115535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final uq2 f115536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jp2 f115537o;

    public ro2(Context context, t9 t9Var, c4 c4Var, es2 es2Var, nw0 nw0Var, si2 si2Var, kp2 kp2Var, vz1 vz1Var, uq2 uq2Var) {
        super(context, t9Var, c4Var, es2Var, nw0Var, new l5());
        this.f115535m = si2Var;
        this.f115536n = uq2Var;
        this.f115537o = kp2Var.a(context, t9Var, es2Var, c4Var);
        vz1Var.a(t9Var);
    }

    @Override // yads.cx0, yads.h53, yads.e4
    public final void a(int i10, Bundle bundle) {
        if (i10 == 13) {
            h();
        } else {
            super.a(i10, bundle);
        }
    }

    @Override // yads.cx0
    public final cx0 f() {
        return this;
    }

    public final void h() {
        Map mapEmptyMap;
        lo2 lo2Var;
        uq2 uq2Var = this.f115536n;
        Context context = this.f110800a;
        t9 t9Var = this.f110801b;
        uq2Var.getClass();
        Boolean boolValueOf = null;
        am2 am2Var = new am2((Map) null, 3);
        if (t9Var != null && (lo2Var = t9Var.f116125r) != null) {
            boolValueOf = Boolean.valueOf(lo2Var.f113179b);
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            mapEmptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "server_side"));
        } else if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            mapEmptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "client_side"));
        } else {
            if (boolValueOf != null) {
                throw new lf.m();
            }
            mapEmptyMap = MapsKt.emptyMap();
        }
        am2Var.b(mapEmptyMap, "reward_info");
        uq2Var.a(context, t9Var, xl2.B, am2Var);
        jp2 jp2Var = this.f115537o;
        if (jp2Var != null) {
            jp2Var.a();
        }
    }

    public final void a(ri2 ri2Var) {
        this.f109639l = ri2Var;
        this.f115535m.f115826a = ri2Var;
    }
}
