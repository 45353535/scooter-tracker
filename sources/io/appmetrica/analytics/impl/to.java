package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class to implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable List<so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = true;
        for (so soVar : list) {
            if (!soVar.f78248a) {
                linkedList.add(soVar.f78249b);
                z10 = false;
            }
        }
        return z10 ? new so(this, true, "") : new so(this, false, TextUtils.join(", ", linkedList));
    }
}
