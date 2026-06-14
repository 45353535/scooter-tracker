package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes8.dex */
public final class zzarf {
    static Pair zza(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZze = zze(randomAccessFile, 0);
        return pairZze != null ? pairZze : zze(randomAccessFile, 65535);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zzc(ByteBuffer byteBuffer, long j10) {
        zzf(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j10 >= 0 && j10 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27);
        sb2.append("uint32 value of out range: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long zzd(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 12);
    }

    private static Pair zze(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzf(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i11 = -1;
        } else {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, 65535);
            for (int i13 = 0; i13 < iMin; i13++) {
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
            i11 = -1;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    private static void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzg(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & 4294967295L;
    }
}
