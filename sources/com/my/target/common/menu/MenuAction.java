package com.my.target.common.menu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class MenuAction {

    @Nullable
    public final String alias;
    public final int style;

    @NonNull
    public final String title;

    @NonNull
    public final String type;

    public MenuAction(@NonNull String str, int i10, @NonNull String str2, @Nullable String str3) {
        this.title = str;
        this.style = i10;
        this.type = str2;
        this.alias = str3;
    }
}
