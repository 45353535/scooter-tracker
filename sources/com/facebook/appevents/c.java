package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19637a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19638b = c.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f19639c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f19640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f19641e;

    private c() {
    }

    public static final String b() {
        if (!f19641e) {
            Log.w(f19638b, "initStore should have been called before calling setUserID");
            f19637a.c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f19639c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f19640d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th2) {
            f19639c.readLock().unlock();
            throw th2;
        }
    }

    private final void c() {
        if (f19641e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f19639c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f19641e) {
                f19640d = PreferenceManager.getDefaultSharedPreferences(com.facebook.s.m()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f19641e = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f19639c.writeLock().unlock();
            throw th2;
        }
    }

    public static final void d() {
        if (f19641e) {
            return;
        }
        m0.f19689b.b().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                c.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        f19637a.c();
    }
}
