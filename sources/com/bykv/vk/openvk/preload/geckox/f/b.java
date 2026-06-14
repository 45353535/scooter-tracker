package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f15835a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f15836b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f15838d;

    private b(String str, FileLock fileLock) {
        this.f15837c = str;
        this.f15838d = fileLock;
    }

    public static b a(String str) throws Exception {
        f15836b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f15835a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f15836b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f15838d.a();
            this.f15838d.b();
            Lock lock = f15835a.get(this.f15837c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f15836b.unlock();
        }
    }
}
