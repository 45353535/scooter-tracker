package com.mbridge.msdk.advanced.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46390c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46392b;

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f46392b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f46392b);
        if (v5CampaignUnit != null && v5CampaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
            a(list, v5CampaignUnit);
            saveRequestTime(v5CampaignUnit.getAds().size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            a(iOptInt, msg);
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f46392b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f46390c, "errorCode = " + aVar.f48689a);
        a(aVar.f48689a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f48687b) == null) {
            return;
        }
        int i10 = this.f46391a;
        if (i10 == 0) {
            b(aVar.f48710b, eVar.f48688c);
        } else if (i10 == 1) {
            a(aVar.f48710b, eVar.f48688c);
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f46392b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f46392b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            a(iOptInt, msg);
        }
    }
}
