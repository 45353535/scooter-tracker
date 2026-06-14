package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\u0019\u0010\u000b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ReleaseUtils;", "", "()V", "releaseAndRemoveChildren", "", "Landroid/view/ViewGroup;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "releaseAndRemoveChildren$div_release", "releaseChildren", "releaseChildren$div_release", "releaseMedia", "releaseMedia$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReleaseUtils {

    @NotNull
    public static final ReleaseUtils INSTANCE = new ReleaseUtils();

    private ReleaseUtils() {
    }

    public final void releaseAndRemoveChildren$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View) {
        releaseChildren$div_release(viewGroup, div2View);
        viewGroup.removeAllViews();
    }

    public final void releaseChildren$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View) {
        Iterator it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it.next());
        }
    }

    public final void releaseMedia$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View) {
        Iterator it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getMediaReleaseViewVisitor$div_release(), (View) it.next());
        }
    }
}
