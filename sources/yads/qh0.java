package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f114997a = CollectionsKt.listOf((Object[]) new String[]{"native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button"});

    public static void a(JSONArray jSONArray, fh0 fh0Var, ph0 ph0Var) {
        Object obj;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                obj = jSONArray.get(i10);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, fh0Var, ph0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, fh0Var, ph0Var);
            }
        }
    }

    public static void a(JSONObject jSONObject, fh0 fh0Var, ph0 ph0Var) {
        Object obj;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("extensions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (Intrinsics.areEqual((jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) == null) ? null : jSONObjectOptJSONObject.optString("view_name"), "native_ad_view")) {
                    fh0Var = fh0.f110724c;
                    break;
                }
                i10++;
            }
        }
        ph0Var.invoke(jSONObject, fh0Var);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                obj = jSONObject.get(itKeys.next());
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, fh0Var, ph0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, fh0Var, ph0Var);
            }
        }
    }

    public final Set a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(jSONObject, fh0.f110723b, new ph0(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!f114997a.contains(((eh0) obj).f110374b)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }
}
