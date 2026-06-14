package io.ktor.utils.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82173r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82174s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f82175t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f82176u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f82177v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f82178w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f82179x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f82180y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82179x = obj;
            this.f82180y |= Integer.MIN_VALUE;
            return j.b(null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f5 -> B:45:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(io.ktor.utils.io.e r9, final java.nio.channels.WritableByteChannel r10, final long r11, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.b(io.ktor.utils.io.e, java.nio.channels.WritableByteChannel, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(e eVar, WritableByteChannel writableByteChannel, long j10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return b(eVar, writableByteChannel, j10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(long j10, u0 u0Var, WritableByteChannel writableByteChannel, ByteBuffer bb2) throws IOException {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        long j11 = j10 - u0Var.f93333b;
        if (j11 < bb2.remaining()) {
            int iLimit = bb2.limit();
            bb2.limit(bb2.position() + ((int) j11));
            while (bb2.hasRemaining()) {
                writableByteChannel.write(bb2);
            }
            bb2.limit(iLimit);
            u0Var.f93333b += j11;
        } else {
            long jWrite = 0;
            while (bb2.hasRemaining()) {
                jWrite += (long) writableByteChannel.write(bb2);
            }
            u0Var.f93333b += jWrite;
        }
        return Unit.f93236a;
    }
}
