package com.google.android.gms.internal.tflite;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh implements DynamiteModule.VersionPolicy {
    private final DynamiteModule.VersionPolicy zza;
    private Integer zzb = null;

    public zzh(DynamiteModule.VersionPolicy versionPolicy) {
        this.zza = versionPolicy;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int i10 = 0;
        Preconditions.checkState(this.zzb == null);
        DynamiteModule.VersionPolicy.SelectionResult selectionResultSelectModule = this.zza.selectModule(context, str, iVersions);
        int i11 = selectionResultSelectModule.selection;
        if (i11 == -1) {
            i10 = selectionResultSelectModule.localVersion;
        } else if (i11 == 1) {
            i10 = selectionResultSelectModule.remoteVersion;
        }
        this.zzb = Integer.valueOf(i10);
        return selectionResultSelectModule;
    }

    public final int zza() {
        return ((Integer) Preconditions.checkNotNull(this.zzb)).intValue();
    }
}
