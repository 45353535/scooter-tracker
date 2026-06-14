package androidx.test.platform.tracing;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.test.platform.tracing.Tracer;
import androidx.tracing.Trace;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes5.dex */
class AndroidXTracer implements Tracer {
    private static final int MAX_SECTION_NAME_LEN = 127;
    private static final String TAG = "AndroidXTracer";

    private static class AndroidXTracerSpan implements Tracer.Span, AutoCloseable {
        private final ArrayDeque<AndroidXTracerSpan> nestedSpans;

        private AndroidXTracerSpan() {
            this.nestedSpans = new ArrayDeque<>();
        }

        @Override // androidx.test.platform.tracing.Tracer.Span
        @NonNull
        public Tracer.Span beginChildSpan(@NonNull String str) {
            Trace.beginSection(AndroidXTracer.sanitizeSpanName(str));
            AndroidXTracerSpan androidXTracerSpan = new AndroidXTracerSpan();
            this.nestedSpans.add(androidXTracerSpan);
            return androidXTracerSpan;
        }

        @Override // androidx.test.platform.tracing.Tracer.Span, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            while (true) {
                AndroidXTracerSpan androidXTracerSpanPollLast = this.nestedSpans.pollLast();
                if (androidXTracerSpanPollLast == null) {
                    Trace.endSection();
                    return;
                }
                androidXTracerSpanPollLast.close();
            }
        }
    }

    AndroidXTracer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String sanitizeSpanName(@NonNull String str) {
        if (str.length() <= 127) {
            return str;
        }
        Log.w(TAG, "Span name exceeds limits: " + str);
        return str.substring(0, 127);
    }

    @Override // androidx.test.platform.tracing.Tracer
    @NonNull
    public Tracer.Span beginSpan(@NonNull String str) {
        Trace.beginSection(sanitizeSpanName(str));
        return new AndroidXTracerSpan();
    }

    @CanIgnoreReturnValue
    public AndroidXTracer enableTracing() {
        try {
            Trace.forceEnableAppTracing();
            return this;
        } catch (NoSuchMethodError e10) {
            Log.e(TAG, "enableTracing failed. You may need to upgrade your androidx.tracing:tracing version", e10);
            return this;
        } catch (RuntimeException e11) {
            Log.e(TAG, "enableTracing failed", e11);
            return this;
        }
    }
}
