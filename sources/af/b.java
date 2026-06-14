package af;

import eg.e0;
import eg.o0;
import eg.x0;
import io.ktor.utils.io.e;
import io.ktor.utils.io.f0;
import io.ktor.utils.io.h;
import io.ktor.utils.io.j;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import uf.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4270r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f4271s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f4272t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ File f4273u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, Continuation continuation) {
            super(2, continuation);
            this.f4273u = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f0 f0Var, Continuation continuation) {
            return ((a) create(f0Var, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f4273u, continuation);
            aVar.f4272t = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            RandomAccessFile randomAccessFile;
            Object objG = pf.b.g();
            ?? r12 = this.f4271s;
            try {
                if (r12 == 0) {
                    d.b(obj);
                    f0 f0Var = (f0) this.f4272t;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f4273u, "rw");
                    e eVarA = f0Var.a();
                    FileChannel channel = randomAccessFile2.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                    this.f4272t = randomAccessFile2;
                    this.f4270r = randomAccessFile2;
                    this.f4271s = 1;
                    obj = j.c(eVarA, channel, 0L, this, 2, null);
                    if (obj == objG) {
                        return objG;
                    }
                    randomAccessFile = randomAccessFile2;
                    r12 = randomAccessFile2;
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RandomAccessFile randomAccessFile3 = (RandomAccessFile) this.f4270r;
                    Closeable closeable = (Closeable) this.f4272t;
                    d.b(obj);
                    randomAccessFile = randomAccessFile3;
                    r12 = closeable;
                }
                randomAccessFile.setLength(((Number) obj).longValue());
                Unit unit = Unit.f93236a;
                c.a(r12, null);
                return Unit.f93236a;
            } finally {
            }
        }
    }

    public static final io.ktor.utils.io.k a(File file, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return h.o(x0.f69181b, new e0("file-writer").plus(coroutineContext), true, new a(file, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.k b(File file, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = o0.b();
        }
        return a(file, coroutineContext);
    }
}
