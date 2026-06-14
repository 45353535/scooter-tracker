package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cb implements Runnable {

    @NonNull
    protected final bb callback;

    @NonNull
    protected final Context context;

    @Nullable
    protected final Bundle extras;

    public cb(Context context, bb bbVar, Bundle bundle) {
        this.context = context;
        this.callback = bbVar;
        this.extras = bundle;
    }

    @WorkerThread
    public boolean runSync() {
        return false;
    }
}
