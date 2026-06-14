package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes12.dex */
public final class Sf implements vo {
    @Override // io.appmetrica.analytics.impl.vo
    public final byte[] a(S8 s82, C5351ph c5351ph) {
        if (!TextUtils.isEmpty(s82.f76409b)) {
            try {
                byte[] bArrDecode = Base64.decode(s82.f76409b, 0);
                C5424sg c5424sg = (bArrDecode == null || bArrDecode.length == 0) ? null : new C5424sg(bArrDecode);
                C4966ag c4966ag = new C4966ag();
                String str = c5424sg.f78236a;
                c4966ag.f76840a = str == null ? new byte[0] : str.getBytes();
                c4966ag.f76842c = c5424sg.f78237b;
                c4966ag.f76841b = c5424sg.f78238c;
                int iOrdinal = c5424sg.f78239d.ordinal();
                int i10 = 1;
                if (iOrdinal != 1) {
                    i10 = 2;
                    if (iOrdinal != 2) {
                        i10 = 0;
                    }
                }
                c4966ag.f76843d = i10;
                return MessageNano.toByteArray(c4966ag);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
