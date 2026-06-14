package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wo implements vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H8 f78542a;

    public wo() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        if (!((C5058e5) c5351ph.f77991l).B() && !TextUtils.isEmpty(s82.f76409b)) {
            try {
                JSONObject jSONObject = new JSONObject(s82.f76409b);
                jSONObject.remove("preloadInfo");
                s82.f76409b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f78542a.a(s82, c5351ph);
    }

    public wo(H8 h82) {
        this.f78542a = h82;
    }
}
