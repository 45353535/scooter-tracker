package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C4240b4;
import com.ironsource.C4291e4;
import com.ironsource.C4326g5;
import com.ironsource.C4417lc;
import com.ironsource.C4462o4;
import com.ironsource.C4500q8;
import com.ironsource.C4509r1;
import com.ironsource.C4516r8;
import com.ironsource.C4533s8;
import com.ironsource.C4614x4;
import com.ironsource.C4618x8;
import com.ironsource.C4631y4;
import com.ironsource.C4635y8;
import com.ironsource.D5;
import com.ironsource.EnumC4225a7;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4546t4;
import com.ironsource.InterfaceC4563u4;
import com.ironsource.InterfaceC4580v4;
import com.ironsource.Kb;
import com.ironsource.L;
import com.ironsource.Lb;
import com.ironsource.Q3;
import com.ironsource.S7;
import com.ironsource.V4;
import com.ironsource.W4;
import com.ironsource.W5;
import com.ironsource.X5;
import com.ironsource.Xd;
import com.ironsource.Y6;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.yg;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f45039b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CountDownTimer f45041d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S7 f45044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yg f45045h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C4417lc f45048k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45038a = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4500q8.b f45040c = C4500q8.b.None;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q3 f45042e = new Q3("NativeCommandExecutor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q3 f45043f = new Q3("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, l.a> f45046i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, l.b> f45047j = new HashMap();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45050b;

        a(JSONObject jSONObject, InterfaceC4563u4 interfaceC4563u4) {
            this.f45049a = jSONObject;
            this.f45050b = interfaceC4563u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45049a, this.f45050b);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f45052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f45053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45054c;

        b(V4 v42, Map map, InterfaceC4563u4 interfaceC4563u4) {
            this.f45052a = v42;
            this.f45053b = map;
            this.f45054c = interfaceC4563u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45052a, this.f45053b, this.f45054c);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ V4 f45058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4546t4 f45059d;

        c(String str, String str2, V4 v42, InterfaceC4546t4 interfaceC4546t4) {
            this.f45056a = str;
            this.f45057b = str2;
            this.f45058c = v42;
            this.f45059d = interfaceC4546t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45056a, this.f45057b, this.f45058c, this.f45059d);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4546t4 f45062b;

        d(JSONObject jSONObject, InterfaceC4546t4 interfaceC4546t4) {
            this.f45061a = jSONObject;
            this.f45062b = interfaceC4546t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45061a, this.f45062b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0475e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f45064a;

        RunnableC0475e(V4 v42) {
            this.f45064a = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45064a);
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f45066a;

        f(V4 v42) {
            this.f45066a = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.b(this.f45066a);
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f45068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f45069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4546t4 f45070c;

        g(V4 v42, Map map, InterfaceC4546t4 interfaceC4546t4) {
            this.f45068a = v42;
            this.f45069b = map;
            this.f45070c = interfaceC4546t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45068a, this.f45069b, this.f45070c);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f45072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f45073b;

        h(l.a aVar, f.c cVar) {
            this.f45072a = aVar;
            this.f45073b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.f45039b != null) {
                if (this.f45072a != null) {
                    eVar.f45046i.put(this.f45073b.f(), this.f45072a);
                }
                e.this.f45039b.a(this.f45073b, this.f45072a);
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45075a;

        i(JSONObject jSONObject) {
            this.f45075a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.b(this.f45075a);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a();
                e.this.f45039b = null;
            }
        }
    }

    class k extends CountDownTimer {
        k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f45038a, "Global Controller Timer Finish");
            e.this.d(C4240b4.c.f42532k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f45038a, "Global Controller Timer Tick " + j10);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45081b;

        m(String str, String str2) {
            this.f45080a = str;
            this.f45081b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f45039b = eVar.b(eVar.f45045h.b(), e.this.f45045h.d(), e.this.f45045h.f(), e.this.f45045h.e(), e.this.f45045h.g(), e.this.f45045h.c(), this.f45080a, this.f45081b);
                e.this.f45039b.b();
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                e.this.d(Log.getStackTraceString(th2));
            }
        }
    }

    class n extends CountDownTimer {
        n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f45038a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C4240b4.c.f42532k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f45038a, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ V4 f45086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4580v4 f45087d;

        o(String str, String str2, V4 v42, InterfaceC4580v4 interfaceC4580v4) {
            this.f45084a = str;
            this.f45085b = str2;
            this.f45086c = v42;
            this.f45087d = interfaceC4580v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45084a, this.f45085b, this.f45086c, this.f45087d);
            }
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4580v4 f45090b;

        p(JSONObject jSONObject, InterfaceC4580v4 interfaceC4580v4) {
            this.f45089a = jSONObject;
            this.f45090b = interfaceC4580v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45089a, this.f45090b);
            }
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ V4 f45094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45095d;

        q(String str, String str2, V4 v42, InterfaceC4563u4 interfaceC4563u4) {
            this.f45092a = str;
            this.f45093b = str2;
            this.f45094c = v42;
            this.f45095d = interfaceC4563u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45092a, this.f45093b, this.f45094c, this.f45095d);
            }
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45098b;

        r(String str, InterfaceC4563u4 interfaceC4563u4) {
            this.f45097a = str;
            this.f45098b = interfaceC4563u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.a(this.f45097a, this.f45098b);
            }
        }
    }

    class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4 f45100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f45101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45102c;

        s(V4 v42, Map map, InterfaceC4563u4 interfaceC4563u4) {
            this.f45100a = v42;
            this.f45101b = map;
            this.f45102c = interfaceC4563u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4618x8.a(Xd.f42076j, new C4533s8().a(D5.f40575v, this.f45100a.f()).a(D5.f40576w, C4635y8.a(this.f45100a, C4500q8.e.Interstitial)).a(D5.f40577x, Boolean.valueOf(C4635y8.a(this.f45100a))).a(D5.I, Long.valueOf(L.f41219a.b(this.f45100a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.f45039b;
            if (lVar != null) {
                lVar.b(this.f45100a, this.f45101b, this.f45102c);
            }
        }
    }

    public e(Context context, C4291e4 c4291e4, W4 w42, S7 s72, int i10, JSONObject jSONObject, String str, String str2, C4417lc c4417lc) {
        this.f45048k = c4417lc;
        this.f45044g = s72;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4326g5 c4326g5A = C4326g5.a(networkStorageDir, s72, jSONObject);
        this.f45045h = new yg(context, c4291e4, w42, i10, c4326g5A, networkStorageDir);
        a(context, c4291e4, w42, i10, c4326g5A, networkStorageDir, str, str2);
    }

    private void l() {
        Logger.i(this.f45038a, "handleReadyState");
        this.f45040c = C4500q8.b.Ready;
        CountDownTimer countDownTimer = this.f45041d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f45043f.c();
        this.f45043f.a();
        com.ironsource.sdk.controller.l lVar = this.f45039b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C4500q8.b.Ready.equals(this.f45040c);
    }

    private void n() {
        this.f45045h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f45039b;
        if (lVar != null) {
            lVar.a(this.f45045h.i());
        }
    }

    public com.ironsource.sdk.controller.l k() {
        return this.f45039b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C4291e4 c4291e4, W4 w42, int i10, C4326g5 c4326g5, String str, String str2, String str3) {
        v vVarB;
        try {
            vVarB = b(context, c4291e4, w42, i10, c4326g5, str, str2, str3);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f45039b = vVarB;
            vVarB.b();
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            C4462o4.d().a(th4);
            d(Log.getStackTraceString(th4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C4618x8.a(Xd.f42070d, new C4533s8().a(D5.A, str).a());
        this.f45040c = C4500q8.b.Loading;
        this.f45039b = new com.ironsource.sdk.controller.n(str, this.f45044g);
        this.f45042e.c();
        this.f45042e.a();
        S7 s72 = this.f45044g;
        if (s72 != null) {
            s72.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4516r8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.z
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f45393a.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.a0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Kb kb2) {
                this.f45001a.a(kb2);
            }
        };
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f45039b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4500q8.c h() {
        com.ironsource.sdk.controller.l lVar = this.f45039b;
        return lVar != null ? lVar.h() : C4500q8.c.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a aVarRemove = this.f45046i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f45039b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C4291e4 c4291e4, W4 w42, int i10, C4326g5 c4326g5, String str, String str2, String str3) throws Throwable {
        C4618x8.a(Xd.f42069c);
        v vVar = new v(context, w42, c4291e4, this, this.f45044g, i10, c4326g5, str, i(), j(), str2, str3);
        X5 x52 = new X5(context, c4326g5, new W5(this.f45044g.a()), new Lb(c4326g5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4326g5.a(), x52));
        vVar.a(new C4509r1());
        vVar.a(new C4631y4(context, new C4614x4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Kb kb2) {
        l.b bVar = this.f45047j.get(kb2.d());
        if (bVar != null) {
            bVar.a(kb2);
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f45038a, "handleControllerLoaded");
        this.f45040c = C4500q8.b.Loaded;
        this.f45042e.c();
        this.f45042e.a();
    }

    private void a(Runnable runnable, long j10) {
        S7 s72 = this.f45044g;
        if (s72 != null) {
            s72.d(runnable, j10);
        } else {
            Logger.e(this.f45038a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C4291e4 c4291e4, final W4 w42, final int i10, final C4326g5 c4326g5, final String str, final String str2, final String str3) {
        int iG = Ib.U().g().g();
        if (iG > 0) {
            C4618x8.a(Xd.B, new C4533s8().a(D5.f40578y, String.valueOf(iG)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45004b.c(context, c4291e4, w42, i10, c4326g5, str, str2, str3);
            }
        }, iG);
        this.f45041d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f45038a, "handleControllerFailed ");
        C4533s8 c4533s8 = new C4533s8();
        c4533s8.a(D5.A, str);
        c4533s8.a(D5.f40578y, String.valueOf(this.f45045h.l()));
        C4618x8.a(Xd.f42081o, c4533s8.a());
        this.f45045h.a(false);
        e(str);
        if (this.f45041d != null) {
            Logger.i(this.f45038a, "cancel timer mControllerReadyTimer");
            this.f45041d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f45038a, "handleControllerReady ");
        this.f45048k.a(h());
        if (C4500q8.c.Web.equals(h())) {
            C4618x8.a(Xd.f42071e, new C4533s8().a(D5.f40578y, String.valueOf(this.f45045h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    public void a(Runnable runnable) {
        this.f45042e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC4260c7
    public void a(@NotNull Y6 y62) {
        EnumC4225a7 enumC4225a7B = y62.b();
        if (enumC4225a7B == EnumC4225a7.SendEvent) {
            C4618x8.a(Xd.A, new C4533s8().a(D5.f40578y, y62.a() + " : strategy: " + enumC4225a7B).a());
            return;
        }
        if (enumC4225a7B == EnumC4225a7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(y62.a(), this.f45044g);
            this.f45039b = nVar;
            this.f45048k.a(nVar.h());
            C4618x8.a(Xd.f42070d, new C4533s8().a(D5.A, y62.a() + " : strategy: " + enumC4225a7B).a());
            C4618x8.a(Xd.A, new C4533s8().a(D5.f40578y, y62.a() + " : strategy: " + enumC4225a7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C4618x8.a(Xd.f42091y, new C4533s8().a(D5.f40578y, str).a());
        CountDownTimer countDownTimer = this.f45041d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        this.f45043f.a(new s(v42, map, interfaceC4563u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42) {
        this.f45043f.a(new f(v42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f45043f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f45039b) == null) {
            return;
        }
        lVar.b(context);
    }

    private void a(C4500q8.e eVar, V4 v42, String str, String str2) {
        Logger.i(this.f45038a, "recoverWebController for product: " + eVar.toString());
        C4533s8 c4533s8 = new C4533s8();
        c4533s8.a(D5.f40576w, eVar.toString());
        c4533s8.a(D5.f40575v, v42.f());
        C4618x8.a(Xd.f42068b, c4533s8.a());
        this.f45045h.n();
        a();
        b(new m(str, str2));
        this.f45041d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4580v4 interfaceC4580v4) {
        if (this.f45045h.a(h(), this.f45040c)) {
            a(C4500q8.e.RewardedVideo, v42, str, str2);
        }
        this.f45043f.a(new o(str, str2, v42, interfaceC4580v4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4580v4 interfaceC4580v4) {
        this.f45043f.a(new p(jSONObject, interfaceC4580v4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4563u4 interfaceC4563u4) {
        if (this.f45045h.a(h(), this.f45040c)) {
            a(C4500q8.e.Interstitial, v42, str, str2);
        }
        this.f45043f.a(new q(str, str2, v42, interfaceC4563u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4563u4 interfaceC4563u4) {
        Logger.i(this.f45038a, "load interstitial");
        this.f45043f.a(new r(str, interfaceC4563u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4563u4 interfaceC4563u4) {
        this.f45043f.a(new a(jSONObject, interfaceC4563u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        this.f45043f.a(new b(v42, map, interfaceC4563u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f45039b == null || !m()) {
            return false;
        }
        return this.f45039b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4546t4 interfaceC4546t4) {
        if (this.f45045h.a(h(), this.f45040c)) {
            a(C4500q8.e.Banner, v42, str, str2);
        }
        this.f45043f.a(new c(str, str2, v42, interfaceC4546t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4546t4 interfaceC4546t4) {
        this.f45043f.a(new d(jSONObject, interfaceC4546t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42) {
        this.f45043f.a(new RunnableC0475e(v42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4546t4 interfaceC4546t4) {
        this.f45043f.a(new g(v42, map, interfaceC4546t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        this.f45043f.a(new h(aVar, cVar));
    }

    public void a(String str, l.b bVar) {
        this.f45047j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f45039b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f45038a, "destroy controller");
        CountDownTimer countDownTimer = this.f45041d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Q3 q32 = this.f45043f;
        if (q32 != null) {
            q32.b();
        }
        this.f45041d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f45039b.a(activity);
    }
}
