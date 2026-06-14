package qf;

import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class b extends AbstractList implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f99119b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f99119b = entries;
    }

    private final Object writeReplace() {
        return new c(this.f99119b);
    }

    public boolean b(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) ArraysKt.getOrNull(this.f99119b, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(i10, this.f99119b.length);
        return this.f99119b[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f99119b.length;
    }

    public int i(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt.getOrNull(this.f99119b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }

    public int j(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }
}
