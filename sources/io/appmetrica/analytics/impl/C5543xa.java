package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5543xa extends K2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f78555b;

    public C5543xa(int i10) {
        this(i10, null);
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    public C5543xa(int i10, @Nullable Aa aa2) {
        super(i10);
        this.f78555b = aa2;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    @NonNull
    public final On a(@Nullable List<Object> list) {
        int iB;
        int i10 = 0;
        if (list == null || (list.size() <= this.f76015a && this.f78555b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < this.f76015a) {
                    Aa aa2 = this.f78555b;
                    if (aa2 != null) {
                        On onA = aa2.a(obj);
                        Object obj2 = onA.f76209a;
                        iB += onA.f76210b.getBytesTruncated();
                        no.a(obj, onA.f76209a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i10++;
                    iB += b(obj);
                }
                i11++;
            }
            list = arrayList;
        }
        return new On(list, new C5462u4(i10, iB));
    }

    @Nullable
    @VisibleForTesting
    public final Aa b() {
        return this.f78555b;
    }
}
