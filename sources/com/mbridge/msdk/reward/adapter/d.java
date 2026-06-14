package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f50327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f50328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50329c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50330d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50331e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50332f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50333g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50334h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f50327a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f50327a;
    }

    public int c() {
        return this.f50333g;
    }

    public int d() {
        return this.f50332f;
    }

    public boolean e() {
        return this.f50329c;
    }

    public void a(boolean z10) {
        this.f50329c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f50328b = campaignEx;
            this.f50330d = campaignEx.getSecondRequestIndex();
            this.f50331e = campaignEx.getSecondShowIndex();
            this.f50332f = campaignEx.getFilterCallBackState();
            this.f50334h = campaignEx.getFilterAdsShowCallState();
            this.f50333g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f50330d == 1 && this.f50329c;
    }
}
