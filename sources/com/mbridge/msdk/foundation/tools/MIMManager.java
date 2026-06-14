package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f48914i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f48915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f48917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f48918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f48919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f48920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile g f48921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f48922h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a(C4240b4.i.W, URLEncoder.encode("m_mini_card", D5.N));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f48255r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a("event", String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48923a;

        a(Context context) {
            this.f48923a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f48915a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f48919e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f48919e == null || !MIMManager.this.f48919e.booleanValue() || this.f48923a == null) {
                    return;
                }
                try {
                    MIMManager.this.f48921g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f48923a.registerReceiver(MIMManager.this.f48921g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f48926b;

        b(Context context, CampaignEx campaignEx) {
            this.f48925a = context;
            this.f48926b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f48925a, this.f48926b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f48929b;

        c(Context context, CampaignEx campaignEx) {
            this.f48928a = context;
            this.f48929b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f48928a, this.f48929b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f48932b;

        d(Context context, CampaignEx campaignEx) {
            this.f48931a = context;
            this.f48932b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    MIMManager.this.f(this.f48931a, this.f48932b);
                } catch (Exception e10) {
                    q0.b("MIMManager", e10.getMessage());
                    if (MIMManager.this.f48917c != null && MIMManager.this.f48917c.contains(this.f48932b)) {
                    }
                }
                if (MIMManager.this.f48917c != null && MIMManager.this.f48917c.contains(this.f48932b)) {
                    MIMManager.this.f48917c.remove(this.f48932b);
                }
            } catch (Throwable th2) {
                if (MIMManager.this.f48917c != null && MIMManager.this.f48917c.contains(this.f48932b)) {
                    MIMManager.this.f48917c.remove(this.f48932b);
                }
                throw th2;
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f48936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f48937d;

        e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f48934a = context;
            this.f48935b = str;
            this.f48936c = campaignEx;
            this.f48937d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f48934a == null || TextUtils.isEmpty(this.f48935b) || this.f48936c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000100");
                jSONObject.put("network_type", m0.s(this.f48934a));
                jSONObject.put("rid", this.f48936c.getRequestId());
                jSONObject.put("rid_n", this.f48936c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f48936c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f48936c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f48255r.get(this.f48936c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put("cid", this.f48936c.getId());
                jSONObject.put("status", this.f48935b);
                jSONObject.put("code", this.f48937d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("MIMManager", th2.getMessage());
            }
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f48939a = new MIMManager(null);
    }

    private static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString("packageName", "");
                if (i10 != -1 && !TextUtils.isEmpty(string) && (campaignExA = MIMManager.b().a(string)) != null) {
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f48916b++;
    }

    public void g() {
        int i10 = this.f48916b - 1;
        this.f48916b = i10;
        if (i10 <= 0) {
            a(this.f48918d);
        }
    }

    public void h() {
        try {
            if (this.f48922h == null) {
                this.f48922h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f48922h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f48922h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f48922h);
                }
                this.f48920f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f48917c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f48917c = null;
                this.f48922h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    private MIMManager() {
        this.f48916b = 0;
        this.f48917c = new CopyOnWriteArrayList<>();
        this.f48915a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                int length = strArrB.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrB[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            return f48914i == null ? "" : String.format("[%s]", f48914i);
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f48919e;
    }

    public static MIMManager b() {
        return f.f48939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                int length = strArrZ.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrZ[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                int length = strArrA.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrA[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    CampaignEx c() {
        return this.f48920f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f48918d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f48919e != null && campaignEx != null && this.f48919e.booleanValue()) {
                this.f48920f = campaignEx;
                this.f48917c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f48922h == null) {
                    h();
                }
                this.f48920f = campaignEx;
                this.f48917c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f48919e == null || campaignEx == null || !this.f48919e.booleanValue()) {
                return;
            }
            this.f48920f = null;
            try {
                this.f48917c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b("MIMManager", e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f48920f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f48920f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f48917c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f48917c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f48914i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[PHI: r4
  0x0030: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:20:0x002e, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "MIMManager"
            if (r4 == 0) goto L4a
            r1 = 0
            com.mbridge.msdk.foundation.tools.MIMManager$g r2 = r3.f48921g     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            if (r2 == 0) goto L13
            com.mbridge.msdk.foundation.tools.MIMManager$g r2 = r3.f48921g     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            goto L13
        Lf:
            r4 = move-exception
            goto L3a
        L11:
            r4 = move-exception
            goto L23
        L13:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r2 = r3.f48922h     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            if (r2 == 0) goto L1c
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r2 = r3.f48922h     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
        L1c:
            r3.f48920f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r3.f48917c
            if (r4 == 0) goto L33
            goto L30
        L23:
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf
            com.mbridge.msdk.foundation.tools.q0.a(r0, r4)     // Catch: java.lang.Throwable -> Lf
            r3.f48920f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r3.f48917c
            if (r4 == 0) goto L33
        L30:
            r4.clear()
        L33:
            r3.f48917c = r1
            r3.f48921g = r1
            r3.f48918d = r1
            goto L4a
        L3a:
            r3.f48920f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r3.f48917c
            if (r0 == 0) goto L43
            r0.clear()
        L43:
            r3.f48917c = r1
            r3.f48921g = r1
            r3.f48918d = r1
            throw r4
        L4a:
            r3.i()     // Catch: java.lang.Throwable -> L4e
            goto L56
        L4e:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r4)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.a(android.content.Context):void");
    }

    void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
