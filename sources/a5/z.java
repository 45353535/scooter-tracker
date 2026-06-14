package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f4121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CheckBox f4122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f4124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f4126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f4127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f4128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DividerView f4129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f4130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f4132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4133q;

    private z(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, View view2, CheckBox checkBox, TextView textView3, View view3, TextView textView4, View view4, ImageView imageView, TextView textView5, DividerView dividerView, ImageView imageView2, TextView textView6, ImageView imageView3, TextView textView7) {
        this.f4117a = constraintLayout;
        this.f4118b = textView;
        this.f4119c = view;
        this.f4120d = textView2;
        this.f4121e = view2;
        this.f4122f = checkBox;
        this.f4123g = textView3;
        this.f4124h = view3;
        this.f4125i = textView4;
        this.f4126j = view4;
        this.f4127k = imageView;
        this.f4128l = textView5;
        this.f4129m = dividerView;
        this.f4130n = imageView2;
        this.f4131o = textView6;
        this.f4132p = imageView3;
        this.f4133q = textView7;
    }

    public static z a(View view) {
        int i10 = R.id.arriveLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.arriveLabel);
        if (textView != null) {
            i10 = R.id.arriveOuterView;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.arriveOuterView);
            if (viewFindChildViewById != null) {
                i10 = R.id.arriveTimeLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.arriveTimeLabel);
                if (textView2 != null) {
                    i10 = R.id.arriveView;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.arriveView);
                    if (viewFindChildViewById2 != null) {
                        i10 = R.id.checkBox;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
                        if (checkBox != null) {
                            i10 = R.id.departLabel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.departLabel);
                            if (textView3 != null) {
                                i10 = R.id.departOuterView;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.departOuterView);
                                if (viewFindChildViewById3 != null) {
                                    i10 = R.id.departTimeLabel;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.departTimeLabel);
                                    if (textView4 != null) {
                                        i10 = R.id.departView;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.departView);
                                        if (viewFindChildViewById4 != null) {
                                            i10 = R.id.distanceImageView;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.distanceImageView);
                                            if (imageView != null) {
                                                i10 = R.id.distanceLabel;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.distanceLabel);
                                                if (textView5 != null) {
                                                    i10 = R.id.dotted_line;
                                                    DividerView dividerView = (DividerView) ViewBindings.findChildViewById(view, R.id.dotted_line);
                                                    if (dividerView != null) {
                                                        i10 = R.id.durationImageView;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.durationImageView);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.durationLabel;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.durationLabel);
                                                            if (textView6 != null) {
                                                                i10 = R.id.moreImageView;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.moreImageView);
                                                                if (imageView3 != null) {
                                                                    i10 = R.id.titleLabel;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                                                    if (textView7 != null) {
                                                                        return new z((ConstraintLayout) view, textView, viewFindChildViewById, textView2, viewFindChildViewById2, checkBox, textView3, viewFindChildViewById3, textView4, viewFindChildViewById4, imageView, textView5, dividerView, imageView2, textView6, imageView3, textView7);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4117a;
    }
}
