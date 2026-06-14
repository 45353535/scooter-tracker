package com.mobilefuse.sdk.ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "changeScale", "", "scale", "", "completeAction", "Lkotlin/Function0;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface ScaleModifier {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeScale$default(ScaleModifier scaleModifier, float f10, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeScale");
            }
            if ((i10 & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier.changeScale.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }
                };
            }
            scaleModifier.changeScale(f10, function0);
        }
    }

    void changeScale(float scale, @NotNull Function0<Unit> completeAction);

    @NotNull
    OmniAdContainer getOmniAdContainer();
}
