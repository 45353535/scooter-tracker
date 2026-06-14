package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", l = {231}, m = "selectAds")
final class AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectAds(null, null, this);
    }
}
