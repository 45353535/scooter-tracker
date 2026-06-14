package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5495vc implements InterfaceC5350pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5520wc f78447a;

    public C5495vc(C5520wc c5520wc) {
        this.f78447a = c5520wc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5350pg
    public final void a(@Nullable C5424sg c5424sg) {
        if (c5424sg == null) {
            return;
        }
        W5 w52 = new W5("", "", 0);
        w52.setValueBytes(c5424sg.a());
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        this.f78447a.a(w52);
    }
}
