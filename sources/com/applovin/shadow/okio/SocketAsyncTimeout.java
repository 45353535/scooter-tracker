package com.applovin.shadow.okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/applovin/shadow/okio/SocketAsyncTimeout;", "Lcom/applovin/shadow/okio/AsyncTimeout;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SocketAsyncTimeout extends AsyncTimeout {

    @NotNull
    private final Socket socket;

    public SocketAsyncTimeout(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
    }

    @Override // com.applovin.shadow.okio.AsyncTimeout
    @NotNull
    protected IOException newTimeoutException(@Nullable IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }

    @Override // com.applovin.shadow.okio.AsyncTimeout
    protected void timedOut() {
        try {
            this.socket.close();
        } catch (AssertionError e10) {
            if (!Okio.isAndroidGetsocknameError(e10)) {
                throw e10;
            }
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e10);
        } catch (Exception e11) {
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e11);
        }
    }
}
