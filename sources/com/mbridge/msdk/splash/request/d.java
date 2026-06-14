package com.mbridge.msdk.splash.request;

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
    private static final String f50852c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50854b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f50855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f50856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f50857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f50858d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        class RunnableC0572a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f50860a;

            RunnableC0572a(CampaignUnit campaignUnit) {
                this.f50860a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f50860a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f50860a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f50857c, this.f50860a);
                    d.this.saveRequestTime(this.f50860a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f50860a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f50856b.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f50858d, msg);
                }
            }
        }

        a(String str, JSONObject jSONObject, List list, int i10) {
            this.f50855a = str;
            this.f50856b = jSONObject;
            this.f50857c = list;
            this.f50858d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0572a("v5".equals(this.f50855a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f50856b.optJSONObject("data"), d.this.f50854b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f50856b.optJSONObject("data"), d.this.f50854b)));
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

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f50852c, "errorCode = " + aVar.f48689a);
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
        int i10 = this.f50853a;
        if (i10 == 0) {
            b(aVar.f48710b, eVar.f48688c);
        } else if (i10 == 1) {
            a(aVar.f48710b, eVar.f48688c);
        }
    }

    public void a(String str) {
        this.f50854b = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f50854b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f50854b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
