package sh;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f104703a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        c cVar = c.f104700a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iB = e.b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
