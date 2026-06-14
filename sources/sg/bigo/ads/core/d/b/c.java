package sg.bigo.ads.core.d.b;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f104035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f104036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.d.a.a f104037c;

    public c(@NonNull sg.bigo.ads.core.d.a.a aVar) {
        this.f104037c = aVar;
        this.f104035a = p.a(aVar.f104010a);
        this.f104036b = p.a(aVar.f104010a);
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(jCurrentTimeMillis)), null))));
                cVar.f104035a.addAll(cVar.e());
            }
        });
    }

    final synchronized List<sg.bigo.ads.common.g.b.b> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f104035a);
            Iterator<sg.bigo.ads.common.g.b.b> it = this.f104036b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f104035a.clear();
            this.f104036b.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    final synchronized int b() {
        return this.f104035a.size();
    }

    final synchronized boolean c() {
        return this.f104035a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.f104035a.isEmpty()) {
                List<sg.bigo.ads.common.g.b.b> listE = e();
                Iterator<sg.bigo.ads.common.g.b.b> it = this.f104036b.iterator();
                while (it.hasNext()) {
                    listE.remove(it.next());
                }
                this.f104035a.addAll(listE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final List<sg.bigo.ads.common.g.b.b> e() {
        return sg.bigo.ads.common.g.c.b.a(this.f104037c.a());
    }

    public final synchronized void f() {
        this.f104036b.clear();
        this.f104035a.clear();
    }

    final synchronized void a(List<sg.bigo.ads.common.g.b.b> list, boolean z10) {
        try {
            this.f104036b.removeAll(list);
            if (!z10) {
                this.f104035a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.common.g.b.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().f102442a));
            }
            sg.bigo.ads.common.g.c.b.a(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void a(sg.bigo.ads.common.g.b.b bVar) {
        try {
            this.f104035a.add(bVar);
            sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "insertStatInfo:" + bVar.toString());
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_id", bVar.f102443b);
            contentValues.put("event_info", bVar.f102444c);
            contentValues.put("expired_ts", Long.valueOf(bVar.f102445d));
            contentValues.put("ext", bVar.f102446e);
            long jCurrentTimeMillis = bVar.f102447f;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
            long jCurrentTimeMillis2 = bVar.f102448g;
            if (jCurrentTimeMillis2 == 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
            bVar.f102442a = sg.bigo.ads.common.g.a.a.a("tb_stat", contentValues);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
