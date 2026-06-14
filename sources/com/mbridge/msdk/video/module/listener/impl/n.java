package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* JADX INFO: loaded from: classes10.dex */
public class n extends o {
    private boolean A;
    private int B;
    private boolean C;
    private MBridgeVideoView.u D;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IJSFactory f52784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f52785y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f52786z;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.f52786z = false;
        this.A = false;
        this.C = false;
        this.f52784x = iJSFactory;
        this.f52785y = i10;
        this.f52786z = i11 == 0;
        this.B = i13;
        if (iJSFactory == null) {
            this.f52762a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.n.a(int, java.lang.Object):void");
    }
}
