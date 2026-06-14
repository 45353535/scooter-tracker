package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jv0 {
    public static hv0 a(JSONObject jSONObject) {
        Object objB;
        kotlinx.serialization.json.b bVarB = kotlinx.serialization.json.v.b(null, iv0.f112157b, 1, null);
        try {
            Result.Companion companion = Result.f93230c;
            String string = jSONObject.toString();
            bVarB.a();
            objB = Result.b((hv0) bVarB.c(hv0.Companion.serializer(), string));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (hv0) (Result.i(objB) ? null : objB);
    }
}
