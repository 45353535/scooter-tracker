package com.google.android.gms.tflite;

import ci.a;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.b;
import org.tensorflow.lite.c;
import org.tensorflow.lite.d;
import org.tensorflow.lite.f;

/* JADX INFO: loaded from: classes8.dex */
class NativeInterpreterWrapper implements AutoCloseable {
    private static final f zzc = f.SYSTEM;
    long zza;
    long zzb;
    private long zzd;
    private ByteBuffer zzf;
    private Map zzg;
    private Map zzh;
    private Map zzi;
    private TensorImpl[] zzj;
    private TensorImpl[] zzk;
    private long zze = 0;

    @UsedByReflection
    private long inferenceDurationNanoseconds = -1;
    private boolean zzl = false;
    private final List zzm = new ArrayList();
    private final List zzn = new ArrayList();

    NativeInterpreterWrapper(String str, zzc zzcVar) {
        TensorFlowLite.a();
        long jCreateErrorReporter = createErrorReporter(512);
        zzs(jCreateErrorReporter, createModel(str, jCreateErrorReporter), zzcVar);
    }

    private static native long allocateTensors(long j10, long j11);

    private static native long createCancellationFlag(long j10);

    private static native long createErrorReporter(int i10);

    private static native long createInterpreter(long j10, long j11, int i10, boolean z10, List<Long> list);

    private static native long createModel(String str, long j10);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j10);

    private static native void delete(long j10, long j11, long j12);

    private static native long deleteCancellationFlag(long j10);

    private static native int getInputCount(long j10);

    private static native String[] getInputNames(long j10);

    private static native int getInputTensorIndex(long j10, int i10);

    private static native int getOutputCount(long j10);

    private static native String[] getOutputNames(long j10);

    private static native int getOutputTensorIndex(long j10, int i10);

    private static native String[] getSignatureKeys(long j10);

    private static native boolean hasUnresolvedFlexOp(long j10);

    private static native boolean resizeInput(long j10, long j11, int i10, int[] iArr, boolean z10);

    private static native void run(long j10, long j11);

    private final NativeSignatureRunnerWrapper zzq(String str) {
        String str2;
        if (this.zzi == null) {
            this.zzi = new HashMap();
        }
        if (this.zzi.containsKey(str)) {
            str2 = str;
        } else {
            str2 = str;
            this.zzi.put(str2, new NativeSignatureRunnerWrapper(this.zzb, this.zza, str2));
        }
        return (NativeSignatureRunnerWrapper) this.zzi.get(str2);
    }

    private static b zzr(List list) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tflite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((b) it.next())) {
                    return null;
                }
            }
            return (b) cls.getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void zzs(long j10, long j11, zzc zzcVar) {
        long j12;
        b bVarZzr;
        zzc zzcVar2 = zzcVar == null ? new zzc() : zzcVar;
        zzcVar2.getAccelerationConfig();
        this.zza = j10;
        this.zzd = j11;
        ArrayList arrayList = new ArrayList();
        long jCreateInterpreter = createInterpreter(j11, j10, zzcVar2.getNumThreads(), zzcVar2.getUseXNNPACK(), arrayList);
        this.zzb = jCreateInterpreter;
        if (hasUnresolvedFlexOp(jCreateInterpreter) && (bVarZzr = zzr(zzcVar2.getDelegates())) != null) {
            this.zzn.add(bVarZzr);
            this.zzm.add(bVarZzr);
        }
        for (b bVar : zzcVar2.getDelegates()) {
            if (zzcVar2.getRuntime() != d.a.EnumC1156a.FROM_APPLICATION_ONLY && !(bVar instanceof a)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.zzm.add(bVar);
        }
        Iterator<c> it = zzcVar2.getDelegateFactories().iterator();
        if (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            throw null;
        }
        if (zzcVar2.getUseNNAPI()) {
            a aVar = new a();
            this.zzn.add(aVar);
            this.zzm.add(aVar);
        }
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (b bVar2 : this.zzm) {
            if (bVar2 instanceof a) {
                ((a) bVar2).n(interpreterFactoryImpl);
            }
        }
        arrayList.ensureCapacity(this.zzm.size());
        Iterator it2 = this.zzm.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((b) it2.next()).getNativeHandle()));
        }
        if (arrayList.isEmpty()) {
            j12 = j10;
        } else {
            delete(0L, 0L, this.zzb);
            j12 = j10;
            this.zzb = createInterpreter(j11, j12, zzcVar2.getNumThreads(), zzcVar2.getUseXNNPACK(), arrayList);
        }
        if (zzcVar2.isCancellable()) {
            this.zze = createCancellationFlag(this.zzb);
        }
        this.zzj = new TensorImpl[getInputCount(this.zzb)];
        this.zzk = new TensorImpl[getOutputCount(this.zzb)];
        allocateTensors(this.zzb, j12);
        this.zzl = true;
    }

    private final boolean zzt() {
        if (this.zzl) {
            return false;
        }
        this.zzl = true;
        allocateTensors(this.zzb, this.zza);
        for (TensorImpl tensorImpl : this.zzk) {
            if (tensorImpl != null) {
                tensorImpl.zzh();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i10 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.zzj;
            if (i10 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i10];
            if (tensorImpl != null) {
                tensorImpl.zze();
                this.zzj[i10] = null;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.zzk;
            if (i11 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i11];
            if (tensorImpl2 != null) {
                tensorImpl2.zze();
                this.zzk[i11] = null;
            }
            i11++;
        }
        delete(this.zza, this.zzd, this.zzb);
        deleteCancellationFlag(this.zze);
        this.zza = 0L;
        this.zzd = 0L;
        this.zzb = 0L;
        this.zze = 0L;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        this.zzl = false;
        this.zzm.clear();
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((b) it.next()).close();
        }
        this.zzn.clear();
    }

    final int zza(String str) {
        if (this.zzg == null) {
            String[] inputNames = getInputNames(this.zzb);
            this.zzg = new HashMap();
            if (inputNames != null) {
                for (int i10 = 0; i10 < inputNames.length; i10++) {
                    this.zzg.put(inputNames[i10], Integer.valueOf(i10));
                }
            }
        }
        if (this.zzg.containsKey(str)) {
            return ((Integer) this.zzg.get(str)).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.zzg));
    }

    final int zzb() {
        return this.zzj.length;
    }

    final int zzc(String str) {
        if (this.zzh == null) {
            String[] outputNames = getOutputNames(this.zzb);
            this.zzh = new HashMap();
            if (outputNames != null) {
                for (int i10 = 0; i10 < outputNames.length; i10++) {
                    this.zzh.put(outputNames[i10], Integer.valueOf(i10));
                }
            }
        }
        if (this.zzh.containsKey(str)) {
            return ((Integer) this.zzh.get(str)).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.zzh));
    }

    final int zzd() {
        return this.zzk.length;
    }

    final TensorImpl zze(int i10) {
        if (i10 >= 0) {
            TensorImpl[] tensorImplArr = this.zzj;
            if (i10 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i10];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j10 = this.zzb;
                TensorImpl tensorImplZzb = TensorImpl.zzb(j10, getInputTensorIndex(j10, i10));
                tensorImplArr[i10] = tensorImplZzb;
                return tensorImplZzb;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i10);
    }

    final TensorImpl zzf(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperZzq = zzq(str2);
        return nativeSignatureRunnerWrapperZzq.zzc() == 0 ? zze(nativeSignatureRunnerWrapperZzq.zza(str)) : nativeSignatureRunnerWrapperZzq.zzd(str);
    }

    final TensorImpl zzg(int i10) {
        if (i10 >= 0) {
            TensorImpl[] tensorImplArr = this.zzk;
            if (i10 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i10];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j10 = this.zzb;
                TensorImpl tensorImplZzb = TensorImpl.zzb(j10, getOutputTensorIndex(j10, i10));
                tensorImplArr[i10] = tensorImplZzb;
                return tensorImplZzb;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i10);
    }

    final TensorImpl zzh(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperZzq = zzq(str2);
        return nativeSignatureRunnerWrapperZzq.zzc() == 0 ? zzg(nativeSignatureRunnerWrapperZzq.zzb(str)) : nativeSignatureRunnerWrapperZzq.zze(str);
    }

    final Long zzi() {
        long j10 = this.inferenceDurationNanoseconds;
        if (j10 < 0) {
            return null;
        }
        return Long.valueOf(j10);
    }

    final void zzj() {
        zzt();
    }

    final void zzk(int i10, int[] iArr, boolean z10) {
        if (resizeInput(this.zzb, this.zza, i10, iArr, z10)) {
            this.zzl = false;
            TensorImpl tensorImpl = this.zzj[i10];
            if (tensorImpl != null) {
                tensorImpl.zzh();
            }
        }
    }

    final void zzl(Object[] objArr, Map map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        for (int i10 = 0; i10 < objArr.length; i10++) {
            int[] iArrZzj = zze(i10).zzj(objArr[i10]);
            if (iArrZzj != null) {
                zzk(i10, iArrZzj, false);
            }
        }
        boolean zZzt = zzt();
        for (int i11 = 0; i11 < objArr.length; i11++) {
            zze(i11).zzi(objArr[i11]);
        }
        long jNanoTime = System.nanoTime();
        run(this.zzb, this.zza);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (zZzt) {
            for (TensorImpl tensorImpl : this.zzk) {
                if (tensorImpl != null) {
                    tensorImpl.zzh();
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                zzg(((Integer) entry.getKey()).intValue()).zzf(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public final void zzm(Map map, Map map2, String str) {
        this.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperZzq = zzq(str);
        if (nativeSignatureRunnerWrapperZzq.zzc() == 0) {
            Object[] objArr = new Object[map.size()];
            for (Map.Entry entry : map.entrySet()) {
                objArr[nativeSignatureRunnerWrapperZzq.zza((String) entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                treeMap.put(Integer.valueOf(nativeSignatureRunnerWrapperZzq.zzb((String) entry2.getKey())), entry2.getValue());
            }
            zzl(objArr, treeMap);
            return;
        }
        for (Map.Entry entry3 : map.entrySet()) {
            int[] iArrZzj = zzf((String) entry3.getKey(), str).zzj(entry3.getValue());
            if (iArrZzj != null) {
                try {
                    nativeSignatureRunnerWrapperZzq.zzh((String) entry3.getKey(), iArrZzj);
                } catch (IllegalArgumentException e10) {
                    throw ((IllegalArgumentException) new IllegalArgumentException(String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), str)).initCause(e10));
                }
            }
        }
        nativeSignatureRunnerWrapperZzq.zzf();
        for (Map.Entry entry4 : map.entrySet()) {
            nativeSignatureRunnerWrapperZzq.zzd((String) entry4.getKey()).zzi(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        nativeSignatureRunnerWrapperZzq.zzg();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (Map.Entry entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                nativeSignatureRunnerWrapperZzq.zze((String) entry5.getKey()).zzf(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    final String[] zzn(String str) {
        return zzq(str).zzi();
    }

    public final String[] zzo() {
        return getSignatureKeys(this.zzb);
    }

    final String[] zzp(String str) {
        return zzq(str).zzj();
    }

    NativeInterpreterWrapper(ByteBuffer byteBuffer, zzc zzcVar) {
        TensorFlowLite.a();
        if (byteBuffer != null && ((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            this.zzf = byteBuffer;
            long jCreateErrorReporter = createErrorReporter(512);
            zzs(jCreateErrorReporter, createModelWithBuffer(this.zzf, jCreateErrorReporter), zzcVar);
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }
}
