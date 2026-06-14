package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public interface b0 extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    b0 trySplit();
}
