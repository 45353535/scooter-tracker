package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Si implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f76447a = new to();

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable Revenue revenue) {
        so soVar;
        to toVar = this.f76447a;
        Xf xf2 = new Xf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            soVar = new so(xf2, true, "");
        } else {
            soVar = new so(xf2, false, "Invalid quantity value " + num);
        }
        List<so> listAsList = Arrays.asList(soVar);
        toVar.getClass();
        return toVar.a(listAsList);
    }
}
