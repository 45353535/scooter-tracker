package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5403rk extends Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f78166a;

    public C5403rk() {
        this(C5468ua.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i10) {
        yo yoVar = this.f78166a;
        synchronized (yoVar) {
            Ao ao = yoVar.f78594a;
            ao.a(ao.a().put("last_migration_api_level", i10));
        }
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        int iOptInt;
        yo yoVar = this.f78166a;
        synchronized (yoVar) {
            iOptInt = yoVar.f78594a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        SparseArray<Pc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C5428sk(this.f78166a));
        sparseArray.put(115, new C5453tk());
        sparseArray.put(116, new C5553xk());
        return sparseArray;
    }

    public C5403rk(yo yoVar) {
        this.f78166a = yoVar;
    }
}
