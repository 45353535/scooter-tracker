package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes10.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f46525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CampaignEx f46529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f46531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f46532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f46533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f46534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f46535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f46536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f46537n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f46524a = new Semaphore(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.f f46538o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f46525b = bVar.c();
        this.f46526c = bVar.e();
        this.f46527d = bVar.b();
        this.f46528e = bVar.d();
        this.f46529f = bVar.a();
        this.f46530g = bVar.g();
        this.f46531h = bVar.i();
        this.f46532i = bVar.f();
        this.f46533j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f46536m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f46535l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f46526c);
        JumpLoaderResult jumpLoaderResultC = c(this.f46526c);
        this.f46535l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f46535l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            k kVar = this.f46537n;
            if (kVar != null) {
                kVar.a(this.f46535l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f46535l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f46537n;
            if (kVar2 != null) {
                kVar2.a(this.f46535l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f46534k;
        if (aVar != null && (jumpLoaderResult = this.f46535l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f46501f);
        }
        m.a(this.f46529f, this.f46535l, this.f46534k, this.f46527d, this.f46528e, this.f46525b, this.f46538o, this.f46537n, this.f46524a);
    }

    class a implements o.f {
        a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f46535l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.f46535l.setSuccess(true);
                    if (l.this.f46537n != null) {
                        l.this.f46537n.a(l.this.f46535l);
                    }
                    l.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f46535l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f46535l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f46529f, this.f46535l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
    
        r1.setjumpDone(true);
        r1.setUrl(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163 A[LOOP:0: B:15:0x003e->B:65:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b A[EDGE_INSN: B:71:0x016b->B:66:0x016b BREAK  A[LOOP:0: B:15:0x003e->B:65:0x0163], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult c(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.l.c(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public void a(g gVar) {
        this.f46536m = gVar;
    }

    public void a(k kVar) {
        this.f46537n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f46524a.release();
    }

    private String a(String str) {
        if (this.f46533j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f46525b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f46529f, str) : str;
    }
}
