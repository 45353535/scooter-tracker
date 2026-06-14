package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4993bh extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo f76913b;

    public C4993bh(@NonNull C5058e5 c5058e5) {
        this(c5058e5, c5058e5.u());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        C5058e5 c5058e5 = this.f76636a;
        if (this.f76913b.c()) {
            return false;
        }
        if (!this.f76913b.d()) {
            C5392r9 c5392r9 = c5058e5.f77075n;
            c5392r9.f78129c.b(W5.a(w52, EnumC5168ib.EVENT_TYPE_FIRST_ACTIVATION));
        }
        zo zoVar = this.f76913b;
        synchronized (zoVar) {
            Ao ao = zoVar.f78664a;
            ao.a(ao.a().put("first_event_done", true));
        }
        return false;
    }

    public C4993bh(C5058e5 c5058e5, zo zoVar) {
        super(c5058e5);
        this.f76913b = zoVar;
    }
}
