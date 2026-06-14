package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.length = Math.max(f10, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @NonNull
    public String toString() {
        return "[Dash: length=" + this.length + C4240b4.j.f42674e;
    }
}
