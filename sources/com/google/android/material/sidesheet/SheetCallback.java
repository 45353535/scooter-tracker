package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
interface SheetCallback {
    void onSlide(@NonNull View view, float f10);

    void onStateChanged(@NonNull View view, int i10);
}
