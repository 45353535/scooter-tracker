package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "", "isInTransientHierarchy", "(Landroid/view/View;)Z", "Landroid/view/ViewParent;", "(Landroid/view/ViewParent;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull View view) {
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        return (view.getParent() instanceof ViewGroup) && isInTransientHierarchy(view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull ViewParent viewParent) {
        return (viewParent instanceof TransientView) && isInTransientHierarchy((View) viewParent);
    }
}
