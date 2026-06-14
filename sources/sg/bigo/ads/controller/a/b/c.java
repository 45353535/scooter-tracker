package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.controller.a.b f103252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final g f103253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final sg.bigo.ads.controller.b.d f103254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final h f103255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected sg.bigo.ads.common.n.e f103256f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AtomicInteger f103257g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected AtomicBoolean f103258h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103251a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f103259i = new Runnable() { // from class: sg.bigo.ads.controller.a.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f103252b != null) {
                if (cVar.f103256f == null) {
                    cVar.f103256f = cVar.a();
                }
                sg.bigo.ads.common.n.e eVar = c.this.f103256f;
                if (eVar == null || eVar.f102589a.get() != 0) {
                    c.this.d();
                    return;
                }
                Pair<String, Integer> pairA = c.a(c.this);
                if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first)) {
                    return;
                }
                c.this.a(pairA);
                c.this.f103252b.f103205a.a(0L);
                if (1 == ((Integer) pairA.second).intValue() % i.f102116a.y()) {
                    c.this.a((String) pairA.first, ((Integer) pairA.second).intValue(), "0");
                }
            }
        }
    };

    public c(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        this.f103252b = bVar;
        this.f103253c = gVar;
        this.f103254d = dVar;
        this.f103255e = hVar;
    }

    static /* synthetic */ Pair a(c cVar) {
        sg.bigo.ads.controller.a.b bVar = cVar.f103252b;
        if (bVar == null || bVar.f103205a == null) {
            return null;
        }
        return cVar.b().a(i.f102116a);
    }

    abstract sg.bigo.ads.common.n.e a();

    abstract void a(Pair<String, Integer> pair);

    abstract sg.bigo.ads.controller.a.a.b b();

    protected final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRound = Math.round((i.f102116a.z() / 2.0f) * 60000.0f);
        long jAbs = Math.abs(jCurrentTimeMillis - this.f103251a);
        if (this.f103251a == 0 || jAbs > iRound) {
            this.f103251a = jCurrentTimeMillis;
            this.f103257g.set(0);
            d();
        }
    }

    protected final void d() {
        if (this.f103257g.getAndAdd(1) >= 3 || this.f103258h.get()) {
            return;
        }
        sg.bigo.ads.common.n.d.a(this.f103259i);
        sg.bigo.ads.common.n.d.a(1, this.f103259i, 5000L);
    }

    protected final void a(Pair<String, Integer> pair, boolean z10) {
        if (this.f103252b == null || this.f103253c == null || this.f103254d == null || pair == null) {
            return;
        }
        boolean zA = b().a((String) pair.first, this.f103253c.v(), this.f103254d.s(), i.f102116a, z10);
        this.f103252b.f103205a.a(0L);
        if (zA) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }

    protected final void a(String str, int i10, String str2) {
        String str3 = this instanceof b ? "1" : this instanceof a ? "2" : "0";
        HashMap map = new HashMap();
        map.put("type", str3);
        map.put("host", str);
        map.put("retry_times", String.valueOf(i.f102116a.y()));
        map.put("retry_interval", String.valueOf(i.f102116a.z()));
        map.put("next_retry_interval", String.valueOf(i.f102116a.A()));
        map.put("cur_retry_time", String.valueOf(i10));
        map.put(CommonUrlParts.UUID, this.f103253c.X());
        map.put("action", str2);
        sg.bigo.ads.core.d.b.d(map);
    }

    protected static boolean a(int i10) {
        return i10 == 702 || i10 == 701 || i10 == 700;
    }
}
