package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class zaad {
    private final Map zaa = DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map zab = DesugarCollections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.zaa) {
            map = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            map2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    final void zac(BasePendingResult basePendingResult, boolean z10) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.addStatusListener(new zaab(this, basePendingResult));
    }

    final void zad(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.zab.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new zaac(this, taskCompletionSource));
    }

    final void zae(int i10, @Nullable String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        zah(true, new Status(20, sb2.toString()));
    }

    public final void zaf() {
        zah(false, GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
