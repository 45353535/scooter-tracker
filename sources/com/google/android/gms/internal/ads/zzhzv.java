package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhzv<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        sb2.append("Reading ");
        sb2.append(name);
        sb2.append(" from a ");
        sb2.append(str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    protected static zziee zzaR(zzidc zzidcVar) {
        return new zziee(zzidcVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzice.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzicn)) {
            if (iterable instanceof zzidl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzicn) iterable).zza();
        zzicn zzicnVar = (zzicn) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzicnVar.size() - size;
                StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                sb2.append("Element at index ");
                sb2.append(size2);
                sb2.append(" is null.");
                String string = sb2.toString();
                int size3 = zzicnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    zzicnVar.remove(size3);
                }
            } else if (obj instanceof zzian) {
                zzicnVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzian.zzs(bArr2, 0, bArr2.length);
                zzicnVar.zzb();
            } else {
                zzicnVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzidn) {
                ((zzidn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            a.a aVar = (Object) list2.get(i10);
            if (aVar == null) {
                zzc(list, size2);
            }
            list.add(aVar);
        }
    }

    private static void zzc(List<?> list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziaq zziaqVar) throws IOException {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        return (BuilderType) zzbd(zziaqVar, zzibb.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException;

    public BuilderType zzaF(zzian zzianVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbe(zziaqVarZzm);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    public BuilderType zzaG(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbd(zziaqVarZzm, zzibbVar);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzicg {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i10, i11, false);
            zzbe(zziaqVarZzG);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzibbVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i10, int i11, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i10, i11, false);
            zzbd(zziaqVarZzG, zzibbVar);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbe(zziaqVarZzF);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbd(zziaqVarZzF, zzibbVar);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzibb zzibbVar) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        zzaM(new zzhzu(inputStream, zziaq.zzM(i10, inputStream)), zzibbVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        return zzaN(inputStream, zzibb.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzidc zzidcVar) {
        if (zzbw().getClass().isInstance(zzidcVar)) {
            return (BuilderType) zzaQ((zzhzw) zzidcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzidb zzaV(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zzaM(inputStream, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zzaG(zzianVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbc(zzian zzianVar) throws zzicg {
        zzaF(zzianVar);
        return this;
    }
}
