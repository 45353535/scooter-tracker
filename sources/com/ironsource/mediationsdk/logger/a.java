package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C4240b4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* JADX INFO: loaded from: classes10.dex */
public class a extends IronSourceLogger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44088c = "console";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44089d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UIThread: ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        sb2.append(" ");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String string2 = sb3.toString();
        if (i10 == 0) {
            Log.v(f44089d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Log.w(f44089d + ironSourceTag, str);
                return;
            }
            if (i10 == 3) {
                Log.e(f44089d + ironSourceTag, str);
                return;
            }
            if (i10 != 4) {
                return;
            }
        }
        Log.i(f44089d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th2) + C4240b4.j.f42674e, 3);
    }

    public a(int i10) {
        super("console", i10);
    }
}
