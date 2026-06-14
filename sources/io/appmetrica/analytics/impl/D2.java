package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes12.dex */
public final class D2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5055e2 fromModel(@NonNull F2 f22) {
        C5055e2 c5055e2 = new C5055e2();
        E2 e22 = f22.f75756a;
        if (e22 != null) {
            int iOrdinal = e22.ordinal();
            if (iOrdinal == 1) {
                c5055e2.f77058a = 1;
            } else if (iOrdinal == 2) {
                c5055e2.f77058a = 2;
            } else if (iOrdinal == 3) {
                c5055e2.f77058a = 3;
            } else if (iOrdinal == 4) {
                c5055e2.f77058a = 4;
            } else if (iOrdinal == 5) {
                c5055e2.f77058a = 5;
            }
        }
        Boolean bool = f22.f75757b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c5055e2.f77059b = 1;
                return c5055e2;
            }
            c5055e2.f77059b = 0;
        }
        return c5055e2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F2 toModel(@NonNull C5055e2 c5055e2) {
        E2 e22;
        int i10 = c5055e2.f77058a;
        Boolean bool = null;
        if (i10 == 1) {
            e22 = E2.ACTIVE;
        } else if (i10 == 2) {
            e22 = E2.WORKING_SET;
        } else if (i10 == 3) {
            e22 = E2.FREQUENT;
        } else if (i10 != 4) {
            e22 = i10 != 5 ? null : E2.RESTRICTED;
        } else {
            e22 = E2.RARE;
        }
        int i11 = c5055e2.f77059b;
        if (i11 == 0) {
            bool = Boolean.FALSE;
        } else if (i11 == 1) {
            bool = Boolean.TRUE;
        }
        return new F2(e22, bool);
    }
}
