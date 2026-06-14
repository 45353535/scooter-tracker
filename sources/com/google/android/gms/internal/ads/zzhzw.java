package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhzw<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidc {
    protected transient int zzq = 0;

    protected static void zzaV(zzian zzianVar) throws IllegalArgumentException {
        if (!zzianVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhzv.zzaT(iterable, list);
    }

    private String zzdU(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb2.append("Serializing ");
        sb2.append(name);
        sb2.append(" to a ");
        sb2.append(str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public zzian zzaM() {
        try {
            int iZzbr = zzbr();
            zzian zzianVar = zzian.zza;
            byte[] bArr = new byte[iZzbr];
            int i10 = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, iZzbr);
            zzcX(zziatVar);
            return zziaj.zza(zziatVar, bArr);
        } catch (IOException e10) {
            throw new RuntimeException(zzdU("ByteString"), e10);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i10 = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, iZzbr);
            zzcX(zziatVar);
            zziatVar.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(zzdU("byte array"), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzaO(OutputStream outputStream) throws IOException {
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zzbr()));
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zziaw.zzA(iZzbr) + iZzbr));
        zziavVar.zzs(iZzbr);
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i10) {
        throw new UnsupportedOperationException();
    }

    public zzidh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzidu zziduVar) {
        return zzaQ();
    }

    zziee zzaU() {
        return new zziee(this);
    }
}
