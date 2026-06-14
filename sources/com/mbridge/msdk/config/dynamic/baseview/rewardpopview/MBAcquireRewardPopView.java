package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f47468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f47469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f47470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f47474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f47475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f47476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnTouchListener f47477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View.OnClickListener f47478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f47479n;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f47475j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f47471f <= 0) {
                MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f47475j, 1000L);
        }
    }

    class d implements Runnable {

        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.f47472g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }
    }

    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.f47467b = motionEvent.getX();
                MBAcquireRewardPopView.this.f47468c = motionEvent.getY();
            } else {
                if (action == 1) {
                    if (MBAcquireRewardPopView.this.f47469d <= MBAcquireRewardPopView.this.f47467b) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (Math.abs(MBAcquireRewardPopView.this.f47469d - MBAcquireRewardPopView.this.f47467b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f47470e - MBAcquireRewardPopView.this.f47468c) >= 100.0f) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.f47473h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f47475j);
                    MBAcquireRewardPopView.this.f47473h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.f47469d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f47470e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47466a = "MBAcquireRewardPopView";
        this.f47467b = 0.0f;
        this.f47468c = 0.0f;
        this.f47469d = 0.0f;
        this.f47470e = 0.0f;
        this.f47474i = new b();
        this.f47475j = new c();
        this.f47476k = new d();
        this.f47477l = new e();
        this.f47478m = new f();
        this.f47479n = new a();
    }

    static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f47471f;
        mBAcquireRewardPopView.f47471f = i10 - 1;
        return i10;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f47475j);
    }

    public void onPause() {
        if (!this.f47472g || this.f47471f <= 0) {
            return;
        }
        removeCallbacks(this.f47475j);
    }

    public void onResume() {
        if (!this.f47472g || this.f47471f <= 0) {
            return;
        }
        post(this.f47475j);
    }

    public void onStop() {
        if (!this.f47472g || this.f47471f <= 0) {
            return;
        }
        removeCallbacks(this.f47475j);
    }

    public void onTimeLessThanReduce(int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }
}
