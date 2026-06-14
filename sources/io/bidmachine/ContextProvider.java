package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface ContextProvider {
    @Nullable
    Activity getActivity();

    @NonNull
    Context getApplicationContext();

    @NonNull
    Context getContext();
}
