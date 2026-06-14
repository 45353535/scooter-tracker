package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f93328a = new Object[0];

    public static final Object[] a(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f93328a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f93328a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArrCopyOf[i10] = it.next();
                    if (i11 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i10 = i11;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
