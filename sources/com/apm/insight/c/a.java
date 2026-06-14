package com.apm.insight.c;

import com.apm.insight.e;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f7729a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (f7729a) {
            try {
                if (f7729a.get()) {
                    return false;
                }
                f7729a.set(true);
                return b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean b() {
        if (!com.apm.insight.runtime.a.g()) {
            return false;
        }
        try {
            File file = new File(e.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
