package sg.bigo.ads.core.d.b;

import android.content.Context;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.d.a.a;
import sg.bigo.ads.core.d.c.a;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.core.d.a.a f104021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a.b f104022b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f104023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g f104024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f104025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f104026f;

    public b(Context context, sg.bigo.ads.core.d.a.a aVar, j jVar, g gVar) {
        this.f104025e = context;
        this.f104023c = new c(aVar);
        this.f104021a = aVar;
        this.f104026f = jVar;
        this.f104024d = gVar;
    }

    public static a b(String str, Map<String, String> map) {
        return new a(str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        sg.bigo.ads.core.d.c.a.a(this.f104022b);
        this.f104022b = null;
        final List<sg.bigo.ads.common.g.b.b> listA = this.f104023c.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (sg.bigo.ads.common.g.b.b bVar : listA) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", bVar.f102443b);
                jSONObject.put("event_info", bVar.f102444c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap map = new HashMap();
        map.put("sdk_events", jSONArray);
        this.f104026f.a(map, new j.a() { // from class: sg.bigo.ads.core.d.b.b.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f104023c.a(listA, true);
                        b.this.f104023c.d();
                        b.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f104023c.a(listA, false);
                        b.this.b();
                    }
                });
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final Map<String, String> map) {
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                a.C1289a c1289a = b.this.f104021a.f104012c.get(str);
                boolean z10 = c1289a == null ? true : c1289a.f104015c;
                a.C1289a c1289a2 = b.this.f104021a.f104012c.get(str);
                long jCurrentTimeMillis = ((long) (c1289a2 == null ? Constants.ONE_HOUR : c1289a2.f104016d)) + System.currentTimeMillis();
                a aVarB = b.b(str, map);
                b bVar = b.this;
                bVar.f104023c.a(aVarB.a(bVar.f104024d, jCurrentTimeMillis));
                if (z10) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendDefer -> eventId=" + str + ", events=" + map);
                    b.a(b.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendImmediately -> eventId=" + str + ", events=" + map);
                b.this.a();
            }
        });
    }

    final void b() {
        if (this.f104022b != null) {
            return;
        }
        if (this.f104023c.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Stats", "no events waitting for sending");
        } else {
            this.f104022b = sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.common.aa.c.b(b.this.f104025e)) {
                        b.this.a();
                        return;
                    }
                    b bVar = b.this;
                    bVar.f104022b = null;
                    bVar.b();
                }
            }, this.f104021a.f104011b);
        }
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.f104023c.b() >= bVar.f104021a.f104010a) {
            bVar.a();
        } else {
            bVar.b();
        }
    }
}
