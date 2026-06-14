package ng;

import java.util.concurrent.atomic.AtomicReferenceArray;
import jg.b0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class l extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f96148f;

    public l(long j10, l lVar, int i10) {
        super(j10, lVar, i10);
        this.f96148f = new AtomicReferenceArray(k.f96147f);
    }

    @Override // jg.b0
    public int r() {
        return k.f96147f;
    }

    @Override // jg.b0
    public void s(int i10, Throwable th2, CoroutineContext coroutineContext) {
        v().set(i10, k.f96146e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f85864d + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f96148f;
    }
}
