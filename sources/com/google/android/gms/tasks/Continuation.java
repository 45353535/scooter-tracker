package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task) throws Exception;
}
