package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes12.dex */
public final class Rm extends Vm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f76377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f76378c;

    public Rm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f76376a = str;
        this.f76377b = protobufStateSerializer;
        this.f76378c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        String str = this.f76376a;
        ProtobufStateSerializer protobufStateSerializer = this.f76377b;
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
        return new Rf(str, iBinaryDataHelper, new F8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), this.f76378c);
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
