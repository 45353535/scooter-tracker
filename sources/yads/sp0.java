package yads;

import android.content.Context;
import com.ironsource.C4455ne;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class sp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df1 f115893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qp0 f115894b;

    public sp0(Context context) {
        this(gf1.a(context, "FalseClickDataStorage"));
    }

    public final void a(long j10) {
        ((ff1) this.f115893a).d(String.valueOf(j10));
    }

    public /* synthetic */ sp0(df1 df1Var) {
        this(df1Var, new qp0());
    }

    public final void a(pp0 pp0Var) throws JSONException {
        String string;
        String strValueOf = String.valueOf(pp0Var.f114735b);
        qp0 qp0Var = this.f115894b;
        qp0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", pp0Var.f114734a.f115230b);
        jSONObject.put("start_time", pp0Var.f114735b);
        jSONObject.put("type", pp0Var.f114736c.f111434b);
        tp0 tp0Var = qp0Var.f115115a;
        op0 op0Var = pp0Var.f114737d;
        tp0Var.getClass();
        String string2 = null;
        if (op0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", op0Var.f114383c);
            jSONObject2.put("url", op0Var.f114382b);
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(pp0Var.f114738e));
        d dVar = qp0Var.f115116b;
        c cVar = pp0Var.f114739f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C4455ne.f44465d, cVar.f109164a);
            jSONObject3.put("test_ids", cVar.f109165b);
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        ((ff1) this.f115893a).a(strValueOf, jSONObject.toString());
    }

    public sp0(df1 df1Var, qp0 qp0Var) {
        this.f115893a = df1Var;
        this.f115894b = qp0Var;
    }
}
