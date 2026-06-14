package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class l02 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f112902g = {ub.a(l02.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), ub.a(l02.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), ub.a(l02.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), ub.a(l02.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), ub.a(l02.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f112903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk2 f112904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk2 f112905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f112906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk2 f112907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f112908f;

    public l02(k02 k02Var) {
        this.f112903a = hk2.a(k02Var.e());
        this.f112904b = hk2.a(k02Var.c());
        this.f112905c = hk2.a(k02Var.d());
        this.f112906d = hk2.a(k02Var.f());
        this.f112907e = hk2.a(k02Var.b());
        this.f112908f = yg1.a(k02Var.a());
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f112908f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final View a() {
        gk2 gk2Var = this.f112903a;
        KProperty kProperty = f112902g[0];
        return (View) gk2Var.f111244a.get();
    }
}
