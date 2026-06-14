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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "", "cancelSurveyResult", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "cancelTime", "", "(Lcom/appsflyer/internal/models/CancelSurveyResult;Ljava/lang/String;)V", "getCancelSurveyResult", "()Lcom/appsflyer/internal/models/CancelSurveyResult;", "getCancelTime", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserInitiatedCancellation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final CancelSurveyResult cancelSurveyResult;

    @NotNull
    private final String cancelTime;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/UserInitiatedCancellation$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<UserInitiatedCancellation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public UserInitiatedCancellation fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) SubscriptionPurchaseKt.toObject(json, "cancelSurveyResult", CancelSurveyResult.INSTANCE);
            String strOptString = json.optString("cancelTime");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"cancelTime\")");
            return new UserInitiatedCancellation(cancelSurveyResult, strOptString);
        }
    }

    public UserInitiatedCancellation(@Nullable CancelSurveyResult cancelSurveyResult, @NotNull String cancelTime) {
        Intrinsics.checkNotNullParameter(cancelTime, "cancelTime");
        this.cancelSurveyResult = cancelSurveyResult;
        this.cancelTime = cancelTime;
    }

    public static /* synthetic */ UserInitiatedCancellation copy$default(UserInitiatedCancellation userInitiatedCancellation, CancelSurveyResult cancelSurveyResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancelSurveyResult = userInitiatedCancellation.cancelSurveyResult;
        }
        if ((i10 & 2) != 0) {
            str = userInitiatedCancellation.cancelTime;
        }
        return userInitiatedCancellation.copy(cancelSurveyResult, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCancelTime() {
        return this.cancelTime;
    }

    @NotNull
    public final UserInitiatedCancellation copy(@Nullable CancelSurveyResult cancelSurveyResult, @NotNull String cancelTime) {
        Intrinsics.checkNotNullParameter(cancelTime, "cancelTime");
        return new UserInitiatedCancellation(cancelSurveyResult, cancelTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInitiatedCancellation)) {
            return false;
        }
        UserInitiatedCancellation userInitiatedCancellation = (UserInitiatedCancellation) other;
        return Intrinsics.areEqual(this.cancelSurveyResult, userInitiatedCancellation.cancelSurveyResult) && Intrinsics.areEqual(this.cancelTime, userInitiatedCancellation.cancelTime);
    }

    @Nullable
    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    @NotNull
    public final String getCancelTime() {
        return this.cancelTime;
    }

    public int hashCode() {
        CancelSurveyResult cancelSurveyResult = this.cancelSurveyResult;
        return ((cancelSurveyResult == null ? 0 : cancelSurveyResult.hashCode()) * 31) + this.cancelTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserInitiatedCancellation(cancelSurveyResult=" + this.cancelSurveyResult + ", cancelTime=" + this.cancelTime + ")";
    }
}
