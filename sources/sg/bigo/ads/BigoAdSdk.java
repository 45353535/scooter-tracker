package sg.bigo.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.c;
import sg.bigo.ads.common.m;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.n.e;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.e.a;
import sg.bigo.ads.controller.e.e;
import sg.bigo.ads.controller.e.f;
import sg.bigo.ads.core.b.b.j;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes4.dex */
public class BigoAdSdk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static sg.bigo.ads.controller.e.a f100048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f100049e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f100045a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f100046b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f100047c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<InitListener> f100050f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Pair<String, String>> f100051g = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.BigoAdSdk$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100058a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f100058a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100058a[ConsentOptions.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100058a[ConsentOptions.CCPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100058a[ConsentOptions.COPPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface InitListener {
        void onInitialized();
    }

    public static void addExtraHost(@Nullable final String str, @Nullable final String str2) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.3
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f100048d == null || !BigoAdSdk.f100045a.get()) {
                    BigoAdSdk.f100051g.add(Pair.create(str, str2));
                } else {
                    BigoAdSdk.f100048d.a(str, str2);
                }
            }
        });
    }

    @Nullable
    public static String getBidderToken() {
        String str;
        String str2;
        if (!f100045a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (f100048d != null) {
                if (f100047c.compareAndSet(true, false)) {
                    sg.bigo.ads.controller.e.a aVar = f100048d;
                    f fVar = aVar.f103543g;
                    if (fVar == null) {
                        fVar = new f();
                        aVar.f103543g = fVar;
                    }
                    if (fVar.f103646a != null) {
                        synchronized (f.class) {
                            fVar.f103646a = null;
                        }
                    }
                }
                sg.bigo.ads.controller.e.a aVar2 = f100048d;
                if (aVar2.f103541e == null) {
                    return null;
                }
                f fVar2 = aVar2.f103543g;
                if (fVar2 == null) {
                    fVar2 = new f();
                    aVar2.f103543g = fVar2;
                }
                sg.bigo.ads.controller.e.d dVar = aVar2.f103541e;
                f.f103645b = true;
                h hVar = i.f102116a;
                int iW = hVar != null ? hVar.w() : 0;
                return iW != 1 ? iW != 2 ? fVar2.a(dVar) : (fVar2.f103646a == null || fVar2.f103647c == 0 || System.currentTimeMillis() - fVar2.f103647c > 300000) ? fVar2.b(dVar) : fVar2.a(dVar) : fVar2.b(dVar);
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        sg.bigo.ads.common.t.a.a(0, str, str2);
        return null;
    }

    @NonNull
    public static String getHashId() {
        return "4240b30";
    }

    @NonNull
    public static String getSDKVersion() {
        return "50602";
    }

    @NonNull
    public static String getSDKVersionName() {
        return "5.6.2";
    }

    public static void initialize(@NonNull Context context, @NonNull AdConfig adConfig, @Nullable InitListener initListener) {
        boolean z10 = f100045a.get();
        boolean z11 = !z10;
        if (z10) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (sg.bigo.ads.controller.e.c.a().f103593b.get() == -1) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z11 = true;
        }
        if (!z11) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f100050f.add(initListener);
        }
        m.a(context);
        m.a(adConfig);
        Context applicationContext = context.getApplicationContext();
        m.a(applicationContext);
        if (f100046b.getAndSet(true)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsDebug = adConfig.isDebug();
        sg.bigo.ads.common.y.a.a((int) (System.currentTimeMillis() / 1000));
        sg.bigo.ads.common.x.b.f103120a = applicationContext;
        sg.bigo.ads.common.m.b.a(applicationContext);
        sg.bigo.ads.common.d.a.a().a(applicationContext);
        b(context);
        t.a(zIsDebug);
        final String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        final sg.bigo.ads.controller.e.a aVar = new sg.bigo.ads.controller.e.a(applicationContext, adConfig);
        f100048d = aVar;
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                BigoAdSdk.f100045a.set(true);
                BigoAdSdk.f100046b.set(false);
                BigoAdSdk.a(extra);
                sg.bigo.ads.common.t.a.a(2, 4, "", "Initialized Bigo Ads SDK successfully.");
                for (InitListener initListener2 : BigoAdSdk.f100050f) {
                    if (initListener2 != null) {
                        initListener2.onInitialized();
                    }
                }
                BigoAdSdk.f100050f.clear();
                if (c.a.a().isEmpty()) {
                    return;
                }
                d.a(3, new Runnable() { // from class: sg.bigo.ads.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.d.b.c(a.c());
                        a.b();
                    }
                });
            }
        };
        aVar.f103546j = jElapsedRealtime;
        aVar.f103541e.f103594a = adConfig;
        aVar.f103543g = new f();
        d.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.4
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
        d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.5
            /* JADX WARN: Removed duplicated region for block: B:24:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0270  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0277  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x02e3  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x02e8  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0334  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x03d5  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x03ea  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1012
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.e.a.AnonymousClass5.run():void");
            }
        });
        e.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.6
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                String name = Thread.currentThread().getName();
                if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
                    return;
                }
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
    }

    public static boolean isInitialized() {
        return f100045a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setUserConsent(@androidx.annotation.NonNull final android.content.Context r4, @androidx.annotation.NonNull final sg.bigo.ads.ConsentOptions r5, final boolean r6) {
        /*
            boolean r0 = sg.bigo.ads.common.x.b.a()
            if (r0 != 0) goto Lc
            android.content.Context r0 = r4.getApplicationContext()
            sg.bigo.ads.common.x.b.f103120a = r0
        Lc:
            boolean r0 = sg.bigo.ads.common.m.b.a()
            if (r0 != 0) goto L19
            android.content.Context r0 = r4.getApplicationContext()
            sg.bigo.ads.common.m.b.a(r0)
        L19:
            sg.bigo.ads.c$1 r0 = new sg.bigo.ads.c$1
            r0.<init>()
            r1 = 3
            sg.bigo.ads.common.n.d.a(r1, r0)
            sg.bigo.ads.ConsentOptions r0 = sg.bigo.ads.ConsentOptions.GDPR
            r1 = 4
            java.lang.String r2 = ""
            r3 = 2
            if (r5 != r0) goto L41
            sg.bigo.ads.common.x.a.a(r6)
            boolean r0 = sg.bigo.ads.common.m.b.e(r4)
            if (r0 == 0) goto L41
            java.lang.String r4 = "Filter the consent status from user: "
        L35:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r4 = r4.concat(r5)
            sg.bigo.ads.common.t.a.a(r3, r1, r2, r4)
            return
        L41:
            a(r4, r5, r6)
            java.lang.String r4 = "Update the consent status from user: "
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.BigoAdSdk.setUserConsent(android.content.Context, sg.bigo.ads.ConsentOptions, boolean):void");
    }

    @NonNull
    public static a a(@NonNull Context context) {
        if (f100049e == null) {
            f100049e = new a(context);
        }
        if (!f100049e.f102309c) {
            f100049e.b(context);
        }
        return f100049e;
    }

    private static void b(@NonNull Context context) {
        if (!sg.bigo.ads.common.m.b.f()) {
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPRContent is not changed, so return");
            return;
        }
        sg.bigo.ads.common.m.b.g();
        f100047c.set(true);
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f103120a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        if (!sg.bigo.ads.common.m.b.e(context)) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.x.a.l() != 2);
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPR applies is null, so return");
        } else if (sg.bigo.ads.common.m.a.b()) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.m.a.a());
        } else {
            a(context, ConsentOptions.GDPR, true);
        }
    }

    public static a.C1280a<sg.bigo.ads.api.b> a(final sg.bigo.ads.api.b bVar, sg.bigo.ads.controller.c cVar) {
        String str;
        bVar.f102124h.f102130f = System.currentTimeMillis();
        sg.bigo.ads.controller.a aVar = new sg.bigo.ads.controller.a(cVar);
        if (!f100045a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair<>(bVar, null));
            return null;
        }
        b(f100048d.f103537a);
        final sg.bigo.ads.controller.e.a aVar2 = f100048d;
        if (q.a((CharSequence) aVar2.f103541e.f103594a.getAppKey())) {
            aVar.a(0, 1013, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", new Pair(bVar, null));
            return null;
        }
        sg.bigo.ads.api.core.c cVarB = bVar.b();
        if (cVarB != null) {
            aVar.a(0, cVarB.f102154a, cVarB.f102155b, cVarB.f102156c, new Pair(bVar, null));
            return null;
        }
        int i10 = 0;
        byte b10 = 0;
        if (!sg.bigo.ads.common.x.a.q()) {
            final a.C1280a<sg.bigo.ads.api.b> c1280a = new a.C1280a<>(bVar, aVar, b10 == true ? 1 : 0);
            d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    if (bVar.f()) {
                        ((sg.bigo.ads.api.b) c1280a.f103580a).b(0);
                        a.a(a.this, c1280a);
                    } else {
                        a.this.f103548l.b();
                        a.this.f103542f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.9.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11) {
                                a.a(a.this, 1, (Map) null);
                                ((sg.bigo.ads.api.b) c1280a.f103580a).b(i11);
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                a.a(a.this, c1280a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11, int i12, String str2) {
                                ((sg.bigo.ads.api.b) c1280a.f103580a).b(i11);
                                if (a.this.f103538b.N()) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    a.a(a.this, c1280a);
                                } else {
                                    AnonymousClass9 anonymousClass92 = AnonymousClass9.this;
                                    a.this.a(c1280a, 1008, i12, str2);
                                }
                            }
                        }, 1);
                    }
                }
            });
            return c1280a;
        }
        String str2 = "Missing CCPA consent";
        if (sg.bigo.ads.common.x.a.m() == 2) {
            str = "Missing GDPR consent";
            i10 = 1;
        } else {
            str = "Missing CCPA consent";
        }
        if (sg.bigo.ads.common.x.a.o() == 2) {
            i10++;
            str = "Missing LGPD consent";
        }
        if (sg.bigo.ads.common.x.a.n() == 2) {
            i10++;
        } else {
            str2 = str;
        }
        if (sg.bigo.ads.common.x.a.p() == 2) {
            i10++;
            str2 = "Missing COPPA consent";
        }
        if (i10 > 1) {
            str2 = "Missing user consent";
        }
        aVar.a(0, 1001, 800, str2, new Pair(bVar, null));
        return null;
    }

    private static void a(final Context context, @NonNull final ConsentOptions consentOptions, boolean z10) {
        boolean zA = a(consentOptions, z10);
        if (z10 || !zA) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.2
            @Override // java.lang.Runnable
            public final void run() {
                HashMap map = new HashMap();
                map.put(ConsentOptions.GDPR, Integer.valueOf(sg.bigo.ads.common.x.a.m()));
                map.put(ConsentOptions.LGPD, Integer.valueOf(sg.bigo.ads.common.x.a.o()));
                map.put(ConsentOptions.CCPA, Integer.valueOf(sg.bigo.ads.common.x.a.n()));
                map.put(ConsentOptions.COPPA, Integer.valueOf(sg.bigo.ads.common.x.a.p()));
                map.remove(consentOptions);
                int iL = sg.bigo.ads.common.x.a.l();
                sg.bigo.ads.common.t.a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
                sg.bigo.ads.core.d.b.b bVar = sg.bigo.ads.core.d.c.a().f104043b;
                if (bVar != null) {
                    bVar.f104023c.f();
                }
                sg.bigo.ads.core.b.b bVarA = sg.bigo.ads.core.b.b.a();
                sg.bigo.ads.core.b.b.a aVar = bVarA.f103915a;
                if (aVar != null) {
                    aVar.f103924b.e();
                }
                j jVar = bVarA.f103917c;
                if (jVar != null) {
                    jVar.f103964c.g();
                    jVar.f103963b.g();
                }
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                dVarA.f104115e = context.getApplicationContext();
                dVarA.b();
                dVarA.f104111a.clear();
                sg.bigo.ads.core.player.b bVarA2 = sg.bigo.ads.core.player.b.a();
                Context context2 = context;
                sg.bigo.ads.common.h.b bVar2 = bVarA2.f104593g;
                if (bVar2 != null) {
                    sg.bigo.ads.common.h.b.b.a();
                    bVar2.f102482a.clear();
                    bVar2.f102484c.clear();
                    bVar2.f102483b.clear();
                    bVar2.f102485d.clear();
                }
                List<n> list = bVarA2.f104590d;
                if (list != null) {
                    list.clear();
                }
                List<n> list2 = bVarA2.f104591e;
                if (list2 != null) {
                    list2.clear();
                }
                Map<String, b.a> map2 = bVarA2.f104592f;
                if (map2 != null) {
                    map2.clear();
                }
                h.a.f102684a.e(context2);
                sg.bigo.ads.common.utils.f.b(new File(o.a(context)));
                sg.bigo.ads.common.g.a.a.a();
                sg.bigo.ads.common.x.a.s();
                BigoAdSdk.a(consentOptions);
                for (Map.Entry entry : map.entrySet()) {
                    int i10 = AnonymousClass5.f100058a[((ConsentOptions) entry.getKey()).ordinal()];
                    if (i10 == 1) {
                        sg.bigo.ads.common.x.a.e(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 2) {
                        sg.bigo.ads.common.x.a.c(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 3) {
                        sg.bigo.ads.common.x.a.d(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 4) {
                        sg.bigo.ads.common.x.a.f(((Integer) entry.getValue()).intValue());
                    }
                }
                sg.bigo.ads.common.x.a.b(iL);
            }
        });
    }

    static /* synthetic */ void a(final String str) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f100048d != null) {
                    for (Pair pair : BigoAdSdk.f100051g) {
                        BigoAdSdk.f100048d.a((String) pair.first, (String) pair.second);
                    }
                    Map<String, String> mapB = sg.bigo.ads.controller.a.d.b(str);
                    if (!k.a(mapB)) {
                        for (Map.Entry<String, String> entry : mapB.entrySet()) {
                            BigoAdSdk.f100048d.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                BigoAdSdk.f100051g.clear();
            }
        });
    }

    static /* synthetic */ boolean a(ConsentOptions consentOptions) {
        return a(consentOptions, false);
    }

    private static boolean a(@NonNull ConsentOptions consentOptions, boolean z10) {
        boolean z11;
        int i10 = z10 ? 1 : 2;
        int i11 = AnonymousClass5.f100058a[consentOptions.ordinal()];
        if (i11 == 1) {
            if (i10 != sg.bigo.ads.common.x.a.o()) {
                sg.bigo.ads.common.x.a.e(i10);
                z11 = true;
            }
            z11 = false;
        } else if (i11 == 2) {
            if (i10 != sg.bigo.ads.common.x.a.m()) {
                sg.bigo.ads.common.x.a.c(i10);
                z11 = true;
            }
            z11 = false;
        } else if (i11 != 3) {
            if (i11 == 4 && i10 != sg.bigo.ads.common.x.a.p()) {
                sg.bigo.ads.common.x.a.f(i10);
                z11 = true;
            }
            z11 = false;
        } else {
            if (i10 != sg.bigo.ads.common.x.a.n()) {
                sg.bigo.ads.common.x.a.d(i10);
                z11 = true;
            }
            z11 = false;
        }
        if (z11) {
            f100047c.set(true);
        }
        return z11;
    }
}
