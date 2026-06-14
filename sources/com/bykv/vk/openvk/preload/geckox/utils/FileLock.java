package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f15894a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15896c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i10) {
        this.f15896c = str;
        this.f15895b = i10;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e10.getMessage());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e10) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e10) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f15894a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i10) throws Exception;

    private static native void nLockFileSegment(int i10, int i11) throws Exception;

    private static native void nRelease(int i10) throws Exception;

    private static native boolean nTryLock(int i10) throws Exception;

    private static native void nUnlockFile(int i10) throws Exception;

    public static FileLock a(String str, int i10) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i10);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f15894a;
        synchronized (map) {
            numRemove = map.remove(this.f15896c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e10) {
            throw new RuntimeException("release lock failed, file:" + this.f15896c + " caused by:" + e10.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f15895b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f15896c);
        }
    }
}
