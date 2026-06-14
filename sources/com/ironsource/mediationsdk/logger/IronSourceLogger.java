package com.ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f44082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44083b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.f44083b = str;
        this.f44082a = 0;
    }

    int a() {
        return this.f44082a;
    }

    String b() {
        return this.f44083b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f44083b;
            if (str != null && str.equals(ironSourceLogger.f44083b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th2);

    public void setDebugLevel(int i10) {
        this.f44082a = i10;
    }

    IronSourceLogger(String str, int i10) {
        this.f44083b = str;
        this.f44082a = i10;
    }
}
