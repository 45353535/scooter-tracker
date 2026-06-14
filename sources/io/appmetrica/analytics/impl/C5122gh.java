package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5122gh extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ce f77261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f77262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G2 f77263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5236l2 f77264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5585z2 f77265f;

    public C5122gh(C5058e5 c5058e5, Ce ce2) {
        this(c5058e5, ce2, ((Vm) Tm.a(C5004c2.class)).create(c5058e5.getContext()), new G2(c5058e5.getContext()), new C5236l2(), new C5585z2(c5058e5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        C5058e5 c5058e5 = this.f76636a;
        c5058e5.f77063b.toString();
        if (!c5058e5.f77081t.c() || !c5058e5.x()) {
            return false;
        }
        C5004c2 c5004c2 = (C5004c2) this.f77262c.read();
        List list = c5004c2.f76940a;
        F2 f22 = c5004c2.f76941b;
        G2 g22 = this.f77263d;
        g22.getClass();
        C5004c2 c5004c22 = null;
        F2 f2A = AndroidUtils.isApiAchieved(28) ? C2.a(g22.f75807a, g22.f75808b) : null;
        List list2 = c5004c2.f76942c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f77265f.f78602a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C5560y2());
        Ce ce2 = this.f77261b;
        Context context = this.f76636a.f77062a;
        ce2.getClass();
        ArrayList arrayListA = new Ui(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !no.a(f22, f2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            c5004c22 = new C5004c2(list, f2A, list3);
        }
        if (c5004c22 != null) {
            C5392r9 c5392r9 = c5058e5.f77075n;
            W5 w5A = W5.a(w52, c5004c22.f76940a, c5004c22.f76941b, this.f77264e, c5004c22.f76942c);
            c5392r9.a(w5A, Wk.a(c5392r9.f78129c.b(w5A), w5A.f76622i));
            long jCurrentTimeSeconds = c5392r9.f78136j.currentTimeSeconds();
            c5392r9.f78138l = jCurrentTimeSeconds;
            c5392r9.f78127a.a(jCurrentTimeSeconds).b();
            this.f77262c.save(c5004c22);
            return false;
        }
        if (!c5058e5.A()) {
            return false;
        }
        C5392r9 c5392r92 = c5058e5.f77075n;
        W5 w5A2 = W5.a(w52, c5004c2.f76940a, c5004c2.f76941b, this.f77264e, c5004c2.f76942c);
        c5392r92.a(w5A2, Wk.a(c5392r92.f78129c.b(w5A2), w5A2.f76622i));
        long jCurrentTimeSeconds2 = c5392r92.f78136j.currentTimeSeconds();
        c5392r92.f78138l = jCurrentTimeSeconds2;
        c5392r92.f78127a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C5122gh(C5058e5 c5058e5, Ce ce2, ProtobufStateStorage protobufStateStorage, G2 g22, C5236l2 c5236l2, C5585z2 c5585z2) {
        super(c5058e5);
        this.f77261b = ce2;
        this.f77262c = protobufStateStorage;
        this.f77263d = g22;
        this.f77264e = c5236l2;
        this.f77265f = c5585z2;
    }
}
