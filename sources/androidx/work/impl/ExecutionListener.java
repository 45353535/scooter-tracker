package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId workGenerationalId, boolean z10);
}
