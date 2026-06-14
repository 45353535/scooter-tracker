package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49679b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f49681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f49682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f49683d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        class RunnableC0540a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f49685a;

            RunnableC0540a(CampaignUnit campaignUnit) {
                this.f49685a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f49685a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f49685a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f49683d, aVar.f49681b.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f49682c, this.f49685a);
                    b.this.saveRequestTime(this.f49685a.getAds().size());
                }
            }
        }

        a(String str, JSONObject jSONObject, List list, int i10) {
            this.f49680a = str;
            this.f49681b = jSONObject;
            this.f49682c = list;
            this.f49683d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0540a("v5".equals(this.f49680a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f49681b.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f49681b.optJSONObject("data"))));
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f49679b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f49679b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f48689a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f48687b) == null) {
            return;
        }
        int i10 = this.f49678a;
        if (i10 == 0) {
            b(aVar.f48710b, eVar.f48688c);
        } else if (i10 == 1) {
            a(aVar.f48710b, eVar.f48688c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(int i10) {
        this.f49678a = i10;
    }

    public int a() {
        return this.f49678a;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
