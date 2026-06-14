package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile b f53205f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53206a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, l> f53207b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> f53208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f53209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f53210e;

    private b() {
    }

    public static b getInstance() {
        if (f53205f == null) {
            synchronized (b.class) {
                try {
                    if (f53205f == null) {
                        f53205f = new b();
                    }
                } finally {
                }
            }
        }
        return f53205f;
    }

    public a a(String str, String str2) {
        l lVarC = c(str);
        if (lVarC != null) {
            return lVarC.a(str2);
        }
        return null;
    }

    public CopyOnWriteArrayList<CampaignEx> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f53209d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f53209d.get(str);
    }

    public l c(String str) {
        ConcurrentHashMap<String, l> concurrentHashMap = this.f53207b;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f53207b.get(str);
    }

    public l createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (!this.f53207b.containsKey(str)) {
            l lVar = new l(context, copyOnWriteArrayList, str, i10);
            if (i10 == 94 || i10 == 287) {
                lVar.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
            } else {
                lVar.a(aVar);
            }
            this.f53207b.put(str, lVar);
            return lVar;
        }
        l lVar2 = this.f53207b.get(str);
        if (lVar2 == null) {
            lVar2 = new l(context, copyOnWriteArrayList, str, i10);
            this.f53207b.put(str, lVar2);
        }
        if (i10 == 94 || i10 == 287) {
            lVar2.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
        } else {
            lVar2.a(aVar);
        }
        lVar2.b(copyOnWriteArrayList);
        return lVar2;
    }

    public void load(String str) {
        l lVarC = c(str);
        if (lVarC != null) {
            lVarC.d();
        }
    }

    public CopyOnWriteArrayList<a> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f53210e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f53210e.get(str);
    }

    public boolean b(int i10, String str, boolean z10) {
        try {
            l lVarC = c(str);
            if (lVarC != null) {
                return lVarC.b(i10, z10) != null;
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public void c(String str, String str2) {
        l lVarC = c(str);
        if (lVarC != null) {
            try {
                lVarC.b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DownLoadManager", e10.getMessage());
                }
            }
        }
    }

    public a a(int i10, String str, boolean z10) {
        l lVarC = c(str);
        if (lVarC != null) {
            return lVarC.a(i10, z10);
        }
        return null;
    }

    public boolean a(int i10, String str, boolean z10, int i11, boolean z11, int i12, List<CampaignEx> list) {
        return a(i10, str, z10, i11, z11, i12, list, false, null);
    }

    public void b(boolean z10) {
        this.f53206a = z10;
        ConcurrentHashMap<String, l> concurrentHashMap = this.f53207b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value = it.next().getValue();
                if (value != null) {
                    value.e();
                }
            }
        }
    }

    public boolean a(int i10, String str, List<CampaignEx> list) {
        String str2;
        l lVarC = c(str);
        if (lVarC == null) {
            str2 = str;
            lVarC = createUnitCache(com.mbridge.msdk.foundation.controller.c.n().d(), str2, (CopyOnWriteArrayList<CampaignEx>) list, i10, (com.mbridge.msdk.videocommon.listener.a) null);
        } else {
            str2 = str;
        }
        if (lVarC != null) {
            return lVarC.a(list, str2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r13, java.lang.String r14, boolean r15, int r16, boolean r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, com.mbridge.msdk.foundation.same.report.metrics.e r21) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.b.a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.metrics.e):boolean");
    }

    public l createUnitCache(Context context, String str, CampaignEx campaignEx, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f53207b.containsKey(str)) {
            l lVar = this.f53207b.get(str);
            if (lVar == null) {
                lVar = new l(context, campaignEx, str, i10);
                this.f53207b.put(str, lVar);
            }
            if (i10 != 94 && i10 != 287) {
                lVar.a(aVar);
            } else {
                lVar.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
            }
            lVar.f(campaignEx);
            return lVar;
        }
        l lVar2 = new l(context, campaignEx, str, i10);
        if (i10 != 94 && i10 != 287) {
            lVar2.a(aVar);
        } else {
            lVar2.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
        }
        this.f53207b.put(str, lVar2);
        return lVar2;
    }

    public int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayListC;
        a value;
        CampaignEx campaignExH;
        ConcurrentHashMap<String, l> concurrentHashMap = this.f53207b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value2 = it.next().getValue();
                if (value2 != null && (copyOnWriteArrayListC = value2.c()) != null) {
                    int size = copyOnWriteArrayListC.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Map<String, a> map = copyOnWriteArrayListC.get(i10);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (campaignExH = value.h()) != null) {
                                String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.o();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    private void a(String str, CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2, CopyOnWriteArrayList<a> copyOnWriteArrayList3) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4;
        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
            if (campaignEx.getSecondRequestIndex() == 1 && (concurrentHashMap = this.f53209d) != null && (copyOnWriteArrayList4 = concurrentHashMap.get(str)) != null && copyOnWriteArrayList4.size() > 0 && copyOnWriteArrayList4.get(0).getLocalRequestId().equals(campaignEx.getLocalRequestId())) {
                return;
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> concurrentHashMap2 = this.f53208c;
        if (concurrentHashMap2 == null) {
            this.f53208c = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap2.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap3 = this.f53210e;
        if (concurrentHashMap3 == null) {
            this.f53210e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap3.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap4 = this.f53209d;
        if (concurrentHashMap4 == null) {
            this.f53209d = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap4.remove(str);
        }
        this.f53208c.put(str, copyOnWriteArrayList);
        this.f53209d.put(str, copyOnWriteArrayList2);
        this.f53210e.put(str, copyOnWriteArrayList3);
    }

    public void a(boolean z10) {
        if (z10) {
            if (this.f53206a) {
                return;
            }
        } else {
            this.f53206a = false;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.f53207b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().d();
            }
        }
    }

    public void a() {
        ConcurrentHashMap<String, l> concurrentHashMap = this.f53207b;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                a(entry.getValue(), entry.getKey());
            }
        }
    }

    private void a(l lVar, String str) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), str);
            if (cVarC == null) {
                return;
            }
            if (cVarC.l() == 2) {
                lVar.e();
            } else {
                lVar.d();
            }
        } catch (Exception e10) {
            q0.b("DownLoadManager", e10.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
                if (lVarE == null) {
                    lVarE = com.mbridge.msdk.setting.l.j(str);
                }
                if (lVarE.q() == 2) {
                    lVar.e();
                } else {
                    lVar.d();
                }
            } catch (Exception e11) {
                q0.b("DownLoadManager", e11.getMessage());
            }
        }
    }
}
