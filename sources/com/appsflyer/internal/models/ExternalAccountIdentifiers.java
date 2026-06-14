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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "", "externalAccountId", "", "obfuscatedExternalAccountId", "obfuscatedExternalProfileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExternalAccountId", "()Ljava/lang/String;", "getObfuscatedExternalAccountId", "getObfuscatedExternalProfileId", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExternalAccountIdentifiers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String externalAccountId;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<ExternalAccountIdentifiers> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public ExternalAccountIdentifiers fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("externalAccountId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"externalAccountId\")");
            String strOptString2 = json.optString("obfuscatedExternalAccountId");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(\"obfuscatedExternalAccountId\")");
            String strOptString3 = json.optString("obfuscatedExternalProfileId");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(\"obfuscatedExternalProfileId\")");
            return new ExternalAccountIdentifiers(strOptString, strOptString2, strOptString3);
        }
    }

    public ExternalAccountIdentifiers(@NotNull String externalAccountId, @NotNull String obfuscatedExternalAccountId, @NotNull String obfuscatedExternalProfileId) {
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        this.externalAccountId = externalAccountId;
        this.obfuscatedExternalAccountId = obfuscatedExternalAccountId;
        this.obfuscatedExternalProfileId = obfuscatedExternalProfileId;
    }

    public static /* synthetic */ ExternalAccountIdentifiers copy$default(ExternalAccountIdentifiers externalAccountIdentifiers, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = externalAccountIdentifiers.externalAccountId;
        }
        if ((i10 & 2) != 0) {
            str2 = externalAccountIdentifiers.obfuscatedExternalAccountId;
        }
        if ((i10 & 4) != 0) {
            str3 = externalAccountIdentifiers.obfuscatedExternalProfileId;
        }
        return externalAccountIdentifiers.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    public final ExternalAccountIdentifiers copy(@NotNull String externalAccountId, @NotNull String obfuscatedExternalAccountId, @NotNull String obfuscatedExternalProfileId) {
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        return new ExternalAccountIdentifiers(externalAccountId, obfuscatedExternalAccountId, obfuscatedExternalProfileId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalAccountIdentifiers)) {
            return false;
        }
        ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) other;
        return Intrinsics.areEqual(this.externalAccountId, externalAccountIdentifiers.externalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalAccountId, externalAccountIdentifiers.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, externalAccountIdentifiers.obfuscatedExternalProfileId);
    }

    @NotNull
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @NotNull
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public int hashCode() {
        return (((this.externalAccountId.hashCode() * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExternalAccountIdentifiers(externalAccountId=" + this.externalAccountId + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ")";
    }
}
