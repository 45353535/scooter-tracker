package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Barrier f4041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f4042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f4045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f4047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f4048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f4049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4054r;

    private s(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, Barrier barrier, ImageView imageView, TextView textView4, TextView textView5, ImageView imageView2, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.f4037a = constraintLayout;
        this.f4038b = textView;
        this.f4039c = textView2;
        this.f4040d = textView3;
        this.f4041e = barrier;
        this.f4042f = imageView;
        this.f4043g = textView4;
        this.f4044h = textView5;
        this.f4045i = imageView2;
        this.f4046j = textView6;
        this.f4047k = textView7;
        this.f4048l = textView8;
        this.f4049m = textView9;
        this.f4050n = textView10;
        this.f4051o = textView11;
        this.f4052p = textView12;
        this.f4053q = textView13;
        this.f4054r = textView14;
    }

    public static s a(View view) {
        int i10 = R.id.addressLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.addressLabel);
        if (textView != null) {
            i10 = R.id.altitudeLabel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.altitudeLabel);
            if (textView2 != null) {
                i10 = R.id.altitudeTitleLabel;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.altitudeTitleLabel);
                if (textView3 != null) {
                    i10 = R.id.barrier;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.barrier);
                    if (barrier != null) {
                        i10 = R.id.gpsImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.gpsImageView);
                        if (imageView != null) {
                            i10 = R.id.gpsLabel;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.gpsLabel);
                            if (textView4 != null) {
                                i10 = R.id.gpsTitleLabel;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.gpsTitleLabel);
                                if (textView5 != null) {
                                    i10 = R.id.imageView;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                                    if (imageView2 != null) {
                                        i10 = R.id.latitudeLabel;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.latitudeLabel);
                                        if (textView6 != null) {
                                            i10 = R.id.latitudeTitleLabel;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.latitudeTitleLabel);
                                            if (textView7 != null) {
                                                i10 = R.id.longitudeLabel;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.longitudeLabel);
                                                if (textView8 != null) {
                                                    i10 = R.id.longitudeTitleLabel;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.longitudeTitleLabel);
                                                    if (textView9 != null) {
                                                        i10 = R.id.satelliteLabel;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.satelliteLabel);
                                                        if (textView10 != null) {
                                                            i10 = R.id.satelliteTitleLabel;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.satelliteTitleLabel);
                                                            if (textView11 != null) {
                                                                i10 = R.id.speedLabel;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.speedLabel);
                                                                if (textView12 != null) {
                                                                    i10 = R.id.speedTitleLabel;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.speedTitleLabel);
                                                                    if (textView13 != null) {
                                                                        i10 = R.id.titleLabel;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                                                        if (textView14 != null) {
                                                                            return new s((ConstraintLayout) view, textView, textView2, textView3, barrier, imageView, textView4, textView5, imageView2, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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

    public static s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_signal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4037a;
    }
}
