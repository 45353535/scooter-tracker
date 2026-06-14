package com.appodeal.ads.utils.debug;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15005b;

    public n(f fVar) {
        this.f15005b = fVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        this.f15005b.f14990d.filter(s10.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(s10, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(s10, "s");
    }
}
