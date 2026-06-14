package io.bidmachine;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m4 {
    public static /* synthetic */ List a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
