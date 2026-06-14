package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Nb implements InterfaceC5410s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5437t4 f76160a;

    public Nb(@NonNull C5437t4 c5437t4) {
        this.f76160a = c5437t4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5410s2
    @Nullable
    public final C5155ho a(@NonNull C5103fo c5103fo, @NonNull C5155ho c5155ho) {
        int i10 = c5103fo.f77188b;
        int i11 = this.f76160a.f78257a;
        if (i10 == i11) {
            if (((C5155ho) ((HashMap) c5103fo.f77187a.get(c5155ho.f77356b)).get(new String(c5155ho.f77355a))) != null) {
                ((HashMap) c5103fo.f77187a.get(c5155ho.f77356b)).put(new String(c5155ho.f77355a), c5155ho);
                return c5155ho;
            }
        } else if (i10 < i11) {
            ((HashMap) c5103fo.f77187a.get(c5155ho.f77356b)).put(new String(c5155ho.f77355a), c5155ho);
            c5103fo.f77188b++;
        }
        return c5155ho;
    }
}
