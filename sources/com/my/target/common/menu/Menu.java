package com.my.target.common.menu;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface Menu {

    public interface Listener {
        void onActionClick(@NonNull MenuAction menuAction);
    }

    void addAction(@NonNull MenuAction menuAction);

    void dismiss();

    void present(@NonNull Context context);

    void setListener(@Nullable Listener listener);
}
