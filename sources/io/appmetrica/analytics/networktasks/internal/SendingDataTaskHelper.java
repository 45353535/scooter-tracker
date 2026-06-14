package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f78891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f78892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f78893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f78894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f78895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f78896f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f78896f.handle(this.f78895e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f78894d.applySendTime(this.f78893c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f78892b.compress(bArr);
            if (bArrCompress != null && (bArrEncrypt = this.f78891a.encrypt(bArrCompress)) != null) {
                this.f78894d.setPostData(bArrEncrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f78891a = requestBodyEncrypter;
        this.f78892b = compressor;
        this.f78893c = timeProvider;
        this.f78894d = requestDataHolder;
        this.f78895e = responseDataHolder;
        this.f78896f = networkResponseHandler;
    }
}
