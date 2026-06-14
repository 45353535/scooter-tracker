package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f10455e = new AppLovinExceptionHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f10456a = new HashSet(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10457b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10458c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10459d;

    private String a(Throwable th2, int i10) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        return TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f10455e;
    }

    public void addSdk(k kVar) {
        if (this.f10456a.contains(kVar)) {
            return;
        }
        this.f10456a.add(kVar);
    }

    public void enable() {
        if (this.f10457b.compareAndSet(false, true)) {
            this.f10459d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (this.f10458c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (k kVar : this.f10456a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th2.toString());
            Integer num = (Integer) kVar.a(x4.I6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th2, num.intValue()));
            }
            kVar.D().d(com.applovin.impl.d2.P0, mapHashMap);
            kVar.F().trackEventSynchronously(C4240b4.i.f42623e0);
            jLongValue = ((Long) kVar.a(x4.f11379n3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10459d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
