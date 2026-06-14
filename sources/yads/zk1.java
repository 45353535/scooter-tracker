package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i93 f118729a;

    public zk1(i93 i93Var) {
        this.f118729a = i93Var;
    }

    public final Object a(JSONObject jSONObject) {
        String strA = this.f118729a.a("html", jSONObject);
        float f10 = (float) jSONObject.getDouble("aspectRatio");
        if (f10 == 0.0f) {
            f10 = 1.7777778f;
        }
        return new ai1(strA, f10);
    }
}
