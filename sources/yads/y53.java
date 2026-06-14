package yads;

import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class y53 {
    public static List a(JSONArray jSONArray) {
        Object objB;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(jSONArray.getString(i10));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.j(objB)) {
                listCreateListBuilder.add((String) objB);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
