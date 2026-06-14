package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f104534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, b> f104535b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, RunnableC1300a> f104536c = new HashMap();

    /* JADX INFO: renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    class RunnableC1300a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<sg.bigo.ads.common.h.a> f104537a;

        public RunnableC1300a(sg.bigo.ads.common.h.a aVar) {
            this.f104537a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.common.h.a> weakReference = RunnableC1300a.this.f104537a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC1300a runnableC1300a = RunnableC1300a.this;
                    a.this.f104536c.remove(runnableC1300a.f104537a.get().f102457a);
                    RunnableC1300a runnableC1300a2 = RunnableC1300a.this;
                    a.this.f104534a.c(runnableC1300a2.f104537a.get());
                }
            });
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sg.bigo.ads.common.h.a f104540a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f104540a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    b bVar = b.this;
                    sg.bigo.ads.common.h.a aVar = bVar.f104540a;
                    if (aVar != null) {
                        a.this.f104535b.remove(aVar.f102457a);
                        b bVar2 = b.this;
                        a.this.f104534a.b(bVar2.f104540a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f104534a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.f104536c.containsKey(aVar.f102457a)) {
                    sg.bigo.ads.common.n.d.a(this.f104536c.remove(aVar.f102457a));
                }
                RunnableC1300a runnableC1300a = new RunnableC1300a(aVar);
                this.f104536c.put(aVar.f102457a, runnableC1300a);
                sg.bigo.ads.common.n.d.a(3, runnableC1300a, ((long) aVar.f()) * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.f104536c.containsKey(aVar.f102457a)) {
            sg.bigo.ads.common.n.d.a(this.f104536c.get(aVar.f102457a));
            this.f104536c.remove(aVar.f102457a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.f104535b.containsKey(aVar.f102457a)) {
            sg.bigo.ads.common.n.d.a(this.f104535b.remove(aVar.f102457a));
            sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + aVar.f102457a);
        }
        b bVar = new b(aVar);
        this.f104535b.put(aVar.f102457a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, ((long) aVar.e()) * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}
