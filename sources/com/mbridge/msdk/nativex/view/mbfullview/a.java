package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f49980b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f49981a;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a, reason: collision with other inner class name */
    class RunnableC0545a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseView f49982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f49983b;

        RunnableC0545a(BaseView baseView, boolean z10) {
            this.f49982a = baseView;
            this.f49983b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49982a.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            this.f49982a.getmAnimationPlayer().getBackground().setAlpha(this.f49983b ? 200 : 255);
            a.this.a(this.f49982a.getmAnimationPlayer());
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49985a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f49985a = iArr;
            try {
                iArr[BaseView.a.FULL_TOP_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49985a[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private class c implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MBridgeTopFullView> f49986a;

        public c(MBridgeTopFullView mBridgeTopFullView) {
            this.f49986a = new WeakReference<>(mBridgeTopFullView);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f49986a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f49986a.get().getMBridgeFullViewDisplayIcon().setImageBitmap(a.this.a(bitmap, 25));
        }
    }

    private a(Context context) {
        this.f49981a = new WeakReference<>(context);
    }

    public void b(boolean z10, boolean z11, BaseView baseView) {
        if (z11) {
            new Handler().postDelayed(new RunnableC0545a(baseView, z10), 1000L);
        }
    }

    public static a a(Context context) {
        if (f49980b == null) {
            synchronized (a.class) {
                try {
                    if (f49980b == null) {
                        f49980b = new a(context);
                    }
                } finally {
                }
            }
        }
        return f49980b;
    }

    public void a(BaseView.a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i10 = b.f49985a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            return;
        }
        MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
        if (mBridgeTopFullView != null) {
            Context context = this.f49981a.get();
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).a(campaignEx.getIconUrl(), new c(mBridgeTopFullView));
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
            mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
        }
    }

    public void a(boolean z10, BaseView baseView) {
        if (baseView instanceof MBridgeTopFullView) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            int i10 = z10 ? 0 : 8;
            mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i10);
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i10);
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i10);
            mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i10);
        }
    }

    public void a(boolean z10, BaseView baseView, int i10) {
        RelativeLayout.LayoutParams layoutParams;
        Context context = this.f49981a.get();
        if (context != null) {
            if (z10) {
                layoutParams = new RelativeLayout.LayoutParams((int) (a(z10) / 3.0f), v0.a(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = v0.a(context, 10.0f);
                layoutParams.rightMargin = (f.a(context) && i10 == 0) ? v0.c(context) + v0.a(context, 8.0f) : v0.a(context, 8.0f);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    private float a(boolean z10) {
        try {
            Context context = this.f49981a.get();
            if (context == null) {
                return 0.0f;
            }
            float fI = v0.i(context);
            return z10 ? fI + v0.c(context) : fI;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0.0f;
        }
    }

    public void a(boolean z10, boolean z11, BaseView baseView) {
        int color = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(color);
        Context context = this.f49981a.get();
        if (!z10) {
            if (baseView.style == BaseView.a.FULL_MIDDLE_VIEW) {
                b(z10, z11, baseView);
                return;
            } else {
                if (context != null) {
                    baseView.getmAnimationContent().setBackgroundResource(i0.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    baseView.getmAnimationPlayer().setBackgroundResource(i0.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    return;
                }
                return;
            }
        }
        if (baseView.style == BaseView.a.FULL_TOP_VIEW && context != null) {
            baseView.getmAnimationContent().setBackgroundResource(i0.a(context, "mbridge_nativex_fullview_background", "drawable"));
            baseView.getmAnimationPlayer().setBackgroundColor(color);
        }
        if (z11) {
            baseView.getmAnimationPlayer().getBackground().setAlpha(80);
        } else {
            baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            baseView.getmAnimationPlayer().getBackground().setAlpha(200);
        }
        b(z10, z11, baseView);
    }

    public void a(BaseView baseView) {
        baseView.getmAnimationPlayer().clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(1);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Bitmap bitmap, int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f10 = i10;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public void a(View view, BaseView baseView) {
        if (view == null || baseView == null) {
            return;
        }
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        baseView.f49972i.addView(view);
    }

    public void a(BaseView baseView, boolean z10) {
        if (baseView != null) {
            baseView.setSystemUiVisibility(z10 ? 0 : InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }
}
