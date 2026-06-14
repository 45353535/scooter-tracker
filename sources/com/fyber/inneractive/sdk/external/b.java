package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f20605b;

    public b(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f20604a = sharedPreferences;
        this.f20605b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        SharedPreferences sharedPreferences = this.f20604a;
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (string.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", string).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th2.getClass().getName()).putString("FyberDescriptionKey", th2.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20605b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
