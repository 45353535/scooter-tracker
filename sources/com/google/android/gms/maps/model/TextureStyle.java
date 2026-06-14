package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.StampStyle;

/* JADX INFO: loaded from: classes8.dex */
public class TextureStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        @NonNull
        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        protected final /* bridge */ /* synthetic */ StampStyle.Builder self() {
            return this;
        }

        /* synthetic */ Builder(zzaf zzafVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        protected Builder self() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzaf zzafVar) {
        super(bitmapDescriptor);
    }

    @NonNull
    public static Builder newBuilder(@NonNull BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
