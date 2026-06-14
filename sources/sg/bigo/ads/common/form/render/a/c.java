package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.form.render.c;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a.InterfaceC1260a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public Context f102375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f102376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f102377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.c[] f102378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f102379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PrivacyCheckBox f102380f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.a f102382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private Map<String, String> f102383i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<a> f102381g = new ArrayList();

    public c(@NonNull e eVar, @Nullable Map<String, Object> map, @NonNull Context context, c.a aVar) {
        this.f102375a = context;
        this.f102377c = eVar;
        this.f102376b = map;
        this.f102378d = eVar.m();
        this.f102382h = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f102383i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        PrivacyCheckBox privacyCheckBox = this.f102380f;
        return privacyCheckBox != null && privacyCheckBox.f102910a;
    }

    @Override // sg.bigo.ads.common.form.render.a.a.InterfaceC1260a
    public final void a(String str, String str2) {
        this.f102383i.put(str, str2);
        c.a aVar = this.f102382h;
        if (aVar != null) {
            aVar.a();
        }
    }
}
