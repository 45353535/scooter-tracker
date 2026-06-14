package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50472d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f50475c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f50476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f50477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f50478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f50479d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        class RunnableC0563a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f50481a;

            RunnableC0563a(CampaignUnit campaignUnit) {
                this.f50481a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f50481a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f50481a.getAds().size() > 0) {
                    this.f50481a.setMetricsData(c.this.f50475c);
                    a aVar = a.this;
                    c.this.a(aVar.f50478c, this.f50481a);
                    c.this.saveRequestTime(this.f50481a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f50481a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f50477b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f50479d, msg, cVar.f50475c);
            }
        }

        a(String str, JSONObject jSONObject, List list, int i10) {
            this.f50476a = str;
            this.f50477b = jSONObject;
            this.f50478c = list;
            this.f50479d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0563a("v5".equals(this.f50476a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f50477b.optJSONObject("data"), c.this.f50474b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f50477b.optJSONObject("data"), c.this.f50474b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f50472d, "errorCode = " + aVar.f48689a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f48689a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f48690b);
        this.f50475c.a(bVar);
        a(aVar.f48689a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f50475c);
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
        int i10 = this.f50473a;
        if (i10 == 0) {
            b(aVar.f48710b, eVar.f48688c);
        } else if (i10 == 1) {
            a(aVar.f48710b, eVar.f48688c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f50475c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(String str) {
        this.f50474b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f50475c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f50474b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f50474b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.f50475c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f50475c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA2.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strL);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strL);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA.l();
            }
        }
        a(i10, strL, cVar);
    }
}
