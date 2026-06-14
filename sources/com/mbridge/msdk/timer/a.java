package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f51783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f51784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f51787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f51788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f51789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f51790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f51791k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    class HandlerC0581a extends Handler {
        HandlerC0581a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f51782b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f51781a);
                        sendMessageDelayed(obtainMessage(1), a.this.f51781a);
                    }
                } finally {
                }
            }
        }
    }

    class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f51793a;

        b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f51793a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f51791k.sendMessage(a.this.f51791k.obtainMessage(2));
            this.f51793a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f51791k.sendMessage(a.this.f51791k.obtainMessage(2));
            this.f51793a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f51795a = new a(null);
    }

    /* synthetic */ a(HandlerC0581a handlerC0581a) {
        this();
    }

    private a() {
        this.f51782b = false;
        this.f51783c = new LinkedList<>();
        this.f51784d = new LinkedList<>();
        this.f51785e = 0;
        this.f51786f = 0;
        this.f51791k = new HandlerC0581a();
    }

    private void b() {
        if (this.f51790j == null) {
            this.f51790j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f51789i == null) {
            this.f51789i = l.a(this.f51790j);
        }
        List<i> listA = this.f51789i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f51784d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f51789i.a(94);
        if (listA2 != null) {
            this.f51783c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f51787g == null) {
            this.f51787g = e.a(this.f51790j);
        }
        if (this.f51788h == null) {
            this.f51788h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f51783c;
            if (linkedList != null && linkedList.size() > 0 && this.f51785e < this.f51783c.size()) {
                i iVar = this.f51783c.get(this.f51785e);
                this.f51785e++;
                if (a(iVar)) {
                    a(iVar.d(), iVar.g(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f51784d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f51786f >= this.f51784d.size()) {
                return;
            }
            i iVar2 = this.f51784d.get(this.f51786f);
            this.f51786f++;
            if (a(iVar2)) {
                c(iVar2.d(), iVar2.g());
            }
        } catch (Throwable th2) {
            q0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    public static a a() {
        return c.f51795a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f51783c;
        if (linkedList == null || linkedList.size() <= 0 || this.f51785e == 0 || this.f51783c.size() <= this.f51785e) {
            LinkedList<i> linkedList2 = this.f51784d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f51786f == 0 || this.f51784d.size() == this.f51786f) {
                this.f51786f = 0;
                this.f51785e = 0;
                Handler handler = this.f51791k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            String strG = iVar.g();
            try {
                if (this.f51787g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f51788h;
                int iA = this.f51787g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f51791k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
            q0.b("LoopTimer", th.getMessage(), th);
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f51781a = j10;
        this.f51782b = false;
        Handler handler = this.f51791k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f51781a);
    }

    public void b(String str, String str2) {
        if (this.f51783c.contains(str2)) {
            return;
        }
        this.f51783c.add(new i(str, str2, 94));
        l lVar = this.f51789i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f51789i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f51784d.contains(str2)) {
            return;
        }
        this.f51784d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f51789i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f51783c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f51783c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f51784d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f51784d.remove(str);
            }
        }
        b(str);
    }
}
