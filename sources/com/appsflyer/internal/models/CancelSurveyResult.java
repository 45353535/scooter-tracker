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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/appsflyer/internal/models/CancelSurveyResult;", "", "reason", "", "reasonUserInput", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getReasonUserInput", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CancelSurveyResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String reason;

    @NotNull
    private final String reasonUserInput;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/CancelSurveyResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<CancelSurveyResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public CancelSurveyResult fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("reason");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"reason\")");
            String strOptString2 = json.optString("reasonUserInput");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(\"reasonUserInput\")");
            return new CancelSurveyResult(strOptString, strOptString2);
        }
    }

    public CancelSurveyResult(@NotNull String reason, @NotNull String reasonUserInput) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(reasonUserInput, "reasonUserInput");
        this.reason = reason;
        this.reasonUserInput = reasonUserInput;
    }

    public static /* synthetic */ CancelSurveyResult copy$default(CancelSurveyResult cancelSurveyResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cancelSurveyResult.reason;
        }
        if ((i10 & 2) != 0) {
            str2 = cancelSurveyResult.reasonUserInput;
        }
        return cancelSurveyResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    @NotNull
    public final CancelSurveyResult copy(@NotNull String reason, @NotNull String reasonUserInput) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(reasonUserInput, "reasonUserInput");
        return new CancelSurveyResult(reason, reasonUserInput);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelSurveyResult)) {
            return false;
        }
        CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) other;
        return Intrinsics.areEqual(this.reason, cancelSurveyResult.reason) && Intrinsics.areEqual(this.reasonUserInput, cancelSurveyResult.reasonUserInput);
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    public int hashCode() {
        return (this.reason.hashCode() * 31) + this.reasonUserInput.hashCode();
    }

    @NotNull
    public String toString() {
        return "CancelSurveyResult(reason=" + this.reason + ", reasonUserInput=" + this.reasonUserInput + ")";
    }
}
