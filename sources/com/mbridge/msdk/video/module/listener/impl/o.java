package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class o extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f52787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f52788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f52789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f52790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f52791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f52792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f52793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f52794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f52795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f52796w;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52797a;

        a(Object obj) {
            this.f52797a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f52797a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f52792s = false;
        this.f52793t = 0;
        this.f52796w = -1;
        if (this.f52762a) {
            this.f52794u = campaignEx.getAdvImpList();
        }
        this.f52793t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x014d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:18:0x0024, B:21:0x002f, B:23:0x003e, B:25:0x0049, B:24:0x0046, B:26:0x005a, B:82:0x0167, B:27:0x0062, B:29:0x0075, B:31:0x0079, B:33:0x007f, B:35:0x0084, B:37:0x0088, B:40:0x0099, B:42:0x009d, B:43:0x00a1, B:45:0x00bd, B:46:0x00c6, B:48:0x00ca, B:53:0x00d2, B:54:0x00d6, B:55:0x00ee, B:58:0x00f4, B:60:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0117, B:68:0x011b, B:69:0x012b, B:71:0x012f, B:72:0x0139, B:74:0x0143, B:76:0x0147, B:77:0x014d, B:79:0x0151, B:81:0x0155), top: B:86:0x0004 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.o.a(int, java.lang.Object):void");
    }
}
