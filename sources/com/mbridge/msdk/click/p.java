package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes10.dex */
public class p extends f implements a.InterfaceC0520a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f46573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f46574c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f46577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f46578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f46579h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46575d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f46580i = new Handler(Looper.getMainLooper());

    class a implements k {
        a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f46574c = jumpLoaderResult;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f46573b != null) {
                if (p.this.f46574c.isSuccess()) {
                    p.this.f46573b.a(p.this.f46574c);
                } else {
                    p.this.f46573b.a(p.this.f46574c, p.this.f46574c.getMsg());
                }
            }
        }
    }

    private class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f46584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f46587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f46588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f46590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f46591i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f46583a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f46592j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f46584b = context;
            this.f46585c = str;
            this.f46586d = str2;
            this.f46587e = str3;
            this.f46588f = campaignEx;
            this.f46589g = z10;
            this.f46590h = z11;
            this.f46591i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f46588f, p.this.f46574c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f46573b != null) {
                p.this.f46573b.b(null);
            }
            p.this.f46574c = new JumpLoaderResult();
            p.this.f46574c.setUrl(this.f46585c);
            p.this.f46574c = a(this.f46585c, this.f46589g, this.f46590h, this.f46588f, this.f46591i);
            if (!TextUtils.isEmpty(p.this.f46574c.getExceptionMsg())) {
                p.this.f46574c.setSuccess(true);
            }
            if (p.this.f46575d && p.this.f46574c.isSuccess()) {
                if (p.this.f46579h != null) {
                    p.this.f46574c.setStatusCode(p.this.f46579h.f46501f);
                }
                q.a(this.f46588f, p.this.f46574c, p.this.f46579h, this.f46586d, this.f46587e, this.f46584b, this.f46592j, this.f46583a);
            }
        }

        class a implements o.f {
            a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f46574c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f46574c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f46574c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f46574c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f46583a.release();
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
        
            r2.setjumpDone(true);
            r2.setUrl(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[EDGE_INSN: B:82:0x01ed->B:75:0x01ed BREAK  A[LOOP:0: B:23:0x005f->B:68:0x0198], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r14, boolean r15, boolean r16, com.mbridge.msdk.foundation.entity.CampaignEx r17, int r18) {
            /*
                Method dump skipped, instruction units count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p.c.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f46577f = context;
        this.f46578g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f46573b = gVar;
        this.f46576e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f46577f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f46573b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f46577f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f46578g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0520a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f46575d) {
            this.f46580i.post(new b());
        }
    }
}
