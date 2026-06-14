package com.my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.my.target.R;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.h6;
import com.my.target.j;
import com.my.target.kb;
import com.my.target.l;
import com.my.target.m;
import com.my.target.m1;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.qa;
import com.my.target.ra;
import com.my.target.t;
import com.my.target.ua;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f59185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f59186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MyTargetViewListener f59187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MyTargetViewRenderCrashListener f59188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ra f59189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSize f59190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59192h;

    public interface MyTargetViewListener {
        void onClick(@NonNull MyTargetView myTargetView);

        void onLoad(@NonNull MyTargetView myTargetView);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView);

        void onShow(@NonNull MyTargetView myTargetView);
    }

    @RequiresApi(26)
    public interface MyTargetViewRenderCrashListener {
        void onViewRenderCrash(@NonNull MyTargetView myTargetView);
    }

    public MyTargetView(@NonNull Context context) {
        this(context, null);
    }

    public void a(ua uaVar, AdSize adSize) {
        final h6.a aVarA = h6.a(this.f59185a.i());
        qa.a(uaVar, this.f59185a, aVarA).a(new l.b() { // from class: com.my.target.ads.b
            @Override // com.my.target.l.b
            public final void a(t tVar, m mVar) {
                this.f59201a.a(aVarA, (ua) tVar, mVar);
            }
        }).a(aVarA.a(), getContext());
    }

    public void destroy() {
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.a();
            this.f59189e = null;
        }
        this.f59187c = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f59188d = null;
        }
    }

    @Nullable
    public String getAdSource() {
        ra raVar = this.f59189e;
        if (raVar != null) {
            return raVar.b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        ra raVar = this.f59189e;
        if (raVar != null) {
            return raVar.c();
        }
        return 0.0f;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.f59185a.g();
    }

    @Nullable
    public MyTargetViewListener getListener() {
        return this.f59187c;
    }

    @Nullable
    @RequiresApi(26)
    public MyTargetViewRenderCrashListener getRenderCrashListener() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f59188d;
        }
        gb.b("Trying to get a MyTargetViewRenderCrashListener on api = " + i10 + ", but min api = 26, return null");
        return null;
    }

    @NonNull
    public AdSize getSize() {
        return this.f59190f;
    }

    @Deprecated
    public void init(int i10) {
        init(i10, true);
    }

    public boolean isMediationEnabled() {
        return this.f59185a.k();
    }

    public void load() {
        if (!this.f59186b.compareAndSet(false, true)) {
            gb.a("MyTargetView: Doesn't support multiple load");
            return;
        }
        final h6.a aVarA = h6.a(this.f59185a.i());
        h6 h6VarA = aVarA.a();
        gb.a("MyTargetView: View load");
        a();
        qa.a(this.f59185a, aVarA).a(new l.b() { // from class: com.my.target.ads.c
            @Override // com.my.target.l.b
            public final void a(t tVar, m mVar) {
                this.f59203a.b(aVarA, (ua) tVar, mVar);
            }
        }).a(h6VarA, getContext());
    }

    public void loadFromBid(@NonNull String str) {
        this.f59185a.b(str);
        this.f59185a.b(false);
        load();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59192h = true;
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59192h = false;
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.a(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f59191g) {
            b();
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.b(z10);
        }
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.f59185a.a(str, adNetworkConfig);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        if (adSize == null) {
            gb.a("MyTargetView: AdSize cannot be null");
            return;
        }
        if (this.f59191g && AdSize.a(this.f59190f, adSize)) {
            return;
        }
        this.f59191g = true;
        if (this.f59186b.get()) {
            AdSize adSize2 = this.f59190f;
            AdSize adSize3 = AdSize.ADSIZE_300x250;
            if (AdSize.a(adSize2, adSize3) || AdSize.a(adSize, adSize3)) {
                gb.a("MyTargetView: unable to switch size to/from 300x250");
                return;
            }
        }
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.a(adSize);
            View childAt = getChildAt(0);
            if (childAt instanceof m1) {
                childAt.requestLayout();
            }
        }
        this.f59190f = adSize;
        a();
    }

    public void setListener(@Nullable MyTargetViewListener myTargetViewListener) {
        this.f59187c = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z10) {
        this.f59185a.a(z10);
    }

    public void setRefreshAd(boolean z10) {
        this.f59185a.b(z10);
    }

    @RequiresApi(26)
    public void setRenderCrashListener(@Nullable MyTargetViewRenderCrashListener myTargetViewRenderCrashListener) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f59188d = myTargetViewRenderCrashListener;
            return;
        }
        gb.b("Can't set MyTargetViewRenderCrashListener: available only on api >= 26, your api = " + i10);
    }

    public void setSlotId(int i10) {
        if (this.f59186b.get()) {
            return;
        }
        this.f59185a.c(i10);
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b() {
        Context context = getContext();
        Point pointB = kb.b(context);
        int i10 = pointB.x;
        float f10 = pointB.y;
        if (i10 != this.f59190f.f59193a || r3.f59194b > f10 * 0.15f) {
            AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
            this.f59190f = adSizeForCurrentOrientation;
            ra raVar = this.f59189e;
            if (raVar != null) {
                raVar.a(adSizeForCurrentOrientation);
            }
        }
    }

    @Deprecated
    public void init(int i10, boolean z10) {
        init(i10, 0, z10);
    }

    public static final class AdSize {
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f59195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f59196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f59197e;
        public static final AdSize ADSIZE_320x50 = new AdSize(320, 50, 0);
        public static final AdSize ADSIZE_300x250 = new AdSize(300, 250, 1);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);

        public AdSize(int i10, int i11, int i12, int i13, int i14) {
            this.f59193a = i10;
            this.f59194b = i11;
            this.f59195c = i12;
            this.f59196d = i13;
            this.f59197e = i14;
        }

        public static AdSize a(float f10, float f11) {
            float fA = kb.a();
            float fMax = Math.max(Math.min(f10 > 524.0f ? (f10 / 728.0f) * 90.0f : (f10 / 320.0f) * 50.0f, f11), 50.0f * fA);
            return new AdSize((int) (f10 / fA), (int) (fMax / fA), (int) f10, (int) fMax, 3);
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i10, int i11, @NonNull Context context) {
            Point pointB = kb.b(context);
            float fA = kb.a();
            return a(i10 * fA, Math.min(i11 * fA, pointB.y * 0.15f));
        }

        public int getHeight() {
            return this.f59194b;
        }

        public int getHeightPixels() {
            return this.f59196d;
        }

        public int getType() {
            return this.f59197e;
        }

        public int getWidth() {
            return this.f59193a;
        }

        public int getWidthPixels() {
            return this.f59195c;
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i10, @NonNull Context context) {
            return a(i10 * kb.a(), kb.b(context).y * 0.15f);
        }

        public static AdSize a(int i10, Context context) {
            if (i10 == 1) {
                return ADSIZE_300x250;
            }
            if (i10 == 2) {
                return ADSIZE_728x90;
            }
            if (i10 != 3) {
                return ADSIZE_320x50;
            }
            return getAdSizeForCurrentOrientation(context);
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(@NonNull Context context) {
            Point pointB = kb.b(context);
            return a(pointB.x, pointB.y * 0.15f);
        }

        public AdSize(int i10, int i11, int i12) {
            this.f59193a = i10;
            this.f59194b = i11;
            float fA = kb.a();
            this.f59195c = (int) (i10 * fA);
            this.f59196d = (int) (i11 * fA);
            this.f59197e = i12;
        }

        public static boolean a(AdSize adSize, AdSize adSize2) {
            return adSize.f59194b == adSize2.f59194b && adSize.f59193a == adSize2.f59193a && adSize.f59197e == adSize2.f59197e;
        }
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i10);
        this.f59186b = new AtomicBoolean();
        this.f59191g = false;
        gb.c("MyTargetView created. Version - " + MyTargetVersion.VERSION);
        this.f59185a = j.a(0, "");
        this.f59190f = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet == null) {
            return;
        }
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MyTargetView);
        } catch (Throwable th2) {
            gb.a("MyTargetView: Unable to get view attributes - " + th2.getMessage());
            typedArrayObtainStyledAttributes = null;
        }
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        this.f59185a.c(typedArrayObtainStyledAttributes.getInt(R.styleable.MyTargetView_myTarget_slotId, 0));
        this.f59185a.b(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MyTargetView_myTarget_isRefreshAd, true));
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.MyTargetView_myTarget_adSize, -1);
        if (i11 >= 0) {
            if (i11 != 3) {
                this.f59191g = true;
            }
            this.f59190f = AdSize.a(i11, context);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Deprecated
    public void init(int i10, int i11) {
        init(i10, i11, true);
    }

    @Deprecated
    public void init(int i10, int i11, boolean z10) {
        setAdSize(AdSize.a(i11, getContext()));
        this.f59185a.c(i10);
        this.f59185a.b(z10);
        gb.a("MyTargetView: Initialized");
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(ua uaVar, IAdLoadingError iAdLoadingError, h6.a aVar) {
        MyTargetViewListener myTargetViewListener = this.f59187c;
        if (myTargetViewListener == null) {
            return;
        }
        if (uaVar == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60104i;
            }
            myTargetViewListener.onNoAd(iAdLoadingError, this);
            return;
        }
        ra raVar = this.f59189e;
        if (raVar != null) {
            raVar.a();
        }
        ra raVarA = ra.a(this, this.f59185a, aVar);
        this.f59189e = raVarA;
        raVarA.a(this.f59192h);
        this.f59189e.b(uaVar);
        this.f59185a.b((String) null);
    }

    public final void a() {
        AdSize adSize = this.f59190f;
        if (adSize == AdSize.ADSIZE_320x50) {
            this.f59185a.c("standard_320x50");
            return;
        }
        if (adSize == AdSize.ADSIZE_300x250) {
            this.f59185a.c("standard_300x250");
        } else if (adSize == AdSize.ADSIZE_728x90) {
            this.f59185a.c("standard_728x90");
        } else {
            this.f59185a.c(Reporting.CreativeType.STANDARD);
        }
    }
}
