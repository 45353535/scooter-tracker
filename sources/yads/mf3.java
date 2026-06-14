package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class mf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn f113455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i93 f113456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bc3 f113457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa3 f113458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg3 f113459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w21 f113460f;

    public /* synthetic */ mf3(Context context, dm2 dm2Var, cn cnVar) {
        this(cnVar, j93.a(cnVar.a()), new bc3(context, new b52()), new sa3(context, dm2Var), new sg3(), new w21());
    }

    public final Object a(JSONObject jSONObject) throws mz1 {
        n93 n93VarA;
        rg3 rg3Var;
        Object objB;
        try {
            n93VarA = this.f113458d.a(this.f113456b.a("vast", jSONObject), this.f113455a);
        } catch (Exception unused) {
            n93VarA = null;
        }
        if (n93VarA == null || n93VarA.f113763b.isEmpty()) {
            throw new mz1("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.f113459e.getClass();
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("volumeControlVisible", true);
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("isProgressBarHidden", false);
            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("alternativeFormatFallback", false);
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(Double.valueOf(jSONObjectOptJSONObject.getDouble("initialVolume")));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.i(objB)) {
                objB = null;
            }
            rg3Var = new rg3(zOptBoolean, zOptBoolean2, zOptBoolean3, (Double) objB);
        } else {
            rg3Var = null;
        }
        ArrayList arrayListA = this.f113457c.a(n93VarA.f113763b, rg3Var);
        if (arrayListA.isEmpty()) {
            throw new mz1("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("preview");
        return new gb3(arrayListA, rg3Var, jSONObjectOptJSONObject2 != null ? this.f113460f.a(jSONObjectOptJSONObject2) : null);
    }

    public mf3(cn cnVar, i93 i93Var, bc3 bc3Var, sa3 sa3Var, sg3 sg3Var, w21 w21Var) {
        this.f113455a = cnVar;
        this.f113456b = i93Var;
        this.f113457c = bc3Var;
        this.f113458d = sa3Var;
        this.f113459e = sg3Var;
        this.f113460f = w21Var;
    }
}
