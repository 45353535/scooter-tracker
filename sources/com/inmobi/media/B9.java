package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class B9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36616b;

    public B9(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f36615a = z10;
        this.f36616b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        Intrinsics.checkNotNullParameter(r10, "r");
        try {
            Thread thread = new Thread(r10, this.f36616b);
            thread.setDaemon(this.f36615a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }
}
