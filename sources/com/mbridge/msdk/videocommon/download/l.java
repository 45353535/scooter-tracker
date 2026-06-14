package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f53239c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f53241e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f53244h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f53246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f53247k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53249m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f53252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53253q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f53237a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53238b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53240d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f53242f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f53243g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f53245i = 3600;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53248l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.mbridge.msdk.setting.l f53250n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    com.mbridge.msdk.setting.l f53251o = null;

    class a implements c {
        a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f53238b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f53238b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f53249m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f53253q = zB;
            if (zB) {
                this.f53246j = str;
                this.f53249m = i10;
                this.f53252p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f53252p = null;
            this.f53253q = false;
        }
        this.f53244h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f53237a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f53246j = str;
        this.f53249m = i10;
        a(this.f53237a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f53253q || (kVar = this.f53252p) == null) ? this.f53243g : kVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:11:0x0016, B:13:0x001f, B:16:0x0025, B:17:0x002b, B:19:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:28:0x0058, B:31:0x005f, B:33:0x0065, B:34:0x0067, B:37:0x0073, B:38:0x0083, B:40:0x0094, B:42:0x0098, B:43:0x00a0, B:44:0x00a4, B:50:0x00b9, B:52:0x00bd, B:53:0x00d1, B:55:0x00d5, B:57:0x00db, B:59:0x00df, B:61:0x00e3, B:62:0x00f7, B:64:0x00fb, B:76:0x0129, B:78:0x012e, B:80:0x0134, B:84:0x016b, B:85:0x016f, B:87:0x0174, B:91:0x017c, B:94:0x0181, B:96:0x0185, B:97:0x018e, B:99:0x0192, B:103:0x019c, B:104:0x01a0, B:106:0x01c2, B:109:0x01c7, B:111:0x01cb, B:115:0x01d9, B:119:0x01e2, B:121:0x01ed, B:123:0x01f1, B:126:0x01f5, B:129:0x01fb, B:131:0x0206, B:135:0x020e, B:136:0x0213, B:142:0x0220, B:141:0x021d, B:65:0x0100, B:67:0x0104, B:71:0x0119, B:72:0x011f, B:74:0x0123, B:143:0x0225), top: B:150:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.d():void");
    }

    public void e() {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f53243g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f53243g) {
                            if (map != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.o() == 1) {
                                        value.c("playing and stop download");
                                        value.g();
                                        this.f53243g.remove(map);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th3.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f53237a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f53237a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f53237a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f53237a);
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f53251o == null) {
                    this.f53251o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f53246j);
                }
                return this.f53251o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f53247k == null) {
                this.f53247k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f53246j, false);
            }
            return this.f53247k.w();
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.a(aVar);
        } else {
            this.f53239c = aVar;
        }
    }

    class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f53255a;

        b(CampaignEx campaignEx) {
            this.f53255a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f53239c != null) {
                l.this.f53239c.a(str);
            }
            if (l.this.f53241e == null || l.this.f53241e.size() <= 0 || this.f53255a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f53241e.get(this.f53255a.getRequestId() + "_" + this.f53255a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f53241e.remove(this.f53255a.getRequestId() + "_" + this.f53255a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f53239c != null) {
                l.this.f53239c.a(str, str2);
            }
            CampaignEx campaignEx = this.f53255a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f53255a.getRsIgnoreCheckRule().size() <= 0 || !this.f53255a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.f53241e == null || l.this.f53241e.size() <= 0 || this.f53255a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f53241e.get(this.f53255a.getRequestId() + "_" + this.f53255a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.f53241e.remove(this.f53255a.getRequestId() + "_" + this.f53255a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            q0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f53241e == null) {
            this.f53241e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f53241e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f53243g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f53243g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f53243g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.n() > this.f53245i * 1000 && value.o() == 1) {
                                    value.c("download timeout");
                                    value.c(this.f53248l);
                                    value.g();
                                    this.f53243g.remove(map);
                                    i10--;
                                }
                                if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                    value.g();
                                    this.f53243g.remove(map);
                                    i10--;
                                }
                            }
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:85|86|116|91|(1:93)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0202, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0204, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("UnitCacheCtroller", r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0213, code lost:
    
        throw r12;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.util.List):void");
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(Reporting.EventType.CACHE, 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f53249m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f53253q = zB;
            if (zB) {
                this.f53246j = str;
                this.f53249m = i10;
                this.f53252p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f53252p = null;
            this.f53253q = false;
        }
        this.f53244h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f53237a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f53246j = str;
        this.f53249m = i10;
        a(this.f53237a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0194 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.videocommon.download.a b(int r25, boolean r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.b(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    private boolean d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f53243g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f53243g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f53243g.get(i10);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.h() != null && value.t()) {
                                    value.y();
                                    this.f53243g.remove(map);
                                    i10--;
                                }
                            }
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0255 A[PHI: r16
  0x0255: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:134:0x0226, B:139:0x0234, B:147:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r27, int r28, boolean r29, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r30, boolean r31, com.mbridge.msdk.foundation.same.report.metrics.e r32) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.metrics.e):java.util.List");
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f53243g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f53243g) != null && copyOnWriteArrayList.size() > 0) {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f53243g) {
                            if (map != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f53243g.remove(map);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.f53248l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j10 > 0 && jM * 100 >= j10 * ((long) i10)) {
            if (i10 != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExH = aVar.h();
        if (campaignExH != null) {
            if (campaignExH.getRsIgnoreCheckRule() != null && campaignExH.getRsIgnoreCheckRule().size() > 0 && campaignExH.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExH.getIsTimeoutCheckVideoStatus() == 1 && campaignExH.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExH.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                    campaignExH.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f53253q && (kVar = this.f53252p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f53243g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f53243g) {
                        if (map != null && map.containsKey(str)) {
                            return map.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } finally {
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.f53250n;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("UnitCacheCtroller", e10.getMessage());
            return 100;
        }
    }
}
