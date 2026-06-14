package sg.bigo.ads.core.e.a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.core.e.a.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f104109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f104110g = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f104113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f104114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f104115e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f104111a = p.a(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f104112b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f104116h = new Runnable() { // from class: sg.bigo.ads.core.e.a.d.2
        /* JADX WARN: Removed duplicated region for block: B:106:0x02a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x02b7  */
        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"ConcurrentModification", "IteratorRemove"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 846
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.e.a.d.AnonymousClass2.run():void");
        }
    };

    public static d a() {
        return f104110g;
    }

    static /* synthetic */ boolean c() {
        f104109f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f104109f = true;
        b();
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "startCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(1, this.f104116h, 20000L);
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "stopCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(this.f104116h);
    }

    public final void a(f fVar) {
        if (!f104109f) {
            d();
        }
        this.f104111a.add(fVar);
        g gVar = g.a.f104151a;
        g.a(fVar);
    }

    public final void b(final f fVar) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.a.f104151a;
                g.b(fVar);
            }
        });
    }
}
