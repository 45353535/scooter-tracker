package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class I3 extends X7 {
    @Override // io.appmetrica.analytics.impl.X7
    public final boolean a(@NotNull C5586z3 c5586z3, @NotNull C5586z3 c5586z32) {
        if (no.a(c5586z32.f78603a)) {
            return true;
        }
        if (no.a(c5586z3.f78603a)) {
            return false;
        }
        Y7 y72 = c5586z3.f78604b;
        if (y72 == Y7.f76695c) {
            if (((Number) this.f76664a.a(y72)).intValue() >= ((Number) this.f76664a.a(c5586z32.f78604b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f76664a.a(y72)).intValue() > ((Number) this.f76664a.a(c5586z32.f78604b)).intValue()) {
            return true;
        }
        return false;
    }
}
