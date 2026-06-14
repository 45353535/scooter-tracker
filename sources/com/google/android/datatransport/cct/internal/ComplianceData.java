package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes7.dex */
@AutoValue
public abstract class ComplianceData {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ComplianceData build();

        @NonNull
        public abstract Builder setPrivacyContext(@Nullable ExternalPrivacyContext externalPrivacyContext);

        @NonNull
        public abstract Builder setProductIdOrigin(@Nullable ProductIdOrigin productIdOrigin);
    }

    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final SparseArray f24272c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24274b;

        static {
            ProductIdOrigin productIdOrigin = NOT_SET;
            ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f24272c = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        ProductIdOrigin(int i10) {
            this.f24274b = i10;
        }

        @Nullable
        public static ProductIdOrigin forNumber(int i10) {
            return (ProductIdOrigin) f24272c.get(i10);
        }

        public int getValue() {
            return this.f24274b;
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ComplianceData.Builder();
    }

    @Nullable
    public abstract ExternalPrivacyContext getPrivacyContext();

    @Nullable
    public abstract ProductIdOrigin getProductIdOrigin();
}
