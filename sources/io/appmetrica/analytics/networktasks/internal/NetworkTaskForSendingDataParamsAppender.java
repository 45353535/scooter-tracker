package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f78880a;

    public NetworkTaskForSendingDataParamsAppender(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this.f78880a = requestBodyEncrypter;
    }

    public void appendEncryptedData(@NonNull Uri.Builder builder) {
        if (this.f78880a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
