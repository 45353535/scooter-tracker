package com.appodeal.ads.inapp;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okio.Utf8;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u0003453J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u0004R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u0004R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u0004R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase;", "", "", "toString", "()Ljava/lang/String;", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "a", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "getType", "()Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "type", "b", "Ljava/lang/String;", "getPublicKey", "publicKey", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSignature", InAppPurchaseMetaData.KEY_SIGNATURE, "d", "getPurchaseData", "purchaseData", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getDeveloperPayload", "developerPayload", InneractiveMediationDefs.GENDER_FEMALE, "getPrice", "price", "g", "getCurrency", "currency", "h", "getSku", AppLovinEventParameters.PRODUCT_IDENTIFIER, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getOrderId", "orderId", "j", "getPurchaseToken", "purchaseToken", "", CampaignEx.JSON_KEY_AD_K, "J", "getPurchaseTimestamp", "()J", "purchaseTimestamp", "", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "additionalParameters", y.f66058y, "Type", "Builder", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InAppPurchase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Type type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String publicKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String purchaseData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String developerPayload;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String price;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String currency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String sku;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String orderId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String purchaseToken;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final long purchaseTimestamp;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Map additionalParameters;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b3\u0018\u00002\u00020\u0001B\u009d\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u0015J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "type", "", "publicKey", InAppPurchaseMetaData.KEY_SIGNATURE, "purchaseData", "developerPayload", "price", "currency", AppLovinEventParameters.PRODUCT_IDENTIFIER, "orderId", "purchaseToken", "", "purchaseTimestamp", "", "additionalParameters", "<init>", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "withPublicKey", "(Ljava/lang/String;)Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "withSignature", "withPurchaseData", "withPrice", "withCurrency", "withSku", "withOrderId", "withDeveloperPayload", "withPurchaseToken", "withPurchaseTimestamp", "(J)Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "withAdditionalParams", "(Ljava/util/Map;)Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "Lcom/appodeal/ads/inapp/InAppPurchase;", "build", "()Lcom/appodeal/ads/inapp/InAppPurchase;", "a", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "getType", "()Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "setType", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;)V", "b", "Ljava/lang/String;", "getPublicKey", "()Ljava/lang/String;", "setPublicKey", "(Ljava/lang/String;)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSignature", "setSignature", "d", "getPurchaseData", "setPurchaseData", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getDeveloperPayload", "setDeveloperPayload", InneractiveMediationDefs.GENDER_FEMALE, "getPrice", "setPrice", "g", "getCurrency", "setCurrency", "h", "getSku", "setSku", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getOrderId", "setOrderId", "j", "getPurchaseToken", "setPurchaseToken", CampaignEx.JSON_KEY_AD_K, "J", "getPurchaseTimestamp", "()J", "setPurchaseTimestamp", "(J)V", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "setAdditionalParameters", "(Ljava/util/Map;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Type type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String publicKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public String signature;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String purchaseData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String developerPayload;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public String price;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public String currency;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public String sku;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public String orderId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public String purchaseToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public long purchaseTimestamp;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public Map additionalParameters;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type) {
            this(type, null, null, null, null, null, null, null, null, null, 0L, null, 4094, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        public final InAppPurchase build() {
            Type type = this.type;
            String str = this.publicKey;
            String str2 = this.signature;
            String str3 = this.purchaseData;
            String str4 = this.developerPayload;
            String str5 = this.price;
            String str6 = this.currency;
            String str7 = this.sku;
            String str8 = this.orderId;
            String str9 = this.purchaseToken;
            long j10 = this.purchaseTimestamp;
            Map map = this.additionalParameters;
            Pair pair = TuplesKt.to("apd_type", type.name());
            String str10 = this.publicKey;
            if (str10 == null || str10.length() == 0) {
                str10 = null;
            }
            Pair pair2 = TuplesKt.to("apd_public_key", str10);
            String str11 = this.signature;
            if (str11 == null || str11.length() == 0) {
                str11 = null;
            }
            Pair pair3 = TuplesKt.to("apd_signature", str11);
            String str12 = this.purchaseData;
            if (str12 == null || str12.length() == 0) {
                str12 = null;
            }
            Pair pair4 = TuplesKt.to("apd_purchase_data", str12);
            String str13 = this.developerPayload;
            if (str13 == null || str13.length() == 0) {
                str13 = null;
            }
            Pair pair5 = TuplesKt.to("apd_developer_payload", str13);
            String str14 = this.price;
            if (str14 == null || str14.length() == 0) {
                str14 = null;
            }
            Pair pair6 = TuplesKt.to("apd_price", str14);
            String str15 = this.currency;
            if (str15 == null || str15.length() == 0) {
                str15 = null;
            }
            Pair pair7 = TuplesKt.to("apd_currency", str15);
            String str16 = this.sku;
            if (str16 == null || str16.length() == 0) {
                str16 = null;
            }
            Pair pair8 = TuplesKt.to("apd_sku", str16);
            String str17 = this.orderId;
            if (str17 == null || str17.length() == 0) {
                str17 = null;
            }
            Pair pair9 = TuplesKt.to("apd_order_id", str17);
            String str18 = this.purchaseToken;
            if (str18 == null || str18.length() == 0) {
                str18 = null;
            }
            Map mapMapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to("apd_purchase_token", str18), TuplesKt.to("apd_purchase_timestamp", String.valueOf(this.purchaseTimestamp)));
            ArrayList arrayList = new ArrayList();
            Iterator it = mapMapOf.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str19 = (String) entry.getKey();
                Iterator it2 = it;
                String str20 = (String) entry.getValue();
                Pair pair10 = str20 != null ? TuplesKt.to(str19, str20) : null;
                if (pair10 != null) {
                    arrayList.add(pair10);
                }
                it = it2;
            }
            return new InAppPurchase(type, str, str2, str3, str4, str5, str6, str7, str8, str9, j10, MapsKt.plus(map, MapsKt.toMap(arrayList)), null);
        }

        public final Map<String, String> getAdditionalParameters() {
            return this.additionalParameters;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDeveloperPayload() {
            return this.developerPayload;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public final String getPurchaseData() {
            return this.purchaseData;
        }

        public final long getPurchaseTimestamp() {
            return this.purchaseTimestamp;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final String getSku() {
            return this.sku;
        }

        public final Type getType() {
            return this.type;
        }

        public final void setAdditionalParameters(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.additionalParameters = map;
        }

        public final void setCurrency(String str) {
            this.currency = str;
        }

        public final void setDeveloperPayload(String str) {
            this.developerPayload = str;
        }

        public final void setOrderId(String str) {
            this.orderId = str;
        }

        public final void setPrice(String str) {
            this.price = str;
        }

        public final void setPublicKey(String str) {
            this.publicKey = str;
        }

        public final void setPurchaseData(String str) {
            this.purchaseData = str;
        }

        public final void setPurchaseTimestamp(long j10) {
            this.purchaseTimestamp = j10;
        }

        public final void setPurchaseToken(String str) {
            this.purchaseToken = str;
        }

        public final void setSignature(String str) {
            this.signature = str;
        }

        public final void setSku(String str) {
            this.sku = str;
        }

        public final void setType(Type type) {
            Intrinsics.checkNotNullParameter(type, "<set-?>");
            this.type = type;
        }

        public final Builder withAdditionalParams(Map<String, String> additionalParameters) {
            Intrinsics.checkNotNullParameter(additionalParameters, "additionalParameters");
            this.additionalParameters = additionalParameters;
            return this;
        }

        public final Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public final Builder withDeveloperPayload(String developerPayload) {
            this.developerPayload = developerPayload;
            return this;
        }

        public final Builder withOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public final Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public final Builder withPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public final Builder withPurchaseData(String purchaseData) {
            this.purchaseData = purchaseData;
            return this;
        }

        public final Builder withPurchaseTimestamp(long purchaseTimestamp) {
            this.purchaseTimestamp = purchaseTimestamp;
            return this;
        }

        public final Builder withPurchaseToken(String purchaseToken) {
            this.purchaseToken = purchaseToken;
            return this;
        }

        public final Builder withSignature(String signature) {
            this.signature = signature;
            return this;
        }

        public final Builder withSku(String sku) {
            this.sku = sku;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str) {
            this(type, str, null, null, null, null, null, null, null, null, 0L, null, 4092, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2) {
            this(type, str, str2, null, null, null, null, null, null, null, 0L, null, 4088, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3) {
            this(type, str, str2, str3, null, null, null, null, null, null, 0L, null, 4080, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4) {
            this(type, str, str2, str3, str4, null, null, null, null, null, 0L, null, 4064, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5) {
            this(type, str, str2, str3, str4, str5, null, null, null, null, 0L, null, 4032, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6) {
            this(type, str, str2, str3, str4, str5, str6, null, null, null, 0L, null, Utf8.MASK_2BYTES, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this(type, str, str2, str3, str4, str5, str6, str7, null, null, 0L, null, 3840, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this(type, str, str2, str3, str4, str5, str6, str7, str8, null, 0L, null, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this(type, str, str2, str3, str4, str5, str6, str7, str8, str9, 0L, null, 3072, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j10) {
            this(type, str, str2, str3, str4, str5, str6, str7, str8, str9, j10, null, 2048, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        public Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j10, Map<String, String> additionalParameters) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(additionalParameters, "additionalParameters");
            this.type = type;
            this.publicKey = str;
            this.signature = str2;
            this.purchaseData = str3;
            this.developerPayload = str4;
            this.price = str5;
            this.currency = str6;
            this.sku = str7;
            this.orderId = str8;
            this.purchaseToken = str9;
            this.purchaseTimestamp = j10;
            this.additionalParameters = additionalParameters;
        }

        public /* synthetic */ Builder(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) == 0 ? str9 : null, (i10 & 1024) != 0 ? 0L : j10, (i10 & 2048) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Companion;", "", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "type", "Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "newBuilder", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;)Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "newInAppBuilder", "()Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "newSubscriptionBuilder", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Builder newBuilder(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Builder(type, null, null, null, null, null, null, null, null, null, 0L, null, 4094, null);
        }

        public final Builder newInAppBuilder() {
            return newBuilder(Type.InApp);
        }

        public final Builder newSubscriptionBuilder() {
            return newBuilder(Type.Subs);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "", "InApp", "Subs", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        public static final Type InApp;
        public static final Type Subs;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f13462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13463b;

        static {
            Type type = new Type("InApp", 0);
            InApp = type;
            Type type2 = new Type("Subs", 1);
            Subs = type2;
            Type[] typeArr = {type, type2};
            f13462a = typeArr;
            f13463b = a.a(typeArr);
        }

        public Type(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return f13463b;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f13462a.clone();
        }
    }

    public InAppPurchase(Type type, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j10, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.type = type;
        this.publicKey = str;
        this.signature = str2;
        this.purchaseData = str3;
        this.developerPayload = str4;
        this.price = str5;
        this.currency = str6;
        this.sku = str7;
        this.orderId = str8;
        this.purchaseToken = str9;
        this.purchaseTimestamp = j10;
        this.additionalParameters = map;
    }

    public static final Builder newBuilder(Type type) {
        return INSTANCE.newBuilder(type);
    }

    public static final Builder newInAppBuilder() {
        return INSTANCE.newInAppBuilder();
    }

    public static final Builder newSubscriptionBuilder() {
        return INSTANCE.newSubscriptionBuilder();
    }

    public final Map<String, String> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getPurchaseData() {
        return this.purchaseData;
    }

    public final long getPurchaseTimestamp() {
        return this.purchaseTimestamp;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Type getType() {
        return this.type;
    }

    public String toString() {
        return "price='" + this.price + "', currency='" + this.currency + "'";
    }
}
