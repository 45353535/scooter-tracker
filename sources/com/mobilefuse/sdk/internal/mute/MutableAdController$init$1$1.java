package com.mobilefuse.sdk.internal.mute;

import com.mobilefuse.sdk.config.ObservableConfigKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "p1", "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "p2", "", "invoke"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class MutableAdController$init$1$1 extends y implements Function2<ObservableConfigKey, Object, Unit> {
    MutableAdController$init$1$1(MutableAdController mutableAdController) {
        super(2, mutableAdController, MutableAdController.class, "onConfigPropertyChanged", "onConfigPropertyChanged(Lcom/mobilefuse/sdk/config/ObservableConfigKey;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ObservableConfigKey observableConfigKey, Object obj) {
        invoke2(observableConfigKey, obj);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ObservableConfigKey p12, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((MutableAdController) this.receiver).onConfigPropertyChanged(p12, obj);
    }
}
