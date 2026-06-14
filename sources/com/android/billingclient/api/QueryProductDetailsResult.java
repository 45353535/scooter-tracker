package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@zzv
public final class QueryProductDetailsResult {
    private final List<ProductDetails> productDetailsList;
    private final List<UnfetchedProduct> unfetchedProductList;

    QueryProductDetailsResult(List<ProductDetails> list, List<UnfetchedProduct> list2) {
        this.productDetailsList = list;
        this.unfetchedProductList = list2;
    }

    @NonNull
    public static QueryProductDetailsResult create(@NonNull List<ProductDetails> list, @NonNull List<UnfetchedProduct> list2) {
        return new QueryProductDetailsResult(list, list2);
    }

    @NonNull
    @zzv
    public List<ProductDetails> getProductDetailsList() {
        return this.productDetailsList;
    }

    @NonNull
    @zzv
    public List<UnfetchedProduct> getUnfetchedProductList() {
        return this.unfetchedProductList;
    }
}
