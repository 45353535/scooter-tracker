package com.google.android.gms.tflite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.d;
import org.tensorflow.lite.g;

/* JADX INFO: loaded from: classes8.dex */
final class zzd implements d, AutoCloseable {
    NativeInterpreterWrapper zza;
    private final String[] zzb = getSignatureKeys();

    zzd(File file, zzc zzcVar) {
        this.zza = new NativeInterpreterWrapper(file.getAbsolutePath(), zzcVar);
    }

    public final void allocateTensors() {
        zza();
        this.zza.zzj();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.zza;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.zza = null;
        }
    }

    protected final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final int getInputIndex(String str) {
        zza();
        return this.zza.zza(str);
    }

    public final g getInputTensor(int i10) {
        zza();
        return this.zza.zze(i10);
    }

    public final int getInputTensorCount() {
        zza();
        return this.zza.zzb();
    }

    public final g getInputTensorFromSignature(String str, String str2) {
        zza();
        if (str2 == null) {
            String[] strArr = this.zzb;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.zza.zzf(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ".concat(String.valueOf(Arrays.toString(this.zzb))));
    }

    public final Long getLastNativeInferenceDurationNanoseconds() {
        zza();
        return this.zza.zzi();
    }

    public final int getOutputIndex(String str) {
        zza();
        return this.zza.zzc(str);
    }

    public final g getOutputTensor(int i10) {
        zza();
        return this.zza.zzg(i10);
    }

    public final int getOutputTensorCount() {
        zza();
        return this.zza.zzd();
    }

    public final g getOutputTensorFromSignature(String str, String str2) {
        zza();
        if (str2 == null) {
            String[] strArr = this.zzb;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.zza.zzh(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ".concat(String.valueOf(Arrays.toString(this.zzb))));
    }

    public final String[] getSignatureInputs(String str) {
        zza();
        return this.zza.zzn(str);
    }

    public final String[] getSignatureKeys() {
        zza();
        return this.zza.zzo();
    }

    public final String[] getSignatureOutputs(String str) {
        zza();
        return this.zza.zzp(str);
    }

    public final void resizeInput(int i10, int[] iArr) {
        zza();
        this.zza.zzk(i10, iArr, false);
    }

    public final void run(Object obj, Object obj2) {
        Object[] objArr = {obj};
        HashMap map = new HashMap();
        map.put(0, obj2);
        runForMultipleInputsOutputs(objArr, map);
    }

    public final void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        zza();
        this.zza.zzl(objArr, map);
    }

    public final void runSignature(Map map, Map map2) {
        zza();
        runSignature(map, map2, null);
    }

    final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    zzd(ByteBuffer byteBuffer, zzc zzcVar) {
        this.zza = new NativeInterpreterWrapper(byteBuffer, zzcVar);
    }

    public final void resizeInput(int i10, int[] iArr, boolean z10) {
        zza();
        this.zza.zzk(i10, iArr, z10);
    }

    public final void runSignature(Map map, Map map2, String str) {
        zza();
        if (str == null) {
            String[] strArr = this.zzb;
            if (strArr.length == 1) {
                str = strArr[0];
            }
        }
        if (str != null) {
            this.zza.zzm(map, map2, str);
            return;
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ".concat(String.valueOf(Arrays.toString(this.zzb))));
    }
}
