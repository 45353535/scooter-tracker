package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f46595e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f46596f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f46597g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f46598h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f46599i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f46600j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f46601k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f46602l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f46603m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f46604n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f46605o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f46606p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f46607q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f46608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f46609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f46610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f46611d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    class C0493a extends BroadcastReceiver {
        C0493a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f46611d.sendEmptyMessage(2);
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f46613a = new a(null);
    }

    private static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f46614k);
                }
            }
        }
    }

    /* synthetic */ a(C0493a c0493a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f46609b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f46615l);
            }
        }
    }

    private a() {
        this.f46608a = new ConcurrentHashMap<>();
        this.f46609b = new com.mbridge.msdk.click.retry.c(f46598h);
        this.f46611d = new c(Looper.getMainLooper());
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        f46597g = gVarB.e0();
        f46596f = gVarB.g0() * 1000;
        f46599i = gVarB.h0() * 1000;
        f46600j = gVarB.d0();
        f46601k = gVarB.f0();
        a();
    }

    public static a b() {
        return b.f46613a;
    }

    private boolean b(int i10) {
        return i10 == f46603m || i10 == f46604n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f46595e, "").replace(C4240b4.j.f42670c + f46595e, "");
        if (this.f46608a == null) {
            this.f46608a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f46608a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f46615l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f46600j == 0) && ((!b(i10) || f46601k == 0) && i10 != f46607q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f46599i)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f46614k) {
                if (bVarRemove.e() <= f46597g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f46614k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f46607q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f46609b == null) {
            this.f46609b = new com.mbridge.msdk.click.retry.c(f46598h);
        }
        this.f46609b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f46611d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f46611d.sendMessageDelayed(messageObtainMessage, f46596f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String str2;
        com.mbridge.msdk.click.retry.c cVar = this.f46609b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f46609b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f46608a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f46599i) || bVar.e() >= f46597g || i10 == com.mbridge.msdk.click.retry.b.f46615l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) f46599i)) {
                bVarA.a(i10);
                this.f46608a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    str2 = str + "?" + f46595e;
                } else {
                    str2 = str + C4240b4.j.f42670c + f46595e;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f46615l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f46610c == null) {
                this.f46610c = new C0493a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f46610c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f46606p || i10 == f46605o;
    }
}
