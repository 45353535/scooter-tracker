package org.bidon.sdk.auction.usecases.impl;

import com.ironsource.N6;
import eg.g;
import eg.i;
import eg.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.adapter.ext.AdapterExtKt;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.auction.usecases.GetTokensUseCase;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/auction/usecases/impl/GetTokensUseCaseImpl;", "Lorg/bidon/sdk/auction/usecases/GetTokensUseCase;", "<init>", "()V", "invoke", "", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "adaptersSource", "Lorg/bidon/sdk/adapter/AdaptersSource;", "tokenTimeout", "", "(Lorg/bidon/sdk/auction/AdTypeParam;Lorg/bidon/sdk/adapter/AdaptersSource;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenInfo", N6.G1, "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "(Lorg/bidon/sdk/adapter/Adapter$Bidding;Lorg/bidon/sdk/auction/AdTypeParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logTokens", "", "tokens", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetTokensUseCaseImpl implements GetTokensUseCase {

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl", f = "GetTokensUseCaseImpl.kt", l = {47}, m = "getTokenInfo")
    static final class AnonymousClass1 extends d {
        long J$0;
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
            return GetTokensUseCaseImpl.this.getTokenInfo(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lorg/bidon/sdk/auction/models/TokenInfo$Status;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$2", f = "GetTokensUseCaseImpl.kt", l = {48}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AdTypeParam $adTypeParam;
        final /* synthetic */ Adapter.Bidding $adapter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Adapter.Bidding bidding, AdTypeParam adTypeParam, Continuation continuation) {
            super(2, continuation);
            this.$adapter = bidding;
            this.$adTypeParam = adTypeParam;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$adapter, this.$adTypeParam, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Adapter.Bidding bidding = this.$adapter;
                AdTypeParam adTypeParam = this.$adTypeParam;
                this.label = 1;
                obj = bidding.getToken(adTypeParam, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            String str = (String) obj;
            return (str == null || (pair = TuplesKt.to(str, TokenInfo.Status.SUCCESS)) == null) ? TuplesKt.to(null, TokenInfo.Status.NO_TOKEN) : pair;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$invoke$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$invoke$2", f = "GetTokensUseCaseImpl.kt", l = {32}, m = "invokeSuspend")
    static final class C58172 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AdTypeParam $adTypeParam;
        final /* synthetic */ AdaptersSource $adaptersSource;
        final /* synthetic */ long $tokenTimeout;
        int label;
        final /* synthetic */ GetTokensUseCaseImpl this$0;

        /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$invoke$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @e(c = "org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$invoke$2$1", f = "GetTokensUseCaseImpl.kt", l = {35}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ AdTypeParam $adTypeParam;
            final /* synthetic */ List<Adapter.Bidding> $biddingAdapters;
            final /* synthetic */ long $tokenTimeout;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GetTokensUseCaseImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<? extends Adapter.Bidding> list, GetTokensUseCaseImpl getTokensUseCaseImpl, AdTypeParam adTypeParam, long j10, Continuation continuation) {
                super(2, continuation);
                this.$biddingAdapters = list;
                this.this$0 = getTokensUseCaseImpl;
                this.$adTypeParam = adTypeParam;
                this.$tokenTimeout = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$biddingAdapters, this.this$0, this.$adTypeParam, this.$tokenTimeout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    List<Adapter.Bidding> list = this.$biddingAdapters;
                    GetTokensUseCaseImpl getTokensUseCaseImpl = this.this$0;
                    AdTypeParam adTypeParam = this.$adTypeParam;
                    long j10 = this.$tokenTimeout;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(i.b(coroutineScope, null, null, new GetTokensUseCaseImpl$invoke$2$1$1$1((Adapter.Bidding) it.next(), getTokensUseCaseImpl, adTypeParam, j10, null), 3, null));
                        getTokensUseCaseImpl = getTokensUseCaseImpl;
                        adTypeParam = adTypeParam;
                        j10 = j10;
                    }
                    this.label = 1;
                    obj = eg.d.a(arrayList, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return MapsKt.toMap((Iterable) obj);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58172(AdaptersSource adaptersSource, GetTokensUseCaseImpl getTokensUseCaseImpl, AdTypeParam adTypeParam, long j10, Continuation continuation) {
            super(2, continuation);
            this.$adaptersSource = adaptersSource;
            this.this$0 = getTokensUseCaseImpl;
            this.$adTypeParam = adTypeParam;
            this.$tokenTimeout = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C58172(this.$adaptersSource, this.this$0, this.$adTypeParam, this.$tokenTimeout, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Set<Adapter> adapters = this.$adaptersSource.getAdapters();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : adapters) {
                    if (obj2 instanceof Adapter.Bidding) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AdapterExtKt.applyRegulation((Adapter) it.next());
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList, this.this$0, this.$adTypeParam, this.$tokenTimeout, null);
                this.label = 1;
                obj = m1.c(anonymousClass1, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.this$0.logTokens((Map) obj);
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58172) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getTokenInfo(org.bidon.sdk.adapter.Adapter.Bidding r8, org.bidon.sdk.auction.AdTypeParam r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$1 r0 = (org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$1 r0 = new org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            long r8 = r0.J$0
            kotlin.d.b(r12)
            goto L4c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.d.b(r12)
            long r5 = org.bidon.sdk.utils.ext.LocalDateTimeExtKt.getSystemTimeNow()
            org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$2 r12 = new org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$getTokenInfo$2
            r12.<init>(r8, r9, r3)
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r12 = eg.x1.e(r10, r12, r0)
            if (r12 != r1) goto L4b
            return r1
        L4b:
            r8 = r5
        L4c:
            kotlin.Pair r12 = (kotlin.Pair) r12
            if (r12 != 0) goto L56
            org.bidon.sdk.auction.models.TokenInfo$Status r10 = org.bidon.sdk.auction.models.TokenInfo.Status.TIMEOUT_REACHED
            kotlin.Pair r12 = kotlin.TuplesKt.to(r3, r10)
        L56:
            java.lang.Object r10 = r12.component1()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r12.component2()
            org.bidon.sdk.auction.models.TokenInfo$Status r11 = (org.bidon.sdk.auction.models.TokenInfo.Status) r11
            long r0 = org.bidon.sdk.utils.ext.LocalDateTimeExtKt.getSystemTimeNow()
            org.bidon.sdk.auction.models.TokenInfo r12 = new org.bidon.sdk.auction.models.TokenInfo
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.e(r8)
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.e(r0)
            java.lang.String r11 = r11.getCode()
            r12.<init>(r10, r8, r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl.getTokenInfo(org.bidon.sdk.adapter.Adapter$Bidding, org.bidon.sdk.auction.AdTypeParam, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTokens(Map<String, TokenInfo> tokens) {
        for (Map.Entry<String, TokenInfo> entry : tokens.entrySet()) {
            String key = entry.getKey();
            TokenInfo value = entry.getValue();
            LogExtKt.logInfo(TagKt.getTAG(this), "#" + key + ": status: " + value.getStatus() + ", token: " + value.getToken());
        }
    }

    @Override // org.bidon.sdk.auction.usecases.GetTokensUseCase
    @Nullable
    public Object invoke(@NotNull AdTypeParam adTypeParam, @NotNull AdaptersSource adaptersSource, long j10, @NotNull Continuation continuation) {
        return g.g(SdkDispatchers.INSTANCE.getDefault(), new C58172(adaptersSource, this, adTypeParam, j10, null), continuation);
    }
}
