package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public class CacheControlHttpsConnectionPerformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f78849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f78850b;

    public interface Client {
        @Nullable
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        Response responseA;
        int code;
        String str2;
        try {
            a aVar = this.f78849a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f78850b;
            aVar.getClass();
            responseA = a.a(oldETag, str, sSLSocketFactory);
            code = responseA.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(responseA.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, responseA.getResponseData());
    }

    CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f78849a = aVar;
        this.f78850b = sSLSocketFactory;
    }
}
