package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5026co extends Wg {
    public C5026co(C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        String strJ = this.f76636a.f77064c.j();
        String str = w52.f76621h;
        this.f76636a.f77064c.j(str).b();
        if (TextUtils.equals(strJ, str)) {
            return false;
        }
        this.f76636a.a(U3.o());
        return false;
    }
}
