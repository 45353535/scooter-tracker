package com.appodeal.consent;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/appodeal/consent/ConsentInfoUpdateCallback;", "", "onUpdated", "", "onFailed", "error", "Lcom/appodeal/consent/ConsentManagerError;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConsentInfoUpdateCallback {
    void onFailed(@NotNull ConsentManagerError error);

    void onUpdated();
}
