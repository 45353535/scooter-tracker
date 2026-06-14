package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class kt2 implements j12 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f112843f = {ub.a(kt2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f112844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final et2 f112845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk2 f112846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uq2 f112847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q02 f112848e;

    public kt2(zy1 zy1Var, c4 c4Var, et2 et2Var) {
        this.f112844a = c4Var;
        this.f112845b = et2Var;
        this.f112846c = hk2.a(zy1Var);
        this.f112847d = new uq2(zy1Var.e(), zy1Var.h());
        this.f112848e = new q02(zy1Var.e());
    }

    @Override // yads.j12
    public final void a(Context context, t9 t9Var) {
        gk2 gk2Var = this.f112846c;
        KProperty kProperty = f112843f[0];
        zy1 zy1Var = (zy1) gk2Var.f111244a.get();
        if (zy1Var != null) {
            zy1Var.f115506b.a(u5.f116499c, null);
            qz1 qz1Var = (qz1) t9Var.f116127t;
            c4 c4Var = this.f112844a;
            s02 s02Var = new s02();
            this.f112847d.a(context, t9Var, this.f112848e);
            uq2 uq2Var = this.f112847d;
            uq2Var.getClass();
            Map mapEmptyMap = MapsKt.emptyMap();
            if ((kotlin.jvm.internal.b1.q(mapEmptyMap) ? mapEmptyMap : null) == null) {
                new LinkedHashMap();
            }
            am2 am2VarA = s02Var.a(t9Var, c4Var, qz1Var);
            yl2 yl2Var = yl2.f118285c;
            am2VarA.b("success", "status");
            uq2Var.a(context, t9Var, xl2.f117871h, am2VarA);
            jy1 jy1VarA = this.f112845b.a(t9Var);
            if (zy1Var.f115522r == y5.f118084b) {
                return;
            }
            qz1 qz1Var2 = (qz1) t9Var.f116127t;
            yx1 yx1Var = zy1Var.B;
            eg.i.d(yx1Var.f118430d, null, null, new xx1(yx1Var, t9Var, qz1Var2, jy1VarA, zy1Var.C, null), 3, null);
        }
    }
}
