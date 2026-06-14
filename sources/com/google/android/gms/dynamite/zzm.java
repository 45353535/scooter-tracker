package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes7.dex */
final class zzm implements DynamiteModule.VersionPolicy {
    zzm() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int iZza;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        int i10 = 1;
        int i11 = 0;
        if (iZzb != 0) {
            iZza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = iZza;
        } else {
            iZza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = iZza;
        }
        int i12 = selectionResult.localVersion;
        if (i12 == 0) {
            if (iZza == 0) {
                i10 = 0;
            }
            selectionResult.selection = i10;
            return selectionResult;
        }
        i11 = i12;
        if (iZza < i11) {
            i10 = -1;
        }
        selectionResult.selection = i10;
        return selectionResult;
    }
}
