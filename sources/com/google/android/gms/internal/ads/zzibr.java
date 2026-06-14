package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzibr<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzibr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 43 + String.valueOf(str).length() + 2);
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(str);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzibz zzbC() {
        return zzibs.zzd();
    }

    protected static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zzh(size + size);
    }

    protected static zzicc zzbE() {
        return zzicq.zzg();
    }

    protected static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzh(size + size);
    }

    protected static zziby zzbG() {
        return zzibi.zzd();
    }

    protected static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zzh(size + size);
    }

    protected static zzibu zzbI() {
        return zziay.zzd();
    }

    protected static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zzh(size + size);
    }

    protected static zzibt zzbK() {
        return zziad.zzd();
    }

    protected static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zzh(size + size);
    }

    protected static <E> zzicd<E> zzbM() {
        return zzidn.zzd();
    }

    protected static <E> zzicd<E> zzbN(zzicd<E> zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    static <T extends zzibr<T, ?>> T zzbO(T t10, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t11 = (T) t10.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t11.getClass());
            zziduVarZzb.zzg(t11, zziar.zza(zziaqVar), zzibbVar);
            zziduVarZzb.zzk(t11);
            return t11;
        } catch (zzicg e10) {
            if (e10.zzb()) {
                throw new zzicg(e10);
            }
            throw e10;
        } catch (zziee e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzicg) {
                throw ((zzicg) e12.getCause());
            }
            throw new zzicg(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzicg) {
                throw ((zzicg) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends zzibr<T, ?>> T zzbP(T t10, zziaq zziaqVar) throws zzicg {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        return (T) zzbO(t10, zziaqVar, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbQ(T t10, ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
        zziaq zziaqVarZzG;
        int i10 = zziaq.zze;
        if (byteBuffer.hasArray()) {
            zziaqVarZzG = zziaq.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zziaqVarZzG = zziaq.zzG(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbZ(t10, zziaqVarZzG, zzibbVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbR(T t10, ByteBuffer byteBuffer) throws zzicg {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        return (T) zzbQ(t10, byteBuffer, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbS(T t10, zzian zzianVar) throws zzicg {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        T t11 = (T) zzbT(t10, zzianVar, zzibb.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbT(T t10, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        T t11 = (T) zzj(t10, zzianVar, zzibbVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbU(T t10, byte[] bArr) throws zzicg {
        int length = bArr.length;
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        T t11 = (T) zzh(t10, bArr, 0, length, zzibb.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbV(T t10, byte[] bArr, zzibb zzibbVar) throws zzicg {
        T t11 = (T) zzh(t10, bArr, 0, bArr.length, zzibbVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbW(T t10, InputStream inputStream) throws zzicg {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        T t11 = (T) zzbO(t10, zziaqVarZzF, zzibb.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbX(T t10, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t11 = (T) zzbO(t10, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzbY(T t10, zziaq zziaqVar) throws zzicg {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        return (T) zzbZ(t10, zziaqVar, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbZ(T t10, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t11 = (T) zzbO(t10, zziaqVar, zzibbVar);
        zzi(t11);
        return t11;
    }

    static <T extends zzibr> T zzbt(Class<T> cls) {
        zzibr<?, ?> zzibrVar = zzd.get(cls);
        if (zzibrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVar = zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzibrVar != null) {
            return zzibrVar;
        }
        zzibr<?, ?> zzibrVarZzbw = ((zzibr) zziem.zzc(cls)).zzbw();
        if (zzibrVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzibrVarZzbw);
        return zzibrVarZzbw;
    }

    protected static <T extends zzibr> void zzbu(Class<T> cls, T t10) {
        t10.zzaY();
        zzd.put(cls, t10);
    }

    protected static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzidc zzidcVar, zzibw zzibwVar, int i10, zzies zziesVar, Class cls) {
        return new zzibp<>(containingtype, type, zzidcVar, new zzibo(zzibwVar, i10, zziesVar, false, false), cls);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzbz(ContainingType containingtype, zzidc zzidcVar, zzibw zzibwVar, int i10, zzies zziesVar, boolean z10, Class cls) {
        return new zzibp<>(containingtype, zzidn.zzd(), zzidcVar, new zzibo(zzibwVar, i10, zziesVar, true, z10), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    protected static <T extends zzibr<T, ?>> T zzca(T t10, InputStream inputStream) throws zzicg {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
        T t11 = (T) zzk(t10, inputStream, zzibb.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zzibr<T, ?>> T zzcb(T t10, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t11 = (T) zzk(t10, inputStream, zzibbVar);
        zzi(t11);
        return t11;
    }

    private int zzd(zzidu<?> zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzibn<MessageType, BuilderType>, BuilderType, T> zzibp<MessageType, T> zze(zziaz<MessageType, T> zziazVar) {
        return (zzibp) zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzibr<T, ?>> boolean zzg(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzidm.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    private static <T extends zzibr<T, ?>> T zzh(T t10, byte[] bArr, int i10, int i11, zzibb zzibbVar) throws zzicg {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t11.getClass());
            zziduVarZzb.zzj(t11, bArr, i10, i10 + i11, new zziab(zzibbVar));
            zziduVarZzb.zzk(t11);
            return t11;
        } catch (zzicg e10) {
            if (e10.zzb()) {
                throw new zzicg(e10);
            }
            throw e10;
        } catch (zziee e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzicg) {
                throw ((zzicg) e12.getCause());
            }
            throw new zzicg(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzibr<T, ?>> T zzi(T t10) throws zzicg {
        if (t10 == null || t10.zzbi()) {
            return t10;
        }
        throw t10.zzaU().zza();
    }

    private static <T extends zzibr<T, ?>> T zzj(T t10, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zziaq zziaqVarZzm = zzianVar.zzm();
        T t11 = (T) zzbO(t10, zziaqVarZzm, zzibbVar);
        zziaqVarZzm.zzb(0);
        return t11;
    }

    private static <T extends zzibr<T, ?>> T zzk(T t10, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            zziaq zziaqVarZzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(i10, inputStream)), 4096);
            T t11 = (T) zzbO(t10, zziaqVarZzF, zzibbVar);
            zziaqVarZzF.zzb(0);
            return t11;
        } catch (zzicg e10) {
            if (e10.zzb()) {
                throw new zzicg(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzicg(e11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzide.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    void zzaR(int i10) {
        if (i10 >= 0) {
            this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(i10);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaT(zzidu zziduVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int iZzd = zzd(zziduVar);
            zzaR(iZzd);
            return iZzd;
        }
        int iZzd2 = zzd(zziduVar);
        if (iZzd2 >= 0) {
            return iZzd2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iZzd2);
        throw new IllegalStateException(sb2.toString());
    }

    boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    int zzaZ() {
        return this.zzq;
    }

    void zzba(int i10) {
        this.zzq = i10;
    }

    void zzbb() {
        this.zzq = 0;
    }

    boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final zzidk<MessageType> zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected boolean zzbj(int i10, zziaq zziaqVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i10, zziaqVar);
    }

    protected void zzbk(int i10, int i11) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk(i10 << 3, Long.valueOf(i11));
    }

    protected void zzbl(int i10, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk((i10 << 3) | 2, zzianVar);
    }

    protected void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public int zzbr() {
        return zzaT(null);
    }

    Object zzbs() throws Exception {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzcX(zziaw zziawVar) throws IOException {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }

    protected abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);
}
