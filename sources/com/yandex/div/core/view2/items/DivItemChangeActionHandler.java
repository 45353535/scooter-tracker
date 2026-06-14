package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.o.g;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001e*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/div/core/view2/items/DivItemChangeActionHandler;", "", "<init>", "()V", "", "authority", "", "canHandle", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", g.f66428y, "Lcom/yandex/div/core/DivViewFacade;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "handleAction", "(Landroid/net/Uri;Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "animated", "Lcom/yandex/div/core/view2/items/DivViewWithItemsController;", "viewController", "handleSetCurrentItem", "(Landroid/net/Uri;ZLcom/yandex/div/core/view2/items/DivViewWithItemsController;)Z", "handleNextItem", "handlePreviousItem", "handleScrollForward", "handleScrollBackward", "handleScrollTo", "handleScrollToTheEnd", "(ZLcom/yandex/div/core/view2/items/DivViewWithItemsController;)Z", "handleScrollToTheStart", "", "default", "getStepParam", "(Landroid/net/Uri;I)I", "Lcom/yandex/div/core/view2/items/Direction;", "direction", "(Ljava/lang/String;)Lcom/yandex/div/core/view2/items/Direction;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivItemChangeActionHandler {

    @NotNull
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean canHandle(@Nullable String authority) {
        if (authority == null) {
            return false;
        }
        switch (authority.hashCode()) {
            case -1789088446:
                return authority.equals("set_next_item");
            case -1509135083:
                return authority.equals("scroll_backward");
            case -1348467885:
                return authority.equals("scroll_forward");
            case -1280379330:
                return authority.equals("set_previous_item");
            case -770388272:
                return authority.equals("scroll_to_start");
            case -88123690:
                return authority.equals("set_current_item");
            case 633820873:
                return authority.equals("scroll_to_end");
            case 1099321339:
                return authority.equals("scroll_to_position");
            default:
                return false;
        }
    }

    private final Direction direction(String authority) {
        return Intrinsics.areEqual(authority, "set_previous_item") ? Direction.PREVIOUS : Intrinsics.areEqual(authority, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }

    private final int getStepParam(Uri uri, int i10) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter != null) {
            try {
                return Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail(queryParameter + " is not a number");
                }
            }
        }
        return i10;
    }

    static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean handleAction(@NotNull Uri uri, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.INSTANCE;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController divViewWithItemsControllerCreate = companion.create(queryParameter, view, resolver, divItemChangeActionHandler.direction(authority));
        if (divViewWithItemsControllerCreate == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean z10 = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority != null) {
            switch (authority.hashCode()) {
                case -1789088446:
                    if (authority.equals("set_next_item")) {
                        return divItemChangeActionHandler.handleNextItem(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case -1509135083:
                    if (authority.equals("scroll_backward")) {
                        return divItemChangeActionHandler.handleScrollBackward(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case -1348467885:
                    if (authority.equals("scroll_forward")) {
                        return divItemChangeActionHandler.handleScrollForward(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case -1280379330:
                    if (authority.equals("set_previous_item")) {
                        return divItemChangeActionHandler.handlePreviousItem(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case -770388272:
                    if (authority.equals("scroll_to_start")) {
                        return divItemChangeActionHandler.handleScrollToTheStart(z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case -88123690:
                    if (authority.equals("set_current_item")) {
                        return divItemChangeActionHandler.handleSetCurrentItem(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case 633820873:
                    if (authority.equals("scroll_to_end")) {
                        return divItemChangeActionHandler.handleScrollToTheEnd(z10, divViewWithItemsControllerCreate);
                    }
                    break;
                case 1099321339:
                    if (authority.equals("scroll_to_position")) {
                        return divItemChangeActionHandler.handleScrollTo(uri, z10, divViewWithItemsControllerCreate);
                    }
                    break;
            }
        }
        return false;
    }

    private final boolean handleNextItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollTo(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollTo(getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollToTheEnd(boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollToEnd(animated);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollToStart(animated);
        return true;
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        String queryParameter = uri.getQueryParameter("item");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            viewController.setCurrentItem(Integer.parseInt(queryParameter), animated);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter + " is not a number");
            }
            return false;
        }
    }
}
