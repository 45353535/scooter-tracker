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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/appsflyer/internal/models/CanceledStateContext;", "", "developerInitiatedCancellation", "Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "replacementCancellation", "Lcom/appsflyer/internal/models/ReplacementCancellation;", "systemInitiatedCancellation", "Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "userInitiatedCancellation", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "(Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;Lcom/appsflyer/internal/models/ReplacementCancellation;Lcom/appsflyer/internal/models/SystemInitiatedCancellation;Lcom/appsflyer/internal/models/UserInitiatedCancellation;)V", "getDeveloperInitiatedCancellation", "()Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "getReplacementCancellation", "()Lcom/appsflyer/internal/models/ReplacementCancellation;", "getSystemInitiatedCancellation", "()Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "getUserInitiatedCancellation", "()Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CanceledStateContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final DeveloperInitiatedCancellation developerInitiatedCancellation;

    @Nullable
    private final ReplacementCancellation replacementCancellation;

    @Nullable
    private final SystemInitiatedCancellation systemInitiatedCancellation;

    @Nullable
    private final UserInitiatedCancellation userInitiatedCancellation;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/CanceledStateContext$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/CanceledStateContext;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<CanceledStateContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public CanceledStateContext fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new CanceledStateContext((DeveloperInitiatedCancellation) SubscriptionPurchaseKt.toObject(json, "developerInitiatedCancellation", DeveloperInitiatedCancellation.INSTANCE), (ReplacementCancellation) SubscriptionPurchaseKt.toObject(json, "replacementCancellation", ReplacementCancellation.INSTANCE), (SystemInitiatedCancellation) SubscriptionPurchaseKt.toObject(json, "systemInitiatedCancellation", SystemInitiatedCancellation.INSTANCE), (UserInitiatedCancellation) SubscriptionPurchaseKt.toObject(json, "userInitiatedCancellation", UserInitiatedCancellation.INSTANCE));
        }
    }

    public CanceledStateContext(@Nullable DeveloperInitiatedCancellation developerInitiatedCancellation, @Nullable ReplacementCancellation replacementCancellation, @Nullable SystemInitiatedCancellation systemInitiatedCancellation, @Nullable UserInitiatedCancellation userInitiatedCancellation) {
        this.developerInitiatedCancellation = developerInitiatedCancellation;
        this.replacementCancellation = replacementCancellation;
        this.systemInitiatedCancellation = systemInitiatedCancellation;
        this.userInitiatedCancellation = userInitiatedCancellation;
    }

    public static /* synthetic */ CanceledStateContext copy$default(CanceledStateContext canceledStateContext, DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            developerInitiatedCancellation = canceledStateContext.developerInitiatedCancellation;
        }
        if ((i10 & 2) != 0) {
            replacementCancellation = canceledStateContext.replacementCancellation;
        }
        if ((i10 & 4) != 0) {
            systemInitiatedCancellation = canceledStateContext.systemInitiatedCancellation;
        }
        if ((i10 & 8) != 0) {
            userInitiatedCancellation = canceledStateContext.userInitiatedCancellation;
        }
        return canceledStateContext.copy(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    @NotNull
    public final CanceledStateContext copy(@Nullable DeveloperInitiatedCancellation developerInitiatedCancellation, @Nullable ReplacementCancellation replacementCancellation, @Nullable SystemInitiatedCancellation systemInitiatedCancellation, @Nullable UserInitiatedCancellation userInitiatedCancellation) {
        return new CanceledStateContext(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CanceledStateContext)) {
            return false;
        }
        CanceledStateContext canceledStateContext = (CanceledStateContext) other;
        return Intrinsics.areEqual(this.developerInitiatedCancellation, canceledStateContext.developerInitiatedCancellation) && Intrinsics.areEqual(this.replacementCancellation, canceledStateContext.replacementCancellation) && Intrinsics.areEqual(this.systemInitiatedCancellation, canceledStateContext.systemInitiatedCancellation) && Intrinsics.areEqual(this.userInitiatedCancellation, canceledStateContext.userInitiatedCancellation);
    }

    @Nullable
    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    @Nullable
    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    @Nullable
    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    @Nullable
    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    public int hashCode() {
        DeveloperInitiatedCancellation developerInitiatedCancellation = this.developerInitiatedCancellation;
        int iHashCode = (developerInitiatedCancellation == null ? 0 : developerInitiatedCancellation.hashCode()) * 31;
        ReplacementCancellation replacementCancellation = this.replacementCancellation;
        int iHashCode2 = (iHashCode + (replacementCancellation == null ? 0 : replacementCancellation.hashCode())) * 31;
        SystemInitiatedCancellation systemInitiatedCancellation = this.systemInitiatedCancellation;
        int iHashCode3 = (iHashCode2 + (systemInitiatedCancellation == null ? 0 : systemInitiatedCancellation.hashCode())) * 31;
        UserInitiatedCancellation userInitiatedCancellation = this.userInitiatedCancellation;
        return iHashCode3 + (userInitiatedCancellation != null ? userInitiatedCancellation.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CanceledStateContext(developerInitiatedCancellation=" + this.developerInitiatedCancellation + ", replacementCancellation=" + this.replacementCancellation + ", systemInitiatedCancellation=" + this.systemInitiatedCancellation + ", userInitiatedCancellation=" + this.userInitiatedCancellation + ")";
    }
}
