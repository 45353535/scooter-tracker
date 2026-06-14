package io.bidmachine.analytics.internal.C;

import com.ironsource.C4246ba;
import com.taurusx.tax.y.z.w.s;
import io.bidmachine.analytics.internal.g.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final c a(io.bidmachine.analytics.internal.g.c cVar) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        String strC = cVar.c();
        String strD = cVar.d();
        long jF = cVar.f();
        String strA = cVar.a();
        String string2 = a(cVar.e()).toString();
        io.bidmachine.analytics.internal.g.e eVarB = cVar.b();
        if (eVarB == null || (jSONObjectA = e.a(eVarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(Charsets.UTF_8)) == null) {
            bytes = new byte[0];
        }
        return new c(strC, strD, jF, strA, string2, bytes, cVar.g());
    }

    public static final io.bidmachine.analytics.internal.g.c a(c cVar) {
        return new io.bidmachine.analytics.internal.g.c(cVar.c(), cVar.d(), cVar.f(), cVar.a(), a(new JSONObject(cVar.e())), cVar.b().length == 0 ? null : e.a(new JSONObject(new String(cVar.b(), Charsets.UTF_8))), cVar.g());
    }

    public static final JSONObject a(c.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (aVar instanceof c.a.C0949a) {
            jSONObject.put("type", C4246ba.f42746n);
            c.a.C0949a c0949a = (c.a.C0949a) aVar;
            jSONObject.put(s.z.f67720z, c0949a.b());
            jSONObject.put("path", c0949a.a());
            return jSONObject;
        }
        if (aVar instanceof c.a.b) {
            jSONObject.put("type", "pur");
            c.a.b bVar = (c.a.b) aVar;
            jSONObject.put(s.z.f67720z, bVar.d());
            jSONObject.put("path", bVar.a());
            jSONObject.putOpt("query", bVar.b());
            jSONObject.put("shouldRep", bVar.c());
        }
        return jSONObject;
    }

    public static final c.a a(JSONObject jSONObject) {
        if (Intrinsics.areEqual(jSONObject.optString("type", C4246ba.f42746n), "pur")) {
            return new c.a.b(jSONObject.optString(s.z.f67720z), jSONObject.optString("path"), jSONObject.has("query") ? jSONObject.optString("query") : null, jSONObject.optBoolean("shouldRep", true));
        }
        return new c.a.C0949a(jSONObject.optString(s.z.f67720z), jSONObject.optString("path"));
    }
}
