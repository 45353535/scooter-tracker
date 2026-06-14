package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4958a8 implements IAppSetIdRetriever {
    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public final void retrieveAppSetId(@NotNull Context context, @NotNull AppSetIdListener appSetIdListener) {
        appSetIdListener.onFailure(new IllegalStateException("No App Set ID library"));
    }
}
