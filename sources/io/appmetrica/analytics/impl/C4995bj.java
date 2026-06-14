package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4995bj extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5573yf f76917b;

    public C4995bj(@NonNull C5058e5 c5058e5) {
        this(c5058e5, C5468ua.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(w52.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f76917b.b(C5498vf.a(jSONObjectOptJSONObject));
        return false;
    }

    public C4995bj(C5058e5 c5058e5, C5573yf c5573yf) {
        super(c5058e5);
        this.f76917b = c5573yf;
    }
}
