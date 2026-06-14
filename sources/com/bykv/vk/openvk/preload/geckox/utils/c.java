package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f15899a;

    public static c a() {
        if (f15899a == null) {
            synchronized (c.class) {
                try {
                    if (f15899a == null) {
                        f15899a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15899a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
