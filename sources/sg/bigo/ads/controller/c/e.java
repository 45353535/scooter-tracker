package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f103438a;

    public e(@NonNull JSONObject jSONObject) {
        this.f103438a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.h.a
    public final boolean a() {
        return this.f103438a;
    }

    @Override // sg.bigo.ads.api.core.h.a
    @NonNull
    public final String[] b() {
        return new String[0];
    }
}
