package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f103441c = new ArrayList();

    public f(@NonNull JSONObject jSONObject) {
        this.f103439a = jSONObject.optInt(CampaignEx.JSON_KEY_CLICK_MODE, 2);
        this.f103440b = jSONObject.optInt("wrong_click_time", 500);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reconfirm_click_region");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    this.f103441c.add(new g(jSONObjectOptJSONObject));
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.a
    public final int a() {
        return this.f103439a;
    }

    @Override // sg.bigo.ads.api.core.b.a
    public final int b() {
        return this.f103440b;
    }
}
