package sg.bigo.ads.core.b;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.core.b.b.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b f103914i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.core.b.b.a f103915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f103916b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f103917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sg.bigo.ads.core.b.a.a f103918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f103919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.common.j f103920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.common.j f103921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f103922h;

    private b() {
    }

    public static b a() {
        return f103914i;
    }

    public final void a(String str, @NonNull Map<String, Object> map) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        if (!this.f103916b.get()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "please execute init first");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        sg.bigo.ads.core.b.a.a aVar = this.f103918d;
        if (aVar != null && aVar.f103912d) {
            if (this.f103917c == null) {
                this.f103917c = new j(this.f103919e, aVar, this.f103920f, this.f103921g, this.f103922h);
            }
            this.f103917c.a(str, jSONObject);
        } else {
            sg.bigo.ads.core.b.b.a aVar2 = this.f103915a;
            if (aVar2 != null) {
                aVar2.a(str, jSONObject);
            }
        }
    }
}
