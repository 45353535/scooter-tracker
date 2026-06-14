package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5697g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC5697g onClose(Runnable runnable);

    InterfaceC5697g parallel();

    InterfaceC5697g sequential();

    Spliterator spliterator();

    InterfaceC5697g unordered();
}
