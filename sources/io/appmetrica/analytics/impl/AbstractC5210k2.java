package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5210k2 {
    public static final IAppSetIdRetriever a() {
        return ReflectionUtils.detectClassExists("com.google.android.gms.appset.AppSet") ? new AppSetIdRetriever() : new C4958a8();
    }
}
