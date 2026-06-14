package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* JADX INFO: loaded from: classes10.dex */
public class e extends MBTempContainer.k.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f52263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f52264c;

    public e(com.mbridge.msdk.foundation.same.report.metrics.c cVar, h hVar) {
        this.f52263b = hVar;
        this.f52264c = cVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k.a, com.mbridge.msdk.video.bt.module.MBTempContainer.k
    public void onError(String str) {
        super.onError(str);
        h hVar = this.f52263b;
        if (hVar != null) {
            hVar.a(this.f52264c, str);
        }
    }
}
