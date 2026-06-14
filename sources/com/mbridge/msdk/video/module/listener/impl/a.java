package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f52749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f52750b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f52749a = activity;
        this.f52750b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (i10 != 106 || this.f52749a == null || this.f52750b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strA = com.mbridge.msdk.click.c.a(this.f52750b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strA)) {
                intent.setData(Uri.parse(strA));
                this.f52749a.startActivity(intent);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
        this.f52749a.finish();
    }
}
