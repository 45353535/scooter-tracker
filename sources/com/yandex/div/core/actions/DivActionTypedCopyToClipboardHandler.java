package com.yandex.div.core.actions;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.m5;
import k8.p2;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0013J1\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedCopyToClipboardHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/p2;", "content", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleCopyToClipboard", "(Lk8/p2;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Landroid/content/ClipData;", "getClipData", "(Lk8/p2;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/content/ClipData;", "Lk8/p2$d;", "(Lk8/p2$d;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/content/ClipData;", "Lk8/p2$c;", "(Lk8/p2$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/content/ClipData;", "", "scopeId", "Lk8/m5;", "action", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedCopyToClipboardHandler implements DivActionTypedHandler {
    private final ClipData getClipData(p2 p2Var, ExpressionResolver expressionResolver) {
        if (p2Var instanceof p2.c) {
            return getClipData((p2.c) p2Var, expressionResolver);
        }
        if (p2Var instanceof p2.d) {
            return getClipData((p2.d) p2Var, expressionResolver);
        }
        throw new m();
    }

    private final void handleCopyToClipboard(p2 content, Div2View view, ExpressionResolver resolver) {
        Object systemService = view.getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
        } else {
            clipboardManager.setPrimaryClip(getClipData(content, resolver));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof m5.i)) {
            return false;
        }
        handleCopyToClipboard(((m5.i) action).c().f90141a, view, resolver);
        return true;
    }

    private final ClipData getClipData(p2.d dVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item((Uri) dVar.c().f88299a.evaluate(expressionResolver)));
    }

    private final ClipData getClipData(p2.c cVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied text", new String[]{AssetHelper.DEFAULT_MIME_TYPE}, new ClipData.Item((String) cVar.c().f87140a.evaluate(expressionResolver)));
    }
}
