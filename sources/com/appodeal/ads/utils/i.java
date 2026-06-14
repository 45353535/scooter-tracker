package com.appodeal.ads.utils;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15023d;

    public i(String str) {
        ArrayList arrayList;
        Integer num;
        Integer num2;
        Integer num3;
        List listSplit$default;
        String str2;
        List listSplit$default2;
        if (str == null || (listSplit$default = StringsKt.split$default(str, new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null)) == null || (str2 = (String) CollectionsKt.firstOrNull(listSplit$default)) == null || (listSplit$default2 = StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
            Iterator it = listSplit$default2.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.toIntOrNull((String) it.next()));
            }
        }
        int iIntValue = -1;
        this.f15021b = (arrayList == null || (num3 = (Integer) CollectionsKt.getOrNull(arrayList, 0)) == null) ? -1 : num3.intValue();
        this.f15022c = (arrayList == null || (num2 = (Integer) CollectionsKt.getOrNull(arrayList, 1)) == null) ? -1 : num2.intValue();
        if (arrayList != null && (num = (Integer) CollectionsKt.getOrNull(arrayList, 2)) != null) {
            iIntValue = num.intValue();
        }
        this.f15023d = iIntValue;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = this.f15021b;
        if (i10 == -1) {
            return -1;
        }
        int iCompare = Intrinsics.compare(i10, other.f15021b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Intrinsics.compare(this.f15022c, other.f15022c);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Intrinsics.compare(this.f15023d, other.f15023d);
        if (iCompare3 != 0) {
            return iCompare3;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this.f15021b == -1) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.appodeal.ads.utils.SdkVersion");
        i iVar = (i) obj;
        return this.f15021b == iVar.f15021b && this.f15022c == iVar.f15022c && this.f15023d == iVar.f15023d;
    }

    public final int hashCode() {
        return (((this.f15021b * 31) + this.f15022c) * 31) + this.f15023d;
    }

    public final String toString() {
        int i10 = this.f15021b;
        if (i10 == -1) {
            return "invalidSdkVersion" + kotlin.random.d.f93341b.i();
        }
        return i10 + "." + this.f15022c + "." + this.f15023d;
    }
}
