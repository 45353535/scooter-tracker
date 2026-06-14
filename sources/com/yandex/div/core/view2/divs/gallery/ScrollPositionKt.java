package com.yandex.div.core.view2.divs.gallery;

import k8.td;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8/td$e;", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "toScrollPosition", "(Lk8/td$e;)Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ScrollPositionKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[td.e.values().length];
            try {
                iArr[td.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[td.e.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ScrollPosition toScrollPosition(@NotNull td.e eVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i10 == 1) {
            return ScrollPosition.DEFAULT;
        }
        if (i10 == 2) {
            return ScrollPosition.CENTER;
        }
        throw new m();
    }
}
