package com.appodeal.ads.networking;

import com.appodeal.ads.b3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/appodeal/ads/networking/LoadingError;", "", "", "description", "Lcom/appodeal/ads/b3;", "requestResult", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/appodeal/ads/b3;I)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Lcom/appodeal/ads/b3;", "getRequestResult", "()Lcom/appodeal/ads/b3;", "I", "getCode", "()I", "NoFill", "InternalError", "TimeoutError", "ConnectionError", "RequestError", "ServerError", "RequestVerificationFailed", "SdkVersionNotSupported", "InvalidAssets", "AdapterNotFound", "AdTypeNotSupportedInAdapter", "Canceled", "IncorrectAdunit", "IncorrectCreative", "ShowFailed", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadingError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoadingError[] $VALUES;
    public static final LoadingError AdTypeNotSupportedInAdapter;
    public static final LoadingError AdapterNotFound;
    public static final LoadingError Canceled;
    public static final LoadingError ConnectionError;
    public static final LoadingError IncorrectAdunit;
    public static final LoadingError IncorrectCreative;
    public static final LoadingError InternalError;
    public static final LoadingError InvalidAssets;
    public static final LoadingError NoFill = new LoadingError("NoFill", 0, "no fill", b3.f13110d, 2);
    public static final LoadingError RequestError;
    public static final LoadingError RequestVerificationFailed;
    public static final LoadingError SdkVersionNotSupported;
    public static final LoadingError ServerError;
    public static final LoadingError ShowFailed;
    public static final LoadingError TimeoutError;
    private final int code;

    @NotNull
    private final String description;

    @NotNull
    private final b3 requestResult;

    private static final /* synthetic */ LoadingError[] $values() {
        return new LoadingError[]{NoFill, InternalError, TimeoutError, ConnectionError, RequestError, ServerError, RequestVerificationFailed, SdkVersionNotSupported, InvalidAssets, AdapterNotFound, AdTypeNotSupportedInAdapter, Canceled, IncorrectAdunit, IncorrectCreative, ShowFailed};
    }

    static {
        b3 b3Var = b3.f13112f;
        InternalError = new LoadingError("InternalError", 1, "internal error", b3Var, 4);
        TimeoutError = new LoadingError("TimeoutError", 2, "timeout error", b3.f13111e, 3);
        ConnectionError = new LoadingError("ConnectionError", 3, "connection error", b3Var, 4);
        RequestError = new LoadingError("RequestError", 4, "request error", b3Var, 4);
        ServerError = new LoadingError("ServerError", 5, "server error", b3Var, 4);
        RequestVerificationFailed = new LoadingError("RequestVerificationFailed", 6, "request verification failed", b3Var, 4);
        SdkVersionNotSupported = new LoadingError("SdkVersionNotSupported", 7, "sdk version not supported", b3Var, 4);
        InvalidAssets = new LoadingError("InvalidAssets", 8, "invalid assets", b3.f13115i, 7);
        AdapterNotFound = new LoadingError("AdapterNotFound", 9, "adapter not found", b3.f13113g, 8);
        b3 b3Var2 = b3.f13114h;
        AdTypeNotSupportedInAdapter = new LoadingError("AdTypeNotSupportedInAdapter", 10, "ad type not supported in adapter", b3Var2, 9);
        Canceled = new LoadingError("Canceled", 11, "ad request canceled", b3.f13117k, 2);
        IncorrectAdunit = new LoadingError("IncorrectAdunit", 12, "incorrect adunit", b3Var2, 2);
        IncorrectCreative = new LoadingError("IncorrectCreative", 13, "incorrect creative", b3.f13118l, 4);
        ShowFailed = new LoadingError("ShowFailed", 14, "show failed", b3Var, 4);
        LoadingError[] loadingErrorArr$values = $values();
        $VALUES = loadingErrorArr$values;
        $ENTRIES = qf.a.a(loadingErrorArr$values);
    }

    private LoadingError(String str, int i10, String str2, b3 b3Var, int i11) {
        this.description = str2;
        this.requestResult = b3Var;
        this.code = i11;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LoadingError valueOf(String str) {
        return (LoadingError) Enum.valueOf(LoadingError.class, str);
    }

    public static LoadingError[] values() {
        return (LoadingError[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final b3 getRequestResult() {
        return this.requestResult;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.description;
    }
}
