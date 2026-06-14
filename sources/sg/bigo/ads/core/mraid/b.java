package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f104394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Rect f104395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<Rect> f104396c;

    b(float f10, Rect rect, List<Rect> list) {
        this.f104394a = f10;
        this.f104395b = rect;
        this.f104396c = list;
    }

    static JSONArray a(List<Rect> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Rect> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(it.next()));
        }
        return jSONArray;
    }

    static JSONObject a(Rect rect) {
        if (rect == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", rect.left);
            jSONObject.put("y", rect.top);
            jSONObject.put("width", rect.width());
            jSONObject.put("height", rect.height());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
