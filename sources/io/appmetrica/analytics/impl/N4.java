package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes12.dex */
public abstract class N4 extends AbstractC5488v5 {
    public N4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, S5> componentLoader, @NonNull C5204jm c5204jm, @NonNull BaseRequestConfig.BaseRequestArguments<C5487v4, Object> baseRequestArguments) {
        super(componentLoader, c5204jm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5488v5
    public final void a(@NonNull Object obj) {
        C5487v4 c5487v4 = (C5487v4) obj;
        synchronized (this) {
            super.a((Object) c5487v4);
        }
    }

    public final synchronized void a(@NonNull C5487v4 c5487v4) {
        super.a((Object) c5487v4);
    }
}
