package com.fyber.inneractive.sdk.player.ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23364a;

    public g(s sVar) {
        super(sVar.getContext());
        this.f23364a = new WeakReference(sVar);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = (s) v.a(this.f23364a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).f23365y;
        }
        if (sVar != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(sVar.f23420t.f23872a, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(sVar.f23420t.f23873b, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
