package sg.bigo.ads.core.mraid.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Drawable f104370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b f104372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private EnumC1295a f104373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f104374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f104375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f104376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f104377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f104378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f104379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f104380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f104381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f104382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private c f104383n;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a.a$a, reason: collision with other inner class name */
    public enum EnumC1295a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f104392h;

        EnumC1295a(int i10) {
            this.f104392h = i10;
        }
    }

    public interface b {
        void a();
    }

    final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }

        /* synthetic */ c(a aVar, byte b10) {
            this();
        }
    }

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private static void a(EnumC1295a enumC1295a, int i10, Rect rect, Rect rect2) {
        Gravity.apply(enumC1295a.f104392h, i10, i10, rect, rect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z10) {
        if (z10 == a()) {
            return;
        }
        this.f104370a.setState(z10 ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.f104379j);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f104377h) {
            this.f104377h = false;
            this.f104378i.set(0, 0, getWidth(), getHeight());
            a(this.f104373d, this.f104378i, this.f104379j);
            this.f104381l.set(this.f104379j);
            Rect rect = this.f104381l;
            int i10 = this.f104376g;
            rect.inset(i10, i10);
            a(this.f104373d, this.f104375f, this.f104381l, this.f104380k);
            this.f104370a.setBounds(this.f104380k);
        }
        if (this.f104370a.isVisible()) {
            this.f104370a.draw(canvas);
        }
    }

    @VisibleForTesting
    final Rect getCloseBounds() {
        return this.f104379j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f104377h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        byte b10 = 0;
        if (!a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f104371b) || (!this.f104382m && !this.f104370a.isVisible())) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setClosePressed(true);
        } else if (action != 1) {
            if (action == 3) {
                setClosePressed(false);
            }
        } else if (a()) {
            if (this.f104383n == null) {
                this.f104383n = new c(this, b10);
            }
            postDelayed(this.f104383n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            b bVar = this.f104372c;
            if (bVar != null) {
                bVar.a();
            }
        }
        return true;
    }

    public final void setCloseAlwaysInteractable(boolean z10) {
        this.f104382m = z10;
    }

    @VisibleForTesting
    final void setCloseBoundChanged(boolean z10) {
        this.f104377h = z10;
    }

    @VisibleForTesting
    final void setCloseBounds(Rect rect) {
        this.f104379j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC1295a enumC1295a) {
        this.f104373d = enumC1295a;
        this.f104377h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z10) {
        if (this.f104370a.setVisible(z10, false)) {
            invalidate(this.f104379j);
        }
    }

    public final void setOnCloseListener(@Nullable b bVar) {
        this.f104372c = bVar;
    }

    private a(@NonNull Context context, byte b10) {
        super(context, null, 0);
        this.f104378i = new Rect();
        this.f104379j = new Rect();
        this.f104380k = new Rect();
        this.f104381l = new Rect();
        Drawable drawableA = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.f104370a = drawableA;
        this.f104373d = EnumC1295a.TOP_RIGHT;
        drawableA.setState(FrameLayout.EMPTY_STATE_SET);
        drawableA.setCallback(this);
        this.f104371b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f104374e = e.a(context, 50);
        this.f104375f = e.a(context, 30);
        this.f104376g = e.a(context, 8);
        setWillNotDraw(false);
        this.f104382m = true;
    }

    public final void a(EnumC1295a enumC1295a, Rect rect, Rect rect2) {
        a(enumC1295a, this.f104374e, rect, rect2);
    }

    @VisibleForTesting
    private boolean a() {
        return this.f104370a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @VisibleForTesting
    private boolean a(int i10, int i11, int i12) {
        Rect rect = this.f104379j;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }
}
