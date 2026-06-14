package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f93407a = new d();

    private d() {
    }

    @Override // kotlin.sequences.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d a(int i10) {
        return f93407a;
    }

    @Override // kotlin.sequences.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b(int i10) {
        return f93407a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }
}
