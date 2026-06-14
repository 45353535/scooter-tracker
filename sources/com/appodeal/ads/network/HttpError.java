package com.appodeal.ads.network;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/appodeal/ads/network/HttpError;", "", "", "getDescription", "()Ljava/lang/String;", "description", "", "getCode", "()I", "code", "NoFill", "InternalError", "TimeoutError", "ConnectionError", "RequestError", "ServerError", "RequestVerificationFailed", "SdkVersionNotSupported", "InvalidAssets", "AdapterNotFound", "AdTypeNotSupportedInAdapter", "Canceled", "IncorrectAdUnit", "IncorrectCreative", "ShowFailed", "UncaughtException", "Lcom/appodeal/ads/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/network/HttpError$Canceled;", "Lcom/appodeal/ads/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/network/HttpError$InternalError;", "Lcom/appodeal/ads/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/network/HttpError$NoFill;", "Lcom/appodeal/ads/network/HttpError$RequestError;", "Lcom/appodeal/ads/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/network/HttpError$ServerError;", "Lcom/appodeal/ads/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/network/HttpError$UncaughtException;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HttpError extends Throwable {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdTypeNotSupportedInAdapter extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public AdTypeNotSupportedInAdapter() {
            super(null);
            this.description = "ad type not supported in adapter";
            this.code = 9;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdapterNotFound extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public AdapterNotFound() {
            super(null);
            this.description = "adapter not found";
            this.code = 8;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$Canceled;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Canceled extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public Canceled() {
            super(null);
            this.description = "ad request canceled";
            this.code = 2;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnectionError extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public ConnectionError() {
            super(null);
            this.description = "connection error";
            this.code = 4;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IncorrectAdUnit extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public IncorrectAdUnit() {
            super(null);
            this.description = "incorrect adunit";
            this.code = 2;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IncorrectCreative extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public IncorrectCreative() {
            super(null);
            this.description = "incorrect creative";
            this.code = 4;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/HttpError$InternalError;", "Lcom/appodeal/ads/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalError extends HttpError {
        public static final InternalError INSTANCE = new InternalError();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final String description = "internal error";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int code = 4;

        public InternalError() {
            super(null);
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidAssets extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public InvalidAssets() {
            super(null);
            this.description = "invalid assets";
            this.code = 7;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/HttpError$NoFill;", "Lcom/appodeal/ads/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoFill extends HttpError {
        public static final NoFill INSTANCE = new NoFill();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final String description = "no fill";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int code = 2;

        public NoFill() {
            super(null);
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return description;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/HttpError$RequestError;", "Lcom/appodeal/ads/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestError extends HttpError {
        public static final RequestError INSTANCE = new RequestError();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final String description = "request error";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int code = 4;

        public RequestError() {
            super(null);
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestVerificationFailed extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public RequestVerificationFailed() {
            super(null);
            this.description = "request verification failed";
            this.code = 4;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkVersionNotSupported extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public SdkVersionNotSupported() {
            super(null);
            this.description = "sdk version not supported";
            this.code = 4;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/HttpError$ServerError;", "Lcom/appodeal/ads/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends HttpError {
        public static final ServerError INSTANCE = new ServerError();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final String description = "server error";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int code = 4;

        public ServerError() {
            super(null);
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/network/HttpError;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowFailed extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        public ShowFailed() {
            super(null);
            this.description = "show failed";
            this.code = 4;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/network/HttpError;", "", PglCryptUtils.KEY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TimeoutError extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutError(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.description = message;
            this.code = 3;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/network/HttpError$UncaughtException;", "Lcom/appodeal/ads/network/HttpError;", "", PglCryptUtils.KEY_MESSAGE, "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getDescription", "description", "", "d", "I", "getCode", "()I", "code", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UncaughtException extends HttpError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Throwable cause;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UncaughtException(String message, Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.message = message;
            this.cause = cause;
            String message2 = getCause().getMessage();
            this.description = message2 == null ? "uncaught exception" : message2;
            this.code = -1;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.appodeal.ads.network.HttpError
        public int getCode() {
            return this.code;
        }

        @Override // com.appodeal.ads.network.HttpError
        public String getDescription() {
            return this.description;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public HttpError(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract int getCode();

    public abstract String getDescription();
}
