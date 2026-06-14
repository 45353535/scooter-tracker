package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "", "sdkConfig", "isInit"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends k implements Function3<NativeConfigurationOuterClass.NativeConfiguration, Boolean, Continuation, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    AndroidSessionRepository$persistedNativeConfiguration$1(Continuation continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z10, @Nullable Continuation continuation) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(continuation);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        return TuplesKt.to((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, kotlin.coroutines.jvm.internal.b.a(this.Z$0));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, Boolean bool, Continuation continuation) {
        return invoke(nativeConfiguration, bool.booleanValue(), continuation);
    }
}
