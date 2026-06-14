package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f103937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f103938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f103939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f103940d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f103941e;

    public b(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f103939c = aVar;
        this.f103937a = p.a(aVar.f103909a);
        this.f103938b = p.a(aVar.f103909a);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    private void f() {
        c cVar = this.f103941e;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f103940d;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = this.f103941e;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f103943a, cVar2.f103944b, cVar2.f103945c, cVar2.f103946d);
            this.f103940d = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            this.f103941e.c();
        }
    }

    private List<sg.bigo.ads.common.g.b.a> g() {
        return sg.bigo.ads.common.g.c.a.a(this.f103939c.a());
    }

    final synchronized List<sg.bigo.ads.common.g.b.a> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f103937a);
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f103938b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f103937a.clear();
            this.f103938b.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    final synchronized int b() {
        return this.f103937a.size();
    }

    final synchronized boolean c() {
        return this.f103937a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.f103937a.isEmpty()) {
                List<sg.bigo.ads.common.g.b.a> listG = g();
                Iterator<sg.bigo.ads.common.g.b.a> it = this.f103938b.iterator();
                while (it.hasNext()) {
                    listG.remove(it.next());
                }
                this.f103937a.addAll(listG);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f103938b.clear();
        this.f103937a.clear();
    }

    final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        try {
            this.f103938b.removeAll(list);
            if (!z10) {
                this.f103937a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.common.g.b.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().f102435a));
            }
            sg.bigo.ads.common.g.c.a.a(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void a(sg.bigo.ads.common.g.b.a aVar) {
        this.f103937a.add(aVar);
        aVar.f102435a = sg.bigo.ads.common.g.c.a.a(aVar);
        f();
        this.f103941e.a(aVar.f102436b);
    }

    static /* synthetic */ void a(b bVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) bVar.f103939c.f103911c));
        bVar.f103937a.addAll(bVar.g());
        long j10 = sg.bigo.ads.common.x.a.j();
        bVar.f103940d = j10;
        if (j10 == 0) {
            bVar.f103940d = System.currentTimeMillis();
        }
        bVar.f103941e = c.a();
        bVar.f();
    }
}
