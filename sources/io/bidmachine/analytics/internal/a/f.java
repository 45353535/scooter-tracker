package io.bidmachine.analytics.internal.a;

import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f79519d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f79520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f79521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f79522c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            Object objB;
            try {
                Result.Companion companion = Result.f93230c;
                if (StringsKt.y0(str)) {
                    return null;
                }
                List listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
                if (listSplit$default.isEmpty()) {
                    return null;
                }
                int size = listSplit$default.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < size && i10 <= 6) {
                    if (i10 == 0) {
                        i11 = Integer.parseInt((String) listSplit$default.get(0));
                    } else if (i10 != 1) {
                        i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt((String) listSplit$default.get(i10)) : Integer.parseInt((String) listSplit$default.get(2));
                    } else {
                        i12 = Integer.parseInt((String) listSplit$default.get(1));
                    }
                    i10++;
                }
                objB = Result.b(new f(i11, i12, i13));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            return (f) (Result.i(objB) ? null : objB);
        }

        private a() {
        }
    }

    public f(int i10, int i11, int i12) {
        this.f79520a = i10;
        this.f79521b = i11;
        this.f79522c = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iCompare = Intrinsics.compare(this.f79520a, fVar.f79520a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Intrinsics.compare(this.f79521b, fVar.f79521b);
        return iCompare2 != 0 ? iCompare2 : Intrinsics.compare(this.f79522c, fVar.f79522c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f79520a == fVar.f79520a && this.f79521b == fVar.f79521b && this.f79522c == fVar.f79522c;
    }

    public int hashCode() {
        return (((this.f79520a * 31) + this.f79521b) * 31) + this.f79522c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f79520a);
        sb2.append('.');
        sb2.append(this.f79521b);
        sb2.append('.');
        sb2.append(this.f79522c);
        return sb2.toString();
    }
}
