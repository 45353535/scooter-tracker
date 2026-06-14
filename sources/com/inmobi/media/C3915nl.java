package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3915nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f39117a;

    public C3915nl(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f39117a = adContext;
    }

    public static void a(HashMap macros, List nativeTrackers, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(nativeTrackers, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : nativeTrackers) {
            if (Intrinsics.areEqual(((C4107ve) obj).f39775b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C4107ve) it.next()).f39774a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(macros, "macros");
            String strW = str;
            for (Map.Entry entry : macros.entrySet()) {
                strW = StringsKt.W(strW, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            arrayList2.add(strW);
        }
        for (String url : arrayList2) {
            C4121w3 c4121w3 = C4121w3.f39816a;
            Ag priority = Ag.f36573b;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(priority, "priority");
            Dg.a(priority, new C3897n3(url, c3903n9, null));
        }
    }
}
