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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData;", "", "status", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ValidationFailureData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;
    private final int status;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ValidationFailureData;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<ValidationFailureData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public ValidationFailureData fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            int iOptInt = json.optInt("status", -1);
            String description = json.optString("description");
            Intrinsics.checkNotNullExpressionValue(description, "description");
            return new ValidationFailureData(iOptInt, description);
        }
    }

    public ValidationFailureData(int i10, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.status = i10;
        this.description = description;
    }

    public static /* synthetic */ ValidationFailureData copy$default(ValidationFailureData validationFailureData, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = validationFailureData.status;
        }
        if ((i11 & 2) != 0) {
            str = validationFailureData.description;
        }
        return validationFailureData.copy(i10, str);
    }

    @NotNull
    public static ValidationFailureData fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ValidationFailureData copy(int status, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new ValidationFailureData(status, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationFailureData)) {
            return false;
        }
        ValidationFailureData validationFailureData = (ValidationFailureData) other;
        return this.status == validationFailureData.status && Intrinsics.areEqual(this.description, validationFailureData.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "ValidationFailureData(status=" + this.status + ", description=" + this.description + ")";
    }
}
