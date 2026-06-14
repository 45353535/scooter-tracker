package androidx.test.platform.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.MustBeClosed;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface Tracer {

    public interface Span extends Closeable {
        @NonNull
        @MustBeClosed
        Span beginChildSpan(@NonNull String str);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    @NonNull
    @MustBeClosed
    Span beginSpan(@NonNull String str);
}
