package yads;

import android.text.Html;
import com.ironsource.N6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class up1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo1 f116735a;

    public /* synthetic */ up1() {
        this(new wo1());
    }

    public final cp1 a(JSONObject jSONObject) {
        i5 i5Var;
        try {
            kotlinx.serialization.json.b bVar = rc1.f115402a;
            String string = jSONObject.getString(N6.G1);
            if (string == null || string.length() == 0 || Intrinsics.areEqual("null", string)) {
                throw new JSONException("Json value can not be null or empty");
            }
            String strValueOf = String.valueOf(Html.fromHtml(string));
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                mapCreateMapBuilder.put(next, jSONObject2.getString(next));
            }
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            if (mapBuild.isEmpty()) {
                return null;
            }
            List listB = rc1.b("click_tracking_urls", jSONObject);
            List listB2 = rc1.b("impression_tracking_urls", jSONObject);
            List listB3 = rc1.b("ad_response_tracking_urls", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bidding_info");
            Map mapA = jSONObjectOptJSONObject != null ? rc1.a(jSONObjectOptJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                this.f116735a.getClass();
                try {
                    String string2 = jSONObject.getString("impression_data");
                    if (string2.length() == 0 || Intrinsics.areEqual("null", string2)) {
                        throw new JSONException("Json has not required attributes");
                    }
                    i5Var = new i5(string2);
                } catch (Exception unused) {
                    boolean z10 = lb1.f113032a;
                    i5Var = null;
                }
            } else {
                i5Var = null;
            }
            return new cp1(strValueOf, mapBuild, listB2, listB, listB3, i5Var, mapA);
        } catch (JSONException unused2) {
            boolean z11 = lb1.f113032a;
            return null;
        }
    }

    public up1(wo1 wo1Var) {
        this.f116735a = wo1Var;
    }
}
