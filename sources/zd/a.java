package zd;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1342a f119343e = new C1342a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f119346d;

    /* JADX INFO: renamed from: zd.a$a, reason: collision with other inner class name */
    public static final class C1342a {
        public /* synthetic */ C1342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            List listEmptyList;
            if (str != null && str.length() != 0) {
                try {
                    List listJ = new Regex("\\.").j(str, 0);
                    if (listJ.isEmpty()) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        ListIterator listIterator = listJ.listIterator(listJ.size());
                        while (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                listEmptyList = CollectionsKt.take(listJ, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                    if (strArr.length == 0) {
                        return null;
                    }
                    int length = strArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (i10 < length) {
                        if (i10 == 0) {
                            i11 = Integer.parseInt(strArr[0]);
                        } else if (i10 != 1) {
                            i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArr[i10]) : Integer.parseInt(strArr[2]);
                        } else {
                            i12 = Integer.parseInt(strArr[1]);
                        }
                        i10++;
                    }
                    return new a(i11, i12, i13);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private C1342a() {
        }
    }

    public a(int i10, int i11, int i12) {
        this.f119344b = i10;
        this.f119345c = i11;
        this.f119346d = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompare = Intrinsics.compare(this.f119344b, other.f119344b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Intrinsics.compare(this.f119345c, other.f119345c);
        return iCompare2 != 0 ? iCompare2 : Intrinsics.compare(this.f119346d, other.f119346d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119344b == aVar.f119344b && this.f119345c == aVar.f119345c && this.f119346d == aVar.f119346d;
    }

    public int hashCode() {
        return (((this.f119344b * 31) + this.f119345c) * 31) + this.f119346d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119344b);
        sb2.append('.');
        sb2.append(this.f119345c);
        sb2.append('.');
        sb2.append(this.f119346d);
        return sb2.toString();
    }
}
