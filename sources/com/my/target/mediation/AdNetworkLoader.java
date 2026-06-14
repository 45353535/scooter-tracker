package com.my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface AdNetworkLoader {

    public interface AdParamsListener {
        void onLoad(@NonNull AdNetworkLoader adNetworkLoader, @NonNull Map<String, String> map, @Nullable String str);
    }

    void loadParams(@NonNull String str, @NonNull Context context);

    void setAdParamsListener(@Nullable AdParamsListener adParamsListener);
}
