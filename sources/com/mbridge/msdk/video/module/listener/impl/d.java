package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.f52762a) {
            try {
                CampaignEx campaignEx = this.f52763b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 == 122) {
                    g();
                    return;
                }
                switch (i10) {
                    case 109:
                        a(2);
                        b(2);
                        break;
                    case 110:
                        a(1);
                        b(1);
                        break;
                    case 111:
                        b(1);
                        break;
                }
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b);
            if (i10 != 105) {
                String noticeUrl = this.f52763b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f48601m)) {
                        noticeUrl = noticeUrl.replace(com.mbridge.msdk.foundation.same.a.f48601m + C4240b4.j.f42668b + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f48601m), com.mbridge.msdk.foundation.same.a.f48601m + "=2");
                    } else {
                        noticeUrl = noticeUrl + C4240b4.j.f42670c + com.mbridge.msdk.foundation.same.a.f48601m + "=2";
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b, this.f52768g, noticeUrl, true, false, com.mbridge.msdk.click.retry.a.f46605o);
            }
        }
    }
}
