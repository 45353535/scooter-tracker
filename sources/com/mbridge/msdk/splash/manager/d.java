package com.mbridge.msdk.splash.manager;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f50742a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.mbridge.msdk.foundation.db.e f50743b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    class a implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBSplashView f50744a;

        a(MBSplashView mBSplashView) {
            this.f50744a = mBSplashView;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            this.f50744a.setVideoReady(true);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            this.f50744a.setVideoReady(false);
        }
    }

    class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.view.nativeview.a f50745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f50746b;

        b(com.mbridge.msdk.splash.view.nativeview.a aVar, MBSplashView mBSplashView) {
            this.f50745a = aVar;
            this.f50746b = mBSplashView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.splash.view.nativeview.a aVar = this.f50745a;
            if (aVar != null) {
                aVar.b();
            }
            MBSplashView mBSplashView = this.f50746b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(false);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            com.mbridge.msdk.splash.view.nativeview.a aVar = this.f50745a;
            if (aVar != null) {
                aVar.a();
            }
            MBSplashView mBSplashView = this.f50746b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(true);
            }
        }
    }

    class c implements com.mbridge.msdk.foundation.same.image.c {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    public static CampaignEx a(MBSplashView mBSplashView, String str, String str2, String str3, boolean z10, int i10, boolean z11, boolean z12) {
        if (f50743b == null) {
            f50743b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        long jA0 = gVarD.a0() * 1000;
        long jB0 = gVarD.b0() * 1000;
        a(jB0, str2);
        List<CampaignEx> listA = f50743b.a(str2, 0, 0, f50742a, !TextUtils.isEmpty(str3));
        if (listA != null && listA.size() > 0) {
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - jA0;
            if (z11) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                    if (a(mBSplashView, campaignEx, str, str2, z10, i10, z12) && campaignEx.isSpareOffer(jA0, jB0)) {
                        return a(campaignEx);
                    }
                } else if (a(mBSplashView, campaignEx, str, str2, z10, i10, z12)) {
                    return a(campaignEx);
                }
            } else if (((campaignEx.getPlct() > 0 && (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() >= jCurrentTimeMillis) || (campaignEx.getPlct() <= 0 && campaignEx.getTimestamp() >= j10)) && a(mBSplashView, campaignEx, str, str2, z10, i10, z12)) {
                return a(campaignEx);
            }
        }
        return null;
    }

    public static void b(String str) {
        if (f50743b == null) {
            f50743b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f50743b.a(str, 0, f50742a);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    public static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx, String str, String str2, boolean z10, int i10, boolean z11) {
        boolean z12;
        if (campaignEx != null) {
            mBSplashView.clearResState();
            if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                z12 = true;
            } else {
                boolean z13 = mBSplashView.isVideoReady() || com.mbridge.msdk.videocommon.download.b.getInstance().b(297, str2, campaignEx.isBidCampaign());
                if (!z13) {
                    a(mBSplashView, campaignEx, str2);
                } else {
                    mBSplashView.setVideoReady(true);
                }
                z12 = z13;
            }
            if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBSplashView.isH5Ready()) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
                if (TextUtils.isEmpty(h5ResAddress)) {
                    z12 = false;
                } else if (!z11) {
                    a(mBSplashView, h5ResAddress, campaignEx, str, str2, z10, i10);
                }
            }
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBSplashView.isH5Ready()) {
                String strA = a(campaignEx.getAdHtml());
                if (TextUtils.isEmpty(strA)) {
                    z12 = false;
                } else if (!z11) {
                    a(mBSplashView, strA, campaignEx, str, str2, z10, i10);
                }
            }
            if (!campaignEx.isDynamicView()) {
                return z12;
            }
            if (!TextUtils.isEmpty(campaignEx.getImageUrl()) && !mBSplashView.isImageReady()) {
                if (!com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).c(campaignEx.getImageUrl())) {
                    a(mBSplashView, campaignEx, (com.mbridge.msdk.splash.view.nativeview.a) null);
                    return z12;
                }
                mBSplashView.setImageReady(true);
                return true;
            }
        }
        return false;
    }

    private static void a(MBSplashView mBSplashView, CampaignEx campaignEx, String str) {
        a aVar = new a(mBSplashView);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(com.mbridge.msdk.foundation.controller.c.n().d(), str, copyOnWriteArrayList, 297, aVar);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, str, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(str);
        } else {
            mBSplashView.setVideoReady(true);
        }
    }

    public static void a(MBSplashView mBSplashView, CampaignEx campaignEx, com.mbridge.msdk.splash.view.nativeview.a aVar) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new b(aVar, mBSplashView));
        if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl(), new c());
    }

    private static void a(MBSplashView mBSplashView, String str, CampaignEx campaignEx, String str2, String str3, boolean z10, int i10) {
        g.d dVar = new g.d();
        dVar.c(str3);
        dVar.b(str2);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(z10);
        dVar.a(i10);
        g.a().a(mBSplashView, dVar, null);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx) {
        if (mBSplashView == null) {
            return false;
        }
        boolean zIsVideoReady = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? mBSplashView.isVideoReady() : true;
        if (zIsVideoReady && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zIsVideoReady = mBSplashView.isH5Ready();
        }
        if (zIsVideoReady && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zIsVideoReady = mBSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zIsVideoReady = false;
        }
        if (!campaignEx.isDynamicView()) {
            return zIsVideoReady;
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return false;
        }
        return mBSplashView.isImageReady();
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f50743b == null) {
            f50743b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f50743b.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f50743b == null) {
            f50743b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f50743b.a(j10, str);
    }
}
