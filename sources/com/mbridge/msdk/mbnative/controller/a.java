package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f49597a;

    public abstract void a(int i10, long j10, int i11, String str);

    public void a(Context context, CampaignEx campaignEx) {
    }

    public void a(CampaignUnit campaignUnit) {
    }

    public void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, int i10) {
    }

    public boolean a(com.mbridge.msdk.click.a aVar, Context context, CampaignEx campaignEx, String str, com.mbridge.msdk.widget.dialog.b bVar) {
        return false;
    }

    public synchronized void a(long j10, int i10, boolean z10, String str, String str2) {
        a(1, j10, i10, str2);
    }
}
