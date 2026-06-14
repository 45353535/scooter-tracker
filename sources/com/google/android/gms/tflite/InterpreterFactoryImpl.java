package com.google.android.gms.tflite;

import ci.a;
import com.google.android.gms.tflite.nnapi.NnApiDelegateImpl;
import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.d;
import org.tensorflow.lite.e;

/* JADX INFO: loaded from: classes8.dex */
@UsedByReflection
class InterpreterFactoryImpl implements e {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    public final d create(File file, d.a aVar) {
        return new zzd(file, aVar == null ? null : new zzc(aVar));
    }

    @Override // org.tensorflow.lite.e
    public final a.b createNnApiDelegateImpl(a.C0154a c0154a) {
        return new NnApiDelegateImpl(c0154a);
    }

    public final String runtimeVersion() {
        TensorFlowLite.a();
        return nativeRuntimeVersion();
    }

    public final String schemaVersion() {
        TensorFlowLite.a();
        return nativeSchemaVersion();
    }

    public final d create(ByteBuffer byteBuffer, d.a aVar) {
        return new zzd(byteBuffer, aVar == null ? null : new zzc(aVar));
    }
}
