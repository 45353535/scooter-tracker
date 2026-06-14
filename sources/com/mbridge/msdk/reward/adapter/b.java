package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.ironsource.C4274d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.videocommon.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f50076g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f50077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f50080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f50082f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f50084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f50085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f50086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f50087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f50088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f50089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f50090h;

        a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f50083a = copyOnWriteArrayList;
            this.f50084b = context;
            this.f50085c = str;
            this.f50086d = i10;
            this.f50087e = str2;
            this.f50088f = str3;
            this.f50089g = str4;
            this.f50090h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0257  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 993
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a.run():void");
        }
    }

    class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f50095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f50096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f50097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f50099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f50100f;

        c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f50095a = str;
            this.f50096b = str2;
            this.f50097c = str3;
            this.f50098d = campaignEx;
            this.f50099e = nVar;
            this.f50100f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFailed(java.lang.String r22, java.lang.String r23) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.c.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50095a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50096b);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f50097c);
                bundle.putString(C4240b4.i.W, this.f50095a + "_" + this.f50097c + "_" + this.f50098d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f50077a.sendMessage(messageObtain);
                n nVar = this.f50099e;
                if (nVar != null) {
                    nVar.a(this.f50096b, this.f50095a, this.f50097c, str);
                }
                if (z10) {
                    return;
                }
                b.this.a(this.f50100f, 1, this.f50098d, str, "", this.f50095a, str2);
            } catch (Exception e10) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50095a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f50096b);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f50097c);
                bundle2.putString(C4240b4.i.W, this.f50095a + "_" + this.f50097c + "_" + this.f50098d.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                b.this.f50077a.sendMessage(messageObtain2);
                if (this.f50099e != null) {
                    try {
                        this.f50099e.a(str, this.f50097c, b.b(880005, new MBridgeIds(this.f50096b, this.f50095a, this.f50097c), "", e10, null));
                    } catch (Exception e11) {
                        q0.b("RewardCampaignsResourceManager", e11.getMessage());
                    }
                }
                b.this.a(this.f50100f, 3, this.f50098d, str, e10.getLocalizedMessage(), this.f50095a, str2);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f50103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f50104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f50106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f50107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f50108g;

        d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f50102a = campaignEx;
            this.f50103b = context;
            this.f50104c = i10;
            this.f50105d = str;
            this.f50106e = str2;
            this.f50107f = str3;
            this.f50108g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f50102a == null || this.f50103b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f50103b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f50104c);
                CampaignEx campaignEx = this.f50102a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f50102a.getRequestId());
                    nVar.k(this.f50102a.getCurrentLocalRid());
                    nVar.o(this.f50102a.getRequestIdNotice());
                }
                nVar.b("url", this.f50105d);
                nVar.t(this.f50105d);
                nVar.m(this.f50106e);
                nVar.u(this.f50107f);
                if (!TextUtils.isEmpty(this.f50108g)) {
                    nVar.q(this.f50108g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f50102a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f50111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f50114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f50115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f50116g;

        e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f50110a = z10;
            this.f50111b = windVaneWebView;
            this.f50112c = campaignEx;
            this.f50113d = copyOnWriteArrayList;
            this.f50114e = str;
            this.f50115f = cVar;
            this.f50116g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f50110a, this.f50111b, this.f50112c.getRewardTemplateMode().j(), 0, this.f50112c, (CopyOnWriteArrayList<CampaignEx>) this.f50113d, H5DownLoadManager.getInstance().getH5ResAddress(this.f50112c.getRewardTemplateMode().j()), this.f50114e, this.f50115f, this.f50116g, b.this.f50078b);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f50118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f50119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f50121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f50122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f50123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f50124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f50125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f50126i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f50118a = z10;
            this.f50119b = z11;
            this.f50120c = i10;
            this.f50121d = i11;
            this.f50122e = str;
            this.f50123f = str2;
            this.f50124g = i12;
            this.f50125h = copyOnWriteArrayList;
            this.f50126i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    private static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f50149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f50150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f50151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f50152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n f50153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f50154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f50155i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f50147a = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f50156j = System.currentTimeMillis();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f50157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f50158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50159c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50160d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f50161e;

            a(int i10, long j10, String str, String str2, String str3) {
                this.f50157a = i10;
                this.f50158b = j10;
                this.f50159c = str;
                this.f50160d = str2;
                this.f50161e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f50152f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f50157a, this.f50158b + "", this.f50159c, i.this.f50152f.getId(), i.this.f50150d, this.f50160d, "2");
                    nVar.n(i.this.f50152f.getRequestId());
                    nVar.k(i.this.f50152f.getCurrentLocalRid());
                    nVar.o(i.this.f50152f.getRequestIdNotice());
                    nVar.b(i.this.f50152f.getId());
                    nVar.a(i.this.f50152f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f50159c);
                    if (i.this.f50152f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f50152f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f50161e)) {
                        nVar.q(this.f50161e);
                    }
                    b.b(nVar, i.this.f50152f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f50150d, i.this.f50152f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f50148b = i10;
            this.f50149c = str;
            this.f50150d = str2;
            this.f50151e = str3;
            this.f50152f = campaignEx;
            this.f50153g = nVar;
            this.f50154h = handler;
            this.f50155i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f50148b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.f50154h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle2.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.f50154h.sendMessage(messageObtain2);
                if (this.f50147a) {
                    a(3, System.currentTimeMillis() - this.f50156j, str, "url download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 205;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle3.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle3.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain3.setData(bundle3);
                this.f50154h.sendMessage(messageObtain3);
                if (this.f50153g != null) {
                    try {
                        this.f50153g.a(str, this.f50151e, b.b(880006, new MBridgeIds(this.f50149c, this.f50150d, this.f50151e), str2, null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f50148b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f50154h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle2.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f50154h.sendMessage(messageObtain2);
                if (this.f50147a) {
                    a(1, System.currentTimeMillis() - this.f50156j, str, "", str2);
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50150d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f50149c);
                bundle3.putString(CommonUrlParts.REQUEST_ID, this.f50151e);
                bundle3.putString(C4240b4.i.W, this.f50150d + "_" + this.f50151e + "_" + this.f50152f.getSecondRequestIndex());
                messageObtain3.setData(bundle3);
                this.f50154h.sendMessage(messageObtain3);
                n nVar = this.f50153g;
                if (nVar != null) {
                    nVar.a(this.f50149c, this.f50150d, this.f50151e, str);
                }
            }
        }

        public void a(boolean z10) {
            this.f50147a = z10;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }
    }

    private static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f50163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f50168f;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50169a;

            a(String str) {
                this.f50169a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f50168f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f50168f.getId());
                        nVar.i(j.this.f50168f.getImageUrl());
                        nVar.n(j.this.f50168f.getRequestId());
                        nVar.k(j.this.f50168f.getCurrentLocalRid());
                        nVar.o(j.this.f50168f.getRequestIdNotice());
                        nVar.u(j.this.f50165c);
                        nVar.m(this.f50169a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f50163a = handler;
            this.f50164b = i10;
            this.f50166d = str;
            this.f50165c = str2;
            this.f50167e = str3;
            this.f50168f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f50164b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50165c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50166d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f50167e);
            bundle.putString(C4240b4.i.W, this.f50165c + "_" + this.f50167e + "_" + this.f50168f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f50163a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f50164b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50165c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50166d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f50167e);
            bundle.putString(C4240b4.i.W, this.f50165c + "_" + this.f50167e + "_" + this.f50168f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f50163a.sendMessage(messageObtain);
        }
    }

    private static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f50177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f50181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f50182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f50183h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f50184i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f50185j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f50176a = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f50186k = System.currentTimeMillis();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f50187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50188b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50189c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50190d;

            a(int i10, String str, String str2, String str3) {
                this.f50187a = i10;
                this.f50188b = str;
                this.f50189c = str2;
                this.f50190d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f50181f == null || l.this.f50177b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f50177b != null) {
                        nVar.c(m0.s(l.this.f50177b.getApplicationContext()));
                    }
                    nVar.d(this.f50187a);
                    if (l.this.f50181f != null) {
                        nVar.b(l.this.f50181f.getId());
                        nVar.n(l.this.f50181f.getRequestId());
                        nVar.k(l.this.f50181f.getCurrentLocalRid());
                        nVar.o(l.this.f50181f.getRequestIdNotice());
                    }
                    nVar.t(this.f50188b);
                    nVar.m(this.f50189c);
                    nVar.u(l.this.f50178c);
                    if (!TextUtils.isEmpty(this.f50190d)) {
                        nVar.q(this.f50190d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f50188b);
                    b.b(nVar, l.this.f50181f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f50181f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        class RunnableC0549b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f50192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f50193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50194c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50195d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f50196e;

            RunnableC0549b(int i10, long j10, String str, String str2, String str3) {
                this.f50192a = i10;
                this.f50193b = j10;
                this.f50194c = str;
                this.f50195d = str2;
                this.f50196e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f50181f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f50192a, this.f50193b + "", this.f50194c, l.this.f50181f.getId(), l.this.f50178c, this.f50195d, "1");
                    nVar.n(l.this.f50181f.getRequestId());
                    nVar.k(l.this.f50181f.getCurrentLocalRid());
                    nVar.o(l.this.f50181f.getRequestIdNotice());
                    nVar.b(l.this.f50181f.getId());
                    nVar.a(l.this.f50181f.getAdSpaceT());
                    nVar.q(this.f50196e);
                    nVar.b("scenes", "1");
                    if (l.this.f50181f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f50181f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f50194c);
                    nVar.e(3);
                    b.b(nVar, l.this.f50181f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f50178c, l.this.f50181f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f50177b = context;
            this.f50179d = str;
            this.f50178c = str2;
            this.f50180e = str3;
            this.f50181f = campaignEx;
            this.f50182g = i10;
            this.f50183h = handler;
            this.f50184i = nVar;
            this.f50185j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f50186k;
            int i10 = this.f50182g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
                bundle.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.f50183h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
                bundle2.putString("url", str2);
                bundle2.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.f50183h.sendMessage(messageObtain2);
                if (this.f50176a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 203;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
                bundle3.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
                bundle3.putString("url", str2);
                bundle3.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain3.setData(bundle3);
                this.f50183h.sendMessage(messageObtain3);
                if (this.f50184i != null) {
                    try {
                        this.f50184i.a(str2, this.f50180e, b.b(880006, new MBridgeIds(this.f50179d, this.f50178c, this.f50180e), "", null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
                a(3, str2, str, "");
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f50186k;
            int i10 = this.f50182g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
                bundle.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f50183h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
                bundle2.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f50183h.sendMessage(messageObtain2);
                if (this.f50176a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50178c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f50179d);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f50180e);
            bundle3.putString(C4240b4.i.W, this.f50178c + "_" + this.f50180e + "_" + this.f50181f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f50183h.sendMessage(messageObtain3);
            n nVar = this.f50184i;
            if (nVar != null) {
                nVar.a(this.f50179d, this.f50178c, this.f50180e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z10) {
            this.f50176a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0549b(i10, j10, str, str2, str3));
        }
    }

    private static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f50198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f50199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f50200c;

        public m(Looper looper) {
            super(looper);
            this.f50199b = new ConcurrentHashMap<>();
            this.f50200c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.f50199b.put(str, hVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:194:0x03c1, code lost:
        
            if (r18.getRsIgnoreCheckRule().contains(3) == false) goto L205;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0354 A[Catch: Exception -> 0x0319, TRY_LEAVE, TryCatch #4 {Exception -> 0x0319, blocks: (B:153:0x0302, B:161:0x032c, B:171:0x0354, B:207:0x0400), top: B:234:0x00a0 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.BaseBundle, android.os.Bundle] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r29) {
            /*
                Method dump skipped, instruction units count: 1168
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.m.handleMessage(android.os.Message):void");
        }

        public void a(Context context) {
            this.f50198a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f50200c.put(str, copyOnWriteArrayList);
        }
    }

    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    public interface o {
        void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a);
    }

    private static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f50201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f50202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f50204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f50206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f50207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f50208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f50209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f50210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final a.C0600a f50211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final CampaignEx f50212l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f50213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f50214n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f50215o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f50216p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f50217q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Runnable f50218r;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f50219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0600a f50220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50222d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f50223e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f50224f;

            a(o oVar, a.C0600a c0600a, String str, String str2, String str3, String str4) {
                this.f50219a = oVar;
                this.f50220b = c0600a;
                this.f50221c = str;
                this.f50222d = str2;
                this.f50223e = str3;
                this.f50224f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0600a c0600a;
                if (this.f50219a != null && (c0600a = this.f50220b) != null) {
                    c0600a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50221c + "_" + this.f50222d + "_" + this.f50223e, true);
                    o oVar = this.f50219a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f50221c);
                    sb2.append("_");
                    sb2.append(this.f50223e);
                    oVar.a(sb2.toString(), this.f50224f, this.f50221c, this.f50222d, this.f50223e, this.f50220b);
                }
                a.C0600a c0600a2 = this.f50220b;
                if (c0600a2 == null || (windVaneWebViewB = c0600a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        class RunnableC0550b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f50226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0600a f50227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50228c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50229d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f50230e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f50231f;

            RunnableC0550b(o oVar, a.C0600a c0600a, String str, String str2, String str3, String str4) {
                this.f50226a = oVar;
                this.f50227b = c0600a;
                this.f50228c = str;
                this.f50229d = str2;
                this.f50230e = str3;
                this.f50231f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0600a c0600a;
                if (this.f50226a != null && (c0600a = this.f50227b) != null) {
                    c0600a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50228c + "_" + this.f50229d + "_" + this.f50230e, true);
                    o oVar = this.f50226a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f50228c);
                    sb2.append("_");
                    sb2.append(this.f50230e);
                    oVar.a(sb2.toString(), this.f50231f, this.f50228c, this.f50229d, this.f50230e, this.f50227b);
                }
                a.C0600a c0600a2 = this.f50227b;
                if (c0600a2 == null || (windVaneWebViewB = c0600a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0600a c0600a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f50201a = handler;
            this.f50202b = runnable;
            this.f50203c = z10;
            this.f50204d = z11;
            this.f50205e = str;
            this.f50206f = oVar;
            this.f50207g = windVaneWebView;
            this.f50208h = str2;
            this.f50209i = str4;
            this.f50210j = str3;
            this.f50211k = c0600a;
            this.f50212l = campaignEx;
            this.f50213m = copyOnWriteArrayList;
            this.f50214n = j10;
            a aVar = new a(oVar, c0600a, str4, str, str2, str3);
            this.f50218r = aVar;
            this.f50217q = new RunnableC0550b(oVar, c0600a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f50201a;
            if (handler2 != null && (runnable2 = this.f50217q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f50201a;
            if (handler3 != null && (runnable = this.f50218r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f50212l, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f50216p) {
                return;
            }
            String str = this.f50209i + "_" + this.f50208h;
            if (i10 == 1) {
                Runnable runnable3 = this.f50202b;
                if (runnable3 != null && (handler = this.f50201a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50209i + "_" + this.f50205e + "_" + this.f50208h, true);
                a.C0600a c0600a = this.f50211k;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                if (this.f50203c) {
                    if (this.f50204d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f50212l.getRequestIdNotice(), this.f50211k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f50212l.getRequestIdNotice(), this.f50211k);
                    }
                } else if (this.f50204d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f50212l.getRequestIdNotice(), this.f50211k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f50212l.getRequestIdNotice(), this.f50211k);
                }
                o oVar = this.f50206f;
                if (oVar != null) {
                    oVar.a(str, this.f50210j, this.f50209i, this.f50205e, this.f50208h, this.f50211k);
                }
            } else if (this.f50206f != null) {
                this.f50206f.a(str, this.f50205e, this.f50208h, this.f50211k, b.b(880009, new MBridgeIds(this.f50210j, this.f50209i, this.f50205e), "readyState:" + i10, null, this.f50212l));
            }
            this.f50216p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f50201a;
            if (handler2 != null && (runnable2 = this.f50218r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f50215o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f50201a;
                if (handler3 != null && (runnable = this.f50217q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f50209i + "_" + this.f50208h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50209i + "_" + this.f50205e + "_" + this.f50208h, true);
                Runnable runnable3 = this.f50202b;
                if (runnable3 != null && (handler = this.f50201a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0600a c0600a = this.f50211k;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                if (this.f50203c) {
                    if (this.f50212l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f50212l.getRequestIdNotice(), this.f50211k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f50212l.getRequestIdNotice(), this.f50211k);
                    }
                } else if (this.f50212l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f50212l.getRequestIdNotice(), this.f50211k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f50212l.getRequestIdNotice(), this.f50211k);
                }
                o oVar = this.f50206f;
                if (oVar != null) {
                    oVar.a(str2, this.f50210j, this.f50209i, this.f50205e, this.f50208h, this.f50211k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f50215o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50209i + "_" + this.f50205e + "_" + this.f50208h, false);
            Handler handler = this.f50201a;
            if (handler != null) {
                if (this.f50217q != null) {
                    handler.removeCallbacks(this.f50218r);
                }
                Runnable runnable = this.f50217q;
                if (runnable != null) {
                    this.f50201a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f50209i + "_" + this.f50208h;
                a.C0600a c0600a = this.f50211k;
                if (c0600a != null) {
                    c0600a.a(false);
                }
                if (this.f50206f != null) {
                    this.f50206f.a(str3, this.f50205e, str2, this.f50211k, b.b(880009, new MBridgeIds(this.f50210j, this.f50209i, this.f50205e), i10 + "#" + str, null, this.f50212l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50209i + "_" + this.f50205e + "_" + this.f50208h, false);
            Handler handler = this.f50201a;
            if (handler != null) {
                if (this.f50217q != null) {
                    handler.removeCallbacks(this.f50218r);
                }
                Runnable runnable = this.f50217q;
                if (runnable != null) {
                    this.f50201a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f50209i + "_" + this.f50208h;
                a.C0600a c0600a = this.f50211k;
                if (c0600a != null) {
                    c0600a.a(false);
                }
                if (this.f50206f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f50210j, this.f50209i, this.f50205e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f50206f.a(str, this.f50205e, this.f50208h, this.f50211k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f50212l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    private static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f50234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f50235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f50236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f50237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a.C0600a f50238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CampaignEx f50239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f50240h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f50241i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f50242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f50243k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, a.C0600a c0600a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f50234b = z10;
            this.f50235c = windVaneWebView;
            this.f50236d = str2;
            this.f50237e = str3;
            this.f50238f = c0600a;
            this.f50239g = campaignEx;
            this.f50233a = str;
            this.f50240h = z11;
            this.f50241i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f50239g, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f50243k) {
                return;
            }
            if (this.f50235c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f50233a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f50235c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f50237e + "_" + this.f50239g.getId() + "_" + this.f50239g.getRequestId() + "_" + this.f50236d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50237e + "_" + this.f50241i + "_" + this.f50236d, true);
                a.C0600a c0600a = this.f50238f;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                if (this.f50234b) {
                    if (this.f50239g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f50238f, false, this.f50240h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f50238f, false, this.f50240h);
                    }
                } else if (this.f50239g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f50238f, false, this.f50240h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f50238f, false, this.f50240h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50237e + "_" + this.f50241i + "_" + this.f50236d, false);
                a.C0600a c0600a2 = this.f50238f;
                if (c0600a2 != null) {
                    c0600a2.a(false);
                }
            }
            this.f50243k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.f50242j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f50235c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f50233a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f50235c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50237e + "_" + this.f50241i + "_" + this.f50236d, true);
                a.C0600a c0600a = this.f50238f;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                String str2 = this.f50237e + "_" + this.f50239g.getId() + "_" + this.f50239g.getRequestId() + "_" + this.f50236d;
                if (this.f50234b) {
                    if (this.f50239g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f50239g.getRequestIdNotice(), this.f50238f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f50238f, false, this.f50240h);
                    }
                } else if (this.f50239g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f50239g.getRequestIdNotice(), this.f50238f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f50238f, false, this.f50240h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f50242j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50237e + "_" + this.f50241i + "_" + this.f50236d, false);
            a.C0600a c0600a = this.f50238f;
            if (c0600a != null) {
                c0600a.a(false);
            }
            if (this.f50235c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f50233a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f50235c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    private static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f50244a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i10) {
        return i10 != 200 ? i10 != 201 ? i10 != 203 ? i10 != 205 ? "unknown" : "tpl" : C4274d4.D : "zip/html" : "video";
    }

    private b() {
        this.f50079c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f50080d = "down_type";
        this.f50081e = "h3c";
        this.f50082f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f50076g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f50077a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f50244a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    private static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f50171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f50172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f50173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f50174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f50175e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f50171a = handler;
            this.f50173c = str;
            this.f50172b = str2;
            this.f50174d = str3;
            this.f50175e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50172b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50173c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f50174d);
            bundle.putString(C4240b4.i.W, this.f50175e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f50171a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f50172b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f50173c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f50174d);
            bundle.putString("url", str2);
            bundle.putString(C4240b4.i.W, this.f50175e);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f50171a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f50076g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f50077a.a(str4, hVar);
        this.f50077a.a(context);
        this.f50077a.a(str4, copyOnWriteArrayList2);
        this.f50077a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    class C0548b implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f50092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50093b;

        C0548b(int i10, CampaignEx campaignEx) {
            this.f50092a = i10;
            this.f50093b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f50092a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f50093b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f50093b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f50093b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f50092a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f50093b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f50093b);
            nVar.o(this.f50093b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f50093b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0548b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f50077a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f50077a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    private static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f50127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f50128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f50130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f50132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f50133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f50134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f50135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private a.C0600a f50136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CampaignEx f50137k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f50138l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f50139m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f50140n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f50141o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f50142p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f50143q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f50144r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f50145s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f50146t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0600a c0600a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f50127a = handler;
            this.f50128b = runnable;
            this.f50129c = z11;
            this.f50130d = z12;
            this.f50131e = i10;
            this.f50132f = str;
            this.f50134h = str2;
            this.f50133g = str3;
            this.f50135i = str4;
            this.f50136j = c0600a;
            this.f50137k = campaignEx;
            this.f50138l = copyOnWriteArrayList;
            this.f50139m = cVar;
            this.f50140n = oVar;
            this.f50141o = z13;
            this.f50145s = z10;
            this.f50146t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f50137k, eVar);
            } catch (Throwable th2) {
                q0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f50143q) {
                return;
            }
            String str = this.f50133g + "_" + this.f50132f;
            if (i10 == 1) {
                if (this.f50141o) {
                    com.mbridge.msdk.videocommon.a.d(this.f50133g + "_" + this.f50135i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f50133g + "_" + this.f50135i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f50133g + "_" + this.f50135i + "_" + this.f50132f, this.f50136j, true, this.f50141o);
                Handler handler = this.f50127a;
                if (handler != null && (runnable = this.f50128b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50133g + "_" + this.f50135i + "_" + this.f50132f, true);
                a.C0600a c0600a = this.f50136j;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                o oVar = this.f50140n;
                if (oVar != null) {
                    oVar.a(str, this.f50134h, this.f50133g, this.f50135i, this.f50132f, this.f50136j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50133g + "_" + this.f50135i + "_" + this.f50132f, false);
                a.C0600a c0600a2 = this.f50136j;
                if (c0600a2 != null) {
                    c0600a2.a(false);
                }
                if (this.f50140n != null) {
                    this.f50140n.a(str, this.f50135i, this.f50132f, this.f50136j, b.b(880008, new MBridgeIds(this.f50134h, this.f50133g, this.f50135i), "readyState:" + i10, null, this.f50137k));
                }
            }
            this.f50143q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f50142p) {
                return;
            }
            String str2 = this.f50133g + "_" + this.f50132f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50133g + "_" + this.f50135i + "_" + this.f50132f, true);
                Handler handler = this.f50127a;
                if (handler != null && (runnable = this.f50128b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0600a c0600a = this.f50136j;
                if (c0600a != null) {
                    c0600a.a(true);
                }
                o oVar = this.f50140n;
                if (oVar != null) {
                    oVar.a(str2, this.f50134h, this.f50133g, this.f50135i, this.f50132f, this.f50136j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f50142p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50133g + "_" + this.f50135i + "_" + this.f50132f, false);
            if (this.f50140n != null) {
                String str3 = this.f50133g + "_" + this.f50132f;
                a.C0600a c0600a = this.f50136j;
                if (c0600a != null) {
                    c0600a.a(false);
                }
                this.f50140n.a(str3, this.f50135i, this.f50132f, this.f50136j, b.b(880008, new MBridgeIds(this.f50134h, this.f50133g, this.f50135i), "onReceivedError： " + i10 + "  " + str, null, this.f50137k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f50133g, this.f50135i);
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f50145s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f50144r == 0 ? 3 : 6);
                        this.f50144r++;
                    }
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f50077a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (v0.b(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString(CommonUrlParts.REQUEST_ID, str3);
                    bundle.putString(C4240b4.i.W, str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f50077a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (cVarB == null) {
                        cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0187 A[Catch: all -> 0x0034, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(boolean r20, android.os.Handler r21, boolean r22, boolean r23, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r24, java.lang.String r25, int r26, com.mbridge.msdk.foundation.entity.CampaignEx r27, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.mbridge.msdk.videocommon.setting.c r34, com.mbridge.msdk.reward.adapter.b.o r35) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.setting.c, com.mbridge.msdk.reward.adapter.b$o):void");
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        a.C0600a c0600a;
        WindVaneWebView windVaneWebView;
        String strB;
        String strB2;
        com.mbridge.msdk.video.signal.impl.k kVar;
        com.mbridge.msdk.video.signal.impl.k kVar2;
        String str9 = str4;
        synchronized (this) {
            this.f50078b = z13;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f50078b = z13;
            if (v0.i(str5)) {
                if (oVar != null) {
                    oVar.a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                c0600a = new a.C0600a();
                windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                c0600a.a(windVaneWebView);
                strB = com.mbridge.msdk.video.bt.component.d.c().b();
                strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
                c0600a.a(strB2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str9);
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i11, campaignEx2);
                                }
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                } else {
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                }
                kVar.g(i10);
                kVar.setUnitId(str7);
                kVar.c(strB2);
                kVar.d(strB);
                kVar.c(true);
                kVar.setRewardUnitSetting(cVar);
                kVar.d(z10);
                kVar2 = kVar;
                try {
                    str9 = str4;
                    str8 = str;
                } catch (Exception e10) {
                    e = e10;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e11) {
                e = e11;
                str8 = str;
            }
            try {
                windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0600a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                windVaneWebView.setObject(kVar2);
                windVaneWebView.loadUrl(str6);
                windVaneWebView.setRid(str8);
                MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTRootLayout.setInstanceId(strB);
                mBridgeBTRootLayout.setUnitId(str9);
                MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTLayout.setInstanceId(strB2);
                mBridgeBTLayout.setUnitId(str9);
                mBridgeBTLayout.setWebView(windVaneWebView);
                AbstractMap abstractMapB = com.mbridge.msdk.video.bt.component.d.c().b(str9, str8);
                abstractMapB.put(strB2, mBridgeBTLayout);
                abstractMapB.put(strB, mBridgeBTRootLayout);
                mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
            } catch (Exception e12) {
                e = e12;
                if (oVar != null) {
                    oVar.a(str10, str8, str5, null, b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C0600a c0600a = new a.C0600a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0600a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                requestId = requestId2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0600a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            q0.b("RewardCampaignsResourceManager", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}
