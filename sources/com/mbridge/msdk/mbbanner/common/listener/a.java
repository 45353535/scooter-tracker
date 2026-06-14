package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void a(CampaignEx campaignEx);

    void a(boolean z10);

    void a(boolean z10, String str);

    void close();

    void readyStatus(int i10);

    void toggleCloseBtn(int i10);

    void triggerCloseBtn(String str);
}
