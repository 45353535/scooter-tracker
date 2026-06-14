package j$.util.stream;

import j$.util.C5654f;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements IntFunction, LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IntFunction f85069a;

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        Object objApply = this.f85069a.apply(i10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C5654f.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        return AbstractC5773v1.x(j10, this.f85069a);
    }
}
