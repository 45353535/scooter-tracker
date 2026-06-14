package com.my.tracker.miniapps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.e1;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MiniAppEvent extends e1 {

    @Nullable
    public final String customUserId;

    @Nullable
    public final Map<String, String> eventParams;

    @NonNull
    public final String miniAppId;

    @Nullable
    public final String name;

    @NonNull
    public final String platformUserId;

    @Nullable
    public final String query;

    MiniAppEvent(int i10, String str, String str2, String str3, String str4, String str5, Map map) {
        super(i10);
        this.miniAppId = str;
        this.platformUserId = str2;
        this.query = str3;
        this.customUserId = str4;
        this.name = str5;
        this.eventParams = map;
    }
}
