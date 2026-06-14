package com.google.firebase.util;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.d;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/random/d;", "", SessionDescription.ATTR_LENGTH, "", "nextAlphanumericString", "(Lkotlin/random/d;I)Ljava/lang/String;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RandomUtilKt {
    @NotNull
    public static final String nextAlphanumericString(@NotNull d dVar, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("invalid length: " + i10).toString());
        }
        IntRange intRangeV = g.v(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(StringsKt.G1("23456789abcdefghjkmnpqrstvwxyz", dVar)));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
