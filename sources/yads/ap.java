package yads;

import android.text.Html;
import com.ironsource.N6;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up1 f108743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.json.b f108744b;

    public /* synthetic */ ap() {
        this(new up1(), rc1.a());
    }

    public final eb a(JSONObject jSONObject) {
        String strValueOf;
        String string;
        try {
            try {
                kotlinx.serialization.json.b bVar = rc1.f115402a;
                string = jSONObject.getString("ad_unit_id");
            } catch (JSONException unused) {
                kotlinx.serialization.json.b bVar2 = rc1.f115402a;
                String string2 = jSONObject.getString("block_id");
                if (string2 == null || string2.length() == 0 || Intrinsics.areEqual("null", string2)) {
                    throw new JSONException("Json value can not be null or empty");
                }
                strValueOf = String.valueOf(Html.fromHtml(string2));
            }
        } catch (JSONException unused2) {
            boolean z10 = lb1.f113032a;
        }
        if (string == null || string.length() == 0 || Intrinsics.areEqual("null", string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        strValueOf = String.valueOf(Html.fromHtml(string));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(N6.E1);
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cp1 cp1VarA = this.f108743a.a(jSONArrayOptJSONArray.getJSONObject(i10));
                if (cp1VarA != null) {
                    arrayList.add(cp1VarA);
                }
            }
            if (!arrayList.isEmpty()) {
                return new eb(strValueOf, jSONObject.toString(), arrayList);
            }
        }
        return null;
    }

    public final zo b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        sq1 sq1Var;
        String string;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    eb ebVarA = a(jSONArrayOptJSONArray.getJSONObject(i10));
                    if (ebVarA != null) {
                        arrayList.add(ebVarA);
                    }
                }
            }
            if (jSONObject2 == null || (string = jSONObject2.toString()) == null) {
                sq1Var = null;
            } else {
                kotlinx.serialization.json.b bVar = this.f108744b;
                bVar.a();
                sq1Var = (sq1) bVar.c(vg.a.t(sq1.Companion.serializer()), string);
            }
            if (arrayList.isEmpty() && sq1Var == null) {
                return null;
            }
            return new zo(arrayList, sq1Var);
        } catch (JSONException unused2) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    public ap(up1 up1Var, kotlinx.serialization.json.b bVar) {
        this.f108743a = up1Var;
        this.f108744b = bVar;
    }
}
