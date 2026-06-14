package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class yr2 implements yn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f118336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yn2 f118337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s23 f118338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dl0 f118339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ap f118340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zl0 f118341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s7 f118342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b13 f118343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pv2 f118344i;

    public yr2(mr1 mr1Var, yn2 yn2Var, s23 s23Var, dl0 dl0Var, ap apVar, zl0 zl0Var, s7 s7Var, b13 b13Var, pv2 pv2Var) {
        this.f118336a = mr1Var;
        this.f118337b = yn2Var;
        this.f118338c = s23Var;
        this.f118339d = dl0Var;
        this.f118340e = apVar;
        this.f118341f = zl0Var;
        this.f118342g = s7Var;
        this.f118343h = b13Var;
        this.f118344i = pv2Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object objB;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (Integer) (Result.i(objB) ? null : objB);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    @Override // yads.yn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(yads.rn2 r99) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yr2.a(yads.rn2):java.lang.Object");
    }
}
