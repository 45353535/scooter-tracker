package com.appodeal.ads.context;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements ContextProvider.Synchronizer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f13215b = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f13216a = (t) q.f13207a.getValue();

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider.Synchronizer
    public final void setApplicationContext(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f13216a.setApplicationContext(applicationContext);
    }
}
