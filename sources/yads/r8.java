package yads;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f115359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f115360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8 f115361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t9 f115362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdQualityVerificationResult f115363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f115364f;

    public r8(c4 c4Var, Context context, h8 h8Var) {
        this.f115359a = c4Var;
        this.f115360b = context;
        this.f115361c = h8Var;
        this.f115363e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f115364f = lf.i.a(new p8(this));
    }

    public final void a() {
        am2 am2VarA;
        if (b()) {
            h8 h8Var = this.f115361c;
            Context context = this.f115360b;
            AdQualityVerificationResult adQualityVerificationResult = this.f115363e;
            t9 t9Var = this.f115362d;
            h8Var.getClass();
            t7 t7Var = h8Var.f111509c;
            c4 c4Var = h8Var.f111507a;
            t7Var.getClass();
            if ((t9Var != null ? t9Var.f116120m : null) == ez.f110528b) {
                Object obj = t9Var.f116127t;
                am2VarA = t7Var.f116093b.a(t9Var, c4Var, obj instanceof qz1 ? (qz1) obj : null);
            } else {
                am2VarA = t7Var.f116092a.a(t9Var, c4Var);
            }
            am2VarA.a(c4Var.f109206m, "verification_network");
            h8Var.f111510d.getClass();
            Map mapEmptyMap = MapsKt.emptyMap();
            if (!kotlin.jvm.internal.b1.q(mapEmptyMap)) {
                mapEmptyMap = null;
            }
            if (mapEmptyMap == null) {
                mapEmptyMap = new LinkedHashMap();
            }
            String strA = j8.a(adQualityVerificationResult);
            if (strA == null) {
                mapEmptyMap.put("verification_status", "undefined");
            } else {
                mapEmptyMap.put("verification_status", strA);
            }
            mapEmptyMap.put("verification_flow", "undefined");
            mapEmptyMap.put("status", "error");
            c cVar = am2VarA.f108723b;
            if (cVar == null) {
                cVar = null;
            }
            Map mapPlus = MapsKt.plus(am2VarA.f108722a, mapEmptyMap);
            Map linkedHashMap = kotlin.jvm.internal.b1.q(mapPlus) ? mapPlus : null;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            xl2 xl2Var = xl2.f117866c;
            zl2 zl2Var = new zl2("ad_verification_result", MapsKt.toMutableMap(linkedHashMap), cVar);
            ((pr3) h8Var.f111508b).getClass();
            wr3 wr3Var = wr3.f117545a;
            ((pr3) h8Var.f111508b).getClass();
            ve.a(context, new in3()).a(zl2Var);
            ((y8) this.f115364f.getValue()).onInvalidated();
        }
    }

    public final boolean b() {
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(this.f115360b);
        d8 d8Var = hr2VarA != null ? hr2VarA.f111758v0 : null;
        return d8Var != null && d8Var.f109822a;
    }

    public /* synthetic */ r8(c4 c4Var, es2 es2Var, Context context) {
        this(c4Var, context, new h8(c4Var, es2Var));
    }
}
