package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class Pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f76254a;

    public Pd(Ud ud2) {
        this.f76254a = ud2;
    }

    public final Qd a(Context context, Xg xg2) {
        return new Qd(context, xg2, this.f76254a, new Yd() { // from class: io.appmetrica.analytics.impl.mp
            @Override // io.appmetrica.analytics.impl.Yd
            public final InterfaceC5074el a(E0 e02) {
                return Pd.a(e02);
            }
        }, EnumC5168ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Qd b(Context context, Xg xg2) {
        return new Qd(context, xg2, this.f76254a, new Yd() { // from class: io.appmetrica.analytics.impl.np
            @Override // io.appmetrica.analytics.impl.Yd
            public final InterfaceC5074el a(E0 e02) {
                return Pd.b(e02);
            }
        }, EnumC5168ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC5074el a(E0 e02) {
        return new Nd(e02.f75694f.f75751d);
    }

    public static final InterfaceC5074el b(E0 e02) {
        return new X();
    }
}
