package com.applovin.shadow.okio;

import com.ironsource.C4240b4;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\t\u0010\u0013J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0017J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u000e\u0010\u001aJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u000e\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\t\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0007¢\u0006\u0004\b\t\u0010#J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0007¢\u0006\u0004\b\u000e\u0010$¨\u0006%"}, d2 = {"Lcom/applovin/shadow/okio/-DeprecatedOkio;", "", "<init>", "()V", "Ljava/io/File;", C4240b4.i.f42616b, "Lcom/applovin/shadow/okio/Sink;", "appendingSink", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Sink;", "sink", "Lcom/applovin/shadow/okio/BufferedSink;", "buffer", "(Lcom/applovin/shadow/okio/Sink;)Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Source;", "source", "Lcom/applovin/shadow/okio/BufferedSource;", "(Lcom/applovin/shadow/okio/Source;)Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/io/OutputStream;)Lcom/applovin/shadow/okio/Sink;", "Ljava/net/Socket;", "socket", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Source;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Source;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Source;", "blackhole", "()Lcom/applovin/shadow/okio/Sink;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lvh/j0;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lvh/l0;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeprecatedOkio {

    @NotNull
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio.appendingSink(file);
    }

    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return Okio.buffer(sink);
    }

    @NotNull
    public final Sink sink(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @NotNull
    public final Source source(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio.source(file);
    }

    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return Okio.buffer(source);
    }

    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @NotNull
    public final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return Okio.sink(socket);
    }

    @NotNull
    public final Source source(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return Okio.source(socket);
    }
}
