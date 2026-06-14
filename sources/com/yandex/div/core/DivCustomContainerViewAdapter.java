package com.yandex.div.core;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.x9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "", "Lk8/x9;", "div", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Landroid/view/View;", "createView", "(Lk8/x9;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/state/DivStatePath;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "bindView", "(Landroid/view/View;Lk8/x9;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/state/DivStatePath;)V", "", "type", "", "isCustomTypeSupported", "(Ljava/lang/String;)Z", "release", "(Landroid/view/View;Lk8/x9;)V", "Lcom/yandex/div/core/DivPreloader$Callback;", "callBack", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "preload", "(Lk8/x9;Lcom/yandex/div/core/DivPreloader$Callback;)Lcom/yandex/div/core/DivPreloader$PreloadReference;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivCustomContainerViewAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivCustomContainerViewAdapter STUB = new DivCustomContainerViewAdapter() { // from class: com.yandex.div.core.DivCustomContainerViewAdapter$Companion$STUB$1
        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public View createView(@NotNull x9 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public boolean isCustomTypeSupported(@NotNull String type) {
            return false;
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public DivPreloader.PreloadReference preload(@NotNull x9 div, @NotNull DivPreloader.Callback callBack) {
            return DivPreloader.PreloadReference.INSTANCE.getEMPTY();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void release(@NotNull View view, @NotNull x9 div) {
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void bindView(@NotNull View view, @NotNull x9 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/DivCustomContainerViewAdapter$Companion;", "", "<init>", "()V", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "STUB", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindView(@NotNull View view, @NotNull x9 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path);

    @NotNull
    View createView(@NotNull x9 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path);

    boolean isCustomTypeSupported(@NotNull String type);

    @NotNull
    DivPreloader.PreloadReference preload(@NotNull x9 div, @NotNull DivPreloader.Callback callBack);

    void release(@NotNull View view, @NotNull x9 div);
}
