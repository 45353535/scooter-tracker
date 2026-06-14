package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.StampStyle;

/* JADX INFO: loaded from: classes8.dex */
public class SpriteStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        @NonNull
        public SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        protected Builder self() {
            return this;
        }

        /* synthetic */ Builder(zzv zzvVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        protected final /* bridge */ /* synthetic */ StampStyle.Builder self() {
            return this;
        }
    }

    public SpriteStyle(@NonNull BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    @NonNull
    public static Builder newBuilder(@NonNull BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
