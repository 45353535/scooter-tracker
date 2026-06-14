package com.google.android.gms.tflite;

/* JADX INFO: loaded from: classes8.dex */
final class NativeSignatureRunnerWrapper {
    private final long zza;
    private final long zzb;
    private boolean zzc = false;

    NativeSignatureRunnerWrapper(long j10, long j11, String str) {
        this.zzb = j11;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(j10, str);
        this.zza = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner != -1) {
            return;
        }
        throw new IllegalArgumentException("Input error: Signature " + str + " not found.");
    }

    private static native void nativeAllocateTensors(long j10, long j11);

    private static native int nativeGetInputIndex(long j10, String str);

    private static native int nativeGetOutputIndex(long j10, String str);

    private static native long nativeGetSignatureRunner(long j10, String str);

    private static native int nativeGetSubgraphIndex(long j10);

    private static native String[] nativeInputNames(long j10);

    private static native void nativeInvoke(long j10, long j11);

    private static native String[] nativeOutputNames(long j10);

    private static native boolean nativeResizeInput(long j10, long j11, String str, int[] iArr);

    public final int zza(String str) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.zza, str);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new IllegalArgumentException("Input error: input " + str + " not found.");
    }

    public final int zzb(String str) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.zza, str);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new IllegalArgumentException("Input error: output " + str + " not found.");
    }

    public final int zzc() {
        return nativeGetSubgraphIndex(this.zza);
    }

    public final TensorImpl zzd(String str) {
        return TensorImpl.zzc(this.zza, str);
    }

    public final TensorImpl zze(String str) {
        return TensorImpl.zzd(this.zza, str);
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        nativeAllocateTensors(this.zza, this.zzb);
        this.zzc = true;
    }

    public final void zzg() {
        nativeInvoke(this.zza, this.zzb);
    }

    public final boolean zzh(String str, int[] iArr) {
        this.zzc = false;
        return nativeResizeInput(this.zza, this.zzb, str, iArr);
    }

    public final String[] zzi() {
        return nativeInputNames(this.zza);
    }

    public final String[] zzj() {
        return nativeOutputNames(this.zza);
    }
}
