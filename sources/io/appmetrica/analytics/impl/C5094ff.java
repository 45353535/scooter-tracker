package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5094ff implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5473uf f77164a;

    public C5094ff() {
        this(new C5473uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5398rf fromModel(@NonNull C5146hf c5146hf) {
        C5398rf c5398rf = new C5398rf();
        if (!TextUtils.isEmpty(c5146hf.f77306a)) {
            c5398rf.f78149a = c5146hf.f77306a;
        }
        c5398rf.f78150b = c5146hf.f77307b.toString();
        c5398rf.f78151c = this.f77164a.fromModel(c5146hf.f77308c).intValue();
        return c5398rf;
    }

    public C5094ff(C5473uf c5473uf) {
        this.f77164a = c5473uf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5146hf toModel(@NonNull C5398rf c5398rf) {
        JSONObject jSONObject;
        String str = c5398rf.f78149a;
        String str2 = c5398rf.f78150b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C5146hf(str, jSONObject, this.f77164a.toModel(Integer.valueOf(c5398rf.f78151c)));
    }
}
