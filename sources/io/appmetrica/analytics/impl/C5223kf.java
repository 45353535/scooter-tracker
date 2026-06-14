package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5223kf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5523wf f77605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5094ff f77606b;

    public C5223kf() {
        this(new C5523wf(), new C5094ff());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5423sf fromModel(@NonNull Cif cif) {
        C5423sf c5423sf = new C5423sf();
        c5423sf.f78234a = this.f77605a.fromModel(cif.f77433a);
        c5423sf.f78235b = new C5398rf[cif.f77434b.size()];
        Iterator<C5146hf> it = cif.f77434b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c5423sf.f78235b[i10] = this.f77606b.fromModel(it.next());
            i10++;
        }
        return c5423sf;
    }

    public C5223kf(C5523wf c5523wf, C5094ff c5094ff) {
        this.f77605a = c5523wf;
        this.f77606b = c5094ff;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cif toModel(@NonNull C5423sf c5423sf) {
        C5498vf model;
        ArrayList arrayList = new ArrayList(c5423sf.f78235b.length);
        for (C5398rf c5398rf : c5423sf.f78235b) {
            arrayList.add(this.f77606b.toModel(c5398rf));
        }
        C5374qf c5374qf = c5423sf.f78234a;
        if (c5374qf == null) {
            model = this.f77605a.toModel(new C5374qf());
        } else {
            model = this.f77605a.toModel(c5374qf);
        }
        return new Cif(model, arrayList);
    }
}
