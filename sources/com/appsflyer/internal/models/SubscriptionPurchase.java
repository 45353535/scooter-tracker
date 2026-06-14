package com.appsflyer.internal.models;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u009d\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006A"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase;", "", "acknowledgementState", "", "canceledStateContext", "Lcom/appsflyer/internal/models/CanceledStateContext;", "externalAccountIdentifiers", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "kind", "latestOrderId", "lineItems", "", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "linkedPurchaseToken", "pausedStateContext", "Lcom/appsflyer/internal/models/PausedStateContext;", "regionCode", "startTime", "subscribeWithGoogleInfo", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "subscriptionState", "testPurchase", "Lcom/appsflyer/internal/models/TestPurchase;", "(Ljava/lang/String;Lcom/appsflyer/internal/models/CanceledStateContext;Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/internal/models/PausedStateContext;Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;Ljava/lang/String;Lcom/appsflyer/internal/models/TestPurchase;)V", "getAcknowledgementState", "()Ljava/lang/String;", "getCanceledStateContext", "()Lcom/appsflyer/internal/models/CanceledStateContext;", "getExternalAccountIdentifiers", "()Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "getKind", "getLatestOrderId", "getLineItems", "()Ljava/util/List;", "getLinkedPurchaseToken", "getPausedStateContext", "()Lcom/appsflyer/internal/models/PausedStateContext;", "getRegionCode", "getStartTime", "getSubscribeWithGoogleInfo", "()Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "getSubscriptionState", "getTestPurchase", "()Lcom/appsflyer/internal/models/TestPurchase;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SubscriptionPurchase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String acknowledgementState;

    @Nullable
    private final CanceledStateContext canceledStateContext;

    @Nullable
    private final ExternalAccountIdentifiers externalAccountIdentifiers;

    @NotNull
    private final String kind;

    @NotNull
    private final String latestOrderId;

    @NotNull
    private final List<SubscriptionPurchaseLineItem> lineItems;

    @Nullable
    private final String linkedPurchaseToken;

    @Nullable
    private final PausedStateContext pausedStateContext;

    @NotNull
    private final String regionCode;

    @NotNull
    private final String startTime;

    @Nullable
    private final SubscribeWithGoogleInfo subscribeWithGoogleInfo;

    @NotNull
    private final String subscriptionState;

    @Nullable
    private final TestPurchase testPurchase;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SubscriptionPurchase> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public SubscriptionPurchase fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONArray jSONArray = json.getJSONArray("lineItems");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(\"lineItems\")");
            List list = SubscriptionPurchaseKt.toList(jSONArray);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SubscriptionPurchaseLineItem.INSTANCE.fromJson((JSONObject) it.next()));
            }
            String strOptString = json.optString("acknowledgementState");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"acknowledgementState\")");
            CanceledStateContext canceledStateContext = (CanceledStateContext) SubscriptionPurchaseKt.toObject(json, "canceledStateContext", CanceledStateContext.INSTANCE);
            ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) SubscriptionPurchaseKt.toObject(json, "externalAccountIdentifiers", ExternalAccountIdentifiers.INSTANCE);
            String strOptString2 = json.optString("kind");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(\"kind\")");
            String strOptString3 = json.optString("latestOrderId");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(\"latestOrderId\")");
            String str = (String) SubscriptionPurchaseKt.getNullable(json, "linkedPurchaseToken");
            PausedStateContext pausedStateContext = (PausedStateContext) SubscriptionPurchaseKt.toObject(json, "pausedStateContext", PausedStateContext.INSTANCE);
            String strOptString4 = json.optString("regionCode");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(\"regionCode\")");
            String strOptString5 = json.optString("startTime");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(\"startTime\")");
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) SubscriptionPurchaseKt.toObject(json, "subscribeWithGoogleInfo", SubscribeWithGoogleInfo.INSTANCE);
            String strOptString6 = json.optString("subscriptionState");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(\"subscriptionState\")");
            return new SubscriptionPurchase(strOptString, canceledStateContext, externalAccountIdentifiers, strOptString2, strOptString3, arrayList, str, pausedStateContext, strOptString4, strOptString5, subscribeWithGoogleInfo, strOptString6, (TestPurchase) SubscriptionPurchaseKt.toObject(json, "testPurchase", TestPurchase.INSTANCE));
        }
    }

    public SubscriptionPurchase(@NotNull String acknowledgementState, @Nullable CanceledStateContext canceledStateContext, @Nullable ExternalAccountIdentifiers externalAccountIdentifiers, @NotNull String kind, @NotNull String latestOrderId, @NotNull List<SubscriptionPurchaseLineItem> lineItems, @Nullable String str, @Nullable PausedStateContext pausedStateContext, @NotNull String regionCode, @NotNull String startTime, @Nullable SubscribeWithGoogleInfo subscribeWithGoogleInfo, @NotNull String subscriptionState, @Nullable TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(acknowledgementState, "acknowledgementState");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(latestOrderId, "latestOrderId");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        this.acknowledgementState = acknowledgementState;
        this.canceledStateContext = canceledStateContext;
        this.externalAccountIdentifiers = externalAccountIdentifiers;
        this.kind = kind;
        this.latestOrderId = latestOrderId;
        this.lineItems = lineItems;
        this.linkedPurchaseToken = str;
        this.pausedStateContext = pausedStateContext;
        this.regionCode = regionCode;
        this.startTime = startTime;
        this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
        this.subscriptionState = subscriptionState;
        this.testPurchase = testPurchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionPurchase copy$default(SubscriptionPurchase subscriptionPurchase, String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionPurchase.acknowledgementState;
        }
        return subscriptionPurchase.copy(str, (i10 & 2) != 0 ? subscriptionPurchase.canceledStateContext : canceledStateContext, (i10 & 4) != 0 ? subscriptionPurchase.externalAccountIdentifiers : externalAccountIdentifiers, (i10 & 8) != 0 ? subscriptionPurchase.kind : str2, (i10 & 16) != 0 ? subscriptionPurchase.latestOrderId : str3, (i10 & 32) != 0 ? subscriptionPurchase.lineItems : list, (i10 & 64) != 0 ? subscriptionPurchase.linkedPurchaseToken : str4, (i10 & 128) != 0 ? subscriptionPurchase.pausedStateContext : pausedStateContext, (i10 & 256) != 0 ? subscriptionPurchase.regionCode : str5, (i10 & 512) != 0 ? subscriptionPurchase.startTime : str6, (i10 & 1024) != 0 ? subscriptionPurchase.subscribeWithGoogleInfo : subscribeWithGoogleInfo, (i10 & 2048) != 0 ? subscriptionPurchase.subscriptionState : str7, (i10 & 4096) != 0 ? subscriptionPurchase.testPurchase : testPurchase);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    @NotNull
    public final List<SubscriptionPurchaseLineItem> component6() {
        return this.lineItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    public final SubscriptionPurchase copy(@NotNull String acknowledgementState, @Nullable CanceledStateContext canceledStateContext, @Nullable ExternalAccountIdentifiers externalAccountIdentifiers, @NotNull String kind, @NotNull String latestOrderId, @NotNull List<SubscriptionPurchaseLineItem> lineItems, @Nullable String linkedPurchaseToken, @Nullable PausedStateContext pausedStateContext, @NotNull String regionCode, @NotNull String startTime, @Nullable SubscribeWithGoogleInfo subscribeWithGoogleInfo, @NotNull String subscriptionState, @Nullable TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(acknowledgementState, "acknowledgementState");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(latestOrderId, "latestOrderId");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        return new SubscriptionPurchase(acknowledgementState, canceledStateContext, externalAccountIdentifiers, kind, latestOrderId, lineItems, linkedPurchaseToken, pausedStateContext, regionCode, startTime, subscribeWithGoogleInfo, subscriptionState, testPurchase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPurchase)) {
            return false;
        }
        SubscriptionPurchase subscriptionPurchase = (SubscriptionPurchase) other;
        return Intrinsics.areEqual(this.acknowledgementState, subscriptionPurchase.acknowledgementState) && Intrinsics.areEqual(this.canceledStateContext, subscriptionPurchase.canceledStateContext) && Intrinsics.areEqual(this.externalAccountIdentifiers, subscriptionPurchase.externalAccountIdentifiers) && Intrinsics.areEqual(this.kind, subscriptionPurchase.kind) && Intrinsics.areEqual(this.latestOrderId, subscriptionPurchase.latestOrderId) && Intrinsics.areEqual(this.lineItems, subscriptionPurchase.lineItems) && Intrinsics.areEqual(this.linkedPurchaseToken, subscriptionPurchase.linkedPurchaseToken) && Intrinsics.areEqual(this.pausedStateContext, subscriptionPurchase.pausedStateContext) && Intrinsics.areEqual(this.regionCode, subscriptionPurchase.regionCode) && Intrinsics.areEqual(this.startTime, subscriptionPurchase.startTime) && Intrinsics.areEqual(this.subscribeWithGoogleInfo, subscriptionPurchase.subscribeWithGoogleInfo) && Intrinsics.areEqual(this.subscriptionState, subscriptionPurchase.subscriptionState) && Intrinsics.areEqual(this.testPurchase, subscriptionPurchase.testPurchase);
    }

    @NotNull
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @Nullable
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    @Nullable
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    @NotNull
    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    @Nullable
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    @NotNull
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    @Nullable
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    public int hashCode() {
        int iHashCode = this.acknowledgementState.hashCode() * 31;
        CanceledStateContext canceledStateContext = this.canceledStateContext;
        int iHashCode2 = (iHashCode + (canceledStateContext == null ? 0 : canceledStateContext.hashCode())) * 31;
        ExternalAccountIdentifiers externalAccountIdentifiers = this.externalAccountIdentifiers;
        int iHashCode3 = (((((((iHashCode2 + (externalAccountIdentifiers == null ? 0 : externalAccountIdentifiers.hashCode())) * 31) + this.kind.hashCode()) * 31) + this.latestOrderId.hashCode()) * 31) + this.lineItems.hashCode()) * 31;
        String str = this.linkedPurchaseToken;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PausedStateContext pausedStateContext = this.pausedStateContext;
        int iHashCode5 = (((((iHashCode4 + (pausedStateContext == null ? 0 : pausedStateContext.hashCode())) * 31) + this.regionCode.hashCode()) * 31) + this.startTime.hashCode()) * 31;
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = this.subscribeWithGoogleInfo;
        int iHashCode6 = (((iHashCode5 + (subscribeWithGoogleInfo == null ? 0 : subscribeWithGoogleInfo.hashCode())) * 31) + this.subscriptionState.hashCode()) * 31;
        TestPurchase testPurchase = this.testPurchase;
        return iHashCode6 + (testPurchase != null ? testPurchase.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubscriptionPurchase(acknowledgementState=" + this.acknowledgementState + ", canceledStateContext=" + this.canceledStateContext + ", externalAccountIdentifiers=" + this.externalAccountIdentifiers + ", kind=" + this.kind + ", latestOrderId=" + this.latestOrderId + ", lineItems=" + this.lineItems + ", linkedPurchaseToken=" + this.linkedPurchaseToken + ", pausedStateContext=" + this.pausedStateContext + ", regionCode=" + this.regionCode + ", startTime=" + this.startTime + ", subscribeWithGoogleInfo=" + this.subscribeWithGoogleInfo + ", subscriptionState=" + this.subscriptionState + ", testPurchase=" + this.testPurchase + ")";
    }
}
