package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import b.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0083@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "Lb/d;", "mTopicsManager", "<init>", "(Lb/d;)V", "Lb/a;", "getTopicsRequest", "Lb/b;", "getTopicsAsyncInternal", "(Lb/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "getTopics", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertRequest$ads_adservices_release", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Lb/a;", "convertRequest", "response", "convertResponse$ads_adservices_release", "(Lb/b;)Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "convertResponse", "Lb/d;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TopicsManagerImplCommon extends TopicsManager {

    @NotNull
    private final d mTopicsManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
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
            return TopicsManagerImplCommon.getTopics$suspendImpl(TopicsManagerImplCommon.this, null, this);
        }
    }

    public TopicsManagerImplCommon(@NotNull d mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
    }

    public static final /* synthetic */ d access$getMTopicsManager$p(TopicsManagerImplCommon topicsManagerImplCommon) {
        topicsManagerImplCommon.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r5, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r5 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r5
            kotlin.d.b(r7)
            goto L47
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.d.b(r7)
            r5.convertRequest$ads_adservices_release(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r5.getTopicsAsyncInternal(r3, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            androidx.privacysandbox.ads.adservices.topics.a.a(r7)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r5 = r5.convertResponse$ads_adservices_release(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(b.a aVar, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(b.d(continuation), 1);
        eVar.I();
        access$getMTopicsManager$p(this);
        new androidx.media3.exoplayer.hls.offline.a();
        OutcomeReceiverKt.asOutcomeReceiver(eVar);
        throw null;
    }

    @NotNull
    public b.a convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequestHelper.INSTANCE.convertRequestWithoutRecordObservation$ads_adservices_release(request);
        return null;
    }

    @NotNull
    public GetTopicsResponse convertResponse$ads_adservices_release(@NotNull b.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return GetTopicsResponseHelper.INSTANCE.convertResponse$ads_adservices_release(response);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    @Nullable
    public Object getTopics(@NotNull GetTopicsRequest getTopicsRequest, @NotNull Continuation continuation) {
        return getTopics$suspendImpl(this, getTopicsRequest, continuation);
    }
}
