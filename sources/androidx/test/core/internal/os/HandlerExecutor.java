package androidx.test.core.internal.os;

import android.os.Handler;
import androidx.annotation.RestrictTo;
import com.ironsource.sdk.controller.f;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/test/core/internal/os/HandlerExecutor;", "Ljava/util/concurrent/Executor;", "handler", "Landroid/os/Handler;", "(Landroid/os/Handler;)V", "getHandler", "()Landroid/os/Handler;", "execute", "", f.b.f45113g, "Ljava/lang/Runnable;", "core_java_androidx_test_core-core_internal_kt"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class HandlerExecutor implements Executor {

    @NotNull
    private final Handler handler;

    public HandlerExecutor(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (Thread.currentThread().equals(this.handler.getLooper().getThread())) {
            command.run();
        } else {
            this.handler.post(command);
        }
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }
}
