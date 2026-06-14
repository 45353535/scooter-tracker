package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class x72 implements uw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117734a;

    public x72(int i10) {
        this.f117734a = i10;
    }

    @Override // yads.uw1
    public final View a(View view, String str) {
        View viewFindViewWithTag = view.findViewWithTag(str + "_" + this.f117734a);
        if (androidx.activity.s.a(viewFindViewWithTag)) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final CheckBox b(View view) {
        View viewFindViewWithTag = view.findViewWithTag("mute_button_" + this.f117734a);
        if (viewFindViewWithTag instanceof CheckBox) {
            return (CheckBox) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final CustomizableMediaView c(View view) {
        View viewFindViewWithTag = view.findViewWithTag("media_" + this.f117734a);
        if (viewFindViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView d(View view) {
        View viewFindViewWithTag = view.findViewWithTag("price_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView e(View view) {
        View viewFindViewWithTag = view.findViewWithTag("call_to_action_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView f(View view) {
        View viewFindViewWithTag = view.findViewWithTag("warning_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ImageView g(View view) {
        View viewFindViewWithTag = view.findViewWithTag("favicon_" + this.f117734a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView h(View view) {
        View viewFindViewWithTag = view.findViewWithTag("age_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final View i(View view) {
        View viewFindViewWithTag = view.findViewWithTag("rating_" + this.f117734a);
        if (androidx.activity.s.a(viewFindViewWithTag)) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView j(View view) {
        View viewFindViewWithTag = view.findViewWithTag("title_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ProgressBar k(View view) {
        return (ProgressBar) view.findViewWithTag("video_progress_" + this.f117734a);
    }

    @Override // yads.uw1
    public final ImageView l(View view) {
        View viewFindViewWithTag = view.findViewWithTag("feedback_" + this.f117734a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView m(View view) {
        View viewFindViewWithTag = view.findViewWithTag("sponsored_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView n(View view) {
        View viewFindViewWithTag = view.findViewWithTag("domain_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final ImageView o(View view) {
        View viewFindViewWithTag = view.findViewWithTag("icon_" + this.f117734a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView p(View view) {
        View viewFindViewWithTag = view.findViewWithTag("review_count_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.uw1
    public final TextView a(View view) {
        View viewFindViewWithTag = view.findViewWithTag("body_" + this.f117734a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }
}
