package xe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xe.c;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f108177b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f108178a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void e(List list, List list2, int i10, int i11, Function1 function1, Function2 function2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                Character ch2 = (Character) function2.invoke(obj, Integer.valueOf(i11));
                ch2.charValue();
                Object arrayList = linkedHashMap.get(ch2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(ch2, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Function2 function22 = function2;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i12 = i11 + 1;
                ArrayList arrayList2 = new ArrayList();
                a aVar = c.f108177b;
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list4) {
                    if (((Number) function1.invoke(obj2)).intValue() > i12) {
                        arrayList3.add(obj2);
                    }
                }
                aVar.e(arrayList2, arrayList3, i10, i12, function1, function22);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((Number) function1.invoke(obj3)).intValue() == i12) {
                        arrayList4.add(obj3);
                    }
                }
                list.add(new b(cCharValue, arrayList4, arrayList2));
                function22 = function2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final char g(CharSequence s10, int i10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            return s10.charAt(i10);
        }

        public final c c(List from) {
            Intrinsics.checkNotNullParameter(from, "from");
            return d(from, new Function1() { // from class: xe.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(c.a.f((CharSequence) obj));
                }
            }, new Function2() { // from class: xe.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Character.valueOf(c.a.g((CharSequence) obj, ((Integer) obj2).intValue()));
                }
            });
        }

        public final c d(List from, Function1 length, Function2 charAt) {
            Object obj;
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(length, "length");
            Intrinsics.checkNotNullParameter(charAt, "charAt");
            List list = from;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) length.invoke(next);
                    do {
                        Object next2 = it.next();
                        Comparable comparable2 = (Comparable) length.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (obj == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = ((Number) length.invoke(obj)).intValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) length.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            e(arrayList, from, iIntValue, 0, length, charAt);
            arrayList.trimToSize();
            return new c(new b((char) 0, CollectionsKt.emptyList(), arrayList));
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f108179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f108180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f108181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b[] f108182d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c10, List exact, List children) {
            Intrinsics.checkNotNullParameter(exact, "exact");
            Intrinsics.checkNotNullParameter(children, "children");
            this.f108179a = c10;
            this.f108180b = exact;
            this.f108181c = children;
            b[] bVarArr = new b[256];
            for (int i10 = 0; i10 < 256; i10++) {
                Iterator it = this.f108181c.iterator();
                Object obj = null;
                boolean z10 = false;
                Object obj2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((b) next).f108179a == i10) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            obj2 = next;
                        }
                    } else if (z10) {
                        obj = obj2;
                    }
                }
                bVarArr[i10] = obj;
            }
            this.f108182d = bVarArr;
        }
    }

    public c(b root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f108178a = root;
    }
}
