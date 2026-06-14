package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes12.dex */
public final class Qm extends Vm {
    @Override // io.appmetrica.analytics.impl.Vm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        G3 g32 = new G3();
        try {
            bArrA = AbstractC5253lj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC5253lj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Rf("clids_info", iBinaryDataHelper, new F8(g32, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new B3());
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper iBinaryDataHelperF;
        C5112g7 c5112g7A = C5112g7.a(context);
        synchronized (c5112g7A) {
            iBinaryDataHelperF = c5112g7A.f();
        }
        return iBinaryDataHelperF;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper a(Context context) {
        return C5112g7.a(context).g();
    }
}
