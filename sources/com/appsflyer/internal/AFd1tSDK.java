package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1tSDK {
    @NotNull
    public static final JSONArray AFAdRevenueData(@NotNull List<ExceptionInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ExceptionInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExceptionInfo) it.next()).AFAdRevenueData());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getMediationNetwork(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
