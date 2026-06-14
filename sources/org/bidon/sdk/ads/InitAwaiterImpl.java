package org.bidon.sdk.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.bidon.sdk.config.SdkState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/ads/InitAwaiterImpl;", "Lorg/bidon/sdk/ads/InitAwaiter;", "<init>", "()V", "isWaitingForInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initWaitAndContinueIfRequired", "", "onSuccess", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitAwaiterImpl implements InitAwaiter {

    @NotNull
    private AtomicBoolean isWaitingForInit = new AtomicBoolean(true);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkState.values().length];
            try {
                iArr[SdkState.Initialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkState.InitializationFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.InitAwaiterImpl$initWaitAndContinueIfRequired$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.ads.InitAwaiterImpl", f = "InitAwaiter.kt", l = {27, 30, 39, 42, 43}, m = "initWaitAndContinueIfRequired")
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
            return InitAwaiterImpl.this.initWaitAndContinueIfRequired(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r11.invoke(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r10.invoke(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r11.invoke(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r10.invoke(r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.ads.InitAwaiter
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object initWaitAndContinueIfRequired(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.ads.InitAwaiterImpl.initWaitAndContinueIfRequired(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
