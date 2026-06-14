package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46490e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f46493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f46494i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    JumpLoaderResult f46487b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46488c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46489d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f46491f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46492g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f46495j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f46493h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f46494i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f46489d = str2;
        this.f46491f = gVar;
        this.f46487b = null;
        this.f46490e = i10;
        if (campaignEx != null) {
            z = "5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f46494i.a(str2, gVar, z, id2, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f46489d = new String(campaignEx.getClickURL());
        this.f46491f = gVar;
        this.f46487b = null;
        this.f46494i.a(campaignEx.getClickURL(), gVar, "5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f46606p);
    }

    public void a() {
        this.f46492g = false;
    }
}
