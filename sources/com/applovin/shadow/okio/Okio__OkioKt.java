package com.applovin.shadow.okio;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"blackholeSink", "Lcom/applovin/shadow/okio/Sink;", "blackhole", "buffer", "Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/Source;", "use", "R", "T", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "com/applovin/shadow/okio/Okio")
final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new buffer(source);
    }

    public static final <T extends Closeable, R> R use(T t10, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        R rInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable th2 = null;
        try {
            rInvoke = block.invoke(t10);
            kotlin.jvm.internal.z.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.z.a(1);
        } catch (Throwable th4) {
            kotlin.jvm.internal.z.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            kotlin.jvm.internal.z.a(1);
            th2 = th4;
            rInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(rInvoke);
        return rInvoke;
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new buffer(sink);
    }
}
