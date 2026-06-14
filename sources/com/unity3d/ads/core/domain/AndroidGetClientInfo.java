package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;)V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetClientInfo implements GetClientInfo {

    @NotNull
    private final FIdExistenceDataSource fIdExistenceDataSource;

    @NotNull
    private final MediationRepository mediationRepository;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OmidManager omidManager;

    @NotNull
    private final ScarManager scarManager;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", f = "AndroidGetClientInfo.kt", l = {42, 45}, m = "invoke")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return AndroidGetClientInfo.this.invoke(this);
        }
    }

    public AndroidGetClientInfo(@NotNull SessionRepository sessionRepository, @NotNull MediationRepository mediationRepository, @NotNull OmidManager omidManager, @NotNull ScarManager scarManager, @NotNull OfferwallManager offerwallManager, @NotNull FIdExistenceDataSource fIdExistenceDataSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(fIdExistenceDataSource, "fIdExistenceDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
