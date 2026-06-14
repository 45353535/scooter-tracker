package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: loaded from: classes12.dex */
public final class Z1 implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return ((Activity) obj).getIntent();
    }
}
