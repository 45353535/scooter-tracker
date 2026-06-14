package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import androidx.collection.ScatterMapKt;
import com.yandex.div.R$dimen;
import com.yandex.div.R$drawable;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class OverflowMenuWrapper {

    @DrawableRes
    private int mButtonResourceId;

    @NonNull
    private final Context mContext;

    @Nullable
    private View[] mHorizontallyCompetingViews;

    @Nullable
    private Listener mListener;
    private int mMenuGravity;

    @DimenRes
    private final int mMenuHorizontalMargin;

    @DimenRes
    private final int mMenuVerticalMargin;

    @IntRange(from = 0, to = ScatterMapKt.Sentinel)
    private int mOverflowAlpha;

    @ColorInt
    private int mOverflowColor;
    private int mOverflowGravity;

    @Nullable
    private final ViewGroup mParentView;

    @Nullable
    private PopupMenu mPopupMenu;
    private boolean mValid;

    @Nullable
    private View[] mVerticallyCompetingViews;

    @NonNull
    private final View mWrappedView;

    public interface Listener {

        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onPopupShown() {
            }
        }

        void onMenuCreated(@NonNull PopupMenu popupMenu);

        void onPopupShown();
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
        this(context, view, viewGroup, R$dimen.overflow_menu_margin_horizontal, R$dimen.overflow_menu_margin_vertical);
    }

    public static /* synthetic */ void a(OverflowMenuWrapper overflowMenuWrapper, View view) {
        overflowMenuWrapper.getClass();
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, overflowMenuWrapper.mMenuGravity);
        Listener listener = overflowMenuWrapper.mListener;
        if (listener != null) {
            listener.onMenuCreated(popupMenu);
        }
        popupMenu.show();
        Listener listener2 = overflowMenuWrapper.mListener;
        if (listener2 != null) {
            listener2.onPopupShown();
        }
        overflowMenuWrapper.mPopupMenu = popupMenu;
    }

    public View.OnClickListener getOnMenuClickListener() {
        return new View.OnClickListener() { // from class: d8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowMenuWrapper.a(this.f68461b, view);
            }
        };
    }

    @NonNull
    public OverflowMenuWrapper listener(@NonNull Listener listener) {
        this.mListener = listener;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper overflowGravity(int i10) {
        this.mOverflowGravity = i10;
        return this;
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup, @DimenRes int i10, @DimenRes int i11) {
        this.mOverflowGravity = 51;
        this.mOverflowColor = -1;
        this.mOverflowAlpha = 255;
        this.mMenuGravity = 83;
        this.mButtonResourceId = R$drawable.ic_more_vert_white_24dp;
        this.mHorizontallyCompetingViews = null;
        this.mVerticallyCompetingViews = null;
        this.mValid = false;
        this.mContext = context;
        this.mWrappedView = view;
        this.mParentView = viewGroup;
        this.mMenuHorizontalMargin = i10;
        this.mMenuVerticalMargin = i11;
    }
}
