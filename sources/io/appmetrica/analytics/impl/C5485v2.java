package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5485v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5405rm fromModel(@NonNull C5460u2 c5460u2) {
        C5356pm c5356pm;
        C5405rm c5405rm = new C5405rm();
        c5405rm.f78172a = new C5381qm[c5460u2.f78318a.size()];
        for (int i10 = 0; i10 < c5460u2.f78318a.size(); i10++) {
            C5381qm c5381qm = new C5381qm();
            Pair pair = (Pair) c5460u2.f78318a.get(i10);
            c5381qm.f78094a = (String) pair.first;
            if (pair.second != null) {
                c5381qm.f78095b = new C5356pm();
                C5435t2 c5435t2 = (C5435t2) pair.second;
                if (c5435t2 == null) {
                    c5356pm = null;
                } else {
                    C5356pm c5356pm2 = new C5356pm();
                    c5356pm2.f78009a = c5435t2.f78255a;
                    c5356pm = c5356pm2;
                }
                c5381qm.f78095b = c5356pm;
            }
            c5405rm.f78172a[i10] = c5381qm;
        }
        return c5405rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5460u2 toModel(@NonNull C5405rm c5405rm) {
        ArrayList arrayList = new ArrayList();
        for (C5381qm c5381qm : c5405rm.f78172a) {
            String str = c5381qm.f78094a;
            C5356pm c5356pm = c5381qm.f78095b;
            arrayList.add(new Pair(str, c5356pm == null ? null : new C5435t2(c5356pm.f78009a)));
        }
        return new C5460u2(arrayList);
    }
}
