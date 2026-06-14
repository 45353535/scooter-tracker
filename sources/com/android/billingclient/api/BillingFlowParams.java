package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.ProductDetails;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BillingFlowParams {
    private boolean zza;
    private String zzb;
    private String zzc;
    private SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzbw zze;
    private ArrayList zzf;
    private boolean zzg;

    @Nullable
    private DeveloperBillingOptionParams zzh;

    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        @Nullable
        private DeveloperBillingOptionParams zzg;

        private Builder() {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zzf = builderNewBuilder;
        }

        @NonNull
        public BillingFlowParams build() {
            ArrayList arrayList = this.zzd;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.zzc;
            boolean z12 = (list == null || list.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            zzcx zzcxVar = null;
            if (!z11) {
                List list2 = this.zzc;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((ProductDetailsParams) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.zzd.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.zzd.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.zzd;
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i10);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList3 = this.zzd;
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i11);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(zzcxVar);
            if ((!z11 || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z12 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                z10 = false;
            }
            billingFlowParams.zza = z10;
            billingFlowParams.zzb = this.zza;
            billingFlowParams.zzc = this.zzb;
            billingFlowParams.zzd = this.zzf.build();
            ArrayList arrayList4 = this.zzd;
            billingFlowParams.zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            billingFlowParams.zzg = this.zze;
            List list3 = this.zzc;
            billingFlowParams.zze = list3 != null ? com.google.android.gms.internal.play_billing.zzbw.zzj(list3) : com.google.android.gms.internal.play_billing.zzbw.zzk();
            billingFlowParams.zzh = this.zzg;
            return billingFlowParams;
        }

        @NonNull
        @zzl
        public Builder enableDeveloperBillingOption(@NonNull DeveloperBillingOptionParams developerBillingOptionParams) {
            this.zzg = developerBillingOptionParams;
            return this;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z10) {
            this.zze = z10;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(zzcx zzcxVar) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zzf = builderNewBuilder;
        }
    }

    public static final class ProductDetailsParams {

        @Nullable
        @zzy
        private final SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;
        private final ProductDetails zza;

        @Nullable
        private final String zzb;

        public static class Builder {

            @Nullable
            @zzy
            private SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;
            private ProductDetails zza;

            @Nullable
            private String zzb;

            private Builder() {
                throw null;
            }

            @NonNull
            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzbj.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.zzb = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.zzb = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }

            @NonNull
            @zzy
            public Builder setSubscriptionProductReplacementParams(@NonNull SubscriptionProductReplacementParams subscriptionProductReplacementParams) {
                this.mSubscriptionProductReplacementParams = subscriptionProductReplacementParams;
                return this;
            }

            /* synthetic */ Builder(zzcx zzcxVar) {
            }
        }

        @zzy
        public static class SubscriptionProductReplacementParams {
            private String oldProductId;

            @zzy
            private int replacementMode;

            @zzy
            public static class Builder {
                private String oldProductId;
                private int replacementMode;

                private Builder() {
                    this.replacementMode = 0;
                }

                @NonNull
                @zzy
                public SubscriptionProductReplacementParams build() {
                    SubscriptionProductReplacementParams subscriptionProductReplacementParams = new SubscriptionProductReplacementParams();
                    subscriptionProductReplacementParams.oldProductId = this.oldProductId;
                    subscriptionProductReplacementParams.replacementMode = this.replacementMode;
                    return subscriptionProductReplacementParams;
                }

                @NonNull
                @zzy
                public Builder setOldProductId(@NonNull String str) {
                    this.oldProductId = str;
                    return this;
                }

                @NonNull
                @zzy
                public Builder setReplacementMode(int i10) {
                    this.replacementMode = i10;
                    return this;
                }
            }

            @Retention(RetentionPolicy.SOURCE)
            public @interface ReplacementMode {
                public static final int CHARGE_FULL_PRICE = 4;
                public static final int CHARGE_PRORATED_PRICE = 2;
                public static final int DEFERRED = 5;
                public static final int KEEP_EXISTING = 6;
                public static final int UNKNOWN_REPLACEMENT_MODE = 0;
                public static final int WITHOUT_PRORATION = 3;
                public static final int WITH_TIME_PRORATION = 1;
            }

            @NonNull
            public static Builder newBuilder() {
                return new Builder();
            }

            @NonNull
            @zzy
            public String getOldProductId() {
                return this.oldProductId;
            }

            @zzy
            public int getReplacementMode() {
                return this.replacementMode;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzcx zzcxVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.mSubscriptionProductReplacementParams = builder.mSubscriptionProductReplacementParams;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @Nullable
        @zzy
        public SubscriptionProductReplacementParams getSubscriptionProductReplacementParams() {
            return this.mSubscriptionProductReplacementParams;
        }

        @NonNull
        public final ProductDetails zza() {
            return this.zza;
        }

        @Nullable
        public final String zzb() {
            return this.zzb;
        }
    }

    public static class SubscriptionUpdateParams {
        private String zza;
        private String zzb;
        private int zzc = 0;

        public static class Builder {
            private String zza;
            private String zzb;
            private boolean zzc;
            private int zzd = 0;

            private Builder() {
            }

            static /* synthetic */ Builder zza(Builder builder) {
                builder.zzc = true;
                return builder;
            }

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z10 = true;
                zzcx zzcxVar = null;
                if (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.zzb);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(zzcxVar);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzc = this.zzd;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            @zze
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setSubscriptionReplacementMode(int i10) {
                this.zzd = i10;
                return this;
            }

            @NonNull
            @Deprecated
            public final Builder zzb(@NonNull String str) {
                this.zza = str;
                return this;
            }

            /* synthetic */ Builder(zzcx zzcxVar) {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        static /* bridge */ /* synthetic */ Builder zzb(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder builderNewBuilder = newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.zza);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzc);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return builderNewBuilder;
        }

        final int zza() {
            return this.zzc;
        }

        final String zzc() {
            return this.zza;
        }

        final String zzd() {
            return this.zzb;
        }

        /* synthetic */ SubscriptionUpdateParams(zzcx zzcxVar) {
        }
    }

    private BillingFlowParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Nullable
    @zzl
    public DeveloperBillingOptionParams getDeveloperBillingOptionParams() {
        return this.zzh;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.zzd.zza();
    }

    public long zzc() {
        return 0L;
    }

    final BillingResult zzd() {
        ProductDetails.OneTimePurchaseOfferDetails next;
        ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams;
        char c10;
        BillingResult billingResultZza;
        BillingResult billingResultZza2;
        char c11 = 0;
        if (this.zze.isEmpty()) {
            return zzdc.zzi;
        }
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zze.get(0);
        for (int i10 = 1; i10 < this.zze.size(); i10++) {
            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zze.get(i10);
            if (!productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                return zzdc.zza(5, "All products should have same ProductType.");
            }
        }
        String strZza = productDetailsParams.zza().zza();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.zzbw zzbwVar = this.zze;
        int size = zzbwVar.size();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) zzbwVar.get(i11);
            ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams2 = productDetailsParams3.getSubscriptionProductReplacementParams();
            if (subscriptionProductReplacementParams2 != null) {
                c10 = c11;
                if (!productDetailsParams3.zza().getProductType().equals("subs")) {
                    Object[] objArr = new Object[1];
                    objArr[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza2 = zzdc.zza(5, String.format("Non-subscription product cannot have SubscriptionProductReplacementParams. Invalid product id: %s", objArr));
                } else if (subscriptionProductReplacementParams2.getReplacementMode() <= 0) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza2 = zzdc.zza(5, String.format("replacementMode is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", objArr2));
                } else if (com.google.android.gms.internal.play_billing.zzbm.zzd(subscriptionProductReplacementParams2.oldProductId)) {
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza2 = zzdc.zza(5, String.format("oldProductId is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", objArr3));
                } else {
                    billingResultZza2 = zzdc.zzi;
                }
                if (billingResultZza2 != zzdc.zzi) {
                    return billingResultZza2;
                }
            } else {
                c10 = c11;
            }
            if (subscriptionProductReplacementParams2 != null && subscriptionProductReplacementParams2.getReplacementMode() == 6) {
                if (productDetailsParams3.zzb() != null) {
                    Object[] objArr4 = new Object[1];
                    objArr4[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza = zzdc.zza(5, String.format("When using KEEP_EXISTING mode, offerToken in ProductDetailsParams should not be set. Offer token is set for product id: %s", objArr4));
                } else if (subscriptionProductReplacementParams2.getOldProductId().equals(productDetailsParams3.zza().getProductId())) {
                    billingResultZza = zzdc.zzi;
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza = zzdc.zza(5, String.format("When using KEEP_EXISTING mode, oldProductId in SubscriptionProductReplacementParams should be the same as the product id in ProductDetails. Value is invalid for product id: %s", objArr5));
                }
                if (billingResultZza != zzdc.zzi) {
                    return billingResultZza;
                }
            }
            if (productDetailsParams3.zza().getSubscriptionOfferDetails() != null && productDetailsParams3.zzb() == null && (subscriptionProductReplacementParams2 == null || subscriptionProductReplacementParams2.getReplacementMode() != 6)) {
                Object[] objArr6 = new Object[1];
                objArr6[c10] = productDetailsParams3.zza().getProductId();
                return zzdc.zza(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", objArr6));
            }
            if (map.containsKey(productDetailsParams3.zza().getProductId())) {
                Object[] objArr7 = new Object[1];
                objArr7[c10] = productDetailsParams3.zza().getProductId();
                return zzdc.zza(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", objArr7));
            }
            map.put(productDetailsParams3.zza().getProductId(), productDetailsParams3);
            if (subscriptionProductReplacementParams2 != null) {
                if (hashSet.contains(subscriptionProductReplacementParams2.getOldProductId())) {
                    Object[] objArr8 = new Object[1];
                    objArr8[c10] = subscriptionProductReplacementParams2.getOldProductId();
                    return zzdc.zza(5, String.format("OldProductId can not be duplicated. Invalid old product id: %s.", objArr8));
                }
                hashSet.add(subscriptionProductReplacementParams2.getOldProductId());
                z10 = true;
            }
            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                return zzdc.zza(5, "All products must have the same package name.");
            }
            i11++;
            c11 = c10;
        }
        char c12 = c11;
        for (String str : hashSet) {
            if (map.containsKey(str) && ((subscriptionProductReplacementParams = ((ProductDetailsParams) map.get(str)).getSubscriptionProductReplacementParams()) == null || !subscriptionProductReplacementParams.getOldProductId().equals(str))) {
                Object[] objArr9 = new Object[1];
                objArr9[c12] = str;
                return zzdc.zza(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", objArr9));
            }
        }
        if (z10 && this.zzd.zza() != 0) {
            return zzdc.zza(5, "SubscriptionUpdateParams.setSubscriptionReplaceMode and  ProductDetailsParams.setSubscriptionProductReplacementParams cannot be called at the same time.");
        }
        List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
        String strZzb = productDetailsParams.zzb();
        if (strZzb != null && oneTimePurchaseOfferDetailsList != null) {
            Iterator<ProductDetails.OneTimePurchaseOfferDetails> it = oneTimePurchaseOfferDetailsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (strZzb.equals(next.getOfferToken())) {
                    break;
                }
            }
            if (next != null && next.zza() != null) {
                return zzdc.zza(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return zzdc.zzi;
    }

    @Nullable
    public final String zze() {
        return this.zzb;
    }

    @Nullable
    public final String zzf() {
        return this.zzc;
    }

    @Nullable
    public String zzg() {
        return null;
    }

    @Nullable
    public final String zzh() {
        return this.zzd.zzc();
    }

    @Nullable
    public final String zzi() {
        return this.zzd.zzd();
    }

    @NonNull
    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    @NonNull
    public final List zzk() {
        return this.zze;
    }

    public final boolean zzt() {
        return this.zzg;
    }

    final boolean zzu() {
        if (this.zzb != null || this.zzc != null || this.zzd.zzd() != null || this.zzd.zza() != 0 || this.zza || this.zzg) {
            return true;
        }
        com.google.android.gms.internal.play_billing.zzbw zzbwVar = this.zze;
        if (zzbwVar != null) {
            int size = zzbwVar.size();
            int i10 = 0;
            while (i10 < size) {
                ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams = ((ProductDetailsParams) zzbwVar.get(i10)).getSubscriptionProductReplacementParams();
                i10++;
                if (subscriptionProductReplacementParams != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* synthetic */ BillingFlowParams(zzcx zzcxVar) {
    }
}
