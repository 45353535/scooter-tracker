package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class R2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2 f37628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ya f37629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3673e5 f37631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f37632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3699f5 f37633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f37635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f37636j;

    public R2(String urlToLoad, P2 p22, Context context, Rh rh2, InterfaceC3911nh redirectionValidator, Ya ya2, String api) {
        Intrinsics.checkNotNullParameter(urlToLoad, "urlToLoad");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f37627a = urlToLoad;
        this.f37628b = p22;
        this.f37629c = ya2;
        this.f37630d = api;
        C3673e5 c3673e5 = new C3673e5();
        this.f37631e = c3673e5;
        this.f37633g = new C3699f5(rh2, ya2);
        this.f37635i = new WeakReference(rh2);
        this.f37636j = new WeakReference(redirectionValidator);
        Intrinsics.checkNotNullParameter(this, "connectionCallback");
        c3673e5.f38500c = this;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f37632f = applicationContext;
        Ji.a(context, this);
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession customTabsSessionNewSession;
        P2 p22 = this.f37628b;
        if (p22 != null) {
            try {
                builder = a(p22);
            } catch (Error e10) {
                e10.getMessage();
                C3673e5 c3673e5 = this.f37631e;
                CustomTabsSession customTabsSession = c3673e5.f38501d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = c3673e5.f38498a;
                    customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C3648d5(c3673e5)) : null;
                    c3673e5.f38501d = customTabsSessionNewSession;
                    customTabsSession = customTabsSessionNewSession;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            C3673e5 c3673e52 = this.f37631e;
            CustomTabsSession customTabsSession2 = c3673e52.f38501d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = c3673e52.f38498a;
                customTabsSessionNewSession = customTabsClient2 != null ? customTabsClient2.newSession(new C3648d5(c3673e52)) : null;
                c3673e52.f38501d = customTabsSessionNewSession;
                customTabsSession2 = customTabsSessionNewSession;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        Context context = this.f37632f;
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        Rh rh2 = (Rh) this.f37635i.get();
        Ya ya2 = this.f37629c;
        Object obj = this.f37636j.get();
        Intrinsics.checkNotNull(obj);
        AbstractC3596b5.a(context, customTabsIntentBuild, uri, rh2, ya2, (InterfaceC3911nh) obj, this.f37630d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3673e5 c3673e5 = this.f37631e;
        Context context = this.f37632f;
        c3673e5.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        C3622c5 c3622c5 = c3673e5.f38499b;
        if (c3622c5 != null) {
            context.unbindService(c3622c5);
            c3673e5.f38498a = null;
        }
        c3673e5.f38499b = null;
        c3673e5.f38500c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final CustomTabsIntent.Builder a(P2 p22) {
        Bitmap bitmap;
        C3673e5 c3673e5 = this.f37631e;
        CustomTabsSession customTabsSessionNewSession = c3673e5.f38501d;
        if (customTabsSessionNewSession == null) {
            CustomTabsClient customTabsClient = c3673e5.f38498a;
            customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C3648d5(c3673e5)) : null;
            c3673e5.f38501d = customTabsSessionNewSession;
        }
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder(customTabsSessionNewSession).setCloseButtonPosition(2);
        Intrinsics.checkNotNullExpressionValue(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            Intrinsics.checkNotNull(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (Error e10) {
            e10.getMessage();
        }
        if (p22.f37517b) {
            Context context = this.f37632f;
            int i10 = R.drawable.im_close_transparent;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i10);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        L5 l5H = J5.h();
        Df dfA = Ef.a(J5.g());
        if (dfA != Df.f36735b && dfA != Df.f36737d) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (l5H.f37266b * p22.f37516a)) * l5H.f37267c), 2);
        } else {
            int i11 = (int) (l5H.f37265a * p22.f37516a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i11 * l5H.f37267c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i11);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        Rh rh2 = (Rh) this.f37635i.get();
        if (rh2 != null) {
            InterfaceC3878m9 interfaceC3878m9 = rh2.f37672a.f38368i;
            if (interfaceC3878m9 != null) {
                String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((C3903n9) interfaceC3878m9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = rh2.f37672a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", F3.a(i10));
            jSONObject2.put("top", F3.a(i11));
            jSONObject2.put("right", F3.a(i12));
            jSONObject2.put("bottom", F3.a(i13));
            jSONObject2.put("state", i14);
            Unit unit = Unit.f93236a;
            jSONObject.put("layout", jSONObject2);
            gestureDetectorOnGestureListenerC3635ci.b(jSONObject);
        }
    }
}
