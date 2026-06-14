package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ProductDetails {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    @Nullable
    private final String zzi;

    @Nullable
    private final List zzj;

    @Nullable
    private final List zzk;

    @zzn
    public static final class InstallmentPlanDetails {
        private final int commitmentPaymentsCount;
        private final int subsequentCommitmentPaymentsCount;

        InstallmentPlanDetails(JSONObject jSONObject) throws JSONException {
            this.commitmentPaymentsCount = jSONObject.getInt("commitmentPaymentsCount");
            this.subsequentCommitmentPaymentsCount = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzn
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        @zzn
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }
    }

    public static final class OneTimePurchaseOfferDetails {
        private final String zza;
        private final long zzb;
        private final String zzc;

        @Nullable
        private final String zzd;

        @Nullable
        private final String zze;

        @Nullable
        private final String zzf;
        private final List zzg;

        @Nullable
        private final Long zzh;

        @Nullable
        private final DiscountDisplayInfo zzi;

        @Nullable
        private final ValidTimeWindow zzj;

        @Nullable
        private final LimitedQuantityInfo zzk;

        @Nullable
        private final String zzl;

        @Nullable
        private final PreorderDetails zzm;

        @Nullable
        private final RentalDetails zzn;

        @Nullable
        private final zzdt zzo;

        @zzr
        public static final class DiscountDisplayInfo {

            @Nullable
            private final Integer zza;

            @Nullable
            private final DiscountAmount zzb;

            @zzr
            public static final class DiscountAmount {
                private final String zza;
                private final long zzb;
                private final String zzc;

                DiscountAmount(JSONObject jSONObject) {
                    this.zza = jSONObject.optString("formattedDiscountAmount");
                    this.zzb = jSONObject.optLong("discountAmountMicros");
                    this.zzc = jSONObject.optString("discountAmountCurrencyCode");
                }

                @NonNull
                public String getDiscountAmountCurrencyCode() {
                    return this.zzc;
                }

                public long getDiscountAmountMicros() {
                    return this.zzb;
                }

                @NonNull
                public String getFormattedDiscountAmount() {
                    return this.zza;
                }
            }

            DiscountDisplayInfo(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.zzb = jSONObjectOptJSONObject != null ? new DiscountAmount(jSONObjectOptJSONObject) : null;
            }

            @Nullable
            @zzr
            public DiscountAmount getDiscountAmount() {
                return this.zzb;
            }

            @Nullable
            @zzr
            public Integer getPercentageDiscount() {
                return this.zza;
            }
        }

        @zzr
        public static final class LimitedQuantityInfo {
            private final int zza;
            private final int zzb;

            LimitedQuantityInfo(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.getInt("maximumQuantity");
                this.zzb = jSONObject.getInt("remainingQuantity");
            }

            @zzr
            public int getMaximumQuantity() {
                return this.zza;
            }

            @zzr
            public int getRemainingQuantity() {
                return this.zzb;
            }
        }

        @zzs
        public static final class PreorderDetails {
            private final long preorderPresaleEndTimeMillis;
            private final long preorderReleaseTimeMillis;

            PreorderDetails(JSONObject jSONObject) throws JSONException {
                this.preorderReleaseTimeMillis = jSONObject.getLong("preorderReleaseTimeMillis");
                this.preorderPresaleEndTimeMillis = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            @zzs
            public long getPreorderPresaleEndTimeMillis() {
                return this.preorderPresaleEndTimeMillis;
            }

            @zzs
            public long getPreorderReleaseTimeMillis() {
                return this.preorderReleaseTimeMillis;
            }
        }

        @zzt
        public static final class RentalDetails {

            @Nullable
            private final String rentalExpirationPeriod;
            private final String rentalPeriod;

            RentalDetails(JSONObject jSONObject) throws JSONException {
                this.rentalPeriod = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.rentalExpirationPeriod = true == strOptString.isEmpty() ? null : strOptString;
            }

            @Nullable
            @zzt
            public String getRentalExpirationPeriod() {
                return this.rentalExpirationPeriod;
            }

            @NonNull
            @zzt
            public String getRentalPeriod() {
                return this.rentalPeriod;
            }
        }

        @zzr
        public static final class ValidTimeWindow {

            @Nullable
            private final Long zza;

            @Nullable
            private final Long zzb;

            ValidTimeWindow(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.zzb = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @Nullable
            @zzr
            public Long getEndTimeMillis() {
                return this.zzb;
            }

            @Nullable
            @zzr
            public Long getStartTimeMillis() {
                return this.zza;
            }
        }

        OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.zzd = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.zze = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.zzf = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.zzg = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.zzg.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.zzh = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.zzi = jSONObjectOptJSONObject == null ? null : new DiscountDisplayInfo(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.zzj = jSONObjectOptJSONObject2 == null ? null : new ValidTimeWindow(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.zzk = jSONObjectOptJSONObject3 == null ? null : new LimitedQuantityInfo(jSONObjectOptJSONObject3);
            this.zzl = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.zzm = jSONObjectOptJSONObject4 == null ? null : new PreorderDetails(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.zzn = jSONObjectOptJSONObject5 == null ? null : new RentalDetails(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.zzo = jSONObjectOptJSONObject6 != null ? new zzdt(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new PricingPhases(jSONArrayOptJSONArray2);
        }

        @Nullable
        @zzr
        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.zzi;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.zza;
        }

        @Nullable
        @zzr
        public Long getFullPriceMicros() {
            return this.zzh;
        }

        @Nullable
        @zzr
        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.zzk;
        }

        @Nullable
        @zzr
        @zzt
        public String getOfferId() {
            return this.zze;
        }

        @Nullable
        @zzr
        public List<String> getOfferTags() {
            return this.zzg;
        }

        @Nullable
        @zzr
        @zzt
        public String getOfferToken() {
            return this.zzd;
        }

        @Nullable
        @zzs
        public PreorderDetails getPreorderDetails() {
            return this.zzm;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        @Nullable
        @zzt
        public String getPurchaseOptionId() {
            return this.zzf;
        }

        @Nullable
        @zzt
        public RentalDetails getRentalDetails() {
            return this.zzn;
        }

        @Nullable
        @zzr
        public ValidTimeWindow getValidTimeWindow() {
            return this.zzj;
        }

        @Nullable
        public final zzdt zza() {
            return this.zzo;
        }

        @Nullable
        final String zzb() {
            return this.zzl;
        }
    }

    public static final class PricingPhase {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final int zze;
        private final int zzf;

        PricingPhase(JSONObject jSONObject) {
            this.zzd = jSONObject.optString("billingPeriod");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzf = jSONObject.optInt("recurrenceMode");
            this.zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.zze;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.zzd;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        public int getRecurrenceMode() {
            return this.zzf;
        }
    }

    public static class PricingPhases {
        private final List zza;

        PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.zza = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.zza;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {
        private final String zza;

        @Nullable
        private final String zzb;
        private final String zzc;
        private final PricingPhases zzd;
        private final List zze;

        @Nullable
        private final InstallmentPlanDetails zzf;

        SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.zzb = true == strOptString.isEmpty() ? null : strOptString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.zzf = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.zze = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.zza;
        }

        @Nullable
        @zzn
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.zzf;
        }

        @Nullable
        public String getOfferId() {
            return this.zzb;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.zze;
        }

        @NonNull
        public String getOfferToken() {
            return this.zzc;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.zzd;
        }
    }

    ProductDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzc = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.zzd = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.zze = jSONObject.optString("title");
        this.zzf = jSONObject.optString("name");
        this.zzg = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.zzh = jSONObject.optString("skuDetailsToken");
        this.zzi = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.zzj = arrayList;
        } else {
            this.zzj = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.zzk = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.zzk = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.zzk = arrayList2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.zza, ((ProductDetails) obj).zza);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.zzg;
    }

    @NonNull
    public String getName() {
        return this.zzf;
    }

    @Nullable
    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.zzk;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) list.get(0);
    }

    @Nullable
    @zzr
    @zzt
    public List<OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.zzk;
    }

    @NonNull
    public String getProductId() {
        return this.zzc;
    }

    @NonNull
    public String getProductType() {
        return this.zzd;
    }

    @Nullable
    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.zzj;
    }

    @NonNull
    public String getTitle() {
        return this.zze;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @NonNull
    public String toString() {
        List list = this.zzj;
        return "ProductDetails{jsonString='" + this.zza + "', parsedJson=" + this.zzb.toString() + ", productId='" + this.zzc + "', productType='" + this.zzd + "', title='" + this.zze + "', productDetailsToken='" + this.zzh + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    @NonNull
    public final String zza() {
        return this.zzb.optString("packageName");
    }

    final String zzb() {
        return this.zzh;
    }

    @Nullable
    final String zzc(@Nullable String str) {
        List<OneTimePurchaseOfferDetails> list;
        if (!TextUtils.isEmpty(str) && (list = this.zzk) != null && !list.isEmpty()) {
            for (OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails : list) {
                if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzb()) && Objects.equals(oneTimePurchaseOfferDetails.getOfferToken(), str)) {
                    return oneTimePurchaseOfferDetails.zzb();
                }
            }
        }
        return this.zzi;
    }
}
