package yads;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class n70 extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        Resources resources = view.getResources();
        if (view.getId() == R$id.item_divider) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = resources.getDimensionPixelSize(R$dimen.debug_panel_space_medium_large);
            }
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.debug_panel_space_small);
            rect.bottom = dimensionPixelSize;
            rect.top = dimensionPixelSize;
        }
    }
}
