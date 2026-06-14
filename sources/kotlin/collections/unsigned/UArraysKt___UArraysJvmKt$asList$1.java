package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import lf.t;
import lf.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Llf/t;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "contains-WZ4Q5Ns", "(I)Z", "contains", "", FirebaseAnalytics.Param.INDEX, "get-pVg5ArA", "(I)I", "get", "indexOf-WZ4Q5Ns", "indexOf", "lastIndexOf-WZ4Q5Ns", "lastIndexOf", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<t> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t) {
            return m7983containsWZ4Q5Ns(((t) obj).g());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m7983containsWZ4Q5Ns(int element) {
        return u.i(this.$this_asList, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return t.a(m7984getpVg5ArA(i10));
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public int m7984getpVg5ArA(int index) {
        return u.l(this.$this_asList, index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return u.n(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof t) {
            return m7985indexOfWZ4Q5Ns(((t) obj).g());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m7985indexOfWZ4Q5Ns(int element) {
        return ArraysKt.indexOf(this.$this_asList, element);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return u.p(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof t) {
            return m7986lastIndexOfWZ4Q5Ns(((t) obj).g());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m7986lastIndexOfWZ4Q5Ns(int element) {
        return ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
