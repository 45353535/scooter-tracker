package org.bidon.sdk.utils.networking;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/bidon/sdk/utils/networking/BaseResponse;", "", "success", "", "error", "Lorg/bidon/sdk/utils/networking/BaseResponse$Error;", "<init>", "(Ljava/lang/Boolean;Lorg/bidon/sdk/utils/networking/BaseResponse$Error;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lorg/bidon/sdk/utils/networking/BaseResponse$Error;", "component1", "component2", MenuActionType.COPY, "(Ljava/lang/Boolean;Lorg/bidon/sdk/utils/networking/BaseResponse$Error;)Lorg/bidon/sdk/utils/networking/BaseResponse;", "equals", "other", "hashCode", "", "toString", "", "Error", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BaseResponse {

    @Nullable
    private final Error error;

    @Nullable
    private final Boolean success;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/utils/networking/BaseResponse$Error;", "", "code", "", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {
        private final int code;

        @NotNull
        private final String message;

        public Error(int i10, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = error.code;
            }
            if ((i11 & 2) != 0) {
                str = error.message;
            }
            return error.copy(i10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Error copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.areEqual(this.message, error.message);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.code * 31) + this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(code=" + this.code + ", message=" + this.message + ")";
        }
    }

    public BaseResponse(@Nullable Boolean bool, @Nullable Error error) {
        this.success = bool;
        this.error = error;
    }

    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, Boolean bool, Error error, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = baseResponse.success;
        }
        if ((i10 & 2) != 0) {
            error = baseResponse.error;
        }
        return baseResponse.copy(bool, error);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final BaseResponse copy(@Nullable Boolean success, @Nullable Error error) {
        return new BaseResponse(success, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) other;
        return Intrinsics.areEqual(this.success, baseResponse.success) && Intrinsics.areEqual(this.error, baseResponse.error);
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Error error = this.error;
        return iHashCode + (error != null ? error.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseResponse(success=" + this.success + ", error=" + this.error + ")";
    }
}
