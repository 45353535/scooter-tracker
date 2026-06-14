package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class zztd extends zzcp {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 2) {
            byteBufferZzk = zzk(i10 + i10);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferZzk);
                iPosition += 2;
            }
        } else if (i11 == 1342177280) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i11 == 1610612736) {
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition + 3) & 255;
                int i13 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                zzq(i12 | i13 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i11 == 21) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else {
            if (i11 != 22) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                int i14 = byteBuffer.get(iPosition) & 255;
                int i15 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                zzq(i14 | i15 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferZzk);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i10 = zzclVar.zzd;
        String str = zzfj.zza;
        if (i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736) {
            if (i10 == 4) {
                return zzcl.zza;
            }
            if (i10 != 2) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 4);
    }
}
