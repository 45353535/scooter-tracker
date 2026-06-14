package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ProductData extends ProductData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24120a;

    AutoValue_ProductData(Integer num) {
        this.f24120a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.f24120a;
        Integer productId = ((ProductData) obj).getProductId();
        return num == null ? productId == null : num.equals(productId);
    }

    @Override // com.google.android.datatransport.ProductData
    @Nullable
    public Integer getProductId() {
        return this.f24120a;
    }

    public int hashCode() {
        Integer num = this.f24120a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f24120a + "}";
    }
}
