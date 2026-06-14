package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f111139a;

    public gc(mr1 mr1Var) {
        this.f111139a = mr1Var;
    }

    public static bk a(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("attributes"));
            objB = Result.b(new bk(jSONObject2.getString("campaignId"), jSONObject2.getString("bannerId"), jSONObject2.getString("placeId")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (bk) objB;
    }
}
