package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f54465a = new Regex("\\$\\{AUCTION_PRICE\\}");

    public static final g a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List listC = gVar.getSeatBid();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            List<com.moloco.sdk.internal.ortb.model.e> listC2 = ((A) it.next()).getBid();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC2, 10));
            for (com.moloco.sdk.internal.ortb.model.e eVar : listC2) {
                float price = eVar.getPrice();
                String crid = eVar.getCrid();
                String strB = b(eVar.getAdm(), Float.valueOf(price));
                String burl = eVar.getBurl();
                arrayList2.add(new com.moloco.sdk.internal.ortb.model.e(strB, price, burl != null ? b(burl, Float.valueOf(price)) : null, eVar.getExt(), crid, eVar.getBundle()));
            }
            arrayList.add(new A(arrayList2));
        }
        return new g(arrayList);
    }

    public static final String b(String str, Float f10) {
        String string;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = f54465a;
        if (f10 == null || (string = f10.toString()) == null) {
            string = "";
        }
        return regex.replace(str, string);
    }
}
