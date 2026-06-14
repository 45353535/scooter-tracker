package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f49409b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49410a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    class RunnableC0530a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f49412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f49413c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        class RunnableC0531a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f49415a;

            RunnableC0531a(CampaignUnit campaignUnit) {
                this.f49415a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f49415a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f49415a.getAds().size() > 0) {
                    a.this.a(this.f49415a);
                    if (!TextUtils.isEmpty(a.this.f49410a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f49415a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f49415a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0530a.this.f49412b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0530a runnableC0530a = RunnableC0530a.this;
                a.this.a(runnableC0530a.f49413c, msg);
            }
        }

        RunnableC0530a(String str, JSONObject jSONObject, int i10) {
            this.f49411a = str;
            this.f49412b = jSONObject;
            this.f49413c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0531a("v5".equals(this.f49411a) ? b.parseV5CampaignUnit(this.f49412b.optJSONObject("data"), a.this.f49410a) : b.parseCampaignUnit(this.f49412b.optJSONObject("data"), a.this.f49410a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f49409b, "onFailed errorCode = " + aVar.f48689a);
        a(aVar.f48689a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f48687b.f48710b, eVar.f48688c);
    }

    public void a(String str) {
        this.f49410a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f49409b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0530a(jSONObject.optString("version"), jSONObject, iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
