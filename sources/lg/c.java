package lg;

import jg.m;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f94273h = new c();

    private c() {
        super(j.f94285c, j.f94286d, j.f94287e, j.f94283a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        m.a(i10);
        return i10 >= j.f94285c ? m.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
