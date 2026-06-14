package e8;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.json.ParsingErrorLogger;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {
    static {
        ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
    }

    public static void a(ParsingErrorLogger parsingErrorLogger, Exception exc, String str) {
        parsingErrorLogger.logError(exc);
    }

    public static /* synthetic */ void b(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    public static /* synthetic */ void c(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }
}
