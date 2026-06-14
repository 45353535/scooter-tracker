package com.yandex.div.core.downloader;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.o.g;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.d3;
import k8.dp;
import k8.j1;
import k8.xa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0018JG\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/core/downloader/DivDownloadActionHandler;", "", "<init>", "()V", "Landroid/net/Uri;", g.f66428y, "Lcom/yandex/div/core/DivViewFacade;", "divViewFacade", "", "canHandle", "(Landroid/net/Uri;Lcom/yandex/div/core/DivViewFacade;)Z", "Lk8/j1;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "handleAction", "(Lk8/j1;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/dp;", "handleVisibilityAction", "(Lk8/dp;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/xa;", "downloadCallbacks", "(Landroid/net/Uri;Lk8/xa;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "", "downloadUrl", "", "onSuccessActions", "onFailActions", "executeDownload", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/d3;", "callbacks", "(Lk8/d3;Lk8/xa;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivDownloadActionHandler {

    @NotNull
    public static final DivDownloadActionHandler INSTANCE = new DivDownloadActionHandler();

    private DivDownloadActionHandler() {
    }

    public static final boolean canHandle(@Nullable Uri uri, @NotNull DivViewFacade divViewFacade) {
        String authority;
        if (uri == null || (authority = uri.getAuthority()) == null || !Intrinsics.areEqual(NativeAdPresenter.DOWNLOAD, authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            Assert.fail("url param is required!");
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        Assert.fail("Div2View should be used!");
        return false;
    }

    private final boolean executeDownload(String downloadUrl, final List<j1> onSuccessActions, final List<j1> onFailActions, final Div2View view, final ExpressionResolver resolver) {
        view.addLoadReference(view.getDiv2Component().getDivDownloader().downloadPatch(view, downloadUrl, new DivPatchDownloadCallback() { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$executeDownload$callback$1
        }), view);
        return true;
    }

    public static final boolean handleAction(@NotNull j1 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Expression expression = action.f88315k;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uri, action.f88305a, view, resolver);
    }

    public static final boolean handleVisibilityAction(@NotNull dp action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Expression url = action.getUrl();
        if (url == null || (uri = (Uri) url.evaluate(resolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uri, action.a(), view, resolver);
    }

    public final boolean handleAction(@NotNull d3 action, @Nullable xa callbacks, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        List<j1> list;
        List<j1> list2;
        Uri uri = (Uri) action.f86891c.evaluate(resolver);
        List<j1> list3 = action.f86889a;
        if (list3 != null) {
            list = list3;
        } else if (callbacks != null) {
            list3 = callbacks.f92331a;
            list = list3;
        } else {
            list = null;
        }
        List<j1> list4 = action.f86890b;
        if (list4 == null) {
            list2 = callbacks != null ? callbacks.f92332b : null;
        } else {
            list2 = list4;
        }
        return executeDownload(uri.toString(), list2, list, view, resolver);
    }

    private final boolean handleAction(Uri uri, xa downloadCallbacks, Div2View view, ExpressionResolver resolver) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        return executeDownload(queryParameter, downloadCallbacks != null ? downloadCallbacks.f92332b : null, downloadCallbacks != null ? downloadCallbacks.f92331a : null, view, resolver);
    }
}
