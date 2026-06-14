package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jc1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jc1 f112297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jc1[] f112298c;

    static {
        jc1 jc1Var = new jc1();
        f112297b = jc1Var;
        f112298c = new jc1[]{jc1Var};
    }

    public static jc1 valueOf(String str) {
        return (jc1) Enum.valueOf(jc1.class, str);
    }

    public static jc1[] values() {
        return (jc1[]) f112298c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
