package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ViewBinding {
    public final ConstraintLayout A;
    public final Guideline B;
    public final ImageView C;
    public final ImageView D;
    public final CardView E;
    public final ImageView F;
    public final TextView G;
    public final ConstraintLayout H;
    public final TextView I;
    public final ConstraintLayout J;
    public final ScrollView K;
    public final ImageView L;
    public final TextView M;
    public final ConstraintLayout N;
    public final TextView O;
    public final ConstraintLayout P;
    public final TextView Q;
    public final Toolbar R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f3815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f3817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f3818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f3820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f3821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f3822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f3823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f3824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f3825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f3826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConstraintLayout f3827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f3828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f3829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f3830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f3831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f3832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f3833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DividerView f3834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f3835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f3836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f3837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f3838z;

    private c(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, View view, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout3, TextView textView4, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, TextView textView5, View view2, TextView textView6, ConstraintLayout constraintLayout6, TextView textView7, ImageView imageView2, TextView textView8, ConstraintLayout constraintLayout7, TextView textView9, ConstraintLayout constraintLayout8, DividerView dividerView, ImageView imageView3, TextView textView10, ConstraintLayout constraintLayout9, TextView textView11, ConstraintLayout constraintLayout10, Guideline guideline, ImageView imageView4, ImageView imageView5, CardView cardView, ImageView imageView6, TextView textView12, ConstraintLayout constraintLayout11, TextView textView13, ConstraintLayout constraintLayout12, ScrollView scrollView, ImageView imageView7, TextView textView14, ConstraintLayout constraintLayout13, TextView textView15, ConstraintLayout constraintLayout14, TextView textView16, Toolbar toolbar) {
        this.f3813a = constraintLayout;
        this.f3814b = textView;
        this.f3815c = constraintLayout2;
        this.f3816d = textView2;
        this.f3817e = view;
        this.f3818f = imageView;
        this.f3819g = textView3;
        this.f3820h = constraintLayout3;
        this.f3821i = textView4;
        this.f3822j = constraintLayout4;
        this.f3823k = constraintLayout5;
        this.f3824l = textView5;
        this.f3825m = view2;
        this.f3826n = textView6;
        this.f3827o = constraintLayout6;
        this.f3828p = textView7;
        this.f3829q = imageView2;
        this.f3830r = textView8;
        this.f3831s = constraintLayout7;
        this.f3832t = textView9;
        this.f3833u = constraintLayout8;
        this.f3834v = dividerView;
        this.f3835w = imageView3;
        this.f3836x = textView10;
        this.f3837y = constraintLayout9;
        this.f3838z = textView11;
        this.A = constraintLayout10;
        this.B = guideline;
        this.C = imageView4;
        this.D = imageView5;
        this.E = cardView;
        this.F = imageView6;
        this.G = textView12;
        this.H = constraintLayout11;
        this.I = textView13;
        this.J = constraintLayout12;
        this.K = scrollView;
        this.L = imageView7;
        this.M = textView14;
        this.N = constraintLayout13;
        this.O = textView15;
        this.P = constraintLayout14;
        this.Q = textView16;
        this.R = toolbar;
    }

    public static c a(View view) {
        int i10 = R.id.arriveLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.arriveLabel);
        if (textView != null) {
            i10 = R.id.arriveOuterView;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.arriveOuterView);
            if (constraintLayout != null) {
                i10 = R.id.arriveTimeLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.arriveTimeLabel);
                if (textView2 != null) {
                    i10 = R.id.arriveView;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.arriveView);
                    if (viewFindChildViewById != null) {
                        i10 = R.id.averageImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.averageImageView);
                        if (imageView != null) {
                            i10 = R.id.averageLabel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.averageLabel);
                            if (textView3 != null) {
                                i10 = R.id.averageLabelView;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.averageLabelView);
                                if (constraintLayout2 != null) {
                                    i10 = R.id.averageTitleLabel;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.averageTitleLabel);
                                    if (textView4 != null) {
                                        i10 = R.id.averageView;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.averageView);
                                        if (constraintLayout3 != null) {
                                            i10 = R.id.contentView;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.contentView);
                                            if (constraintLayout4 != null) {
                                                i10 = R.id.dateLabel;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.dateLabel);
                                                if (textView5 != null) {
                                                    i10 = R.id.departInnerView;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.departInnerView);
                                                    if (viewFindChildViewById2 != null) {
                                                        i10 = R.id.departLabel;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.departLabel);
                                                        if (textView6 != null) {
                                                            i10 = R.id.departOuterView;
                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.departOuterView);
                                                            if (constraintLayout5 != null) {
                                                                i10 = R.id.departTimeLabel;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.departTimeLabel);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.distanceImageView;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.distanceImageView);
                                                                    if (imageView2 != null) {
                                                                        i10 = R.id.distanceLabel;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.distanceLabel);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.distanceLabelView;
                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.distanceLabelView);
                                                                            if (constraintLayout6 != null) {
                                                                                i10 = R.id.distanceTitleLabel;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.distanceTitleLabel);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.distanceView;
                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.distanceView);
                                                                                    if (constraintLayout7 != null) {
                                                                                        i10 = R.id.dotted_line;
                                                                                        DividerView dividerView = (DividerView) ViewBindings.findChildViewById(view, R.id.dotted_line);
                                                                                        if (dividerView != null) {
                                                                                            i10 = R.id.durationImageView;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.durationImageView);
                                                                                            if (imageView3 != null) {
                                                                                                i10 = R.id.durationLabel;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.durationLabel);
                                                                                                if (textView10 != null) {
                                                                                                    i10 = R.id.durationLabelView;
                                                                                                    ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.durationLabelView);
                                                                                                    if (constraintLayout8 != null) {
                                                                                                        i10 = R.id.durationTitleLabel;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.durationTitleLabel);
                                                                                                        if (textView11 != null) {
                                                                                                            i10 = R.id.durationView;
                                                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.durationView);
                                                                                                            if (constraintLayout9 != null) {
                                                                                                                i10 = R.id.guideline;
                                                                                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
                                                                                                                if (guideline != null) {
                                                                                                                    i10 = R.id.logoImageView;
                                                                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.logoImageView);
                                                                                                                    if (imageView4 != null) {
                                                                                                                        i10 = R.id.mapOverlay;
                                                                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.mapOverlay);
                                                                                                                        if (imageView5 != null) {
                                                                                                                            i10 = R.id.mapView;
                                                                                                                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.mapView);
                                                                                                                            if (cardView != null) {
                                                                                                                                i10 = R.id.maximumImageView;
                                                                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.maximumImageView);
                                                                                                                                if (imageView6 != null) {
                                                                                                                                    i10 = R.id.maximumLabel;
                                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.maximumLabel);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i10 = R.id.maximumLabelView;
                                                                                                                                        ConstraintLayout constraintLayout10 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.maximumLabelView);
                                                                                                                                        if (constraintLayout10 != null) {
                                                                                                                                            i10 = R.id.maximumTitleLabel;
                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.maximumTitleLabel);
                                                                                                                                            if (textView13 != null) {
                                                                                                                                                i10 = R.id.maximumView;
                                                                                                                                                ConstraintLayout constraintLayout11 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.maximumView);
                                                                                                                                                if (constraintLayout11 != null) {
                                                                                                                                                    i10 = R.id.scrollView;
                                                                                                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                                                                    if (scrollView != null) {
                                                                                                                                                        i10 = R.id.speedingImageView;
                                                                                                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.speedingImageView);
                                                                                                                                                        if (imageView7 != null) {
                                                                                                                                                            i10 = R.id.speedingLabel;
                                                                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.speedingLabel);
                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                i10 = R.id.speedingLabelView;
                                                                                                                                                                ConstraintLayout constraintLayout12 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedingLabelView);
                                                                                                                                                                if (constraintLayout12 != null) {
                                                                                                                                                                    i10 = R.id.speedingTitleLabel;
                                                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.speedingTitleLabel);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        i10 = R.id.speedingView;
                                                                                                                                                                        ConstraintLayout constraintLayout13 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedingView);
                                                                                                                                                                        if (constraintLayout13 != null) {
                                                                                                                                                                            i10 = R.id.titleLabel;
                                                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                i10 = R.id.toolbar;
                                                                                                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                                                                                                                if (toolbar != null) {
                                                                                                                                                                                    return new c((ConstraintLayout) view, textView, constraintLayout, textView2, viewFindChildViewById, imageView, textView3, constraintLayout2, textView4, constraintLayout3, constraintLayout4, textView5, viewFindChildViewById2, textView6, constraintLayout5, textView7, imageView2, textView8, constraintLayout6, textView9, constraintLayout7, dividerView, imageView3, textView10, constraintLayout8, textView11, constraintLayout9, guideline, imageView4, imageView5, cardView, imageView6, textView12, constraintLayout10, textView13, constraintLayout11, scrollView, imageView7, textView14, constraintLayout12, textView15, constraintLayout13, textView16, toolbar);
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

    public static c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_history_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3813a;
    }
}
