package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f52252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f52253d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f52252c = bVar;
        this.f52253d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f52252c.a(this.f52253d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f52252c.a(this.f52253d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f52252c.a(this.f52253d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f52252c.a(this.f52253d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f52252c.b(this.f52253d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f52252c.c(this.f52253d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f52252c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f52252c.a(this.f52253d, i10, str, str2);
        }
    }
}
