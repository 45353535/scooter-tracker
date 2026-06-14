package hf;

import java.io.EOFException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f73166a = new pg.a();

    public static final long a(s sVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        sVar.request(j10);
        long jMin = Math.min(j10, b(sVar));
        sVar.getBuffer().skip(jMin);
        return jMin;
    }

    public static final long b(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.getBuffer().s();
    }

    public static final void c(s sVar, Function1 block) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        while (!sVar.exhausted() && ((Boolean) block.invoke(sVar.getBuffer())).booleanValue()) {
        }
    }
}
