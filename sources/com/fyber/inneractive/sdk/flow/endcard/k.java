package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f20667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f20668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20669f;

    public k(Context context, t0 t0Var) {
        x0 x0Var = new x0(context, t0Var);
        m mVar = new m();
        this.f20665b = mVar;
        this.f20664a = x0Var;
        this.f20666c = !TextUtils.equals(x0Var.f21044d.E, "1");
        h hVar = new h();
        this.f20668e = hVar;
        this.f20669f = hVar.f20661b;
        this.f20667d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(x0Var, mVar);
    }

    public final b a() {
        b bVar;
        m mVar = this.f20665b;
        int size = mVar.f20700a.size();
        int i10 = mVar.f20702c;
        do {
            i10++;
            if (i10 >= size) {
                return null;
            }
            bVar = (b) mVar.f20700a.get(i10);
        } while (!bVar.l());
        if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
            for (int size2 = mVar.f20701b.size() - 1; size2 >= 0; size2--) {
                if (((b) mVar.f20701b.get(size2)) instanceof o) {
                    return null;
                }
            }
            if (mVar.f20702c >= 0) {
                return null;
            }
        } else if (bVar instanceof c) {
            int i11 = i10 + 1;
            for (int size3 = mVar.f20700a.size() - 1; size3 >= i11; size3--) {
                b bVar2 = (b) mVar.f20700a.get(size3);
                if (bVar2 instanceof c) {
                    bVar2.destroy();
                    mVar.f20700a.remove(size3);
                }
            }
        }
        mVar.f20702c = i10;
        mVar.f20701b.add(bVar);
        bVar.f20650e = mVar.f20701b.size();
        return bVar;
    }
}
