package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class dt2 extends em1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f110054j = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(dt2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(dt2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(dt2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em1 f110055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final em1 f110056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx2 f110057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gk2 f110058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gk2 f110059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ct2 f110060i;

    public dt2(CustomizableMediaView customizableMediaView, zs2 zs2Var, em1 em1Var, mm1 mm1Var, kx2 kx2Var) {
        super(customizableMediaView, mm1Var);
        this.f110055d = zs2Var;
        this.f110056e = em1Var;
        this.f110057f = kx2Var;
        this.f110058g = hk2.a(null);
        this.f110059h = hk2.a(null);
        kotlin.properties.a aVar = kotlin.properties.a.f93338a;
        this.f110060i = new ct2(zs2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new at2(new WeakReference(this)));
    }

    @Override // yads.nh3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f110055d.a((View) customizableMediaView);
        this.f110056e.a((View) customizableMediaView);
    }

    @Override // yads.em1
    public final dm1 d() {
        return ((em1) this.f110060i.getValue(this, f110054j[2])).d();
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        am1 am1Var = (am1) obj;
        this.f110055d.a(giVar, qh3Var, am1Var);
        this.f110056e.a(giVar, qh3Var, am1Var);
    }

    @Override // yads.nh3
    public final void a() {
        ((em1) this.f110060i.getValue(this, f110054j[2])).a();
    }

    @Override // yads.em1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f110055d.a(customizableMediaView);
        this.f110056e.a(customizableMediaView);
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        return ((em1) this.f110060i.getValue(this, f110054j[2])).a(view, obj);
    }

    @Override // yads.em1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        gk2 gk2Var = this.f110058g;
        KProperty<?>[] kPropertyArr = f110054j;
        KProperty<?> kProperty = kPropertyArr[0];
        gk2Var.getClass();
        gk2Var.f111244a = new WeakReference(customizableMediaView);
        gk2 gk2Var2 = this.f110059h;
        KProperty<?> kProperty2 = kPropertyArr[1];
        gk2Var2.getClass();
        gk2Var2.f111244a = new WeakReference(am1Var);
        ((em1) this.f110060i.getValue(this, kPropertyArr[2])).b(customizableMediaView, am1Var);
    }

    @Override // yads.em1
    public final void a(am1 am1Var) {
        ((em1) this.f110060i.getValue(this, f110054j[2])).a(am1Var);
    }
}
