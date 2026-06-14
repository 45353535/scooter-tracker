package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgaf implements zzfyv {

    @NotNull
    private final CoroutineScope zza;

    @NotNull
    private final Mutex zzb;

    @NotNull
    private final Mutex zzc;

    @NotNull
    private final Mutex zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;

    @NotNull
    private final DataStore zzh;

    @NotNull
    private final zzdvj zzi;

    public zzgaf(@NotNull DataStore adQualityDataStore, @NotNull zzfzh coroutineScopeProvider, @NotNull zzdvj dataPinger, @NotNull zzfze clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = ng.f.b(false, 1, null);
        this.zzc = ng.f.b(false, 1, null);
        this.zzd = ng.f.b(false, 1, null);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzs(java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfzk
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfzk r0 = (com.google.android.gms.internal.ads.zzfzk) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r9 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.zzb
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            kotlin.d.b(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L49:
            kotlin.d.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 == r1) goto L80
        L5a:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfzl r4 = new com.google.android.gms.internal.ads.zzfzl     // Catch: java.lang.Throwable -> L78
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L78
            r0.zza = r9     // Catch: java.lang.Throwable -> L78
            r0.zzb = r5     // Catch: java.lang.Throwable -> L78
            r0.zze = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 == r1) goto L80
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.zzfyy r9 = (com.google.android.gms.internal.ads.zzfyy) r9     // Catch: java.lang.Throwable -> L31
            r8.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L78:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            r8.unlock(r5)
            throw r9
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzs(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzt(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzn
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzn r0 = (com.google.android.gms.internal.ads.zzfzn) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzn r0 = new com.google.android.gms.internal.ads.zzfzn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r8 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.d.b(r8)
            r8 = r2
            goto L53
        L44:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 == r1) goto L77
        L53:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfzo r4 = new com.google.android.gms.internal.ads.zzfzo     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r0.zza = r8     // Catch: java.lang.Throwable -> L6f
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L77
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L31
            r0.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            r0.unlock(r5)
            throw r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzt(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzu(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzm
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzm r0 = (com.google.android.gms.internal.ads.zzfzm) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzm r0 = new com.google.android.gms.internal.ads.zzfzm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.d.b(r8)
            goto L4a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 == r1) goto L7e
            r0 = r8
        L4a:
            com.google.android.gms.internal.ads.zzfyt r8 = r5.zzf     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "adQualityDataBuilder"
            if (r8 != 0) goto L57
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r8 = r4
            goto L57
        L55:
            r6 = move-exception
            goto L7a
        L57:
            com.google.android.gms.internal.ads.zzfyt r2 = r5.zzf     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L5f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L5f:
            long r2 = r2.zzi()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r2
            com.google.android.gms.internal.ads.zzfyt r2 = r5.zzf     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L6c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L6c:
            long r1 = r2.zzg()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r1
            r8.zzb(r6)     // Catch: java.lang.Throwable -> L55
            r0.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L7a:
            r0.unlock(r4)
            throw r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzu(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzr r0 = (com.google.android.gms.internal.ads.zzfzr) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzr r0 = new com.google.android.gms.internal.ads.zzfzr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L9f
        L35:
            r8 = move-exception
            goto La9
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L40:
            java.lang.Object r2 = r0.zzb
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.zza
            com.google.android.gms.internal.ads.zzfyu r4 = (com.google.android.gms.internal.ads.zzfyu) r4
            kotlin.d.b(r8)
            goto L8b
        L4c:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.d.b(r8)
            goto L63
        L54:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzb
            r0.zza = r2
            r0.zze = r5
            java.lang.Object r8 = r2.lock(r6, r0)
            if (r8 == r1) goto Lb1
        L63:
            com.google.android.gms.internal.ads.zzfyt r8 = r7.zzf     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L70
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)     // Catch: java.lang.Throwable -> L6e
            r8 = r6
            goto L70
        L6e:
            r8 = move-exception
            goto Lad
        L70:
            com.google.android.gms.internal.ads.zzibr r8 = r8.zzbu()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfyu r8 = (com.google.android.gms.internal.ads.zzfyu) r8     // Catch: java.lang.Throwable -> L6e
            r2.unlock(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r4
            java.lang.Object r4 = r2.lock(r6, r0)
            if (r4 == r1) goto Lb1
            r4 = r8
        L8b:
            androidx.datastore.core.DataStore r8 = r7.zzh     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzfzs r5 = new com.google.android.gms.internal.ads.zzfzs     // Catch: java.lang.Throwable -> La7
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> La7
            r0.zza = r2     // Catch: java.lang.Throwable -> La7
            r0.zzb = r6     // Catch: java.lang.Throwable -> La7
            r0.zze = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r8 = r8.updateData(r5, r0)     // Catch: java.lang.Throwable -> La7
            if (r8 == r1) goto Lb1
            r0 = r2
        L9f:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L35
            r0.unlock(r6)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        La7:
            r8 = move-exception
            r0 = r2
        La9:
            r0.unlock(r6)
            throw r8
        Lad:
            r2.unlock(r6)
            throw r8
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzv(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfyu r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzw(com.google.android.gms.internal.ads.zzfyu):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        eg.i.d(this.zza, null, null, new zzgaa(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(@NotNull String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        eg.i.d(this.zza, null, null, new zzfzu(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        eg.i.d(this.zza, null, null, new zzfzq(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        eg.i.d(this.zza, null, null, new zzgae(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        eg.i.d(this.zza, null, null, new zzfzy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        eg.i.d(this.zza, null, null, new zzgac(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        eg.i.d(this.zza, null, null, new zzfzw(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzh(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfzt
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfzt r0 = (com.google.android.gms.internal.ads.zzfzt) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzt r0 = new com.google.android.gms.internal.ads.zzfzt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.zzb
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.String r0 = r0.zzf
            kotlin.d.b(r9)
            goto L54
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.d.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzf = r8
            r0.zza = r9
            r0.zzb = r5
            r0.zze = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 == r1) goto L8b
            r0 = r8
            r8 = r9
            r1 = r5
        L54:
            boolean r9 = r7.zze     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L60
            kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5e
            r8.unlock(r4)
            return r9
        L5e:
            r9 = move-exception
            goto L87
        L60:
            r7.zze = r3     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzfyu r9 = com.google.android.gms.internal.ads.zzfyu.zzp()     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzibl r9 = r9.zzcc()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "toBuilder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzfyt r9 = (com.google.android.gms.internal.ads.zzfyt) r9     // Catch: java.lang.Throwable -> L5e
            r7.zzf = r9     // Catch: java.lang.Throwable -> L5e
            if (r9 != 0) goto L7b
            java.lang.String r9 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)     // Catch: java.lang.Throwable -> L5e
            r9 = r4
        L7b:
            r9.zza(r0)     // Catch: java.lang.Throwable -> L5e
            r9.zzj(r1)     // Catch: java.lang.Throwable -> L5e
            r8.unlock(r4)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L87:
            r8.unlock(r4)
            throw r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzi(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (zzv(r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x0087, B:35:0x008b, B:38:0x0094), top: B:51:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzfzp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzfzp r0 = (com.google.android.gms.internal.ads.zzfzp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzp r0 = new com.google.android.gms.internal.ads.zzfzp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.d.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            kotlin.d.b(r11)
            goto La4
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.d.b(r11)
            goto L87
        L4a:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.d.b(r11)
            goto L61
        L52:
            kotlin.d.b(r11)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzc
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb8
        L61:
            boolean r11 = r10.zzg     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L6d
            kotlin.Unit r11 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L6b
            r2.unlock(r7)
            return r11
        L6b:
            r11 = move-exception
            goto Lb4
        L6d:
            r10.zzg = r6     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r11 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L6b
            r2.unlock(r7)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzb
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb8
            r5 = r8
        L87:
            com.google.android.gms.internal.ads.zzfyt r11 = r10.zzf     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L94
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)     // Catch: java.lang.Throwable -> L92
            r11 = r7
            goto L94
        L92:
            r11 = move-exception
            goto Lb0
        L94:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> L92
            r2.unlock(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzu(r5, r0)
            if (r11 == r1) goto Lb8
        La4:
            r0.zze = r3
            java.lang.Object r11 = r10.zzv(r0)
            if (r11 != r1) goto Lad
            goto Lb8
        Lad:
            kotlin.Unit r11 = kotlin.Unit.f93236a
            return r11
        Lb0:
            r2.unlock(r7)
            throw r11
        Lb4:
            r2.unlock(r7)
            throw r11
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzk(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzk(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        if (zzs(r14, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzl(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (zzs(r15, r0) == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzm(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzv
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzv r0 = (com.google.android.gms.internal.ads.zzfzv) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzv r0 = new com.google.android.gms.internal.ads.zzfzv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.d.b(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzb = r8
            r0.zza = r5
            r0.zze = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 == r1) goto L69
            r0 = r8
            r1 = r5
        L4f:
            com.google.android.gms.internal.ads.zzfyt r8 = r7.zzf     // Catch: java.lang.Throwable -> L5a
            if (r8 != 0) goto L5c
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)     // Catch: java.lang.Throwable -> L5a
            r8 = r4
            goto L5c
        L5a:
            r8 = move-exception
            goto L65
        L5c:
            r8.zzs(r1)     // Catch: java.lang.Throwable -> L5a
            r0.unlock(r4)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L65:
            r0.unlock(r4)
            throw r8
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzn(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
