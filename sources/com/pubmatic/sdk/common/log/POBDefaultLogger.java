package com.pubmatic.sdk.common.log;

import android.util.Log;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
@Keep
class POBDefaultLogger implements POBLog.POBLogging {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62336a;

        static {
            int[] iArr = new int[OpenWrapSDK.LogLevel.values().length];
            f62336a = iArr;
            try {
                iArr[OpenWrapSDK.LogLevel.Info.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62336a[OpenWrapSDK.LogLevel.Warn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62336a[OpenWrapSDK.LogLevel.Debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62336a[OpenWrapSDK.LogLevel.Verbose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    POBDefaultLogger() {
    }

    @Override // com.pubmatic.sdk.common.log.POBLog.POBLogging
    public void log(POBLog.POBLogMessage pOBLogMessage) {
        int i10 = a.f62336a[pOBLogMessage.mLogLevel.ordinal()];
        if (i10 == 1) {
            Log.i(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i10 == 2) {
            Log.w(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i10 == 3) {
            Log.d(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        } else if (i10 == 4) {
            Log.v(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
        if (pOBLogMessage.mLogLevel == OpenWrapSDK.LogLevel.Error) {
            Log.e(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
    }
}
