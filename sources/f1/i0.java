package f1;

import com.ironsource.D5;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f70056a = CollectionsKt.emptyList();

    public static final List a() {
        return f70056a;
    }

    public static final List b(JSONObject jSONObject) {
        List listA;
        List listA2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("blacklist");
        return (jSONArrayOptJSONArray == null || (listA = vd.a(jSONArrayOptJSONArray)) == null || (listA2 = p3.a(listA)) == null) ? f70056a : listA2;
    }

    public static final u c(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tracking");
        if (jSONObjectOptJSONObject == null) {
            return new u(false, null, null, 0, 0, false, 0, 127, null);
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
        String strOptString = jSONObjectOptJSONObject.optString(D5.f40571r, "https://ssp-events.chartboost.com/track/sdk");
        int iOptInt = jSONObjectOptJSONObject.optInt("eventLimit", 10);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("windowDuration", 60);
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("persistenceEnabled", true);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("persistenceMaxEvents", 100);
        List listB = b(jSONObjectOptJSONObject);
        Intrinsics.checkNotNull(strOptString);
        return new u(zOptBoolean, listB, strOptString, iOptInt, iOptInt2, zOptBoolean2, iOptInt3);
    }
}
