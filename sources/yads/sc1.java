package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sc1 {
    public static final String a(String str, JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(jSONObject.getString(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
