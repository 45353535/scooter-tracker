package com.fyber.inneractive.sdk.flow.endcard;

import android.os.Build;
import j$.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20700a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20701b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20702c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f20703d = new g();

    public final b a() {
        int i10 = this.f20702c;
        if (i10 >= 0) {
            return (b) this.f20700a.get(i10);
        }
        return null;
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        for (b bVar : this.f20701b) {
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.f20700a.contains(bVar)) {
            return;
        }
        this.f20700a.add(bVar);
        if (Build.VERSION.SDK_INT >= 24) {
            List.EL.sort(this.f20700a, this.f20703d);
        } else {
            Collections.sort(this.f20700a, this.f20703d);
        }
    }
}
