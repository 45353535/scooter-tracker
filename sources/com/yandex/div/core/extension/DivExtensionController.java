package com.yandex.div.core.extension;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.f7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0012¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/extension/DivExtensionController;", "", "", "Lcom/yandex/div/core/extension/DivExtensionHandler;", "extensionHandlers", "<init>", "(Ljava/util/List;)V", "Lk8/f7;", "div", "", "hasExtensions", "(Lk8/f7;)Z", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "preprocessExtensions", "(Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "beforeBindView", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/f7;)V", "bindView", "unbindView", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivExtensionController {

    @NotNull
    private final List<DivExtensionHandler> extensionHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public DivExtensionController(@NotNull List<? extends DivExtensionHandler> list) {
        this.extensionHandlers = list;
    }

    private boolean hasExtensions(f7 div) {
        List extensions = div.getExtensions();
        return (extensions == null || extensions.isEmpty() || this.extensionHandlers.isEmpty()) ? false : true;
    }

    public void beforeBindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull f7 div) {
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.beforeBindView(divView, resolver, view, div);
                }
            }
        }
    }

    public void bindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull f7 div) {
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.bindView(divView, resolver, view, div);
                }
            }
        }
    }

    public void preprocessExtensions(@NotNull f7 div, @NotNull ExpressionResolver resolver) {
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.preprocess(div, resolver);
                }
            }
        }
    }

    public void unbindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull f7 div) {
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.unbindView(divView, resolver, view, div);
                }
            }
        }
    }
}
