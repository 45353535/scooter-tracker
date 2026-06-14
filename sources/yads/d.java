package yads;

import com.ironsource.C4455ne;
import j$.util.Objects;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.TuplesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C4455ne.f44465d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object objB;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i10)))));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.g(objB) != null) {
                Objects.toString(TuplesKt.to(jSONArray.get(i10), kotlin.jvm.internal.c0.f93287a));
                boolean z10 = lb1.f113032a;
            }
        }
        return linkedHashSet;
    }
}
