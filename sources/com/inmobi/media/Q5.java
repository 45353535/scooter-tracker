package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.media.Q5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Q5 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f37573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V5 f37575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T5 f37576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3586al f37577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC3878m9 f37578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xo f37579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f37573a = activity;
        this.f37574b = -1;
    }

    public final void a(String expandInput, R5 inputType, boolean z10, long j10, String placementType, String impressionId, String creativeId, Ya ya2) {
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        if (this.f37575c == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            V5 v52 = new V5(context, j10, placementType, impressionId, creativeId, new Function1() { // from class: w3.b4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Q5.a(this.f106988b, (JSONObject) obj);
                }
            }, this.f37578f);
            this.f37575c = v52;
            v52.setId(65517);
        }
        V5 v53 = this.f37575c;
        if (v53 != null) {
            v53.setLandingPageTelemetryControlInfo(ya2);
        }
        if (this.f37574b != expandInput.hashCode()) {
            if (inputType == R5.f37637a) {
                V5 v54 = this.f37575c;
                if (v54 != null) {
                    v54.loadUrl(expandInput);
                }
            } else {
                V5 v55 = this.f37575c;
                if (v55 != null) {
                    v55.loadData(expandInput, "text/html", "UTF-8");
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, Utf8.REPLACEMENT_CODE_POINT);
            V5 v56 = this.f37575c;
            if (v56 != null) {
                v56.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.f37575c, layoutParams);
            }
        }
        this.f37574b = expandInput.hashCode();
        if (!z10) {
            View viewFindViewById = findViewById(Utf8.REPLACEMENT_CODE_POINT);
            if (viewFindViewById != null) {
                removeView(viewFindViewById);
                return;
            }
            return;
        }
        if (findViewById(Utf8.REPLACEMENT_CODE_POINT) != null) {
            return;
        }
        float f10 = J5.d().f37267c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (F3.a(this.f37573a)) {
            xo xoVar = this.f37579g;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f37579g = new xo(this.f37573a, new P5(layoutParams2), this.f37578f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3799j5 c3799j5 = new C3799j5(context, (byte) 2, this.f37578f);
        c3799j5.setId(65516);
        c3799j5.setOnTouchListener(new View.OnTouchListener() { // from class: w3.e4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.b(this.f107032b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3799j5 c3799j5 = new C3799j5(context, (byte) 6, this.f37578f);
        c3799j5.setId(1048283);
        c3799j5.setOnTouchListener(new View.OnTouchListener() { // from class: w3.f4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.c(this.f107048b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3799j5 c3799j5 = new C3799j5(context, (byte) 3, this.f37578f);
        c3799j5.setId(65502);
        c3799j5.setOnTouchListener(new View.OnTouchListener() { // from class: w3.c4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.d(this.f107001b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j5, layoutParams);
    }

    @Nullable
    public final InterfaceC3586al getUserLeftApplicationListener() {
        return this.f37577e;
    }

    public final void setEmbeddedBrowserUpdateListener(@NotNull T5 browserUpdateListener) {
        Intrinsics.checkNotNullParameter(browserUpdateListener, "browserUpdateListener");
        this.f37576d = browserUpdateListener;
    }

    public final void setLogger(@NotNull InterfaceC3878m9 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f37578f = logger;
    }

    public final void setUserLeftApplicationListener(@Nullable InterfaceC3586al interfaceC3586al) {
        this.f37577e = interfaceC3586al;
    }

    public static final boolean b(Q5 q52, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            V5 v52 = q52.f37575c;
            if (v52 != null && (u52 = v52.f37887h) != null) {
                U5.a(u52, 5, true, null, 12);
            }
            T5 t52 = q52.f37576d;
            if (t52 != null) {
                M8.a(((L8) t52).f37270a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(Q5 q52, View view, MotionEvent motionEvent) {
        V5 v52 = q52.f37575c;
        if (v52 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (v52.canGoForward()) {
                v52.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(Q5 q52, View view, MotionEvent motionEvent) {
        U5 u52;
        U5 u53;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            V5 v52 = q52.f37575c;
            if (v52 != null && (u53 = v52.f37887h) != null) {
                U5.a(u53, 6, true, null, 12);
            }
            V5 v53 = q52.f37575c;
            if (v53 != null && (u52 = v53.f37887h) != null) {
                U5.a(u52, 6, true, null, 12);
            }
            V5 v54 = q52.f37575c;
            if (v54 != null) {
                v54.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final Unit a(Q5 q52, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        T5 t52 = q52.f37576d;
        if (t52 != null) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            C c10 = ((L8) t52).f37270a.f37348b;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = c10 instanceof GestureDetectorOnGestureListenerC3635ci ? (GestureDetectorOnGestureListenerC3635ci) c10 : null;
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                gestureDetectorOnGestureListenerC3635ci.c(jsonObject);
            }
        }
        return Unit.f93236a;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3799j5 c3799j5 = new C3799j5(context, (byte) 4, this.f37578f);
        c3799j5.setId(65503);
        c3799j5.setOnTouchListener(new View.OnTouchListener() { // from class: w3.d4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.a(this.f107013b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j5, layoutParams);
    }

    public static final boolean a(Q5 q52, View view, MotionEvent motionEvent) {
        V5 v52 = q52.f37575c;
        if (v52 == null) {
            T5 t52 = q52.f37576d;
            if (t52 != null) {
                M8.a(((L8) t52).f37270a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (v52.canGoBack()) {
                v52.goBack();
            } else {
                T5 t53 = q52.f37576d;
                if (t53 != null) {
                    M8.a(((L8) t53).f37270a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
