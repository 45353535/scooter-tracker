package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import lf.y;
import lf.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Llf/y;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "contains-xj2QHRw", "(S)Z", "contains", "", FirebaseAnalytics.Param.INDEX, "get-Mh2AYeg", "(I)S", "get", "indexOf-xj2QHRw", "(S)I", "indexOf", "lastIndexOf-xj2QHRw", "lastIndexOf", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<y> implements RandomAccess {
    final /* synthetic */ short[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.$this_asList = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return m7995containsxj2QHRw(((y) obj).g());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m7995containsxj2QHRw(short element) {
        return z.i(this.$this_asList, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return y.a(m7996getMh2AYeg(i10));
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m7996getMh2AYeg(int index) {
        return z.l(this.$this_asList, index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return z.n(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof y) {
            return m7997indexOfxj2QHRw(((y) obj).g());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m7997indexOfxj2QHRw(short element) {
        return ArraysKt.indexOf(this.$this_asList, element);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return z.p(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof y) {
            return m7998lastIndexOfxj2QHRw(((y) obj).g());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m7998lastIndexOfxj2QHRw(short element) {
        return ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
