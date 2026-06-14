package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.view2.Div2View;
import k8.dv;

/* JADX INFO: loaded from: classes11.dex */
public interface DivTooltipRestrictor {
    public static final DivTooltipRestrictor STUB = new DivTooltipRestrictor() { // from class: y6.k
        @Override // com.yandex.div.core.DivTooltipRestrictor
        public final boolean canShowTooltip(Div2View div2View, View view, dv dvVar, boolean z10) {
            return l.b(div2View, view, dvVar, z10);
        }

        @Override // com.yandex.div.core.DivTooltipRestrictor
        public /* synthetic */ DivTooltipRestrictor.DivTooltipShownCallback getTooltipShownCallback() {
            l.a(this);
            return null;
        }
    };

    public interface DivTooltipShownCallback {
    }

    boolean canShowTooltip(@NonNull Div2View div2View, @NonNull View view, @NonNull dv dvVar, boolean z10);

    @Nullable
    DivTooltipShownCallback getTooltipShownCallback();
}
