package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class ExternalUserId {
    private final String sourceId;
    private final String value;

    public ExternalUserId(@NonNull String str, @NonNull String str2) {
        this.sourceId = str;
        this.value = str2;
    }

    @NonNull
    public String getSourceId() {
        return this.sourceId;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
