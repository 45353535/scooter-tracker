package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4969aj extends Wg {
    public C4969aj(@NonNull C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        String str = w52.f76621h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f76636a.f77064c.j(str).b();
        return false;
    }
}
