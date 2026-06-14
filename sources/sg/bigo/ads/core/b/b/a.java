package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.b.c.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.AbstractRunnableC1287b f103923a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b f103924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.common.g f103925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Context f103926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f103927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.j f103928f;

    public a(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.g gVar) {
        this.f103926d = context;
        this.f103924b = new b(aVar);
        this.f103927e = aVar;
        this.f103928f = jVar;
        this.f103925c = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        sg.bigo.ads.core.b.c.b.a(this.f103923a);
        this.f103923a = null;
        final List<sg.bigo.ads.common.g.b.a> listA = this.f103924b.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listA.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f102437c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f103928f.a(map, new j.a() { // from class: sg.bigo.ads.core.b.b.a.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f103924b.a(listA, true);
                        a.this.f103924b.d();
                        if (a.this.f103924b.c()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f103924b.a(listA, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    final void b() {
        if (this.f103923a != null) {
            return;
        }
        this.f103923a = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(a.this.f103926d)) {
                    a.this.a();
                    return;
                }
                a aVar = a.this;
                aVar.f103923a = null;
                aVar.b();
            }
        }, this.f103927e.f103910b);
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                a.this.f103924b.a(aVar);
                if (TextUtils.isEmpty(a.this.f103925c.P())) {
                    return;
                }
                if ("impression".equals(str) || Reporting.EventType.VIDEO_AD_CLICKED.equals(str)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.this.a();
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
                a.a(a.this);
            }
        });
    }

    static /* synthetic */ void a(a aVar) {
        if (aVar.f103924b.b() >= aVar.f103927e.f103909a) {
            aVar.a();
        } else {
            if (aVar.f103924b.c()) {
                return;
            }
            aVar.b();
        }
    }
}
