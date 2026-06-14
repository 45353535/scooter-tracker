package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SideSheetCallback implements SheetCallback {
    void a(View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@NonNull View view, float f10);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@NonNull View view, int i10);
}
