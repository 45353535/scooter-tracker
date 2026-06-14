package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashListener f32061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SettingsProvider f32062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CrashlyticsNativeComponent f32064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f32065f = new AtomicBoolean(false);

    interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th2);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f32061b = crashListener;
        this.f32062c = settingsProvider;
        this.f32063d = uncaughtExceptionHandler;
        this.f32064e = crashlyticsNativeComponent;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f32064e.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f32065f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f32065f.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f32061b.onUncaughtException(this.f32062c, thread, th2);
                } else {
                    Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f32063d != null) {
                    Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    this.f32063d.uncaughtException(thread, th2);
                } else {
                    Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f32065f.set(false);
            } catch (Exception e10) {
                Logger.getLogger().e("An error occurred in the uncaught exception handler", e10);
                if (this.f32063d != null) {
                    Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    this.f32063d.uncaughtException(thread, th2);
                } else {
                    Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f32065f.set(false);
            }
        } catch (Throwable th3) {
            if (this.f32063d != null) {
                Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                this.f32063d.uncaughtException(thread, th2);
            } else {
                Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f32065f.set(false);
            throw th3;
        }
    }
}
