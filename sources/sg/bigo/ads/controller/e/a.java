package sg.bigo.ads.controller.e;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.ad.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.e.e;
import sg.bigo.ads.controller.f.a;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, l>, a.InterfaceC1281a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f103537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.controller.b.d f103538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.controller.b.h f103539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final sg.bigo.ads.controller.a.b f103540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final d f103541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final e f103542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f103543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final LinkedList<C1280a<? extends sg.bigo.ads.api.b>> f103544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SparseArray<C1280a<sg.bigo.ads.controller.g.i>> f103545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f103546j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final b f103548l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f103550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final sg.bigo.ads.controller.b f103551o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f103549m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f103547k = true;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.e.a$a, reason: collision with other inner class name */
    public static class C1280a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final T f103580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        final sg.bigo.ads.controller.c f103581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f103582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f103583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f103584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f103585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f103586g;

        private C1280a(@NonNull T t10, @NonNull sg.bigo.ads.controller.c cVar) {
            this.f103584e = 1;
            this.f103585f = 0;
            this.f103580a = t10;
            this.f103581b = cVar;
        }

        public /* synthetic */ C1280a(Object obj, sg.bigo.ads.controller.c cVar, byte b10) {
            this(obj, cVar);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile int f103588b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f103589c = true;

        public b() {
        }

        final void a() {
            if (this.f103588b == 0 || this.f103588b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task set.");
                sg.bigo.ads.common.n.d.a(3, this, 5000L);
                this.f103588b = 1;
            }
        }

        final void b() {
            if (this.f103588b == 1 || this.f103588b == 2) {
                if (this.f103588b == 1) {
                    sg.bigo.ads.common.n.d.a(this);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task canceled.");
                this.f103588b = 3;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!sg.bigo.ads.common.f.b.e()) {
                b();
                return;
            }
            if (!this.f103589c || a.this.f103547k) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Start to execute task.");
                this.f103588b = 4;
                a.this.f103542f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.b.1
                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10) {
                        a.a(a.this, 1, (Map) null);
                    }

                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10, int i11, String str) {
                    }
                }, 0);
            } else {
                this.f103589c = false;
                sg.bigo.ads.common.t.a.b("PrefetchConfigTask", "The network is unavailable now. Task paused.");
                this.f103588b = 2;
            }
        }

        static /* synthetic */ void a(b bVar) {
            if (bVar.f103588b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task resumed.");
                bVar.a();
            }
        }
    }

    public a(@NonNull Context context, @NonNull AdConfig adConfig) {
        sg.bigo.ads.controller.b bVar = new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.e.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "sdk config fetch error, seq=" + i10 + ", code=" + i11 + ", subCode=" + i12 + ", message=" + str);
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "sdk config fetch success, seqId=" + i10 + ", data=" + str);
            }
        };
        this.f103551o = bVar;
        this.f103537a = context;
        sg.bigo.ads.controller.b.d dVar = new sg.bigo.ads.controller.b.d(context);
        this.f103538b = dVar;
        sg.bigo.ads.api.a.i.f102116a = dVar;
        sg.bigo.ads.controller.b.h hVar = new sg.bigo.ads.controller.b.h(context);
        this.f103539c = hVar;
        d dVar2 = new d(context, adConfig, dVar);
        this.f103541e = dVar2;
        sg.bigo.ads.controller.a.b bVar2 = new sg.bigo.ads.controller.a.b(context, dVar2, dVar);
        this.f103540d = bVar2;
        bVar2.f103211g = bVar;
        sg.bigo.ads.common.u.a.e.a(bVar2.f103205a.f103138m);
        sg.bigo.ads.common.u.g.f102772a = new sg.bigo.ads.common.u.a.a(dVar2);
        this.f103542f = new e(context, dVar, hVar, dVar2, bVar2);
        sg.bigo.ads.api.a.h hVar2 = sg.bigo.ads.api.a.i.f102116a;
        if (hVar2 != null) {
            sg.bigo.ads.api.a.b bVarQ = hVar2.q();
            if (bVarQ instanceof sg.bigo.ads.controller.b.b) {
                ((sg.bigo.ads.controller.b.b) bVarQ).f103313a = hVar;
            }
        }
        this.f103544h = new LinkedList<>();
        this.f103545i = new SparseArray<>();
        this.f103548l = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a() {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.e.a.a():void");
    }

    final Context b() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.f103537a;
            }
            Context context = this.f103550n;
            if (context != null) {
                return context;
            }
            Context contextCreateWindowContext = this.f103537a.createDisplayContext(((DisplayManager) this.f103537a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.f103550n = contextCreateWindowContext;
            return contextCreateWindowContext;
        } catch (Throwable unused) {
            return this.f103537a;
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable l lVar) {
        final l lVar2 = lVar;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C1280a<sg.bigo.ads.controller.g.i> c1280a = a.this.f103545i.get(i10);
                if (c1280a != null) {
                    sg.bigo.ads.api.b bVarK = c1280a.f103580a.k();
                    a.this.f103545i.remove(i10);
                    int i13 = i11;
                    String str2 = str;
                    if (i13 == 1005) {
                        if (i12 == -6) {
                            i13 = 1004;
                            str2 = "The sdk integration and ad request are successful, but no ad wins at this time.";
                        } else {
                            str2 = "Error from server: " + str;
                        }
                    }
                    c1280a.f103581b.a(i10, i13, i12, str2, Pair.create(bVarK, lVar2));
                }
                a.this.a();
            }
        });
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.b[] bVarArr) {
        final sg.bigo.ads.api.b bVar2 = bVar;
        final sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C1280a<sg.bigo.ads.controller.g.i> c1280a = a.this.f103545i.get(i10);
                if (c1280a != null) {
                    a.this.f103545i.remove(i10);
                    if (!k.a(bVarArr2)) {
                        sg.bigo.ads.api.core.f[] fVarArr = new sg.bigo.ads.api.core.f[bVarArr2.length];
                        int i11 = 0;
                        while (true) {
                            sg.bigo.ads.api.core.b[] bVarArr3 = bVarArr2;
                            if (i11 >= bVarArr3.length) {
                                break;
                            }
                            sg.bigo.ads.api.core.b bVar3 = bVarArr3[i11];
                            l lVarL = c1280a.f103580a.l();
                            sg.bigo.ads.api.b bVar4 = bVar2;
                            a aVar = a.this;
                            f.a aVar2 = new f.a(bVar3, lVarL, bVar4, aVar.f103537a, aVar.b());
                            aVar2.f102180a = a.this.f103541e;
                            fVarArr[i11] = aVar2.a();
                            if (sg.bigo.ads.api.core.a.d(bVar3.x())) {
                                t.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("slot", bVar3.b());
                                contentValues.put("log_id", Long.valueOf(bVar3.Z()));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                contentValues.put("start_time", Long.valueOf(jCurrentTimeMillis));
                                contentValues.put("end_time", Long.valueOf((bVar3.L() * 1000) + jCurrentTimeMillis));
                                JSONObject jSONObjectAf = bVar3.af();
                                contentValues.put("ad_data", jSONObjectAf == null ? "" : jSONObjectAf.toString());
                                contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis));
                                sg.bigo.ads.common.g.a.a.b("tb_addata", contentValues);
                            }
                            i11++;
                        }
                        c1280a.f103581b.a(i10, bVar2, fVarArr);
                    }
                }
                a.this.a();
            }
        });
    }

    public final void a(String str, String str2) {
        this.f103540d.a(str, str2);
    }

    final void a(@NonNull final C1280a<? extends sg.bigo.ads.api.b> c1280a, final int i10, final int i11, final String str) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.e.a.11
            @Override // java.lang.Runnable
            public final void run() {
                c1280a.f103581b.a(0, i10, i11, str, new Pair(c1280a.f103580a, null));
            }
        });
    }

    static /* synthetic */ void a(a aVar, int i10, Map map) {
        if (q.a((CharSequence) aVar.f103541e.f103596c.F()) || aVar.f103549m.getAndSet(true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI = sg.bigo.ads.common.x.a.i();
        long jElapsedRealtime = aVar.f103546j == 0 ? -1L : SystemClock.elapsedRealtime() - aVar.f103546j;
        if (jCurrentTimeMillis - jI >= 300000) {
            sg.bigo.ads.core.d.b.a(jElapsedRealtime, i10, sg.bigo.ads.common.x.a.r(), sg.bigo.ads.common.m.b.e(), (Map<String, String>) map);
            sg.bigo.ads.common.x.a.c(jCurrentTimeMillis);
            sg.bigo.ads.core.d.b.a();
            sg.bigo.ads.core.d.b.a(aVar.f103541e);
        }
    }

    static /* synthetic */ void a(a aVar, final C1280a c1280a) {
        if (aVar.f103538b.H()) {
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.10
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Ad adA;
                    sg.bigo.ads.api.b bVar = (sg.bigo.ads.api.b) c1280a.f103580a;
                    l lVarA = a.this.f103539c.a(bVar);
                    if ((lVarA != null ? lVarA.w() : false) || bVar.g()) {
                        a.this.f103544h.addFirst(c1280a);
                    } else {
                        if (lVarA != null && (adA = b.a.f100151a.a(lVarA)) != null) {
                            sg.bigo.ads.controller.c cVar = c1280a.f103581b;
                            if ((cVar instanceof sg.bigo.ads.controller.a) && (((sg.bigo.ads.controller.a) cVar).f103128a instanceof sg.bigo.ads.controller.d)) {
                                sg.bigo.ads.controller.c cVar2 = ((sg.bigo.ads.controller.a) cVar).f103128a;
                                if (cVar2 instanceof sg.bigo.ads.controller.d) {
                                    ((sg.bigo.ads.controller.d) cVar2).a(lVarA, adA);
                                }
                            }
                        }
                        a.this.f103544h.offer(c1280a);
                    }
                    a.this.a();
                }
            });
        } else {
            aVar.a(c1280a, 1005, 10004, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13.");
        }
    }

    @Override // sg.bigo.ads.controller.f.a.InterfaceC1281a
    public final void a(boolean z10) {
        this.f103547k = z10;
        if (z10) {
            sg.bigo.ads.common.aa.b.a();
            b.a(this.f103548l);
        }
    }
}
