package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes7.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    @NonNull
    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t10) {
        this.zza = t10;
    }

    protected Response(@NonNull T t10) {
        this.zza = t10;
    }
}
