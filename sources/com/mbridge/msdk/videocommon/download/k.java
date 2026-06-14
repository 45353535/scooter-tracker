package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f53226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f53227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f53228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f53230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f53232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f53233h;

    private static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f53235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f53236c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f53234a = str;
            this.f53235b = concurrentHashMap;
            this.f53236c = aVar;
        }

        private void b(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f53236c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f53234a + " videoDownloadListener onDownLoadDone error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f53235b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f53234a + " videoDownloadListener onDownLoadDone error: " + e11.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            b(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            b(str, str2);
        }

        private void b(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f53236c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f53234a + " videoDownloadListener onDownLoadFailed error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f53235b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f53234a + " videoDownloadListener onDownLoadFailed error: " + e11.getMessage());
                        }
                    }
                }
            }
        }
    }

    public k(List<CampaignEx> list, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f53232g = copyOnWriteArrayList;
        this.f53233h = new ConcurrentHashMap<>();
        this.f53228c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f53229d = str;
        this.f53231f = i10;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String b(CampaignEx campaignEx) {
        return campaignEx == null ? "" : campaignEx.getendcard_url();
    }

    private int c() {
        com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
        if (cVarB == null) {
            return 0;
        }
        try {
            return cVarB.g();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            q0.a("RewardVideoRefactorManager", h() + " getCDRate error " + e10.getMessage());
            return 0;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            q0.a("RewardVideoRefactorManager", h() + " getVideoCtnType error " + e10.getMessage());
            return 1;
        }
    }

    private String e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.j();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " getVideoTemplateUrl error", e10);
            }
        }
        return "";
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            if (this.f53233h.containsKey(str)) {
                return;
            }
            a(campaignEx, str, (com.mbridge.msdk.videocommon.download.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " handlerCampaignLoadEvent error", e10);
            }
        }
    }

    private boolean g(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.a("RewardVideoRefactorManager", h() + " isPlayerAbleAds error:" + th2.getMessage());
            return false;
        }
    }

    public void a() {
    }

    public void h(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f53232g.add(campaignEx);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public com.mbridge.msdk.videocommon.download.a i() {
        List<com.mbridge.msdk.videocommon.download.a> listA;
        if (this.f53232g.size() == 0) {
            q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
            return null;
        }
        try {
            listA = a((List<CampaignEx>) this.f53232g, false);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e10);
            }
            listA = null;
        }
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        return listA.get(0);
    }

    public void j() {
        a(this.f53232g);
    }

    public void k() {
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f53226a = aVar;
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        try {
            if (this.f53230e == null) {
                this.f53230e = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, b() == 287);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getRewardUnitSetting error " + e10.getMessage());
            }
        }
        return this.f53230e;
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.f53227b == null) {
            this.f53227b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f53227b.put(str, aVar);
    }

    private int g() {
        try {
            return b(this.f53229d).w();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.a("RewardVideoRefactorManager", h() + " getRewardReadyRate error:" + th2.getMessage());
            return 100;
        }
    }

    public com.mbridge.msdk.videocommon.download.a d() {
        try {
            return i();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTask error:" + th2.getMessage());
            return null;
        }
    }

    public String h() {
        return this.f53229d;
    }

    public void c(String str) {
        com.mbridge.msdk.videocommon.download.a aVarRemove;
        CampaignEx campaignExH;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f53233h.containsKey(str) && (aVarRemove = this.f53233h.remove(str)) != null && (campaignExH = aVarRemove.h()) != null) {
                this.f53232g.remove(campaignExH);
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask campaign name: " + campaignExH.getAppName());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask error:" + e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> e() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f53233h);
            return copyOnWriteArrayList;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTaskList error:" + e10.getMessage());
            return null;
        }
    }

    private int f() {
        if (TextUtils.isEmpty(h())) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
            if (cVarB != null) {
                return cVarB.l();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getDlnet error " + e10.getMessage());
            }
        }
        return 1;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f53232g.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public k(CampaignEx campaignEx, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f53232g = copyOnWriteArrayList;
        this.f53233h = new ConcurrentHashMap<>();
        this.f53228c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f53229d = str;
        this.f53231f = i10;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public int b() {
        return this.f53231f;
    }

    private boolean b(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if ((aVar == null || !aVar.x()) && !campaignEx.isDynamicView()) {
            return ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) && campaignEx.getLoadTimeoutState() == 0 && g.a(str) == null) ? false : true;
        }
        return true;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx != null) {
                    f(campaignEx);
                }
            }
            return;
        }
        q0.a("RewardVideoRefactorManager", h() + " load campaignExes is null");
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    public List<com.mbridge.msdk.videocommon.download.a> a(List<CampaignEx> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    a(z10, arrayList, size, campaignEx);
                }
            }
            return arrayList;
        }
        q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
        return arrayList;
    }

    private void a(boolean z10, List<com.mbridge.msdk.videocommon.download.a> list, int i10, CampaignEx campaignEx) {
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            a(z10, list, campaignEx, a(campaignEx, str, this.f53233h.get(str)), i10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e10);
            }
        }
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a aVarA = a(campaignEx);
        aVarA.C();
        this.f53233h.put(str, aVarA);
        return aVarA;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:7|(2:74|8)|(14:10|11|72|12|(0)(1:15)|78|23|(5:25|(1:31)(1:28)|(2:80|34)|37|(3:39|(1:43)(1:42)|(2:76|46))(0))(0)|54|(1:61)(1:60)|62|(1:64)|65|(4:67|(1:69)|70|71)(1:84))(1:21)|22|78|23|(0)(0)|54|(1:61)(0)|62|(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        r0 = r15;
        r15 = r0;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #3 {Exception -> 0x0053, blocks: (B:23:0x003d, B:25:0x0046), top: B:78:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r15, java.util.List<com.mbridge.msdk.videocommon.download.a> r16, com.mbridge.msdk.foundation.entity.CampaignEx r17, com.mbridge.msdk.videocommon.download.a r18, int r19) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.k.a(boolean, java.util.List, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.videocommon.download.a, int):void");
    }

    private String a(int i10) {
        if (i10 == 0) {
            return "DOWNLOAD_READY";
        }
        if (i10 == 1) {
            return "DOWNLOAD_RUN";
        }
        if (i10 == 2) {
            return "DOWNLOAD_PAUSE";
        }
        if (i10 == 4) {
            return "DOWNLOAD_STOP";
        }
        if (i10 != 5) {
            return "Unknown";
        }
        return "DOWNLOAD_DONE";
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar = null;
        try {
            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f53228c, campaignEx, h(), f());
            try {
                aVar2.e(campaignEx);
                aVar2.a(b());
                aVar2.d(c(campaignEx));
                aVar2.b(c());
                aVar2.e(d(campaignEx));
                aVar2.a((c) null);
                aVar2.a(new a(h(), this.f53227b, this.f53226a));
                return aVar2;
            } catch (Exception e10) {
                e = e10;
                aVar = aVar2;
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return aVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        if (aVar == null || TextUtils.isEmpty(aVar.i())) {
            return true;
        }
        return i10 == 0 ? (aVar.h() == null || TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) ? false : true : Utils.getDownloadRate(aVar.j(), aVar.m()) >= i10;
    }

    private boolean a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10, int i11) {
        if (aVar == null || campaignEx == null) {
            return false;
        }
        if (aVar.w() || g(campaignEx) || TextUtils.isEmpty(aVar.i()) || i11 == 3) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
            return true;
        }
        if (campaignEx.getIsTimeoutCheckVideoStatus() == 1 && campaignEx.getVideoCheckType() == 1) {
            return true;
        }
        long jM = aVar.m();
        long j10 = aVar.j();
        if (z10 && campaignEx.getVideoCheckType() == 1) {
            if (i10 == 0) {
                return true;
            }
            if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                campaignEx.setIsTimeoutCheckVideoStatus(1);
                return true;
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar) {
        if (campaignEx != null && aVar != null) {
            try {
                if (aVar.u()) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || a(str, campaignEx)) {
                    return true;
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardDownload error " + th2.getMessage());
                }
            }
        }
        return false;
    }

    private boolean a(String str, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !g(campaignEx)) {
            return true;
        }
        if ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) && !a1.b(g.a(str))) {
            return a1.b(g.b(str));
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f53233h.containsKey(str)) {
            return this.f53233h.get(str);
        }
        return null;
    }
}
