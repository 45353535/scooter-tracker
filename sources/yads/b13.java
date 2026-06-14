package yads;

import j$.util.Objects;
import java.util.Map;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b13 {
    public static Map a(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(rc1.a(jSONObject));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            Objects.toString(jSONObject);
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (Map) objB;
    }

    public static String a(Map map) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            kotlinx.serialization.json.c0 c0Var = new kotlinx.serialization.json.c0();
            for (Map.Entry entry : map.entrySet()) {
                kotlinx.serialization.json.i.d(c0Var, (String) entry.getKey(), (String) entry.getValue());
            }
            objB = Result.b(c0Var.a().toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    public static Map a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(a(new JSONObject(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (Map) objB;
    }
}
