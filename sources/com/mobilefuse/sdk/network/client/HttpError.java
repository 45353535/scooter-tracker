package com.mobilefuse.sdk.network.client;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.exception.BaseError;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/exception/BaseError;", "()V", "ConnectionError", "UnknownError", "Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "Lcom/mobilefuse/sdk/network/client/HttpError$UnknownError;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public abstract class HttpError implements BaseError {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "statusCode", "", PglCryptUtils.KEY_MESSAGE, "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final /* data */ class ConnectionError extends HttpError {

        @Nullable
        private final String message;
        private final int statusCode;

        public /* synthetic */ ConnectionError(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ ConnectionError copy$default(ConnectionError connectionError, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = connectionError.statusCode;
            }
            if ((i11 & 2) != 0) {
                str = connectionError.getMessage();
            }
            return connectionError.copy(i10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final ConnectionError copy(int statusCode, @Nullable String message) {
            return new ConnectionError(statusCode, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectionError)) {
                return false;
            }
            ConnectionError connectionError = (ConnectionError) other;
            return this.statusCode == connectionError.statusCode && Intrinsics.areEqual(getMessage(), connectionError.getMessage());
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int i10 = this.statusCode * 31;
            String message = getMessage();
            return i10 + (message != null ? message.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConnectionError(statusCode=" + this.statusCode + ", message=" + getMessage() + ")";
        }

        public ConnectionError(int i10, @Nullable String str) {
            super(null);
            this.statusCode = i10;
            this.message = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError$UnknownError;", "Lcom/mobilefuse/sdk/network/client/HttpError;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final /* data */ class UnknownError extends HttpError {

        @Nullable
        private final String message;

        public UnknownError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = unknownError.getMessage();
            }
            return unknownError.copy(str);
        }

        @Nullable
        public final String component1() {
            return getMessage();
        }

        @NotNull
        public final UnknownError copy(@Nullable String message) {
            return new UnknownError(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof UnknownError) && Intrinsics.areEqual(getMessage(), ((UnknownError) other).getMessage());
            }
            return true;
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "UnknownError(message=" + getMessage() + ")";
        }

        public UnknownError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ UnknownError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    private HttpError() {
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
