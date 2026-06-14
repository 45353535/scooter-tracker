package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f52250a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f52251b = null;

    public void a() {
        this.f52251b = Boolean.TRUE;
    }

    public void b() {
        this.f52250a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.f52251b;
    }

    public Boolean d() {
        return this.f52250a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        q0.a("ShowRewardListener", "onAdShow");
        this.f52250a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        q0.a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        q0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        q0.a("ShowRewardListener", "onShowFail:" + str);
        this.f52251b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        q0.a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        q0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        q0.a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        q0.a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
