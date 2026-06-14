package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f103502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f103507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f103508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f103509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f103510i;

    public q(@NonNull JSONObject jSONObject) {
        this.f103502a = jSONObject;
        this.f103503b = jSONObject.optInt("type", 0);
        this.f103504c = jSONObject.optString("value", "");
        this.f103505d = jSONObject.optString("name", "");
        this.f103506e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f103507f = jSONObject.optInt("replace", 0);
        this.f103508g = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray == null) {
            this.f103509h = new String[0];
            this.f103510i = new String[0];
            return;
        }
        this.f103509h = new String[jSONArrayOptJSONArray.length()];
        this.f103510i = new String[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                this.f103509h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f103510i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.f
    public final JSONObject a() {
        return this.f103502a;
    }
}
