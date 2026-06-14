package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "response", "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AdIdManagerImplCommon extends AdIdManager {

    @NotNull
    private final android.adservices.adid.AdIdManager mAdIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", l = {40}, m = "getAdId$suspendImpl")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
            return AdIdManagerImplCommon.getAdId$suspendImpl(AdIdManagerImplCommon.this, this);
        }
    }

    public AdIdManagerImplCommon(@NotNull android.adservices.adid.AdIdManager mAdIdManager) {
        Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    private final AdId convertResponse(android.adservices.adid.AdId response) {
        String adId = response.getAdId();
        Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        return new AdId(adId, response.isLimitAdTrackingEnabled());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object getAdId$suspendImpl(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon) r4
            kotlin.d.b(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.d.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.getAdIdAsyncInternal(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            android.adservices.adid.AdId r5 = androidx.privacysandbox.ads.adservices.adid.d.a(r5)
            androidx.privacysandbox.ads.adservices.adid.AdId r4 = r4.convertResponse(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.getAdId$suspendImpl(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public final Object getAdIdAsyncInternal(Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        this.mAdIdManager.getAdId(new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    @DoNotInline
    @Nullable
    public Object getAdId(@NotNull Continuation continuation) {
        return getAdId$suspendImpl(this, continuation);
    }
}
