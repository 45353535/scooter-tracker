package sg.bigo.ads.core.b.b;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.b.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g f103947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.common.j f103948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f103949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f103950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b.AbstractRunnableC1287b f103951e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final a f103952f;

    public interface a {
        void a();

        void b();
    }

    public f(g gVar, sg.bigo.ads.common.j jVar, a aVar, Context context, long j10) {
        this.f103952f = aVar;
        this.f103950d = context;
        this.f103949c = j10;
        this.f103947a = gVar;
        this.f103948b = jVar;
    }

    protected void a() {
        if (this.f103947a.e()) {
            return;
        }
        d();
    }

    protected final void b() {
        g gVar = this.f103947a;
        if (gVar == null) {
            sg.bigo.ads.common.t.a.b("Callback", "sendEventsRightNow but EventStorage null!!");
            return;
        }
        final List<sg.bigo.ads.common.g.b.a> listC = gVar.c();
        if (listC.isEmpty()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "sendEventsRightNow but event list is empty!!");
            return;
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listC.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f102437c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f103948b.a(map, new j.a() { // from class: sg.bigo.ads.core.b.b.f.1
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f103947a.a(listC, true);
                        f.this.f103947a.f();
                        f.this.a();
                        a aVar = f.this.f103952f;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f103947a.a(listC, false);
                        f.this.d();
                        a aVar = f.this.f103952f;
                        if (aVar != null) {
                            aVar.b();
                        }
                    }
                });
            }
        });
    }

    protected final void c() {
        sg.bigo.ads.core.b.c.b.a(this.f103951e);
        this.f103951e = null;
    }

    protected final void d() {
        if (this.f103951e != null) {
            return;
        }
        this.f103951e = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(f.this.f103950d)) {
                    f.this.b();
                } else {
                    f.this.c();
                    f.this.d();
                }
            }
        }, this.f103949c);
    }
}
