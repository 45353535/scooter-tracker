package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes8.dex */
class H5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f41037a = "ironbeast";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f41038b = "outcome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f41039c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f41040d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f41041e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f41042f = 0;

    H5() {
    }

    static AbstractC4286e a(String str, int i10) {
        if (f41037a.equals(str)) {
            return new C4348ha(i10);
        }
        if (f41038b.equals(str)) {
            return new Rc(i10);
        }
        if (i10 == 2) {
            return new C4348ha(i10);
        }
        if (i10 == 3) {
            return new Rc(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }
}
