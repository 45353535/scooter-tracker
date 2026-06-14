package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG_PREFIX = "WM-";
    private static final Object sLock = new Object();
    private static volatile Logger sLogger;

    public Logger(int i10) {
    }

    public static Logger get() {
        Logger logger;
        synchronized (sLock) {
            try {
                if (sLogger == null) {
                    sLogger = new LogcatLogger(3);
                }
                logger = sLogger;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return logger;
    }

    public static void setLogger(Logger logger) {
        synchronized (sLock) {
            try {
                if (sLogger == null) {
                    sLogger = logger;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String tagWithPrefix(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(TAG_PREFIX);
        int i10 = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void debug(String str, String str2);

    public abstract void debug(String str, String str2, Throwable th2);

    public abstract void error(String str, String str2);

    public abstract void error(String str, String str2, Throwable th2);

    public abstract void info(String str, String str2);

    public abstract void info(String str, String str2, Throwable th2);

    public abstract void verbose(String str, String str2);

    public abstract void verbose(String str, String str2, Throwable th2);

    public abstract void warning(String str, String str2);

    public abstract void warning(String str, String str2, Throwable th2);

    public static class LogcatLogger extends Logger {
        private final int mLoggingLevel;

        public LogcatLogger(int i10) {
            super(i10);
            this.mLoggingLevel = i10;
        }

        @Override // androidx.work.Logger
        public void debug(String str, String str2) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void error(String str, String str2) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void info(String str, String str2) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(String str, String str2) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void warning(String str, String str2) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void debug(String str, String str2, Throwable th2) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void error(String str, String str2, Throwable th2) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void info(String str, String str2, Throwable th2) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(String str, String str2, Throwable th2) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void warning(String str, String str2, Throwable th2) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }
}
