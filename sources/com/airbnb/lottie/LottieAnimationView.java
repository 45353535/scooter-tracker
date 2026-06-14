package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import d0.b0;
import d0.c0;
import d0.d0;
import d0.e0;
import d0.u;
import d0.w;
import d0.y;
import d0.z;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f7238o = "LottieAnimationView";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final w f7239p = new w() { // from class: d0.g
        @Override // d0.w
        public final void onResult(Object obj) {
            LottieAnimationView.b((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f7240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f7241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f7242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f7244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f7250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f7251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f7252n;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f7253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f7255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f7257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7259h;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, com.airbnb.lottie.a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f7253b);
            parcel.writeFloat(this.f7255d);
            parcel.writeInt(this.f7256e ? 1 : 0);
            parcel.writeString(this.f7257f);
            parcel.writeInt(this.f7258g);
            parcel.writeInt(this.f7259h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7253b = parcel.readString();
            this.f7255d = parcel.readFloat();
            this.f7256e = parcel.readInt() == 1;
            this.f7257f = parcel.readString();
            this.f7258g = parcel.readInt();
            this.f7259h = parcel.readInt();
        }
    }

    private enum a {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7267a;

        public b(LottieAnimationView lottieAnimationView) {
            this.f7267a = new WeakReference(lottieAnimationView);
        }

        @Override // d0.w
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f7267a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f7243e != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f7243e);
            }
            (lottieAnimationView.f7242d == null ? LottieAnimationView.f7239p : lottieAnimationView.f7242d).onResult(th2);
        }
    }

    private static class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7268a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f7268a = new WeakReference(lottieAnimationView);
        }

        @Override // d0.w
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(d0.i iVar) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f7268a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7240b = new c(this);
        this.f7241c = new b(this);
        this.f7243e = 0;
        this.f7244f = new o();
        this.f7247i = false;
        this.f7248j = false;
        this.f7249k = true;
        this.f7250l = new HashSet();
        this.f7251m = new HashSet();
        n(attributeSet, R$attr.f7269a);
    }

    public static /* synthetic */ z a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f7249k ? d0.q.l(lottieAnimationView.getContext(), str) : d0.q.m(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void b(Throwable th2) {
        if (!q0.p.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        q0.g.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ z c(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f7249k ? d0.q.x(lottieAnimationView.getContext(), i10) : d0.q.y(lottieAnimationView.getContext(), i10, null);
    }

    private void i() {
        q qVar = this.f7252n;
        if (qVar != null) {
            qVar.k(this.f7240b);
            this.f7252n.j(this.f7241c);
        }
    }

    private void j() {
        this.f7244f.u();
    }

    private q l(final String str) {
        return isInEditMode() ? new q(new Callable() { // from class: d0.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.a(this.f68339b, str);
            }
        }, true) : this.f7249k ? d0.q.j(getContext(), str) : d0.q.k(getContext(), str, null);
    }

    private q m(final int i10) {
        return isInEditMode() ? new q(new Callable() { // from class: d0.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.c(this.f68341b, i10);
            }
        }, true) : this.f7249k ? d0.q.v(getContext(), i10) : d0.q.w(getContext(), i10, null);
    }

    private void n(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f7270a, i10, 0);
        this.f7249k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7275f, true);
        int i11 = R$styleable.f7287r;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = R$styleable.f7282m;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = R$styleable.f7292w;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i13);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f7281l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7274e, false)) {
            this.f7248j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7285p, false)) {
            this.f7244f.N0(-1);
        }
        int i14 = R$styleable.f7290u;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = R$styleable.f7289t;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = R$styleable.f7291v;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = R$styleable.f7277h;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i17, true));
        }
        int i18 = R$styleable.f7276g;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = R$styleable.f7279j;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i19));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.f7284o));
        int i20 = R$styleable.f7286q;
        u(typedArrayObtainStyledAttributes.getFloat(i20, 0.0f), typedArrayObtainStyledAttributes.hasValue(i20));
        k(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7280k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7271b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7272c, true));
        int i21 = R$styleable.f7278i;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            h(new j0.e("**"), y.K, new r0.c(new d0(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i21, -1)).getDefaultColor())));
        }
        int i22 = R$styleable.f7288s;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            c0 c0Var = c0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i22, c0Var.ordinal());
            if (iOrdinal >= c0.values().length) {
                iOrdinal = c0Var.ordinal();
            }
            setRenderMode(c0.values()[iOrdinal]);
        }
        int i23 = R$styleable.f7273d;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            d0.a aVar = d0.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i23, aVar.ordinal());
            if (iOrdinal2 >= c0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(d0.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f7283n, false));
        int i24 = R$styleable.f7293x;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i24, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(q qVar) {
        z zVarE = qVar.e();
        o oVar = this.f7244f;
        if (zVarE != null && oVar == getDrawable() && oVar.I() == zVarE.b()) {
            return;
        }
        this.f7250l.add(a.SET_ANIMATION);
        j();
        i();
        this.f7252n = qVar.d(this.f7240b).c(this.f7241c);
    }

    private void t() {
        boolean zO = o();
        setImageDrawable(null);
        setImageDrawable(this.f7244f);
        if (zO) {
            this.f7244f.l0();
        }
    }

    private void u(float f10, boolean z10) {
        if (z10) {
            this.f7250l.add(a.SET_PROGRESS);
        }
        this.f7244f.L0(f10);
    }

    public void g(Animator.AnimatorListener animatorListener) {
        this.f7244f.q(animatorListener);
    }

    public d0.a getAsyncUpdates() {
        return this.f7244f.D();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f7244f.E();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f7244f.G();
    }

    public boolean getClipToCompositionBounds() {
        return this.f7244f.H();
    }

    @Nullable
    public d0.i getComposition() {
        Drawable drawable = getDrawable();
        o oVar = this.f7244f;
        if (drawable == oVar) {
            return oVar.I();
        }
        return null;
    }

    public long getDuration() {
        d0.i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f7244f.L();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f7244f.N();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f7244f.P();
    }

    public float getMaxFrame() {
        return this.f7244f.R();
    }

    public float getMinFrame() {
        return this.f7244f.S();
    }

    @Nullable
    public b0 getPerformanceTracker() {
        return this.f7244f.T();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f7244f.U();
    }

    public c0 getRenderMode() {
        return this.f7244f.V();
    }

    public int getRepeatCount() {
        return this.f7244f.W();
    }

    public int getRepeatMode() {
        return this.f7244f.X();
    }

    public float getSpeed() {
        return this.f7244f.Y();
    }

    public void h(j0.e eVar, Object obj, r0.c cVar) {
        this.f7244f.r(eVar, obj, cVar);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof o) && ((o) drawable).V() == c0.SOFTWARE) {
            this.f7244f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o oVar = this.f7244f;
        if (drawable2 == oVar) {
            super.invalidateDrawable(oVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void k(boolean z10) {
        this.f7244f.z(u.MergePathsApi19, z10);
    }

    public boolean o() {
        return this.f7244f.c0();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f7248j) {
            return;
        }
        this.f7244f.i0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7245g = savedState.f7253b;
        Set set = this.f7250l;
        a aVar = a.SET_ANIMATION;
        if (!set.contains(aVar) && !TextUtils.isEmpty(this.f7245g)) {
            setAnimation(this.f7245g);
        }
        this.f7246h = savedState.f7254c;
        if (!this.f7250l.contains(aVar) && (i10 = this.f7246h) != 0) {
            setAnimation(i10);
        }
        if (!this.f7250l.contains(a.SET_PROGRESS)) {
            u(savedState.f7255d, false);
        }
        if (!this.f7250l.contains(a.PLAY_OPTION) && savedState.f7256e) {
            q();
        }
        if (!this.f7250l.contains(a.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f7257f);
        }
        if (!this.f7250l.contains(a.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f7258g);
        }
        if (this.f7250l.contains(a.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f7259h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7253b = this.f7245g;
        savedState.f7254c = this.f7246h;
        savedState.f7255d = this.f7244f.U();
        savedState.f7256e = this.f7244f.d0();
        savedState.f7257f = this.f7244f.N();
        savedState.f7258g = this.f7244f.X();
        savedState.f7259h = this.f7244f.W();
        return savedState;
    }

    public void p() {
        this.f7248j = false;
        this.f7244f.h0();
    }

    public void q() {
        this.f7250l.add(a.PLAY_OPTION);
        this.f7244f.i0();
    }

    public void r(InputStream inputStream, String str) {
        setCompositionTask(d0.q.o(inputStream, str));
    }

    public void s(String str, String str2) {
        r(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(@RawRes int i10) {
        this.f7246h = i10;
        this.f7245g = null;
        setCompositionTask(m(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        s(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f7249k ? d0.q.z(getContext(), str) : d0.q.A(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f7244f.n0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f7244f.o0(z10);
    }

    public void setAsyncUpdates(d0.a aVar) {
        this.f7244f.p0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f7249k = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f7244f.q0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f7244f.r0(z10);
    }

    public void setComposition(@NonNull d0.i iVar) {
        if (d0.e.f68328a) {
            Log.v(f7238o, "Set Composition \n" + iVar);
        }
        this.f7244f.setCallback(this);
        this.f7247i = true;
        boolean zS0 = this.f7244f.s0(iVar);
        if (this.f7248j) {
            this.f7244f.i0();
        }
        this.f7247i = false;
        if (getDrawable() != this.f7244f || zS0) {
            if (!zS0) {
                t();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f7251m.iterator();
            if (it.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f7244f.t0(str);
    }

    public void setFailureListener(@Nullable w wVar) {
        this.f7242d = wVar;
    }

    public void setFallbackResource(@DrawableRes int i10) {
        this.f7243e = i10;
    }

    public void setFontAssetDelegate(d0.b bVar) {
        this.f7244f.u0(bVar);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f7244f.v0(map);
    }

    public void setFrame(int i10) {
        this.f7244f.w0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f7244f.x0(z10);
    }

    public void setImageAssetDelegate(d0.c cVar) {
        this.f7244f.y0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f7244f.z0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f7246h = 0;
        this.f7245g = null;
        i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f7246h = 0;
        this.f7245g = null;
        i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f7246h = 0;
        this.f7245g = null;
        i();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f7244f.A0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f7244f.B0(i10);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f7244f.D0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f7244f.F0(str);
    }

    public void setMinFrame(int i10) {
        this.f7244f.G0(i10);
    }

    public void setMinProgress(float f10) {
        this.f7244f.I0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f7244f.J0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f7244f.K0(z10);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        u(f10, true);
    }

    public void setRenderMode(c0 c0Var) {
        this.f7244f.M0(c0Var);
    }

    public void setRepeatCount(int i10) {
        this.f7250l.add(a.SET_REPEAT_COUNT);
        this.f7244f.N0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f7250l.add(a.SET_REPEAT_MODE);
        this.f7244f.O0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f7244f.P0(z10);
    }

    public void setSpeed(float f10) {
        this.f7244f.Q0(f10);
    }

    public void setTextDelegate(e0 e0Var) {
        this.f7244f.R0(e0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f7244f.S0(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        o oVar;
        if (!this.f7247i && drawable == (oVar = this.f7244f) && oVar.c0()) {
            p();
        } else if (!this.f7247i && (drawable instanceof o)) {
            o oVar2 = (o) drawable;
            if (oVar2.c0()) {
                oVar2.h0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f7244f.C0(str);
    }

    public void setMinFrame(String str) {
        this.f7244f.H0(str);
    }

    public void setAnimation(String str) {
        this.f7245g = str;
        this.f7246h = 0;
        setCompositionTask(l(str));
    }
}
