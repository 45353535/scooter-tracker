package yg;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(KSerializer element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
