package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53158a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53159b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53160c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53161d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53162e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53163f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53164g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53165h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53166i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0600a> f53167j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0600a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f53168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53169b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f53168a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f53168a;
        }

        public boolean c() {
            return this.f53169b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f53168a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f53168a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f53169b = z10;
        }
    }

    public static void a(String str, C0600a c0600a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f53165h.put(str, c0600a);
                return;
            } else {
                f53164g.put(str, c0600a);
                return;
            }
        }
        if (z11) {
            f53167j.put(str, c0600a);
        } else {
            f53166i.put(str, c0600a);
        }
    }

    public static C0600a b(String str) {
        if (f53164g.containsKey(str)) {
            return f53164g.get(str);
        }
        if (f53165h.containsKey(str)) {
            return f53165h.get(str);
        }
        if (f53166i.containsKey(str)) {
            return f53166i.get(str);
        }
        if (f53167j.containsKey(str)) {
            return f53167j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0600a> entry : f53164g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f53164g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0600a> entry : f53165h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f53165h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f53164g.containsKey(str)) {
            f53164g.remove(str);
        }
        if (f53166i.containsKey(str)) {
            f53166i.remove(str);
        }
        if (f53165h.containsKey(str)) {
            f53165h.remove(str);
        }
        if (f53167j.containsKey(str)) {
            f53167j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f53164g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f53164g.remove(str2);
                }
            }
        } else {
            f53164g.clear();
        }
        f53165h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0600a> concurrentHashMap = f53159b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0600a> concurrentHashMap2 = f53162e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0600a> concurrentHashMap3 = f53158a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0600a> concurrentHashMap4 = f53161d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0600a> concurrentHashMap5 = f53160c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0600a> concurrentHashMap6 = f53163f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f53166i.clear();
        f53167j.clear();
    }

    public static C0600a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0600a> concurrentHashMap = f53158a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f53158a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0600a> concurrentHashMap2 = f53161d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f53161d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0600a> concurrentHashMap3 = f53160c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f53160c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0600a> concurrentHashMap4 = f53163f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f53163f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0600a> concurrentHashMap5 = f53159b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f53159b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0600a> concurrentHashMap6 = f53162e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f53162e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0600a c0600a) {
        try {
            if (i10 == 94) {
                if (f53162e == null) {
                    f53162e = new ConcurrentHashMap<>();
                }
                f53162e.put(str, c0600a);
            } else if (i10 == 287) {
                if (f53163f == null) {
                    f53163f = new ConcurrentHashMap<>();
                }
                f53163f.put(str, c0600a);
            } else if (i10 != 288) {
                if (f53158a == null) {
                    f53158a = new ConcurrentHashMap<>();
                }
                f53158a.put(str, c0600a);
            } else {
                if (f53161d == null) {
                    f53161d = new ConcurrentHashMap<>();
                }
                f53161d.put(str, c0600a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0600a c0600a) {
        try {
            if (i10 == 94) {
                if (f53159b == null) {
                    f53159b = new ConcurrentHashMap<>();
                }
                f53159b.put(str, c0600a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f53160c == null) {
                    f53160c = new ConcurrentHashMap<>();
                }
                f53160c.put(str, c0600a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
