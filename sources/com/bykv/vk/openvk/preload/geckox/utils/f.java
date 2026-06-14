package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f15901a;

    public static f a() {
        if (f15901a == null) {
            synchronized (f.class) {
                try {
                    if (f15901a == null) {
                        f15901a = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15901a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
