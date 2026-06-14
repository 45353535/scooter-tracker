package yads;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f116618a;

    public /* synthetic */ ud1(Context context, dm2 dm2Var) {
        this(new r0(context.getApplicationContext(), dm2Var));
    }

    public static String a(String str, JSONObject jSONObject) throws mz1 {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        return strOptString;
    }

    public ud1(r0 r0Var) {
        this.f116618a = r0Var;
    }

    public final td1 a(JSONObject jSONObject, cn cnVar) {
        ArrayList arrayList;
        List listBuild;
        Object objB;
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                r0 r0Var = this.f116618a;
                r0Var.getClass();
                String strOptString = jSONObject2.optString("type");
                if (strOptString != null && strOptString.length() != 0 && !Intrinsics.areEqual(strOptString, "null")) {
                    Map mapMapOf = r0Var.f115248f;
                    if (mapMapOf == null) {
                        Pair pair = TuplesKt.to("adtune", new rc(r0Var.f115244b, r0Var.f115245c));
                        Pair pair2 = TuplesKt.to("divkit_adtune", new bh0(r0Var.f115246d, r0Var.f115247e, r0Var.f115245c, cnVar.f109463b));
                        Pair pair3 = TuplesKt.to("close", new lv());
                        Context context = r0Var.f115243a;
                        f83 f83Var = r0Var.f115244b;
                        jSONArray = jSONArrayOptJSONArray;
                        mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(Constants.DEEPLINK, new ma0(f83Var, new qe2(context, f83Var), new y53())), TuplesKt.to("feedback", new ts0(r0Var.f115244b)));
                        r0Var.f115248f = mapMapOf;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                    }
                    q0 q0Var = (q0) mapMapOf.get(strOptString);
                    if (q0Var != null) {
                        arrayList2.add(q0Var.a(jSONObject2));
                    }
                    i10++;
                    jSONArrayOptJSONArray = jSONArray;
                } else {
                    throw new mz1("Native Ad json has not required attributes");
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strA = a("falseClickUrl", jSONObject);
        op0 op0Var = strA != null ? new op0(strA, jSONObject.optLong("falseClickInterval", 0L)) : null;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        String strA2 = a("trackingUrl", jSONObject);
        if (strA2 != null) {
            setCreateSetBuilder.add(strA2);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (jSONArrayOptJSONArray2 != null) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                try {
                    Result.Companion companion = Result.f93230c;
                    objB = Result.b(jSONArrayOptJSONArray2.getString(i11));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                if (Result.j(objB)) {
                    listCreateListBuilder.add((String) objB);
                }
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else {
            listBuild = null;
        }
        if (listBuild != null) {
            setCreateSetBuilder.addAll(listBuild);
        }
        return new td1(arrayList, op0Var, CollectionsKt.toList(SetsKt.build(setCreateSetBuilder)), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }
}
