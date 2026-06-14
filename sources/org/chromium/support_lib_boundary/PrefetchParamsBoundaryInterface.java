package org.chromium.support_lib_boundary;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface PrefetchParamsBoundaryInterface {
    @Nullable
    Map<String, String> getAdditionalHeaders();

    @Nullable
    String getNoVarySearchHint();
}
