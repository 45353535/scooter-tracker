package yads;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp0 f115115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115116b;

    public /* synthetic */ qp0() {
        this(new tp0(), new d());
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next));
            }
            Result.b(Unit.f93236a);
            return map;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
            return map;
        }
    }

    public qp0(tp0 tp0Var, d dVar) {
        this.f115115a = tp0Var;
        this.f115116b = dVar;
    }
}
