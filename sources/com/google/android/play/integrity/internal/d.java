package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt(Reporting.Key.EVENT_TYPE, fVar.a());
            bundle.putLong("event_timestamp", fVar.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i10, List list) {
        list.add(f.c(i10, System.currentTimeMillis()));
    }
}
