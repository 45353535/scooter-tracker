package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f53152s = true;

    private com.mbridge.msdk.click.a q() {
        if (this.f53125l == null) {
            this.f53125l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f53123j);
        }
        return this.f53125l;
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(C4240b4.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void b(JSONObject jSONObject) {
    }

    public void a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.f48601m);
        } catch (Throwable unused) {
        }
        this.f53126m.a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        q().a(this.f53126m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }
}
