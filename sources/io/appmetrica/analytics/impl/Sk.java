package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nk f76450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rk f76451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f76452d;

    public Sk(Context context, X4 x42) {
        x42.a();
        this.f76449a = "session_extras";
        this.f76450b = new Nk();
        this.f76451c = new Rk();
        this.f76452d = C5112g7.a(context).a(x42);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f76452d.get(this.f76449a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f76450b.toModel(this.f76451c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Nk nk = this.f76450b;
        this.f76451c.getClass();
        return nk.toModel(new Pk());
    }
}
