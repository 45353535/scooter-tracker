package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ironsource.C4240b4;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class ww1 implements uw1 {
    @Override // yads.uw1
    public final View a(View view, String str) {
        View viewFindViewWithTag = view.findViewWithTag(str);
        if (androidx.activity.s.a(viewFindViewWithTag)) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final CheckBox b(View view) {
        View viewFindViewWithTag = view.findViewWithTag("mute_button");
        if (viewFindViewWithTag instanceof CheckBox) {
            return (CheckBox) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final CustomizableMediaView c(View view) {
        View viewFindViewWithTag = view.findViewWithTag("media");
        if (viewFindViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView d(View view) {
        View viewFindViewWithTag = view.findViewWithTag("price");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView e(View view) {
        View viewFindViewWithTag = view.findViewWithTag("call_to_action");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView f(View view) {
        View viewFindViewWithTag = view.findViewWithTag("warning");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ImageView g(View view) {
        View viewFindViewWithTag = view.findViewWithTag("favicon");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView h(View view) {
        View viewFindViewWithTag = view.findViewWithTag("age");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final View i(View view) {
        View viewFindViewWithTag = view.findViewWithTag("rating");
        if (androidx.activity.s.a(viewFindViewWithTag)) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView j(View view) {
        View viewFindViewWithTag = view.findViewWithTag("title");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ProgressBar k(View view) {
        View viewFindViewWithTag = view.findViewWithTag("video_progress");
        if (viewFindViewWithTag instanceof ProgressBar) {
            return (ProgressBar) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ImageView l(View view) {
        View viewFindViewWithTag = view.findViewWithTag("feedback");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView m(View view) {
        View viewFindViewWithTag = view.findViewWithTag("sponsored");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView n(View view) {
        View viewFindViewWithTag = view.findViewWithTag(C4240b4.j.D);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ImageView o(View view) {
        View viewFindViewWithTag = view.findViewWithTag("icon");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView p(View view) {
        View viewFindViewWithTag = view.findViewWithTag("review_count");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView a(View view) {
        View viewFindViewWithTag = view.findViewWithTag("body");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }
}
