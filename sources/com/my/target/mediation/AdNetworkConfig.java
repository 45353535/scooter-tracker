package com.my.target.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface AdNetworkConfig {
    @NonNull
    String getAdNetwork();

    @Nullable
    Object getData();

    @Nullable
    AdNetworkLoader getLoader();
}
