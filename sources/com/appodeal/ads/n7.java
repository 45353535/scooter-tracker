package com.appodeal.ads;

import android.util.Log;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13810a = CollectionsKt.listOf((Object[]) new String[]{"appodeal", "bidmachine", "mraid", "vast"});

    public final void a() {
        Set setA = com.appodeal.ads.initializing.j.f13479b.f13480a.a((AdType) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setA, 10));
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.appodeal.ads.initializing.g) it.next()).f13475a);
        }
        List listMinus = CollectionsKt.minus((Iterable) this.f13810a, (Iterable) CollectionsKt.toSet(arrayList));
        if (listMinus.isEmpty()) {
            return;
        }
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format(" \n\nATTENTION:\n\tAdapters are not registered in you app: \n\t\t%s.\n\tPlease add the dependencies for them to improve your fill rates and increase revenue.\n\tIf you are sure that you do not need these adapters, skip this warning.\n ", Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(listMinus, null, null, null, 0, null, null, 63, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Log.e("Appodeal", str);
    }
}
