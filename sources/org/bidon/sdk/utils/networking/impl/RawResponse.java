package org.bidon.sdk.utils.networking.impl;

import com.inmobi.unification.sdk.InitializationStatus;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.networking.HttpError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\f\rR$\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "", "headers", "", "", "", "getHeaders", "()Ljava/util/Map;", "code", "", "getCode", "()I", InitializationStatus.SUCCESS, "Failure", "Lorg/bidon/sdk/utils/networking/impl/RawResponse$Failure;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse$Success;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RawResponse {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawResponse$Failure;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "headers", "", "", "", "code", "", "httpError", "Lorg/bidon/sdk/utils/networking/HttpError;", "responseBody", "", "<init>", "(Ljava/util/Map;ILorg/bidon/sdk/utils/networking/HttpError;[B)V", "getHeaders", "()Ljava/util/Map;", "getCode", "()I", "getHttpError", "()Lorg/bidon/sdk/utils/networking/HttpError;", "getResponseBody", "()[B", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure implements RawResponse {
        private final int code;

        @NotNull
        private final Map<String, List<String>> headers;

        @NotNull
        private final HttpError httpError;

        @Nullable
        private final byte[] responseBody;

        /* JADX WARN: Multi-variable type inference failed */
        public Failure(@NotNull Map<String, ? extends List<String>> headers, int i10, @NotNull HttpError httpError, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(httpError, "httpError");
            this.headers = headers;
            this.code = i10;
            this.httpError = httpError;
            this.responseBody = bArr;
        }

        @Override // org.bidon.sdk.utils.networking.impl.RawResponse
        public int getCode() {
            return this.code;
        }

        @Override // org.bidon.sdk.utils.networking.impl.RawResponse
        @NotNull
        public Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        @NotNull
        public final HttpError getHttpError() {
            return this.httpError;
        }

        @Nullable
        public final byte[] getResponseBody() {
            return this.responseBody;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B=\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawResponse$Success;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "headers", "", "", "", "code", "", "contentEncoding", "requestBody", "", "<init>", "(Ljava/util/Map;ILjava/lang/String;[B)V", "getHeaders", "()Ljava/util/Map;", "getCode", "()I", "getContentEncoding", "()Ljava/lang/String;", "getRequestBody", "()[B", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success implements RawResponse {
        private final int code;

        @Nullable
        private final String contentEncoding;

        @NotNull
        private final Map<String, List<String>> headers;

        @Nullable
        private final byte[] requestBody;

        /* JADX WARN: Multi-variable type inference failed */
        public Success(@NotNull Map<String, ? extends List<String>> headers, int i10, @Nullable String str, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
            this.code = i10;
            this.contentEncoding = str;
            this.requestBody = bArr;
        }

        @Override // org.bidon.sdk.utils.networking.impl.RawResponse
        public int getCode() {
            return this.code;
        }

        @Nullable
        public final String getContentEncoding() {
            return this.contentEncoding;
        }

        @Override // org.bidon.sdk.utils.networking.impl.RawResponse
        @NotNull
        public Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        @Nullable
        public final byte[] getRequestBody() {
            return this.requestBody;
        }
    }

    int getCode();

    @NotNull
    Map<String, List<String>> getHeaders();
}
