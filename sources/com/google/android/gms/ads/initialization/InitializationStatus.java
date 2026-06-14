package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface InitializationStatus {
    @NonNull
    Map<String, AdapterStatus> getAdapterStatusMap();
}
