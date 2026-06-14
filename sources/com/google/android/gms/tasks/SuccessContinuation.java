package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    @NonNull
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
