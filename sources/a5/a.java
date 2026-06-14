package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.slider.Slider;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.DigitalTextView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {
    public final ScrollView A;
    public final TextView B;
    public final Slider C;
    public final ConstraintLayout D;
    public final Toolbar E;
    public final TextView F;
    public final ConstraintLayout G;
    public final ConstraintLayout H;
    public final TextView I;
    public final ConstraintLayout J;
    public final ConstraintLayout K;
    public final View L;
    public final TextView M;
    public final ConstraintLayout N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f3778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f3780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f3781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DigitalTextView f3783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f3784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f3785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f3786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f3787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Guideline f3788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f3789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f3791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConstraintLayout f3792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f3793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DigitalTextView f3794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f3795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f3796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f3797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DigitalTextView f3798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f3799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f3800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f3801z;

    private a(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, TextView textView, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, DigitalTextView digitalTextView, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, Guideline guideline, ConstraintLayout constraintLayout8, View view2, TextView textView4, ConstraintLayout constraintLayout9, ImageView imageView, DigitalTextView digitalTextView2, ConstraintLayout constraintLayout10, TextView textView5, ConstraintLayout constraintLayout11, DigitalTextView digitalTextView3, TextView textView6, ConstraintLayout constraintLayout12, ConstraintLayout constraintLayout13, ScrollView scrollView, TextView textView7, Slider slider, ConstraintLayout constraintLayout14, Toolbar toolbar, TextView textView8, ConstraintLayout constraintLayout15, ConstraintLayout constraintLayout16, TextView textView9, ConstraintLayout constraintLayout17, ConstraintLayout constraintLayout18, View view3, TextView textView10, ConstraintLayout constraintLayout19) {
        this.f3776a = constraintLayout;
        this.f3777b = constraintLayout2;
        this.f3778c = view;
        this.f3779d = textView;
        this.f3780e = constraintLayout3;
        this.f3781f = textView2;
        this.f3782g = textView3;
        this.f3783h = digitalTextView;
        this.f3784i = constraintLayout4;
        this.f3785j = constraintLayout5;
        this.f3786k = constraintLayout6;
        this.f3787l = constraintLayout7;
        this.f3788m = guideline;
        this.f3789n = constraintLayout8;
        this.f3790o = view2;
        this.f3791p = textView4;
        this.f3792q = constraintLayout9;
        this.f3793r = imageView;
        this.f3794s = digitalTextView2;
        this.f3795t = constraintLayout10;
        this.f3796u = textView5;
        this.f3797v = constraintLayout11;
        this.f3798w = digitalTextView3;
        this.f3799x = textView6;
        this.f3800y = constraintLayout12;
        this.f3801z = constraintLayout13;
        this.A = scrollView;
        this.B = textView7;
        this.C = slider;
        this.D = constraintLayout14;
        this.E = toolbar;
        this.F = textView8;
        this.G = constraintLayout15;
        this.H = constraintLayout16;
        this.I = textView9;
        this.J = constraintLayout17;
        this.K = constraintLayout18;
        this.L = view3;
        this.M = textView10;
        this.N = constraintLayout19;
    }

    public static a a(View view) {
        int i10 = R.id.backgroundColorOuterView;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.backgroundColorOuterView);
        if (constraintLayout != null) {
            i10 = R.id.backgroundColorView;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.backgroundColorView);
            if (viewFindChildViewById != null) {
                i10 = R.id.backgroundLabel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.backgroundLabel);
                if (textView != null) {
                    i10 = R.id.backgroundView;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.backgroundView);
                    if (constraintLayout2 != null) {
                        i10 = R.id.fontLabel;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.fontLabel);
                        if (textView2 != null) {
                            i10 = R.id.fontPickerLabel1;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.fontPickerLabel1);
                            if (textView3 != null) {
                                i10 = R.id.fontPickerLabel2;
                                DigitalTextView digitalTextView = (DigitalTextView) ViewBindings.findChildViewById(view, R.id.fontPickerLabel2);
                                if (digitalTextView != null) {
                                    i10 = R.id.fontPickerView;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.fontPickerView);
                                    if (constraintLayout3 != null) {
                                        i10 = R.id.fontPickerView1;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.fontPickerView1);
                                        if (constraintLayout4 != null) {
                                            i10 = R.id.fontPickerView2;
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.fontPickerView2);
                                            if (constraintLayout5 != null) {
                                                i10 = R.id.fontView;
                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.fontView);
                                                if (constraintLayout6 != null) {
                                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
                                                    i10 = R.id.normalTextColorOuterView;
                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.normalTextColorOuterView);
                                                    if (constraintLayout7 != null) {
                                                        i10 = R.id.normalTextColorView;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.normalTextColorView);
                                                        if (viewFindChildViewById2 != null) {
                                                            i10 = R.id.normalTextLabel;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.normalTextLabel);
                                                            if (textView4 != null) {
                                                                i10 = R.id.normalTextView;
                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.normalTextView);
                                                                if (constraintLayout8 != null) {
                                                                    i10 = R.id.previewCancelView;
                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.previewCancelView);
                                                                    if (imageView != null) {
                                                                        i10 = R.id.previewSpeedFontLabel;
                                                                        DigitalTextView digitalTextView2 = (DigitalTextView) ViewBindings.findChildViewById(view, R.id.previewSpeedFontLabel);
                                                                        if (digitalTextView2 != null) {
                                                                            i10 = R.id.previewSpeedFontView;
                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.previewSpeedFontView);
                                                                            if (constraintLayout9 != null) {
                                                                                i10 = R.id.previewSpeedLabel;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.previewSpeedLabel);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.previewSpeedView;
                                                                                    ConstraintLayout constraintLayout10 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.previewSpeedView);
                                                                                    if (constraintLayout10 != null) {
                                                                                        i10 = R.id.previewUnitFontLabel;
                                                                                        DigitalTextView digitalTextView3 = (DigitalTextView) ViewBindings.findChildViewById(view, R.id.previewUnitFontLabel);
                                                                                        if (digitalTextView3 != null) {
                                                                                            i10 = R.id.previewUnitLabel;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.previewUnitLabel);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.previewView;
                                                                                                ConstraintLayout constraintLayout11 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.previewView);
                                                                                                if (constraintLayout11 != null) {
                                                                                                    i10 = R.id.previewWindowView;
                                                                                                    ConstraintLayout constraintLayout12 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.previewWindowView);
                                                                                                    if (constraintLayout12 != null) {
                                                                                                        i10 = R.id.scrollView;
                                                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                        if (scrollView != null) {
                                                                                                            i10 = R.id.sizeLabel;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.sizeLabel);
                                                                                                            if (textView7 != null) {
                                                                                                                i10 = R.id.sizeSeekBar;
                                                                                                                Slider slider = (Slider) ViewBindings.findChildViewById(view, R.id.sizeSeekBar);
                                                                                                                if (slider != null) {
                                                                                                                    i10 = R.id.sizeView;
                                                                                                                    ConstraintLayout constraintLayout13 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.sizeView);
                                                                                                                    if (constraintLayout13 != null) {
                                                                                                                        i10 = R.id.toolbar;
                                                                                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                                                        if (toolbar != null) {
                                                                                                                            i10 = R.id.typeNormalLabel;
                                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.typeNormalLabel);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i10 = R.id.typeNormalView;
                                                                                                                                ConstraintLayout constraintLayout14 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.typeNormalView);
                                                                                                                                if (constraintLayout14 != null) {
                                                                                                                                    i10 = R.id.typeView;
                                                                                                                                    ConstraintLayout constraintLayout15 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.typeView);
                                                                                                                                    if (constraintLayout15 != null) {
                                                                                                                                        i10 = R.id.typeWarningLabel;
                                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.typeWarningLabel);
                                                                                                                                        if (textView9 != null) {
                                                                                                                                            i10 = R.id.typeWarningView;
                                                                                                                                            ConstraintLayout constraintLayout16 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.typeWarningView);
                                                                                                                                            if (constraintLayout16 != null) {
                                                                                                                                                i10 = R.id.warningTextColorOuterView;
                                                                                                                                                ConstraintLayout constraintLayout17 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.warningTextColorOuterView);
                                                                                                                                                if (constraintLayout17 != null) {
                                                                                                                                                    i10 = R.id.warningTextColorView;
                                                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.warningTextColorView);
                                                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                                                        i10 = R.id.warningTextLabel;
                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.warningTextLabel);
                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                            i10 = R.id.warningTextView;
                                                                                                                                                            ConstraintLayout constraintLayout18 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.warningTextView);
                                                                                                                                                            if (constraintLayout18 != null) {
                                                                                                                                                                return new a((ConstraintLayout) view, constraintLayout, viewFindChildViewById, textView, constraintLayout2, textView2, textView3, digitalTextView, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, guideline, constraintLayout7, viewFindChildViewById2, textView4, constraintLayout8, imageView, digitalTextView2, constraintLayout9, textView5, constraintLayout10, digitalTextView3, textView6, constraintLayout11, constraintLayout12, scrollView, textView7, slider, constraintLayout13, toolbar, textView8, constraintLayout14, constraintLayout15, textView9, constraintLayout16, constraintLayout17, viewFindChildViewById3, textView10, constraintLayout18);
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

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_custom_minimize, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3776a;
    }
}
