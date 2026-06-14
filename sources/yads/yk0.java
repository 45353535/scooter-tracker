package yads;

import com.ironsource.N6;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class yk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f118248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn f118249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb f118250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m72 f118251d;

    public yk0(c4 c4Var, bn bnVar, gb gbVar, m72 m72Var) {
        this.f118248a = c4Var;
        this.f118249b = bnVar;
        this.f118250c = gbVar;
        this.f118251d = m72Var;
    }

    public final String a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(N6.E1, jSONArray);
            bn bnVar = this.f118249b;
            String string = jSONObject.toString();
            bnVar.getClass();
            return bn.a(string);
        } catch (JSONException unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yk0.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
