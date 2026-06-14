package com.mobilefuse.sdk.utils;

import android.widget.RelativeLayout;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.PositionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/utils/PositionUtils;", "", "()V", "addPositionRules", "Landroid/widget/RelativeLayout$LayoutParams;", "params", "config", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
public final class PositionUtils {

    @NotNull
    public static final PositionUtils INSTANCE = new PositionUtils();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PositionType.tl.ordinal()] = 1;
            iArr[PositionType.tr.ordinal()] = 2;
            iArr[PositionType.bl.ordinal()] = 3;
            iArr[PositionType.br.ordinal()] = 4;
        }
    }

    private PositionUtils() {
    }

    @NotNull
    public static final RelativeLayout.LayoutParams addPositionRules(@NotNull RelativeLayout.LayoutParams params, @NotNull CloseConfigResponse config) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(config, "config");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(params);
        int i10 = WhenMappings.$EnumSwitchMapping$0[config.getPos().ordinal()];
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            return layoutParams;
        }
        if (i10 == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            return layoutParams;
        }
        if (i10 == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            return layoutParams;
        }
        if (i10 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        return layoutParams;
    }
}
