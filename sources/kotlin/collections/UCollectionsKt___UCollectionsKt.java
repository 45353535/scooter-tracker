package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.r;
import lf.s;
import lf.t;
import lf.u;
import lf.v;
import lf.w;
import lf.y;
import lf.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"", "Llf/r;", "Llf/s;", "toUByteArray", "(Ljava/util/Collection;)[B", "Llf/t;", "Llf/u;", "toUIntArray", "(Ljava/util/Collection;)[I", "Llf/v;", "Llf/w;", "toULongArray", "(Ljava/util/Collection;)[J", "Llf/y;", "Llf/z;", "toUShortArray", "(Ljava/util/Collection;)[S", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sum", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public static final int sumOfUByte(@NotNull Iterable<r> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<r> it = iterable.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC = t.c(iC + t.c(it.next().g() & 255));
        }
        return iC;
    }

    public static final int sumOfUInt(@NotNull Iterable<t> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<t> it = iterable.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC = t.c(iC + it.next().g());
        }
        return iC;
    }

    public static final long sumOfULong(@NotNull Iterable<v> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<v> it = iterable.iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC = v.c(jC + it.next().g());
        }
        return jC;
    }

    public static final int sumOfUShort(@NotNull Iterable<y> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<y> it = iterable.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC = t.c(iC + t.c(it.next().g() & 65535));
        }
        return iC;
    }

    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<r> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrE = s.e(collection.size());
        Iterator<r> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s.r(bArrE, i10, it.next().g());
            i10++;
        }
        return bArrE;
    }

    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<t> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrE = u.e(collection.size());
        Iterator<t> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            u.r(iArrE, i10, it.next().g());
            i10++;
        }
        return iArrE;
    }

    @NotNull
    public static final long[] toULongArray(@NotNull Collection<v> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrE = w.e(collection.size());
        Iterator<v> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            w.r(jArrE, i10, it.next().g());
            i10++;
        }
        return jArrE;
    }

    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<y> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrE = z.e(collection.size());
        Iterator<y> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            z.r(sArrE, i10, it.next().g());
            i10++;
        }
        return sArrE;
    }
}
