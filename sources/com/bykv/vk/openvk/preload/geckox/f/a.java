package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f15832a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f15833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15834c;

    private a(String str, FileLock fileLock) {
        this.f15834c = str;
        this.f15833b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f15832a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e10) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f15832a;
        synchronized (map) {
            try {
                try {
                    this.f15833b.a();
                    this.f15833b.b();
                    map.get(this.f15834c).unlock();
                } catch (Throwable th2) {
                    f15832a.get(this.f15834c).unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
