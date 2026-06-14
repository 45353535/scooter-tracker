package yads;

import android.content.Context;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Locale;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class o22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud1 f114163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj f114164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f83 f114165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e41 f114166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th0 f114167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf0 f114168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l32 f114169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ew2 f114170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gi1 f114171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gc f114172j;

    public /* synthetic */ o22(Context context, mr1 mr1Var) {
        ud1 ud1Var = new ud1(context, mr1Var);
        this(ud1Var, new dj(context, mr1Var, ud1Var, 8), new f83(), new e41(), new th0(mr1Var), new lf0(), new l32(), new ew2(), new gi1(), new gc(mr1Var));
    }

    public final cw2 a(JSONObject jSONObject) throws mz1 {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        Object objB5;
        dw2 dw2Var;
        if (!p22.a(jSONObject, POBCTAOverlayData.KEY_CTA_DELAY, "url")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Long.valueOf(jSONObject.getLong(POBCTAOverlayData.KEY_CTA_DELAY)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Long l10 = (Long) objB;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        try {
            this.f114165c.getClass();
            objB2 = Result.b(f83.a("url", jSONObject));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.f93230c;
            objB2 = Result.b(kotlin.d.a(th3));
        }
        if (Result.i(objB2)) {
            objB2 = null;
        }
        String str = (String) objB2;
        try {
            objB3 = Result.b(Double.valueOf(jSONObject.optInt("visibilityPercent", 0)));
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.f93230c;
            objB3 = Result.b(kotlin.d.a(th4));
        }
        if (Result.i(objB3)) {
            objB3 = null;
        }
        Double d10 = (Double) objB3;
        int iL = (int) kotlin.ranges.g.l(d10 != null ? d10.doubleValue() : 0.0d, 0.0d, 100.0d);
        try {
            objB4 = Result.b(jSONObject.getString("type"));
        } catch (Throwable th5) {
            Result.Companion companion5 = Result.f93230c;
            objB4 = Result.b(kotlin.d.a(th5));
        }
        if (Result.i(objB4)) {
            objB4 = null;
        }
        String str2 = (String) objB4;
        if (str2 != null) {
            try {
                String upperCase = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                objB5 = Result.b(dw2.valueOf(upperCase));
            } catch (Throwable th6) {
                Result.Companion companion6 = Result.f93230c;
                objB5 = Result.b(kotlin.d.a(th6));
            }
            if (Result.i(objB5)) {
                objB5 = null;
            }
            dw2Var = (dw2) objB5;
        } else {
            dw2Var = null;
        }
        if (dw2Var == null) {
            if (str != null) {
                this.f114170h.getClass();
                dw2Var = StringsKt.g0(str, "/rtbcount/", false, 2, null) ? dw2.f110099c : StringsKt.g0(str, "/count/", false, 2, null) ? dw2.f110098b : dw2.f110100d;
            } else {
                dw2Var = dw2.f110100d;
            }
        }
        return new cw2(iL, jLongValue, dw2Var, str);
    }

    public o22(ud1 ud1Var, dj djVar, f83 f83Var, e41 e41Var, th0 th0Var, lf0 lf0Var, l32 l32Var, ew2 ew2Var, gi1 gi1Var, gc gcVar) {
        this.f114163a = ud1Var;
        this.f114164b = djVar;
        this.f114165c = f83Var;
        this.f114166d = e41Var;
        this.f114167e = th0Var;
        this.f114168f = lf0Var;
        this.f114169g = l32Var;
        this.f114170h = ew2Var;
        this.f114171i = gi1Var;
        this.f114172j = gcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:391:0x00d7, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.qz1 a(java.lang.String r53, yads.cn r54) throws org.json.JSONException, yads.mz1 {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.o22.a(java.lang.String, yads.cn):yads.qz1");
    }
}
