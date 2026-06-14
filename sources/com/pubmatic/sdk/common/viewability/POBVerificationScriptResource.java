package com.pubmatic.sdk.common.viewability;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface POBVerificationScriptResource {
    @Nullable
    List<String> getJavaScriptResource();

    @Nullable
    String getVendorKey();

    @Nullable
    String getVerificationParameter();
}
