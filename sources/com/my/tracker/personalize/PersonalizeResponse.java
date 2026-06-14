package com.my.tracker.personalize;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizeResponse<T> {

    @Nullable
    public final String error;

    @Nullable
    public final String rawData;

    @Nullable
    public final T result;

    /* JADX WARN: Multi-variable type inference failed */
    PersonalizeResponse(Object obj, String str, String str2) {
        this.result = obj;
        this.error = str;
        this.rawData = str2;
    }
}
