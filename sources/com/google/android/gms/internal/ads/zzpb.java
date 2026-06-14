package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes8.dex */
final class zzpb {
    private final zzbd zza;
    private zzguf zzb = zzguf.zzi();
    private zzgui zzc = zzgui.zza();

    @Nullable
    private zzwk zzd;
    private zzwk zze;
    private zzwk zzf;

    public zzpb(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzguh zzguhVar = new zzguh();
        if (this.zzb.isEmpty()) {
            zzk(zzguhVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzguhVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzguhVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzguhVar, (zzwk) this.zzb.get(i10), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzguhVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzguhVar.zzc();
    }

    private final void zzk(zzguh zzguhVar, @Nullable zzwk zzwkVar, zzbf zzbfVar) {
        if (zzwkVar == null) {
            return;
        }
        if (zzbfVar.zze(zzwkVar.zza) != -1) {
            zzguhVar.zza(zzwkVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzwkVar);
        if (zzbfVar2 != null) {
            zzguhVar.zza(zzwkVar, zzbfVar2);
        }
    }

    @Nullable
    private static zzwk zzl(zzbb zzbbVar, zzguf zzgufVar, @Nullable zzwk zzwkVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfj.zzq(zzbbVar.zzu()));
        }
        int i10 = iZzf;
        for (int i11 = 0; i11 < zzgufVar.size(); i11++) {
            zzwk zzwkVar2 = (zzwk) zzgufVar.get(i11);
            if (zzm(zzwkVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
                return zzwkVar2;
            }
        }
        if (zzgufVar.isEmpty() && zzwkVar != null && zzm(zzwkVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
            return zzwkVar;
        }
        return null;
    }

    private static boolean zzm(zzwk zzwkVar, @Nullable Object obj, boolean z10, int i10, int i11, int i12) {
        if (zzwkVar.zza.equals(obj)) {
            return z10 ? zzwkVar.zzb == i10 && zzwkVar.zzc == i11 : zzwkVar.zzb == -1 && zzwkVar.zze == i12;
        }
        return false;
    }

    @Nullable
    public final zzwk zza() {
        return this.zzd;
    }

    @Nullable
    public final zzwk zzb() {
        return this.zze;
    }

    @Nullable
    public final zzwk zzc() {
        return this.zzf;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final zzwk zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (androidx.activity.s.a(list)) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzwk) objLast;
    }

    @Nullable
    public final zzbf zze(zzwk zzwkVar) {
        return (zzbf) this.zzc.get(zzwkVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, @Nullable zzwk zzwkVar, zzbb zzbbVar) {
        this.zzb = zzguf.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzwk) list.get(0);
            zzwkVar.getClass();
            this.zzf = zzwkVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    final /* synthetic */ zzguf zzi() {
        return this.zzb;
    }
}
