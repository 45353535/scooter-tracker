package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.D5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.my.target.common.StoreType;
import com.taurusx.tax.g.f0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f46451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map<String, Long> f46452o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Set<String> f46453p = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f46456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f46457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.e f46458e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.report.h f46460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f46461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f46462i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f46466m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f46459f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f46463j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46464k = true;

    class b implements g {
        b() {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f46471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f46472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46473c;

        c(boolean z10, boolean z11, CampaignEx campaignEx) {
            this.f46471a = z10;
            this.f46472b = z11;
            this.f46473c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f46471a && !a.f46451n && !a.this.f46465l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f46472b) {
                a.this.d(this.f46473c);
            }
            if (this.f46471a || a.this.f46459f == null || a.f46451n || a.this.f46465l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f46459f.onShowLoading(this.f46473c);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f46481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Campaign f46482b;

        e(boolean z10, Campaign campaign) {
            this.f46481a = z10;
            this.f46482b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f46481a && !a.f46451n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f46459f == null || a.f46451n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f46459f.onDismissLoading(this.f46482b);
        }
    }

    public a(Context context, String str) {
        this.f46456c = null;
        this.f46457d = null;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(str);
        this.f46461h = gVarD;
        if (gVarD == null) {
            this.f46461h = com.mbridge.msdk.setting.h.b().a();
        }
        this.f46462i = this.f46461h.K0();
        Context applicationContext = context.getApplicationContext();
        this.f46457d = applicationContext;
        this.f46454a = str;
        if (this.f46456c == null) {
            this.f46456c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f46460g = new com.mbridge.msdk.foundation.same.report.h(this.f46457d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "2000138" : "2000139" : "2000137" : "2000136";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f46457d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.f46457d.startActivity(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    public void c() {
        try {
            this.f46459f = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (cVarB != null) {
                        cVarB.a(cVarB.t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    q0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            cVarB2.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", cVarB2);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.retry.a.f46602l);
    }

    public boolean b(CampaignEx campaignEx) {
        Long l10;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f46452o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l10 = f46452o.get(id2)) != null) {
                if (l10.longValue() > System.currentTimeMillis() || f46453p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f46452o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11, int i10) {
        if (context == null) {
            return;
        }
        int i11 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        a(i10, campaignEx, i11);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C0492a(i11, str2, i10, campaignEx), str2, z10, z11, i10);
    }

    private static void a(int i10, CampaignEx campaignEx, int i11) {
        if (campaignEx != null) {
            try {
                String strB = b(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i11));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.f46461h;
            if (gVar != null) {
                return gVar.V();
            }
            return 1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    class C0492a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f46467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46470d;

        C0492a(int i10, String str, int i11, CampaignEx campaignEx) {
            this.f46467a = i10;
            this.f46468b = str;
            this.f46469c = i11;
            this.f46470d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f46467a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith("2")) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str;
                        }
                        eVar.a("failingURL", c1.d(this.f46468b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String strB = a.b(this.f46469c);
                if (this.f46470d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f46470d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String strB = a.b(this.f46469c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a("code", "");
                eVar.a("failingURL", c1.d(this.f46468b));
                eVar.a("net_ty", String.valueOf(this.f46467a));
                if (this.f46470d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f46470d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z10, z11, com.mbridge.msdk.click.retry.a.f46602l);
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f46476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f46477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f46478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f46479e;

        d(CampaignEx campaignEx, boolean z10, Boolean bool, List list, boolean z11) {
            this.f46475a = campaignEx;
            this.f46476b = z10;
            this.f46477c = bool;
            this.f46478d = list;
            this.f46479e = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.Object r11) {
            /*
                r10 = this;
                java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.f46453p
                if (r0 == 0) goto Ld
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f46475a
                java.lang.String r1 = r1.getId()
                r0.remove(r1)
            Ld:
                java.lang.String r1 = "CommonClickControl"
                r2 = 0
                if (r11 == 0) goto L63
                boolean r0 = r11 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L63
                r5 = r11
                com.mbridge.msdk.click.entity.JumpLoaderResult r5 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r5     // Catch: java.lang.Throwable -> L5a
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f46475a     // Catch: java.lang.Throwable -> L4b
                r11.setJumpResult(r5)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a r3 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r10.f46475a     // Catch: java.lang.Throwable -> L4b
                boolean r6 = r10.f46476b     // Catch: java.lang.Throwable -> L4b
                boolean r7 = com.mbridge.msdk.click.a.d(r3)     // Catch: java.lang.Throwable -> L4b
                java.lang.Boolean r8 = r10.f46477c     // Catch: java.lang.Throwable -> L4b
                java.util.List r9 = r10.f46478d     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
                boolean r11 = r5.isjumpDone()     // Catch: java.lang.Throwable -> L4b
                if (r11 == 0) goto L4f
                com.mbridge.msdk.click.a r11 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.db.g r11 = com.mbridge.msdk.click.a.e(r11)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.db.d r11 = com.mbridge.msdk.foundation.db.d.a(r11)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f46475a     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a r2 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                java.lang.String r2 = com.mbridge.msdk.click.a.f(r2)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.b.a(r11, r0, r2)     // Catch: java.lang.Throwable -> L4b
                goto L4f
            L4b:
                r0 = move-exception
                r11 = r0
                r2 = r5
                goto L5c
            L4f:
                com.mbridge.msdk.click.a r11 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                boolean r0 = r10.f46479e     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f46475a     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a.a(r11, r0, r2)     // Catch: java.lang.Throwable -> L4b
                r2 = r5
                goto L63
            L5a:
                r0 = move-exception
                r11 = r0
            L5c:
                java.lang.String r11 = r11.getMessage()
                com.mbridge.msdk.foundation.tools.q0.b(r1, r11)
            L63:
                com.mbridge.msdk.foundation.same.report.metrics.e r11 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Throwable -> L7f
                r11.<init>()     // Catch: java.lang.Throwable -> L7f
                java.lang.String r0 = "result"
                java.lang.String r3 = "1"
                r11.a(r0, r3)     // Catch: java.lang.Throwable -> L7f
                if (r2 == 0) goto L82
                java.lang.String r0 = "status_code"
                int r2 = r2.getStatusCode()     // Catch: java.lang.Throwable -> L7f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7f
                r11.a(r0, r2)     // Catch: java.lang.Throwable -> L7f
                goto L82
            L7f:
                r0 = move-exception
                r11 = r0
                goto Lad
            L82:
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f46475a     // Catch: java.lang.Throwable -> L7f
                if (r0 == 0) goto L97
                java.lang.String r0 = r0.getClickURL()     // Catch: java.lang.Throwable -> L7f
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7f
                if (r2 != 0) goto L97
                java.lang.String r2 = "tcp"
                boolean r0 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> L7f
                goto L98
            L97:
                r0 = -1
            L98:
                java.lang.String r2 = "net_ty"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7f
                r11.a(r2, r0)     // Catch: java.lang.Throwable -> L7f
                com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Throwable -> L7f
                java.lang.String r2 = "2000138"
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r10.f46475a     // Catch: java.lang.Throwable -> L7f
                r0.a(r2, r3, r11)     // Catch: java.lang.Throwable -> L7f
                goto Lb8
            Lad:
                boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r0 == 0) goto Lb8
                java.lang.String r11 = r11.getMessage()
                com.mbridge.msdk.foundation.tools.q0.b(r1, r11)
            Lb8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.d.a(java.lang.Object):void");
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        /* JADX WARN: Type inference failed for: r6v10, types: [int] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.Object r6, java.lang.String r7) {
            /*
                r5 = this;
                java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.f46453p
                if (r0 == 0) goto Ld
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f46475a
                java.lang.String r1 = r1.getId()
                r0.remove(r1)
            Ld:
                java.lang.String r0 = "CommonClickControl"
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r2 = r6 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L28
                if (r2 == 0) goto L2a
                r2 = r6
                com.mbridge.msdk.click.entity.JumpLoaderResult r2 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r2     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.click.a r1 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L25
                com.mbridge.msdk.click.entity.JumpLoaderResult r6 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r6     // Catch: java.lang.Throwable -> L25
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r5.f46475a     // Catch: java.lang.Throwable -> L25
                r4 = 1
                com.mbridge.msdk.click.a.a(r1, r6, r3, r4)     // Catch: java.lang.Throwable -> L25
                r1 = r2
                goto L2a
            L25:
                r6 = move-exception
                r1 = r2
                goto L47
            L28:
                r6 = move-exception
                goto L47
            L2a:
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.c(r6)     // Catch: java.lang.Throwable -> L28
                if (r6 == 0) goto L3d
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.c(r6)     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f46475a     // Catch: java.lang.Throwable -> L28
                r6.onRedirectionFailed(r2, r7)     // Catch: java.lang.Throwable -> L28
            L3d:
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                boolean r7 = r5.f46479e     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f46475a     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.click.a.a(r6, r7, r2)     // Catch: java.lang.Throwable -> L28
                goto L4e
            L47:
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.q0.b(r0, r6)
            L4e:
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f46475a     // Catch: java.lang.Throwable -> L63
                if (r6 == 0) goto L65
                java.lang.String r6 = r6.getClickURL()     // Catch: java.lang.Throwable -> L63
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L63
                if (r7 != 0) goto L65
                java.lang.String r7 = "tcp"
                boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r6 = move-exception
                goto L96
            L65:
                r6 = -1
            L66:
                com.mbridge.msdk.foundation.same.report.metrics.e r7 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Throwable -> L63
                r7.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "result"
                java.lang.String r3 = "2"
                r7.a(r2, r3)     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "net_ty"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L63
                r7.a(r2, r6)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L8a
                java.lang.String r6 = "status_code"
                int r1 = r1.getStatusCode()     // Catch: java.lang.Throwable -> L63
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L63
                r7.a(r6, r1)     // Catch: java.lang.Throwable -> L63
            L8a:
                com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Throwable -> L63
                java.lang.String r1 = "2000138"
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f46475a     // Catch: java.lang.Throwable -> L63
                r6.a(r1, r2, r7)     // Catch: java.lang.Throwable -> L63
                goto La1
            L96:
                boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r7 == 0) goto La1
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.q0.b(r0, r6)
            La1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.d.a(java.lang.Object, java.lang.String):void");
        }
    }

    public void a(String str) {
        this.f46454a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f46459f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.f46466m = jVar;
    }

    public void a(boolean z10) {
        this.f46464k = z10;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    public void a(CampaignEx campaignEx) {
        a aVar = this;
        if (campaignEx == null) {
            return;
        }
        try {
            if (b(campaignEx)) {
                c(campaignEx);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(aVar.f46456c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), aVar.f46454a);
                if (jumpLoaderResultB != null) {
                    if (jumpLoaderResultB.getNoticeurl() != null) {
                        jumpLoaderResultB.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    com.mbridge.msdk.click.b.a(dVarA, campaignEx, aVar.f46454a);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (v0.b(campaignEx)) {
                    MIMManager.b().a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (com.mbridge.msdk.click.c.d(aVar.f46457d, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = aVar.f46459f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, noticeUrl + "&opdptype=1", -1);
                        com.mbridge.msdk.click.b.a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = aVar.f46459f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.b().b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = aVar.f46459f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, str, -1);
                    aVar.a(aVar.f46457d, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = aVar.f46459f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (com.mbridge.msdk.click.c.d(aVar.f46457d, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = aVar.f46459f;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (aVar.f46457d != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    aVar.f46457d.sendBroadcast(intent);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("CommonClickControl", e10.getMessage());
                                    }
                                }
                            }
                            com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, str + "&opdptype=1", -1);
                            com.mbridge.msdk.click.b.a(campaignEx);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = aVar.f46459f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = aVar.f46459f;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(aVar.a(aVar.f46459f, campaignEx, appletsModel, aVar));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (appletsModel.isRequestTimesMaxPerDay()) {
                                if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                    campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                                }
                            } else {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = aVar.f46459f;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, aVar.a(aVar.f46459f, campaignEx, appletsModel, aVar));
                                return;
                            }
                        }
                    }
                }
                if (com.mbridge.msdk.util.b.b()) {
                    com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && com.mbridge.msdk.click.c.a(aVar.f46457d, campaignEx.getPackageName())) {
                    com.mbridge.msdk.click.c.b(aVar.f46457d, campaignEx.getPackageName());
                    if (com.mbridge.msdk.util.b.a()) {
                        com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, str, com.mbridge.msdk.foundation.same.a.N);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = aVar.f46459f;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                    } else {
                        aVar.a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = aVar.f46459f;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        u0.a(aVar.f46459f);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iB = aVar.b();
                if (com.mbridge.msdk.util.b.a() && linkType != 3) {
                    com.mbridge.msdk.click.b.a(aVar.f46457d, aVar.f46454a, campaignEx, str, -1);
                }
                boolean z10 = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith(f0.f66125c) || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add(StoreType.GOOGLE_PLAY);
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = aVar.f46459f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (u0.a.a(aVar.f46457d, campaignEx.getClickURL(), aVar.f46459f)) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = aVar.f46459f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    aVar.a(iB, campaignEx.getClickURL(), campaignEx, aVar.f46459f, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = aVar.f46459f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z10) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            aVar.a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = aVar.f46459f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = aVar.f46459f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = aVar.f46459f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    u0.a(aVar.f46457d, clickURL2, aVar.f46459f, campaignEx, arrayList);
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        return;
                    } else {
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = aVar.f46459f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = aVar.f46459f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = aVar.f46459f;
                        if (baseTrackingListener == null && (baseTrackingListener = aVar.f46466m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        try {
                            u0.a(aVar.f46457d, clickURL3, campaignEx, aVar, baseTrackingListener, arrayList);
                            aVar = aVar;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        u0.a(aVar.f46457d, clickURL3, campaignEx, aVar.f46459f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = aVar.f46459f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    u0.a(aVar.f46457d, clickURL3, aVar.f46459f, campaignEx, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = aVar.f46459f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iB == 2) {
                        u0.a(aVar.f46457d, clickURL3, campaignEx, aVar.f46459f, arrayList);
                    } else {
                        u0.a(aVar.f46457d, clickURL3, aVar.f46459f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = aVar.f46459f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                aVar.a(jumpLoaderResultB, campaignEx, false);
                return;
            }
            return;
        } catch (Throwable th3) {
            th = th3;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b("CommonClickControl", th.getMessage(), th);
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, 2, "context is null", this.f46454a);
            return;
        }
        boolean z10 = m0.E() == 1;
        boolean z11 = m0.D(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String strJ = com.mbridge.msdk.foundation.controller.c.n().j();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(strJ)) {
                        bindId = strJ;
                    }
                    Object objD = m0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object objNewInstance = cls.newInstance();
                    cls.getField("userName").set(objNewInstance, ghId);
                    cls.getField("path").set(objNewInstance, ghPath);
                    cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f46454a);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th2.getMessage(), this.f46454a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f46454a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f46454a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            u0.a(this.f46457d, campaignEx.getClickURL(), campaignEx, this.f46459f, list);
        } else {
            u0.a(this.f46457d, campaignEx.getClickURL(), this.f46459f, campaignEx, list);
        }
    }

    private void a(CampaignEx campaignEx, boolean z10, Boolean bool, List<String> list) {
        boolean z11;
        boolean z12;
        try {
            this.f46455b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f46459f;
            if (nativeTrackingListener == null || z10) {
                z11 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z11 = !this.f46459f.onInterceptDefaultLoadingDialog();
            }
            this.f46465l = false;
            boolean z13 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z10) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.f46463j, bool, list);
                }
                this.f46465l = true;
                this.f46463j = false;
                z13 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f46456c).c(campaignEx.getId(), this.f46454a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f46456c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f46454a);
                if (jumpLoaderResultB != null && !z10) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z13) {
                        a(campaignEx, jumpLoaderResultB, z13, this.f46463j, bool, list);
                        this.f46465l = true;
                        this.f46463j = false;
                        z12 = false;
                    }
                    z12 = z13;
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z10) {
                        boolean zA = u0.a.a(this.f46457d, "market://details?id=" + campaignEx.getPackageName(), this.f46459f);
                        if (list != null) {
                            list.add(StoreType.GOOGLE_PLAY);
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f46459f;
                        if (nativeTrackingListener2 != null && z13) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f46459f.onFinishRedirection(campaignEx, null);
                        }
                        this.f46465l = true;
                        z13 = false;
                    }
                    if (z10) {
                        this.f46465l = true;
                        this.f46463j = false;
                        z12 = false;
                    }
                    z12 = z13;
                }
                new Handler(Looper.getMainLooper()).post(new c(z11, z10, campaignEx));
                com.mbridge.msdk.click.e eVar = this.f46458e;
                if (eVar != null) {
                    eVar.a();
                }
                Set<String> set = f46453p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f46459f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f46459f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f46453p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.f46457d);
                this.f46458e = eVar2;
                eVar2.a(this.f46454a, campaignEx, new d(campaignEx, z12, bool, list, z11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z10, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f46455b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iS = m0.s(this.f46457d);
            eVar.e(iS);
            eVar.h(m0.a(this.f46457d, iS));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i10);
            eVar.c(jCurrentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), D5.N));
            }
            eVar.b((this.f46455b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f46454a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), D5.N));
            }
            if (this.f46462i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), D5.N));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), D5.N));
                }
            }
            if (z10) {
                this.f46460g.a("click_jump_error", eVar, this.f46454a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> arrayListA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (arrayListA == null || arrayListA.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = arrayListA.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(it.next());
            }
        } catch (Throwable th2) {
            q0.b("CommonClickControl", th2.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith(f0.f66125c) && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.f46457d, this.f46454a, campaignEx, this.f46459f);
                    return;
                }
                if (u0.a.a(this.f46457d, str, this.f46459f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    u0.a.a(this.f46457d, "market://details?id=" + campaignEx.getPackageName(), this.f46459f);
                    return;
                }
                if (b() == 2) {
                    u0.a(this.f46457d, campaignEx.getClickURL(), campaignEx, this.f46459f, new ArrayList());
                } else {
                    u0.a(this.f46457d, campaignEx.getClickURL(), this.f46459f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i10 == 2) {
                u0.a(this.f46457d, str, campaignEx, nativeTrackingListener, list);
            } else {
                u0.a(this.f46457d, str, nativeTrackingListener, campaignEx, list);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        boolean z11 = true;
        boolean z12 = false;
        if (z10) {
            try {
                int i11 = Integer.parseInt(campaignEx.getLandingType());
                if (i11 == 1) {
                    u0.a(this.f46457d, jumpLoaderResult.getUrl(), this.f46459f, campaignEx, list);
                } else if (i11 == 2) {
                    u0.a(this.f46457d, jumpLoaderResult.getUrl(), campaignEx, this.f46459f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (u0.a.a(this.f46457d, "market://details?id=" + campaignEx.getPackageName(), this.f46459f)) {
                        if (list != null) {
                            try {
                                list.add(StoreType.GOOGLE_PLAY);
                            } catch (Throwable th2) {
                                th = th2;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z11;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f46459f, list);
                    }
                } else {
                    a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f46459f, list);
                }
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
        if (z12) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f46459f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z12;
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f46459f;
            if (nativeTrackingListener2 != null && z10) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z12;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.f46457d, this.f46454a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                u0.a(this.f46457d, campaignEx.getClickURL(), this.f46459f, campaignEx, list);
                z11 = true;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th2.getMessage(), th2);
                }
                return false;
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z11) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f46459f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z11;
            }
        } else {
            if (com.mbridge.msdk.util.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f46459f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:2:0x0000, B:5:0x0006, B:9:0x0010, B:11:0x001a, B:13:0x0020, B:17:0x0032, B:20:0x0040, B:22:0x0046, B:26:0x0056, B:28:0x005a, B:30:0x006c, B:34:0x0077, B:36:0x0081, B:38:0x008b, B:41:0x009b, B:43:0x00a9, B:50:0x00ec, B:53:0x00f2, B:74:0x014e, B:76:0x015c, B:78:0x0164, B:82:0x016c, B:77:0x0161, B:45:0x00b7, B:47:0x00c1, B:49:0x00e0, B:56:0x00fe, B:57:0x010b, B:60:0x0111, B:63:0x011c, B:65:0x0122, B:67:0x0126, B:69:0x012c, B:71:0x0138, B:73:0x0147, B:85:0x0176, B:87:0x017d), top: B:91:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r10, com.mbridge.msdk.click.entity.JumpLoaderResult r11, boolean r12, boolean r13, java.lang.Boolean r14, java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    private boolean a(int i10, String str) {
        try {
            return i10 == 2 ? u0.a.b(str) : !TextUtils.isEmpty(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f46457d.sendBroadcast(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i10));
            eVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", e10.getMessage());
            }
        }
    }
}
