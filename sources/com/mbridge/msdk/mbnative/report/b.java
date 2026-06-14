package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f49672b;

        a(Context context, CampaignEx campaignEx) {
            this.f49671a = context;
            this.f49672b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f49671a)).b(this.f49672b.getId());
            } catch (Exception unused) {
                q0.b("NativeReportUtils", "campain can't insert db");
            }
        }
    }

    public static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.listener.a aVar) {
        if (campaignEx == null) {
            return;
        }
        try {
            com.mbridge.msdk.setting.g gVarB = h.b().b(c.n().b());
            boolean z10 = gVarB == null || gVarB.n() == 1;
            if (!campaignEx.isReport()) {
                campaignEx.setReport(true);
                a(campaignEx, context, str);
                a(campaignEx, context, str, aVar, z10);
                a(a(campaignEx), campaignEx, context, str);
                b(campaignEx, context, str);
                b(campaignEx);
            }
            if (aVar != null && !campaignEx.isCallBackImpression()) {
                if (!z10) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getType());
                    } catch (Exception e10) {
                        Log.e("NativeReportUtils", e10.getMessage());
                    }
                }
                campaignEx.setCallBackImpression(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void b(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        l lVar = new l();
        lVar.a(0);
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVar);
    }

    private static synchronized void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        CampaignEx campaignEx2 = campaignEx;
                        Context context2 = context;
                        String str2 = str;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                        context = context2;
                        campaignEx = campaignEx2;
                        str = str2;
                    }
                }
            } finally {
            }
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str) {
        try {
            c.n().a(context);
            if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, campaignEx));
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46603m);
            }
            if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().p() != null) {
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.listener.a aVar, boolean z10) {
        Map<String, Long> map;
        if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = NativeController.f49505d0) != null && !map.containsKey(campaignEx.getOnlyImpressionURL())) {
            if (z10 && aVar != null) {
                try {
                    aVar.onLoggingImpression(campaignEx.getAdType());
                } catch (Exception e10) {
                    Log.e("NativeReportUtils", e10.getMessage());
                }
            }
            NativeController.f49505d0.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46604n);
        }
    }

    private static void a(List<String> list, CampaignEx campaignEx, Context context, String str) {
        CampaignEx campaignEx2;
        Context context2;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        int i10 = 0;
        while (i10 < list.size()) {
            String str3 = list.get(i10);
            if (TextUtils.isEmpty(str3)) {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
            } else {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
                com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, str3, false, false);
            }
            i10++;
            context = context2;
            campaignEx = campaignEx2;
            str = str2;
        }
    }

    public static List<String> a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx != null) {
            String ad_url_list = campaignEx.getAd_url_list();
            if (!TextUtils.isEmpty(ad_url_list)) {
                try {
                    JSONArray jSONArray = new JSONArray(ad_url_list);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add((String) jSONArray.get(i10));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
