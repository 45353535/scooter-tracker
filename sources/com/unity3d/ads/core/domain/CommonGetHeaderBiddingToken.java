package com.unity3d.ads.core.domain;

import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "fetchSignalsAndSendUseCase", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {

    @NotNull
    public static final String HB_TOKEN_VERSION = "2";

    @NotNull
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;

    @NotNull
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {14, 17}, m = "invoke")
    static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(@NotNull BuildHeaderBiddingToken buildHeaderBiddingToken, @NotNull FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r9, @org.jetbrains.annotations.Nullable com.unity3d.ads.TokenConfiguration r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r9 = r0.L$0
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r9 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r9
            kotlin.d.b(r11)
            goto L92
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.TokenConfiguration r10 = (com.unity3d.ads.TokenConfiguration) r10
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken r2 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken) r2
            kotlin.d.b(r11)
            goto L69
        L47:
            kotlin.d.b(r11)
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken r11 = r8.buildHeaderBiddingToken
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r8.sessionRepository
            java.util.List r2 = r2.getScarEligibleFormats()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r5
            java.lang.Object r11 = r11.invoke(r9, r10, r2, r0)
            if (r11 != r1) goto L68
            goto L90
        L68:
            r2 = r8
        L69:
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r11 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r11
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r2.sessionRepository
            java.util.List r6 = r6.getScarEligibleFormats()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L93
            com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase r2 = r2.fetchSignalsAndSendUseCase
            com.google.protobuf.ByteString r6 = r11.getTokenId()
            java.lang.String r7 = "rawToken.tokenId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.L$0 = r11
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r6, r10, r0)
            if (r9 != r1) goto L91
        L90:
            return r1
        L91:
            r9 = r11
        L92:
            r11 = r9
        L93:
            com.google.protobuf.ByteString r9 = r11.toByteString()
            java.lang.String r10 = "rawToken.toByteString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r10 = 0
            java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r10, r5, r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "2:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
