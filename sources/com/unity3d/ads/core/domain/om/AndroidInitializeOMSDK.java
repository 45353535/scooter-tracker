package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "omRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidInitializeOMSDK implements InitializeOMSDK {

    @NotNull
    private final Context context;

    @NotNull
    private final OpenMeasurementRepository omRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", l = {27}, m = "invoke")
    static final class AnonymousClass1 extends d {
        long J$0;
        Object L$0;
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
            return AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository omRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
