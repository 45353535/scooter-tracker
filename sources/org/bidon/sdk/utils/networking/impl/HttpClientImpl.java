package org.bidon.sdk.utils.networking.impl;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.networking.HttpClient;
import org.bidon.sdk.utils.networking.encoders.RequestDataDecoder;
import org.bidon.sdk.utils.networking.encoders.RequestDataEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0097@¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/HttpClientImpl;", "Lorg/bidon/sdk/utils/networking/HttpClient;", "headers", "", "", "", "encoders", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataEncoder;", "decoders", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataDecoder;", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "enqueue", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "method", "Lorg/bidon/sdk/utils/networking/Method;", "url", "body", "", "enqueue-BWLJW6A", "(Lorg/bidon/sdk/utils/networking/Method;Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpClientImpl implements HttpClient {

    @NotNull
    private final List<RequestDataDecoder> decoders;

    @NotNull
    private final List<RequestDataEncoder> encoders;

    @NotNull
    private final Map<String, List<String>> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpClientImpl(@NotNull Map<String, ? extends List<String>> headers, @NotNull List<? extends RequestDataEncoder> encoders, @NotNull List<? extends RequestDataDecoder> decoders) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(encoders, "encoders");
        Intrinsics.checkNotNullParameter(decoders, "decoders");
        this.headers = headers;
        this.encoders = encoders;
        this.decoders = decoders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.bidon.sdk.utils.networking.HttpClient
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: enqueue-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8679enqueueBWLJW6A(@org.jetbrains.annotations.NotNull org.bidon.sdk.utils.networking.Method r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable byte[] r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.impl.HttpClientImpl.mo8679enqueueBWLJW6A(org.bidon.sdk.utils.networking.Method, java.lang.String, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
