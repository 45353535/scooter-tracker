package com.google.android.gms.tflite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.a;
import org.tensorflow.lite.g;

/* JADX INFO: loaded from: classes8.dex */
final class TensorImpl implements g {
    private long zza;
    private final a zzb;
    private int[] zzc;
    private final int[] zzd;
    private final g.a zze;

    private TensorImpl(long j10) {
        a aVar;
        this.zza = j10;
        int iDtype = dtype(j10);
        switch (iDtype) {
            case 1:
                aVar = a.FLOAT32;
                break;
            case 2:
                aVar = a.INT32;
                break;
            case 3:
                aVar = a.UINT8;
                break;
            case 4:
                aVar = a.INT64;
                break;
            case 5:
                aVar = a.STRING;
                break;
            case 6:
                aVar = a.BOOL;
                break;
            case 7:
                aVar = a.INT16;
                break;
            case 8:
            default:
                throw new IllegalArgumentException("DataType error: DataType " + iDtype + " is not recognized in Java.");
            case 9:
                aVar = a.INT8;
                break;
        }
        this.zzb = aVar;
        this.zzc = shape(j10);
        this.zzd = shapeSignature(j10);
        this.zze = new g.a(quantizationScale(j10), quantizationZeroPoint(j10));
    }

    private static native ByteBuffer buffer(long j10);

    private static native long create(long j10, int i10, int i11);

    private static native long createSignatureInputTensor(long j10, String str);

    private static native long createSignatureOutputTensor(long j10, String str);

    private static native void delete(long j10);

    private static native int dtype(long j10);

    private static native boolean hasDelegateBufferHandle(long j10);

    private static native int index(long j10);

    private static native String name(long j10);

    private static native int numBytes(long j10);

    private static native float quantizationScale(long j10);

    private static native int quantizationZeroPoint(long j10);

    private static native void readMultiDimensionalArray(long j10, Object obj);

    private static native int[] shape(long j10);

    private static native int[] shapeSignature(long j10);

    private static native void writeDirectBuffer(long j10, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j10, Object obj);

    private static native void writeScalar(long j10, Object obj);

    static int zza(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return zza(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    static TensorImpl zzb(long j10, int i10) {
        return new TensorImpl(create(j10, i10, 0));
    }

    static TensorImpl zzc(long j10, String str) {
        long jCreateSignatureInputTensor = createSignatureInputTensor(j10, str);
        if (jCreateSignatureInputTensor != -1) {
            return new TensorImpl(jCreateSignatureInputTensor);
        }
        throw new IllegalArgumentException("Input error: input " + str + " not found.");
    }

    static TensorImpl zzd(long j10, String str) {
        long jCreateSignatureOutputTensor = createSignatureOutputTensor(j10, str);
        if (jCreateSignatureOutputTensor != -1) {
            return new TensorImpl(jCreateSignatureOutputTensor);
        }
        throw new IllegalArgumentException("Input error: output " + str + " not found.");
    }

    static void zzg(Object obj, int i10, int[] iArr) {
        int length = iArr.length;
        if (i10 == length) {
            return;
        }
        int length2 = Array.getLength(obj);
        int i11 = iArr[i10];
        if (i11 == 0) {
            iArr[i10] = length2;
        } else if (i11 != length2) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(i11), Integer.valueOf(length2), Integer.valueOf(i10)));
        }
        int i12 = i10 + 1;
        if (i12 != length) {
            for (int i13 = 0; i13 < length2; i13++) {
                zzg(Array.get(obj, i13), i12, iArr);
            }
        }
    }

    private final ByteBuffer zzk() {
        return buffer(this.zza).order(ByteOrder.nativeOrder());
    }

    private final void zzl(Object obj) {
        a aVar;
        if (obj instanceof ByteBuffer) {
            return;
        }
        Class<?> componentType = obj.getClass();
        if (!componentType.isArray()) {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                aVar = a.FLOAT32;
            } else if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                aVar = a.INT32;
            } else if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                aVar = a.INT16;
            } else if (Byte.class.equals(componentType)) {
                aVar = a.UINT8;
            } else if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                aVar = a.INT64;
            } else {
                if (!Boolean.class.equals(componentType)) {
                    if (String.class.equals(componentType)) {
                        aVar = a.STRING;
                    }
                    throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
                }
                aVar = a.BOOL;
            }
            if (aVar == this.zzb) {
            } else {
                return;
            }
        }
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        if (Float.TYPE.equals(componentType)) {
            aVar = a.FLOAT32;
        } else if (Integer.TYPE.equals(componentType)) {
            aVar = a.INT32;
        } else if (Short.TYPE.equals(componentType)) {
            aVar = a.INT16;
        } else if (Byte.TYPE.equals(componentType)) {
            a aVar2 = this.zzb;
            a aVar3 = a.STRING;
            aVar = aVar2 == aVar3 ? aVar3 : a.UINT8;
        } else if (Long.TYPE.equals(componentType)) {
            aVar = a.INT64;
        } else {
            if (!Boolean.TYPE.equals(componentType)) {
                if (String.class.equals(componentType)) {
                    aVar = a.STRING;
                }
                throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
            }
            aVar = a.BOOL;
        }
        if (aVar == this.zzb && !zzb.zza(aVar).equals(zzb.zza(this.zzb))) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.zzb, obj.getClass().getName(), aVar));
        }
    }

    private final int[] zzm(Object obj) {
        int iZza = zza(obj);
        if (this.zzb == a.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iZza--;
                }
            }
        }
        int[] iArr = new int[iZza];
        zzg(obj, 0, iArr);
        return iArr;
    }

    public final ByteBuffer asReadOnlyBuffer() {
        return zzk().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    public final a dataType() {
        return this.zzb;
    }

    public final int index() {
        return index(this.zza);
    }

    public final String name() {
        return name(this.zza);
    }

    public final int numBytes() {
        return numBytes(this.zza);
    }

    public final int numDimensions() {
        return this.zzc.length;
    }

    public final int numElements() {
        int i10 = 1;
        for (int i11 : this.zzc) {
            i10 *= i11;
        }
        return i10;
    }

    public final g.a quantizationParams() {
        return this.zze;
    }

    public final int[] shape() {
        return this.zzc;
    }

    public final int[] shapeSignature() {
        return this.zzd;
    }

    final void zze() {
        delete(this.zza);
        this.zza = 0L;
    }

    final void zzf(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.zza)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        zzl(obj);
        if (!(obj instanceof Buffer)) {
            int[] iArrZzm = zzm(obj);
            if (!Arrays.equals(iArrZzm, this.zzc)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(this.zza), Arrays.toString(this.zzc), Arrays.toString(iArrZzm)));
            }
            readMultiDimensionalArray(this.zza, obj);
            return;
        }
        Buffer buffer = (Buffer) obj;
        int iNumBytes = numBytes(this.zza);
        int iCapacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.d();
        if (iNumBytes > iCapacity) {
            throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.zza), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
        }
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(zzk());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(zzk().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(zzk().asLongBuffer());
        } else if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(zzk().asIntBuffer());
        } else {
            if (!(buffer instanceof ShortBuffer)) {
                throw new IllegalArgumentException("Unexpected output buffer type: ".concat(buffer.toString()));
            }
            ((ShortBuffer) buffer).put(zzk().asShortBuffer());
        }
    }

    final void zzh() {
        this.zzc = shape(this.zza);
    }

    final void zzi(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.zza)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        zzl(obj);
        if (!(obj instanceof Buffer)) {
            int[] iArrZzm = zzm(obj);
            if (!Arrays.equals(iArrZzm, this.zzc)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(this.zza), Arrays.toString(this.zzc), Arrays.toString(iArrZzm)));
            }
            if (this.zzb == a.STRING && this.zzc.length == 0) {
                writeScalar(this.zza, obj);
                return;
            } else if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.zza, obj);
                return;
            } else {
                writeScalar(this.zza, obj);
                return;
            }
        }
        Buffer buffer = (Buffer) obj;
        int iNumBytes = numBytes(this.zza);
        int iCapacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.d();
        if (iNumBytes != iCapacity) {
            throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.zza), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
        }
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer);
                return;
            } else {
                zzk().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer);
                return;
            } else {
                zzk().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer);
                return;
            } else {
                zzk().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer);
                return;
            } else {
                zzk().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: ".concat(buffer.toString()));
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.zza, buffer);
        } else {
            zzk().asShortBuffer().put(shortBuffer);
        }
    }

    final int[] zzj(Object obj) {
        if (obj == null || (obj instanceof Buffer)) {
            return null;
        }
        zzl(obj);
        int[] iArrZzm = zzm(obj);
        if (Arrays.equals(this.zzc, iArrZzm)) {
            return null;
        }
        return iArrZzm;
    }
}
