package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5023cl extends R2 {
    public C5023cl(@NonNull InterfaceC5410s2 interfaceC5410s2) {
        super(interfaceC5410s2);
    }

    @Override // io.appmetrica.analytics.impl.R2
    public final C5155ho a(@NonNull C5103fo c5103fo, @Nullable C5155ho c5155ho, @NonNull InterfaceC5385r2 interfaceC5385r2) {
        if (c5155ho != null && !c5155ho.f77357c.f77446b) {
            return null;
        }
        C5155ho c5155hoA = ((Hd) interfaceC5385r2).a();
        c5155hoA.f77357c.f77445a = true;
        return this.f76332a.a(c5103fo, c5155hoA);
    }
}
