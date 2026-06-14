package com.appsflyer.internal.models;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/appsflyer/internal/models/PrepaidPlan;", "", "allowExtendAfterTime", "", "(Ljava/lang/String;)V", "getAllowExtendAfterTime", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PrepaidPlan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String allowExtendAfterTime;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/PrepaidPlan$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/PrepaidPlan;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<PrepaidPlan> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public PrepaidPlan fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PrepaidPlan((String) SubscriptionPurchaseKt.getNullable(json, "allowExtendAfterTime"));
        }
    }

    public PrepaidPlan(@Nullable String str) {
        this.allowExtendAfterTime = str;
    }

    public static /* synthetic */ PrepaidPlan copy$default(PrepaidPlan prepaidPlan, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = prepaidPlan.allowExtendAfterTime;
        }
        return prepaidPlan.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    @NotNull
    public final PrepaidPlan copy(@Nullable String allowExtendAfterTime) {
        return new PrepaidPlan(allowExtendAfterTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PrepaidPlan) && Intrinsics.areEqual(this.allowExtendAfterTime, ((PrepaidPlan) other).allowExtendAfterTime);
    }

    @Nullable
    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    public int hashCode() {
        String str = this.allowExtendAfterTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrepaidPlan(allowExtendAfterTime=" + this.allowExtendAfterTime + ")";
    }
}
