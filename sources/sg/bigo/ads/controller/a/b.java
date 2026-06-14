package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.f;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a f103205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.g f103206b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.controller.b f103211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.api.a.h f103212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f103213i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f103207c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f103208d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f103209e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f103210f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f103215k = new g() { // from class: sg.bigo.ads.controller.a.b.1
        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str) {
            b.this.f103205a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], reSave config, fromUrlPath=".concat(String.valueOf(str)));
        }

        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str, boolean z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchConfig, country=" + str + ", fromSDKConfigUrl=" + z10);
            if (!z10) {
                b.a(b.this, (l.a) null);
            }
            b.a(b.this, str, true);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f103216l = new Runnable() { // from class: sg.bigo.ads.controller.a.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.a(b.this, new l.a() { // from class: sg.bigo.ads.controller.a.b.2.1
                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                    b bVar = b.this;
                    b.a(bVar, bVar.f103206b.v(), false);
                }

                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                }
            })) {
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.f103206b.v(), false);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f103214j = new ConcurrentHashMap();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f103243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f103245c;

        private a(k kVar, String str, long j10) {
            this.f103243a = kVar;
            this.f103244b = str;
            this.f103245c = j10;
        }

        /* synthetic */ a(k kVar, String str, long j10, byte b10) {
            this(kVar, str, j10);
        }
    }

    public b(@NonNull Context context, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar) {
        this.f103213i = context;
        this.f103205a = new sg.bigo.ads.controller.a.a(context, hVar);
        this.f103206b = gVar;
        this.f103212h = hVar;
    }

    @NonNull
    public final h a(String str, String str2, long j10, boolean z10) {
        String str3 = str2;
        h hVarA = this.f103205a.a(str, str3, this.f103214j, this.f103206b.v(), this.f103212h.s());
        long jElapsedRealtime = j10 <= 0 ? 0L : SystemClock.elapsedRealtime() - j10;
        if (hVarA.f103295b) {
            this.f103205a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], update host config, configSource=" + str3 + ", result=" + hVarA);
            if (z10) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f103296c, str3, true);
            }
        } else {
            long j11 = jElapsedRealtime;
            int i10 = hVarA.f103297d;
            if (i10 == 0) {
                if (z10) {
                    sg.bigo.ads.core.d.b.a(j11, hVarA.f103296c, str3, false);
                }
            } else if (z10) {
                sg.bigo.ads.core.d.b.a(j11, hVarA.f103296c, str3, i10, hVarA.f103298e);
                str3 = str3;
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "updateHostConfig, configSource=" + str3 + ", update result=" + hVarA);
        return hVarA;
    }

    public final f b(@NonNull String str, String str2) {
        f.a aVar = new f.a(this.f103205a, this.f103206b, this.f103212h, str, str2);
        aVar.a(this.f103215k);
        return aVar;
    }

    public final void a(long j10, String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchAntiBanConfig, delayMillis=" + j10 + ", from=" + str);
        sg.bigo.ads.common.n.d.a(this.f103216l);
        sg.bigo.ads.common.n.d.a(1, this.f103216l, Math.max(j10, 0L));
    }

    public final void a(String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "addExtraHost, country=" + str + ", host=" + str2);
        if (d.a(str2)) {
            if (q.a((CharSequence) str)) {
                str = "all";
            }
            this.f103214j.put(str, str2);
            if (this.f103205a.a(str, str2)) {
                this.f103205a.a(10L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "saveAsync, addExtraHost, delayMillis=10");
            }
        }
    }

    final void a(@NonNull final String str, @NonNull final sg.bigo.ads.controller.a.a.g gVar, @Nullable final ValueCallback<a> valueCallback, @Nullable final ValueCallback<String> valueCallback2) {
        final k kVarA = gVar.a(str);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync] fetch svr config, country=" + str + ", url=" + kVarA);
        this.f103205a.a(0L);
        if (kVarA == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
            }
        } else {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(kVarA.f103303a), this.f103213i);
            aVar.f102749l = sg.bigo.ads.common.u.a.e.b();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.a.b.9
                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar2) {
                    return new sg.bigo.ads.common.u.c.d(aVar2);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] succeed to fetch net disk url: " + kVarA.f103303a);
                    String strA = ((sg.bigo.ads.common.u.c.d) cVar2).a();
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(new a(kVarA, strA, jElapsedRealtime, (byte) 0));
                    }
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] try another net disk url due to failed to fetch net disk url: " + kVarA.f103303a);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, kVarA.f103303a, 4000, "NetError:" + hVar.f102773a + ", " + hVar.getMessage());
                    b.this.a(str, gVar, valueCallback, valueCallback2);
                }
            });
        }
    }

    final boolean a(String str, final ValueCallback<a> valueCallback, ValueCallback<String> valueCallback2) {
        final sg.bigo.ads.controller.a.a.e eVar = this.f103205a.f103136k;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch free svr config, canFetch=" + eVar.a());
        if (!eVar.a()) {
            this.f103210f.set(false);
            return false;
        }
        eVar.b();
        a(str, eVar, new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                eVar.a(true);
                b.this.f103205a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync], fetch third free svr config, onSuccess");
                valueCallback.onReceiveValue(aVar);
            }
        }, valueCallback2);
        return true;
    }

    static /* synthetic */ boolean a(b bVar, final String str, boolean z10) {
        bVar.f103209e.compareAndSet(false, z10);
        if (!bVar.f103208d.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config return because is fetching, fetch free svr config after fail -> ".concat(String.valueOf(z10)));
            return false;
        }
        sg.bigo.ads.controller.a.a.f fVar = bVar.f103205a.f103135j;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config, canFetch=" + fVar.a() + ", fetch free svr config after fail -> " + z10);
        final ValueCallback<a> valueCallback = new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                k kVar;
                a aVar2 = aVar;
                b.this.f103208d.set(false);
                b.this.f103209e.set(false);
                b.this.f103210f.set(false);
                if (aVar2 == null || (kVar = aVar2.f103243a) == null) {
                    return;
                }
                b.this.a(aVar2.f103244b, kVar.f103303a, aVar2.f103245c, true);
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all svr urls are fail");
                b.this.f103209e.set(false);
                b.this.f103210f.set(false);
            }
        };
        if (fVar.a()) {
            fVar.b();
            bVar.a(str, fVar, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.7
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    b.this.f103208d.set(false);
                    if (b.this.f103209e.compareAndSet(true, false) && b.this.f103210f.compareAndSet(false, true)) {
                        b.this.a(str, valueCallback, valueCallback2);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all pay svr urls are fail");
                    }
                }
            });
            return true;
        }
        if (bVar.f103209e.compareAndSet(true, false) && bVar.f103210f.compareAndSet(false, true)) {
            bVar.a(str, valueCallback, valueCallback2);
        }
        bVar.f103208d.set(false);
        return false;
    }

    static /* synthetic */ boolean a(b bVar, final l.a aVar) {
        final sg.bigo.ads.controller.a.a.c cVar = bVar.f103205a.f103132g;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config, canFetch=" + cVar.b() + ", ignoreFetchInterval=false");
        if (!bVar.f103207c.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config return because it is fetching.");
            return false;
        }
        if (!cVar.b()) {
            bVar.f103207c.set(false);
            return false;
        }
        cVar.f103167g = System.currentTimeMillis();
        bVar.f103205a.a(0L);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        new l(bVar.f103206b, bVar, new l.a() { // from class: sg.bigo.ads.controller.a.b.4
            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                int i13;
                int i14;
                String str3;
                b.this.f103207c.set(false);
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    long jElapsedRealtime2 = jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L;
                    StringBuilder sb2 = new StringBuilder("code=");
                    i13 = i11;
                    sb2.append(i13);
                    sb2.append(",subCode=");
                    i14 = i12;
                    sb2.append(i14);
                    sb2.append(",message=");
                    str3 = str2;
                    sb2.append(str3);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime2, false, str, 4001, sb2.toString());
                } else {
                    i13 = i11;
                    i14 = i12;
                    str3 = str2;
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i10, i13, i14, str3, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f103211g;
                if (bVar2 != null) {
                    bVar2.a(i10, i11, i12, str2, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                String str3;
                b.this.f103207c.set(false);
                cVar.f103168h = System.currentTimeMillis();
                b.this.f103205a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config, on sdk config fetch success");
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    str3 = str;
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str3, 4002, "host_cfg is empty.");
                } else {
                    str3 = str;
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str3, i10, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f103211g;
                if (bVar2 != null) {
                    bVar2.a(i10, str2);
                }
            }
        }).b();
        return true;
    }
}
