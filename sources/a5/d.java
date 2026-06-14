package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.DigitalMirroredTextView;
import com.ktwapps.speedometer.Widget.MirroredTextView;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f3846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MirroredTextView f3847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f3848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f3849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f3850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f3851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MirroredTextView f3852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f3853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f3854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MirroredTextView f3855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f3856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DigitalMirroredTextView f3857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MirroredTextView f3858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MirroredTextView f3859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConstraintLayout f3860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f3861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MirroredTextView f3862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f3863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MirroredTextView f3864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f3865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DigitalMirroredTextView f3866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MirroredTextView f3867x;

    private d(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, MirroredTextView mirroredTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView3, MirroredTextView mirroredTextView2, ConstraintLayout constraintLayout5, ImageView imageView4, MirroredTextView mirroredTextView3, ConstraintLayout constraintLayout6, DigitalMirroredTextView digitalMirroredTextView, MirroredTextView mirroredTextView4, MirroredTextView mirroredTextView5, ConstraintLayout constraintLayout7, ImageView imageView5, MirroredTextView mirroredTextView6, ConstraintLayout constraintLayout8, MirroredTextView mirroredTextView7, ConstraintLayout constraintLayout9, DigitalMirroredTextView digitalMirroredTextView2, MirroredTextView mirroredTextView8) {
        this.f3844a = constraintLayout;
        this.f3845b = imageView;
        this.f3846c = imageView2;
        this.f3847d = mirroredTextView;
        this.f3848e = constraintLayout2;
        this.f3849f = constraintLayout3;
        this.f3850g = constraintLayout4;
        this.f3851h = imageView3;
        this.f3852i = mirroredTextView2;
        this.f3853j = constraintLayout5;
        this.f3854k = imageView4;
        this.f3855l = mirroredTextView3;
        this.f3856m = constraintLayout6;
        this.f3857n = digitalMirroredTextView;
        this.f3858o = mirroredTextView4;
        this.f3859p = mirroredTextView5;
        this.f3860q = constraintLayout7;
        this.f3861r = imageView5;
        this.f3862s = mirroredTextView6;
        this.f3863t = constraintLayout8;
        this.f3864u = mirroredTextView7;
        this.f3865v = constraintLayout9;
        this.f3866w = digitalMirroredTextView2;
        this.f3867x = mirroredTextView8;
    }

    public static d a(View view) {
        int i10 = R.id.backView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backView);
        if (imageView != null) {
            i10 = R.id.batteryImageView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.batteryImageView);
            if (imageView2 != null) {
                i10 = R.id.batteryLabel;
                MirroredTextView mirroredTextView = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.batteryLabel);
                if (mirroredTextView != null) {
                    i10 = R.id.batteryView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.batteryView);
                    if (constraintLayout != null) {
                        i10 = R.id.digitalFontView;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.digitalFontView);
                        if (constraintLayout2 != null) {
                            i10 = R.id.digitalView;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.digitalView);
                            if (constraintLayout3 != null) {
                                i10 = R.id.distanceImageView;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.distanceImageView);
                                if (imageView3 != null) {
                                    i10 = R.id.distanceLabel;
                                    MirroredTextView mirroredTextView2 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.distanceLabel);
                                    if (mirroredTextView2 != null) {
                                        i10 = R.id.distanceView;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.distanceView);
                                        if (constraintLayout4 != null) {
                                            i10 = R.id.gpsImageView;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.gpsImageView);
                                            if (imageView4 != null) {
                                                i10 = R.id.gpsLabel;
                                                MirroredTextView mirroredTextView3 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.gpsLabel);
                                                if (mirroredTextView3 != null) {
                                                    i10 = R.id.gpsView;
                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.gpsView);
                                                    if (constraintLayout5 != null) {
                                                        i10 = R.id.speedFontLabel;
                                                        DigitalMirroredTextView digitalMirroredTextView = (DigitalMirroredTextView) ViewBindings.findChildViewById(view, R.id.speedFontLabel);
                                                        if (digitalMirroredTextView != null) {
                                                            i10 = R.id.speedLabel;
                                                            MirroredTextView mirroredTextView4 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.speedLabel);
                                                            if (mirroredTextView4 != null) {
                                                                i10 = R.id.speedingFontLabel;
                                                                MirroredTextView mirroredTextView5 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.speedingFontLabel);
                                                                if (mirroredTextView5 != null) {
                                                                    i10 = R.id.speedingFontView;
                                                                    ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedingFontView);
                                                                    if (constraintLayout6 != null) {
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.speedingImage);
                                                                        i10 = R.id.speedingLabel;
                                                                        MirroredTextView mirroredTextView6 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.speedingLabel);
                                                                        if (mirroredTextView6 != null) {
                                                                            i10 = R.id.speedingView;
                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedingView);
                                                                            if (constraintLayout7 != null) {
                                                                                i10 = R.id.timeLabel;
                                                                                MirroredTextView mirroredTextView7 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.timeLabel);
                                                                                if (mirroredTextView7 != null) {
                                                                                    i10 = R.id.timeView;
                                                                                    ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.timeView);
                                                                                    if (constraintLayout8 != null) {
                                                                                        i10 = R.id.unitFontLabel;
                                                                                        DigitalMirroredTextView digitalMirroredTextView2 = (DigitalMirroredTextView) ViewBindings.findChildViewById(view, R.id.unitFontLabel);
                                                                                        if (digitalMirroredTextView2 != null) {
                                                                                            i10 = R.id.unitLabel;
                                                                                            MirroredTextView mirroredTextView8 = (MirroredTextView) ViewBindings.findChildViewById(view, R.id.unitLabel);
                                                                                            if (mirroredTextView8 != null) {
                                                                                                return new d((ConstraintLayout) view, imageView, imageView2, mirroredTextView, constraintLayout, constraintLayout2, constraintLayout3, imageView3, mirroredTextView2, constraintLayout4, imageView4, mirroredTextView3, constraintLayout5, digitalMirroredTextView, mirroredTextView4, mirroredTextView5, constraintLayout6, imageView5, mirroredTextView6, constraintLayout7, mirroredTextView7, constraintLayout8, digitalMirroredTextView2, mirroredTextView8);
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

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_hud, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3844a;
    }
}
