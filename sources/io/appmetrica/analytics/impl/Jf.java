package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.Application;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/impl/Jf;", "Lio/appmetrica/analytics/impl/Hf;", "", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(28)
public final class Jf implements Hf {
    @Override // io.appmetrica.analytics.impl.Hf
    @Nullable
    public String a() {
        return Application.getProcessName();
    }
}
