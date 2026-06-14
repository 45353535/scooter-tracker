package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzahz {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzahz() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzahy zzahyVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.zza;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.zzb;
            zzb(dataOutputStream, zzahyVar.zza);
            zzb(dataOutputStream, zzahyVar.zzb);
            dataOutputStream.writeLong(zzahyVar.zzc);
            dataOutputStream.writeLong(zzahyVar.zzd);
            dataOutputStream.write(zzahyVar.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
