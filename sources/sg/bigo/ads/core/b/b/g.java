package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.core.b.a.a f103958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f103959b = p.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f103960c = p.a(a());

    public g(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f103958a = aVar;
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        });
    }

    protected int a() {
        return this.f103958a.f103909a;
    }

    protected List<sg.bigo.ads.common.g.b.a> b() {
        return sg.bigo.ads.common.g.c.a.a(this.f103958a.a());
    }

    final synchronized List<sg.bigo.ads.common.g.b.a> c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f103959b);
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f103960c.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f103959b.clear();
            this.f103960c.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    final synchronized int d() {
        return this.f103959b.size();
    }

    final synchronized boolean e() {
        return this.f103959b.isEmpty();
    }

    public final synchronized void f() {
        try {
            if (this.f103959b.isEmpty()) {
                List<sg.bigo.ads.common.g.b.a> listB = b();
                Iterator<sg.bigo.ads.common.g.b.a> it = this.f103960c.iterator();
                while (it.hasNext()) {
                    listB.remove(it.next());
                }
                this.f103959b.addAll(listB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        this.f103960c.clear();
        this.f103959b.clear();
    }

    final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        try {
            this.f103960c.removeAll(list);
            if (!z10) {
                this.f103959b.addAll(list);
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
        this.f103959b.add(aVar);
        aVar.f102435a = sg.bigo.ads.common.g.c.a.a(aVar);
    }

    static /* synthetic */ void a(g gVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) gVar.f103958a.f103911c));
        gVar.f103959b.addAll(gVar.b());
    }
}
