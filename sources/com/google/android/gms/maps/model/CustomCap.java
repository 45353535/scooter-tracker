package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomCap extends Cap {

    @NonNull
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    @NonNull
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + " refWidth=" + this.refWidth + C4240b4.j.f42674e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor, float f10) {
        BitmapDescriptor bitmapDescriptor2 = (BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(bitmapDescriptor2, f10);
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f10;
    }
}
