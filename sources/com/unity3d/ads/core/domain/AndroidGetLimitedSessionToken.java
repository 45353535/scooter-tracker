package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final MediationRepository mediationRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", f = "AndroidGetLimitedSessionToken.kt", l = {19, 20, 21, 22}, m = "invoke")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull MediationRepository mediationRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
