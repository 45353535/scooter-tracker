package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IAd {
    int getAdChoicesPlacement();

    int getCachePolicy();

    void handleData(@NonNull String str);

    void load();

    void loadFromBid(@NonNull String str);

    @Deprecated
    void registerView(@NonNull View view);

    @Deprecated
    void registerView(@NonNull View view, @Nullable List<View> list);

    void setAdChoicesPlacement(int i10);

    void setCachePolicy(int i10);

    void unregisterView();
}
