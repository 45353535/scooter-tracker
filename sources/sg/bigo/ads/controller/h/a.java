package sg.bigo.ads.controller.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f103718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f103719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f103720d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f103719c = jSONObject.optString("data");
            this.f103717a = jSONObject.optInt("code");
            this.f103718b = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            r.a(jSONObject.optInt("timestamp", 0));
            this.f103720d = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals("code", next) && !TextUtils.equals(NotificationCompat.CATEGORY_MESSAGE, next)) {
                    this.f103720d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f103719c = "";
            this.f103717a = 1005;
            this.f103718b = "Invalid response.";
        }
    }

    public final boolean b() {
        return this.f103717a == -14;
    }

    public final boolean a() {
        return this.f103717a == 1;
    }
}
