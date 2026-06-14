package dc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Executable;
import io.bidmachine.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class p extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected View f68634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected View f68635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected View f68636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected View f68637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f68638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected View f68639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected s f68640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ac.b f68641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f68642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68649t;

    public p(Context context) {
        this(context, null);
    }

    @NonNull
    private Set<View> getAllAvailableClickableViews() {
        final HashSet hashSet = new HashSet();
        io.bidmachine.core.h.F(this.f68634e, new n(hashSet));
        io.bidmachine.core.h.F(this.f68635f, new n(hashSet));
        io.bidmachine.core.h.F(this.f68636g, new n(hashSet));
        io.bidmachine.core.h.F(this.f68637h, new n(hashSet));
        io.bidmachine.core.h.F(this.f68638i, new n(hashSet));
        io.bidmachine.core.h.F(this.f68639j, new n(hashSet));
        io.bidmachine.core.h.F(this.f68640k, new Executable() { // from class: dc.o
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                hashSet.add((s) obj);
            }
        });
        return hashSet;
    }

    @Override // dc.m, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view) {
        super.addView(view);
    }

    public void b(ac.b bVar) {
        if (bVar == null || !bVar.isLoaded()) {
            return;
        }
        View view = this.f68634e;
        if (view instanceof TextView) {
            ((TextView) view).setText(bVar.h());
        }
        View view2 = this.f68637h;
        if (view2 instanceof TextView) {
            ((TextView) view2).setText(bVar.e());
        }
        View view3 = this.f68636g;
        if (view3 instanceof RatingBar) {
            RatingBar ratingBar = (RatingBar) view3;
            if (bVar.g() == -1.0f) {
                ratingBar.setVisibility(4);
            } else {
                ratingBar.setVisibility(0);
                ratingBar.setStepSize(0.1f);
                ratingBar.setRating(bVar.g());
            }
        }
        View view4 = this.f68635f;
        if (view4 instanceof TextView) {
            ((TextView) view4).setText(bVar.d());
        }
        if (this.f68638i instanceof ViewGroup) {
            View viewF = bVar.f(getContext());
            if (viewF instanceof r) {
                viewF.setVisibility(8);
            } else if (viewF != null) {
                ae.m.b(viewF);
                ((ViewGroup) this.f68638i).addView(viewF, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        ac.o oVarC = bVar.c();
        if (oVarC instanceof ac.i) {
            this.f68630c.b((ac.i) oVarC);
        }
    }

    @Override // dc.m, android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ void bringChildToFront(View view) {
        super.bringChildToFront(view);
    }

    public void c() {
        ac.b bVar = this.f68641l;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    public void d(ac.b bVar, Set set) {
        if (bVar == null || !bVar.isLoaded()) {
            io.bidmachine.core.a.d("Native ad is not loaded. Please load it before registering");
            return;
        }
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        if (set.isEmpty()) {
            io.bidmachine.core.a.o("'registerViewForInteraction' called with empty 'clickableViews' list, native ad won't be interactive");
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(new WeakReference((View) it.next()));
        }
        e();
        this.f68642m = hashSet;
        this.f68641l = bVar;
        bVar.j(this, getIconView(), getMediaView(), set);
    }

    public void e() {
        ac.b bVar = this.f68641l;
        if (bVar != null) {
            bVar.k();
        }
    }

    @Nullable
    public View getCallToActionView() {
        return this.f68635f;
    }

    @NonNull
    public Set<View> getClickableViews() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f68642m.iterator();
        while (it.hasNext()) {
            io.bidmachine.core.h.F((View) ((WeakReference) it.next()).get(), new n(hashSet));
        }
        return hashSet;
    }

    @Nullable
    public View getDescriptionView() {
        return this.f68637h;
    }

    @Nullable
    public View getIconView() {
        return this.f68639j;
    }

    @Nullable
    public s getMediaView() {
        return this.f68640k;
    }

    @Nullable
    public View getProviderView() {
        return this.f68638i;
    }

    @Nullable
    public View getRatingView() {
        return this.f68636g;
    }

    @Nullable
    public View getTitleView() {
        return this.f68634e;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setTitleView(findViewById(this.f68643n));
        setCallToActionView(findViewById(this.f68644o));
        setRatingView(findViewById(this.f68645p));
        setDescriptionView(findViewById(this.f68646q));
        setProviderView(findViewById(this.f68647r));
        setIconView(findViewById(this.f68648s));
        setMediaView((s) findViewById(this.f68649t));
    }

    @Override // dc.m, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void removeAllViews() {
        super.removeAllViews();
    }

    @Override // dc.m, android.view.ViewGroup, android.view.ViewManager
    public /* bridge */ /* synthetic */ void removeView(View view) {
        super.removeView(view);
    }

    public void setCallToActionView(@Nullable View view) {
        this.f68635f = view;
    }

    public void setDescriptionView(@Nullable View view) {
        this.f68637h = view;
    }

    public void setIconView(@Nullable View view) {
        this.f68639j = view;
    }

    public void setMediaView(@Nullable s sVar) {
        this.f68640k = sVar;
    }

    public void setProviderView(@Nullable View view) {
        this.f68638i = view;
    }

    public void setRatingView(@Nullable View view) {
        this.f68636g = view;
    }

    public void setTitleView(@Nullable View view) {
        this.f68634e = view;
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // dc.m, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10) {
        super.addView(view, i10);
    }

    public p(Context context, AttributeSet attributeSet, int i10) throws Exception {
        super(context, attributeSet, i10);
        this.f68642m = new HashSet();
        this.f68643n = -1;
        this.f68644o = -1;
        this.f68645p = -1;
        this.f68646q = -1;
        this.f68647r = -1;
        this.f68648s = -1;
        this.f68649t = -1;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NativeAdContentLayout, i10, 0);
        try {
            this.f68643n = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_titleViewId, -1);
            this.f68644o = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_callToActionViewId, -1);
            this.f68645p = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_ratingViewId, -1);
            this.f68646q = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_descriptionViewId, -1);
            this.f68647r = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_providerViewId, -1);
            this.f68648s = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_iconViewId, -1);
            this.f68649t = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_mediaViewId, -1);
            androidx.core.provider.c.a(typedArrayObtainStyledAttributes);
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    androidx.core.provider.c.a(typedArrayObtainStyledAttributes);
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // dc.m, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
    }

    @Override // dc.m, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // dc.m, android.view.ViewGroup, android.view.ViewManager
    public /* bridge */ /* synthetic */ void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
    }
}
