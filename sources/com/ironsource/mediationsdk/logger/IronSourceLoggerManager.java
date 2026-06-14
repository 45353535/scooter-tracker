package com.ironsource.mediationsdk.logger;

import com.android.billingclient.BuildConfig;
import com.ironsource.C4315fb;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f44086d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f44087c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f44087c = new CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.f44087c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f44086d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (f44086d == null) {
                        f44086d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                    }
                } finally {
                }
            }
        }
        return f44086d;
    }

    void a(IronSourceLogger.IronSourceTag ironSourceTag, C4315fb c4315fb) {
        if (a(c4315fb.a())) {
            return;
        }
        a(ironSourceTag, c4315fb.c(), c4315fb.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f44087c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = BuildConfig.VERSION_NAME)
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f44087c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f44087c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f44087c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }

    void a(IronSourceLogger.IronSourceTag ironSourceTag, C4315fb c4315fb, Throwable th2) {
        if (a(c4315fb.a())) {
            return;
        }
        logException(ironSourceTag, c4315fb.c(), th2);
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f44087c = new CopyOnWriteArrayList();
        c();
    }

    private boolean a(int i10) {
        return i10 < this.f44082a;
    }

    protected void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f44087c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f44082a = i10;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f44087c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
