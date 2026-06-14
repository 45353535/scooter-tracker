package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5523wf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5473uf f78509a = new C5473uf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5374qf fromModel(@NonNull C5498vf c5498vf) {
        C5374qf c5374qf = new C5374qf();
        if (!TextUtils.isEmpty(c5498vf.f78452a)) {
            c5374qf.f78075a = c5498vf.f78452a;
        }
        c5374qf.f78076b = c5498vf.f78453b.toString();
        c5374qf.f78077c = c5498vf.f78454c;
        c5374qf.f78078d = c5498vf.f78455d;
        c5374qf.f78079e = this.f78509a.fromModel(c5498vf.f78456e).intValue();
        return c5374qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5498vf toModel(@NonNull C5374qf c5374qf) {
        JSONObject jSONObject;
        String str = c5374qf.f78075a;
        String str2 = c5374qf.f78076b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C5498vf(str, jSONObject, c5374qf.f78077c, c5374qf.f78078d, this.f78509a.toModel(Integer.valueOf(c5374qf.f78079e)));
    }
}
