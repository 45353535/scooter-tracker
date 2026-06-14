package com.appodeal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/ShowError;", "", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NetworkShowError", "SdkShowError", "Lcom/appodeal/ads/ShowError$NetworkShowError;", "Lcom/appodeal/ads/ShowError$SdkShowError;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ShowError {

    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/ShowError$NetworkShowError;", "Lcom/appodeal/ads/ShowError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "ErrorDuringShow", "ErrorOnCallback", "Lcom/appodeal/ads/ShowError$NetworkShowError$ErrorDuringShow;", "Lcom/appodeal/ads/ShowError$NetworkShowError$ErrorOnCallback;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NetworkShowError extends ShowError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/ShowError$NetworkShowError$ErrorDuringShow;", "Lcom/appodeal/ads/ShowError$NetworkShowError;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ErrorDuringShow extends NetworkShowError {

            @NotNull
            public static final ErrorDuringShow INSTANCE = new ErrorDuringShow();

            private ErrorDuringShow() {
                super("Error occurred during the AdObject.show() function on the Ad network side.", null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/ShowError$NetworkShowError$ErrorOnCallback;", "Lcom/appodeal/ads/ShowError$NetworkShowError;", PglCryptUtils.KEY_MESSAGE, "", "code", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "()V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ErrorOnCallback extends NetworkShowError {

            @Nullable
            private final Integer code;

            public /* synthetic */ ErrorOnCallback(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : num);
            }

            @Nullable
            public final Integer getCode() {
                return this.code;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorOnCallback(@NotNull String message, @Nullable Integer num) {
                super("(" + num + ") " + message, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.code = num;
            }

            public ErrorOnCallback() {
                this("Ad network not provided any appropriate text or code.", null, 2, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ NetworkShowError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private NetworkShowError(String str) {
            super(str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/ShowError$SdkShowError;", "Lcom/appodeal/ads/ShowError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkShowError extends ShowError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkShowError(@NotNull String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public /* synthetic */ ShowError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    private ShowError(String str) {
        this.message = str;
    }
}
