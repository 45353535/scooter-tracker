package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpError;", "", "<init>", "()V", "cause", "getCause", "()Ljava/lang/Throwable;", "rawResponse", "", "getRawResponse", "()[B", "code", "", "getCode", "()I", "InternalError", "RequestError", "ServerError", "UncaughtException", "Lorg/bidon/sdk/utils/networking/HttpError$InternalError;", "Lorg/bidon/sdk/utils/networking/HttpError$RequestError;", "Lorg/bidon/sdk/utils/networking/HttpError$ServerError;", "Lorg/bidon/sdk/utils/networking/HttpError$UncaughtException;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HttpError extends Throwable {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpError$InternalError;", "Lorg/bidon/sdk/utils/networking/HttpError;", "<init>", "()V", "cause", "", "getCause", "()Ljava/lang/Throwable;", "code", "", "getCode", "()I", "rawResponse", "", "getRawResponse", "()[B", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalError extends HttpError {

        @NotNull
        public static final InternalError INSTANCE = new InternalError();

        @NotNull
        private static final Throwable cause = new Throwable("internal error");
        private static final int code = 4;

        @Nullable
        private static final byte[] rawResponse = null;

        private InternalError() {
            super(null);
        }

        @Override // org.bidon.sdk.utils.networking.HttpError, java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return cause;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        public int getCode() {
            return code;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        @Nullable
        public byte[] getRawResponse() {
            return rawResponse;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpError$RequestError;", "Lorg/bidon/sdk/utils/networking/HttpError;", "<init>", "()V", "cause", "", "getCause", "()Ljava/lang/Throwable;", "code", "", "getCode", "()I", "rawResponse", "", "getRawResponse", "()[B", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestError extends HttpError {

        @NotNull
        public static final RequestError INSTANCE = new RequestError();

        @NotNull
        private static final Throwable cause = new Throwable("request error");
        private static final int code = 4;

        @Nullable
        private static final byte[] rawResponse = null;

        private RequestError() {
            super(null);
        }

        @Override // org.bidon.sdk.utils.networking.HttpError, java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return cause;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        public int getCode() {
            return code;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        @Nullable
        public byte[] getRawResponse() {
            return rawResponse;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpError$ServerError;", "Lorg/bidon/sdk/utils/networking/HttpError;", "<init>", "()V", "cause", "", "getCause", "()Ljava/lang/Throwable;", "code", "", "getCode", "()I", "rawResponse", "", "getRawResponse", "()[B", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends HttpError {

        @NotNull
        public static final ServerError INSTANCE = new ServerError();

        @NotNull
        private static final Throwable cause = new Throwable("server error");
        private static final int code = 4;

        @Nullable
        private static final byte[] rawResponse = null;

        private ServerError() {
            super(null);
        }

        @Override // org.bidon.sdk.utils.networking.HttpError, java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return cause;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        public int getCode() {
            return code;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        @Nullable
        public byte[] getRawResponse() {
            return rawResponse;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpError$UncaughtException;", "Lorg/bidon/sdk/utils/networking/HttpError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "rawResponse", "", "getRawResponse", "()[B", "code", "", "getCode", "()I", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UncaughtException extends HttpError {

        @NotNull
        private final Throwable cause;
        private final int code;

        @Nullable
        private final byte[] rawResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UncaughtException(@NotNull Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            this.code = -1;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError, java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // org.bidon.sdk.utils.networking.HttpError
        @Nullable
        public byte[] getRawResponse() {
            return this.rawResponse;
        }
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.lang.Throwable
    @NotNull
    public abstract Throwable getCause();

    public abstract int getCode();

    @Nullable
    public abstract byte[] getRawResponse();

    private HttpError() {
    }
}
