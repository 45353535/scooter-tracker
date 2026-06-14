package com.yandex.div.core.view2.divs.widgets;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "()V", "visit", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MediaReleaseViewVisitor extends DivViewVisitor {
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivVideoView view) {
        view.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivImageView view) {
        view.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivGifImageView view) {
        view.release();
    }
}
