package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import lf.m;
import org.bidon.sdk.databinders.token.TokenDataSource;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.networking.impl.HttpClientImplKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087B¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/utils/networking/JsonHttpRequest;", "", "tokenDataSource", "Lorg/bidon/sdk/databinders/token/TokenDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/token/TokenDataSource;)V", "invoke", "Lkotlin/Result;", "", "path", "body", "Lorg/json/JSONObject;", "httpClient", "Lorg/bidon/sdk/utils/networking/HttpClient;", "bidOnEndpoints", "Lorg/bidon/sdk/utils/networking/BidonEndpoints;", "invoke-yxL6bBk", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/bidon/sdk/utils/networking/HttpClient;Lorg/bidon/sdk/utils/networking/BidonEndpoints;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonHttpRequest {

    @NotNull
    private final TokenDataSource tokenDataSource;

    public JsonHttpRequest(@NotNull TokenDataSource tokenDataSource) {
        Intrinsics.checkNotNullParameter(tokenDataSource, "tokenDataSource");
        this.tokenDataSource = tokenDataSource;
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m8680invokeyxL6bBk$default(JsonHttpRequest jsonHttpRequest, String str, JSONObject jSONObject, HttpClient httpClient, BidonEndpoints bidonEndpoints, Continuation continuation, int i10, Object obj) {
        BidonEndpoints bidonEndpoints2;
        if ((i10 & 4) != 0) {
            httpClient = HttpClientImplKt.getJsonZipHttpClient();
        }
        HttpClient httpClient2 = httpClient;
        if ((i10 & 8) != 0) {
            InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(BidonEndpoints.class));
            if (instanceType instanceof InstanceType.Singleton) {
                Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
                if (singleton == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.BidonEndpoints");
                }
                bidonEndpoints2 = (BidonEndpoints) singleton;
            } else {
                if (!(instanceType instanceof InstanceType.Factory)) {
                    if (instanceType instanceof InstanceType.ParamFactory) {
                        new InstanceType.ParamFactory.Params();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (instanceType != null) {
                        throw new m();
                    }
                    throw new IllegalStateException(("No factory provided for class: " + BidonEndpoints.class).toString());
                }
                Object objBuild = ((InstanceType.Factory) instanceType).build();
                if (objBuild == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.BidonEndpoints");
                }
                bidonEndpoints2 = (BidonEndpoints) objBuild;
            }
            bidonEndpoints = bidonEndpoints2;
        }
        return jsonHttpRequest.m8681invokeyxL6bBk(str, jSONObject, httpClient2, bidonEndpoints, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8681invokeyxL6bBk(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull org.json.JSONObject r15, @org.jetbrains.annotations.NotNull org.bidon.sdk.utils.networking.HttpClient r16, @org.jetbrains.annotations.NotNull org.bidon.sdk.utils.networking.BidonEndpoints r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.JsonHttpRequest.m8681invokeyxL6bBk(java.lang.String, org.json.JSONObject, org.bidon.sdk.utils.networking.HttpClient, org.bidon.sdk.utils.networking.BidonEndpoints, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
