package org.bidon.sdk.auction.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lorg/bidon/sdk/auction/models/TokenInfo;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "token", "", "tokenStartTs", "", "tokenFinishTs", "status", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTokenStartTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTokenFinishTs", "getStatus", "component1", "component2", "component3", "component4", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lorg/bidon/sdk/auction/models/TokenInfo;", "equals", "", "other", "", "hashCode", "", "toString", "Status", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TokenInfo implements Serializable {

    @JsonName(key = "status")
    @NotNull
    private final String status;

    @JsonName(key = "token")
    @Nullable
    private final String token;

    @JsonName(key = "token_finish_ts")
    @Nullable
    private final Long tokenFinishTs;

    @JsonName(key = "token_start_ts")
    @Nullable
    private final Long tokenStartTs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/auction/models/TokenInfo$Status;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$bidon_productionRelease", "()Ljava/lang/String;", "SUCCESS", "TIMEOUT_REACHED", "NO_TOKEN", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @NotNull
        private final String code;
        public static final Status SUCCESS = new Status("SUCCESS", 0, "SUCCESS");
        public static final Status TIMEOUT_REACHED = new Status("TIMEOUT_REACHED", 1, "TIMEOUT_REACHED");
        public static final Status NO_TOKEN = new Status("NO_TOKEN", 2, "NO_TOKEN");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, TIMEOUT_REACHED, NO_TOKEN};
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = a.a(statusArr$values);
        }

        private Status(String str, int i10, String str2) {
            this.code = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getCode$bidon_productionRelease, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    public TokenInfo(@Nullable String str, @Nullable Long l10, @Nullable Long l11, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.token = str;
        this.tokenStartTs = l10;
        this.tokenFinishTs = l11;
        this.status = status;
    }

    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, Long l10, Long l11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenInfo.token;
        }
        if ((i10 & 2) != 0) {
            l10 = tokenInfo.tokenStartTs;
        }
        if ((i10 & 4) != 0) {
            l11 = tokenInfo.tokenFinishTs;
        }
        if ((i10 & 8) != 0) {
            str2 = tokenInfo.status;
        }
        return tokenInfo.copy(str, l10, l11, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTokenStartTs() {
        return this.tokenStartTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTokenFinishTs() {
        return this.tokenFinishTs;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final TokenInfo copy(@Nullable String token, @Nullable Long tokenStartTs, @Nullable Long tokenFinishTs, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new TokenInfo(token, tokenStartTs, tokenFinishTs, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return Intrinsics.areEqual(this.token, tokenInfo.token) && Intrinsics.areEqual(this.tokenStartTs, tokenInfo.tokenStartTs) && Intrinsics.areEqual(this.tokenFinishTs, tokenInfo.tokenFinishTs) && Intrinsics.areEqual(this.status, tokenInfo.status);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Long getTokenFinishTs() {
        return this.tokenFinishTs;
    }

    @Nullable
    public final Long getTokenStartTs() {
        return this.tokenStartTs;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.tokenStartTs;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.tokenFinishTs;
        return ((iHashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenInfo(token=" + this.token + ", tokenStartTs=" + this.tokenStartTs + ", tokenFinishTs=" + this.tokenFinishTs + ", status=" + this.status + ")";
    }
}
