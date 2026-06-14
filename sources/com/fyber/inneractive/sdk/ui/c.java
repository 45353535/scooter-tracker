package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f23829a;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f23829a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f23829a.f23807q = this.f23829a.f23804n.getWidth() + r1.f23804n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f23829a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.f23825k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.f23807q *= -1.0f;
        }
        fyberAdIdentifierLocal.f23804n.setTranslationX(fyberAdIdentifierLocal.f23807q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f23829a;
        if (fyberAdIdentifierLocal2.f23805o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
