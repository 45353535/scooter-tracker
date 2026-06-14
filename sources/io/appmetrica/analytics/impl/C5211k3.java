package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5211k3 implements vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8 f77585a;

    public C5211k3() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        byte[] bArrDecode = new byte[0];
        String str = s82.f76409b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        M8 m82 = this.f77585a;
        return ((L8) m82.f76120a.a(s82.f76422o)).a(bArrDecode);
    }

    public C5211k3(M8 m82) {
        this.f77585a = m82;
    }
}
