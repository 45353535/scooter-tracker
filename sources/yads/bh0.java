package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bh0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf0 f109000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0 f109001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z53 f109002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f109003d;

    public bh0(lf0 lf0Var, th0 th0Var, z53 z53Var, boolean z10) {
        this.f109000a = lf0Var;
        this.f109001b = th0Var;
        this.f109002c = z53Var;
        this.f109003d = z10;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, mz1 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        this.f109002c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("design");
        gf0 gf0VarA = jSONObjectOptJSONObject != null ? this.f109000a.a(jSONObjectOptJSONObject) : null;
        oh0 oh0VarA = gf0VarA != null ? this.f109001b.a(gf0VarA, this.f109003d) : null;
        if (oh0VarA != null) {
            return new zg0(strOptString, oh0VarA, arrayList);
        }
        throw new mz1("Native Ad json has not required attributes");
    }
}
