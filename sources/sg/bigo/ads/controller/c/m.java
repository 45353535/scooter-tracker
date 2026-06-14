package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103478c;

    public m(@NonNull JSONObject jSONObject) {
        this.f103476a = jSONObject.optString("vendor_url");
        this.f103477b = jSONObject.optString("vendor_key");
        this.f103478c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String a() {
        return this.f103476a;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String b() {
        return this.f103477b;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String c() {
        return this.f103478c;
    }
}
