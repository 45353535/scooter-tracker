package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;
import sg.bigo.ads.core.b.b.f;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.core.b.a.a f103962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f103963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f103964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f f103965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final f f103966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final sg.bigo.ads.common.g f103967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f103968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f103969h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f103970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f.a f103971j;

    public j(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.j jVar2, sg.bigo.ads.common.g gVar) {
        f.a aVar2 = new f.a() { // from class: sg.bigo.ads.core.b.b.j.1
            @Override // sg.bigo.ads.core.b.b.f.a
            public final void a() {
                j.this.f103964c.f();
                j.this.f103966e.b();
            }

            @Override // sg.bigo.ads.core.b.b.f.a
            public final void b() {
                j.this.f103966e.d();
            }
        };
        this.f103971j = aVar2;
        this.f103970i = context;
        i iVar = new i(aVar);
        this.f103963b = iVar;
        e eVar = new e(aVar);
        this.f103964c = eVar;
        this.f103962a = aVar;
        this.f103967f = gVar;
        this.f103965d = new h(iVar, jVar2, aVar2, context, aVar.f103910b);
        this.f103966e = new d(eVar, jVar, context, aVar.f103910b);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.2
            @Override // java.lang.Runnable
            public final void run() {
                j.this.f103969h = sg.bigo.ads.common.x.a.j();
                j jVar3 = j.this;
                if (jVar3.f103969h == 0) {
                    jVar3.f103969h = System.currentTimeMillis();
                }
                j.this.f103968g = c.a();
                j.a(j.this);
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.3
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                String str2 = str;
                (("impression".equals(str2) || Reporting.EventType.VIDEO_AD_CLICKED.equals(str2)) ? j.this.f103964c : j.this.f103963b).a(aVar);
                j.a(j.this);
                c cVar = j.this.f103968g;
                if (cVar != null) {
                    cVar.a(str);
                }
                if (TextUtils.isEmpty(j.this.f103967f.P())) {
                    return;
                }
                j.this.f103966e.b();
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                int iD = j.this.f103963b.d();
                j jVar = j.this;
                if (iD >= jVar.f103962a.f103909a) {
                    jVar.f103965d.b();
                    sb2 = new StringBuilder("SendImmediately -> action=");
                } else {
                    if (jVar.f103963b.e()) {
                        return;
                    }
                    j.this.f103965d.d();
                    sb2 = new StringBuilder("SendDefer -> action=");
                }
                sb2.append(str);
                sb2.append(", eventInfo=");
                sb2.append(aVar.toString());
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", sb2.toString());
            }
        });
    }

    static /* synthetic */ void a(j jVar) {
        c cVar = jVar.f103968g;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jVar.f103969h;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = jVar.f103968g;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f103943a, cVar2.f103944b, cVar2.f103945c, cVar2.f103946d);
            jVar.f103969h = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            jVar.f103968g.c();
        }
    }
}
