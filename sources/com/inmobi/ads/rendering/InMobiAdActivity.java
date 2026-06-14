package com.inmobi.ads.rendering;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.webkit.Profile;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.B;
import com.inmobi.media.C;
import com.inmobi.media.C3799j5;
import com.inmobi.media.C3903n9;
import com.inmobi.media.C4000r7;
import com.inmobi.media.C4148x5;
import com.inmobi.media.F3;
import com.inmobi.media.Ff;
import com.inmobi.media.GestureDetectorOnGestureListenerC3635ci;
import com.inmobi.media.InterfaceC3878m9;
import com.inmobi.media.J5;
import com.inmobi.media.M8;
import com.inmobi.media.Mh;
import com.inmobi.media.O8;
import com.inmobi.media.Q5;
import com.inmobi.media.Q8;
import com.inmobi.media.U5;
import com.inmobi.media.V5;
import com.inmobi.media.Vh;
import com.inmobi.media.xo;
import com.ironsource.C4240b4;
import com.ironsource.Df;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/P8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class InMobiAdActivity extends Activity {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseArray f36523k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC3635ci f36524l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8 f36525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M8 f36526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3635ci f36527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3878m9 f36532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xo f36533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnBackInvokedCallback f36534j;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.b();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = inMobiAdActivity.f36527c;
        if (gestureDetectorOnGestureListenerC3635ci != null && (u52 = gestureDetectorOnGestureListenerC3635ci.D0) != null) {
            U5.a(u52, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = inMobiAdActivity.f36527c;
        if (gestureDetectorOnGestureListenerC3635ci2 != null) {
            gestureDetectorOnGestureListenerC3635ci2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = inMobiAdActivity.f36527c;
        if (gestureDetectorOnGestureListenerC3635ci == null || !gestureDetectorOnGestureListenerC3635ci.canGoBack()) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = inMobiAdActivity.f36527c;
            if (gestureDetectorOnGestureListenerC3635ci2 != null && (u52 = gestureDetectorOnGestureListenerC3635ci2.D0) != null) {
                U5.a(u52, 5, true, null, 12);
            }
            inMobiAdActivity.f36529e = true;
            inMobiAdActivity.a();
        } else {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci3 = inMobiAdActivity.f36527c;
            if (gestureDetectorOnGestureListenerC3635ci3 != null) {
                gestureDetectorOnGestureListenerC3635ci3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = inMobiAdActivity.f36527c;
        if (gestureDetectorOnGestureListenerC3635ci2 != null && gestureDetectorOnGestureListenerC3635ci2.canGoForward() && (gestureDetectorOnGestureListenerC3635ci = inMobiAdActivity.f36527c) != null) {
            gestureDetectorOnGestureListenerC3635ci.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        O8 o82 = this.f36525a;
        if (o82 != null) {
            o82.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x013d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
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
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        M8 m82;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        U5 u52;
        B fullScreenEventsListener;
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onDestroy");
        }
        int i10 = this.f36528d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = f36524l;
            if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                gestureDetectorOnGestureListenerC3635ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onClose"));
            }
        } else if (102 == i10 && (m82 = this.f36526b) != null && m82.f37351e != null) {
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            m82.a(Mh.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.f36529e) {
            int i11 = this.f36528d;
            if (100 == i11) {
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci3 = this.f36527c;
                if (gestureDetectorOnGestureListenerC3635ci3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3635ci3.getFullScreenEventsListener()) != null) {
                    try {
                        Vh vh2 = (Vh) fullScreenEventsListener;
                        InterfaceC3878m9 interfaceC3878m92 = vh2.f37915a.f38368i;
                        if (interfaceC3878m92 != null) {
                            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                            ((C3903n9) interfaceC3878m92).a(str, Df.f40652m);
                        }
                        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, vh2.f37915a.getViewState())) {
                            vh2.f37915a.setAndUpdateViewState("Hidden");
                        }
                        vh2.f37915a.W();
                        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci4 = this.f36527c;
                        Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC3635ci4);
                        gestureDetectorOnGestureListenerC3635ci4.b();
                        O8 o82 = this.f36525a;
                        if (o82 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                            o82 = null;
                        }
                        GestureDetectorOnGestureListenerC3635ci orientationListener = this.f36527c;
                        Intrinsics.checkNotNull(orientationListener);
                        o82.getClass();
                        Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                        o82.f37484b.remove(orientationListener);
                        o82.a();
                        this.f36527c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i11) {
                M8 orientationListener2 = this.f36526b;
                if (orientationListener2 != null) {
                    O8 o83 = this.f36525a;
                    if (o83 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        o83 = null;
                    }
                    o83.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
                    o83.f37484b.remove(orientationListener2);
                    o83.a();
                    C4000r7 c4000r7 = orientationListener2.f37349c;
                    if (c4000r7 != null) {
                        c4000r7.b();
                    }
                    RelativeLayout relativeLayout = orientationListener2.f37350d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Q5 q52 = orientationListener2.f37351e;
                    if (q52 != null) {
                        V5 v52 = q52.f37575c;
                        if (v52 != null) {
                            v52.destroy();
                        }
                        q52.f37575c = null;
                        q52.f37576d = null;
                        q52.f37577e = null;
                        xo xoVar = q52.f37579g;
                        if (xoVar != null) {
                            xoVar.a();
                        }
                        q52.removeAllViews();
                    }
                    orientationListener2.f37347a.clear();
                    orientationListener2.f37348b = null;
                    orientationListener2.f37349c = null;
                    orientationListener2.f37350d = null;
                    orientationListener2.f37351e = null;
                }
                this.f36526b = null;
            }
        } else {
            int i12 = this.f36528d;
            if (100 != i12 && 102 == i12) {
                M8 orientationListener3 = this.f36526b;
                if (orientationListener3 != null) {
                    O8 o84 = this.f36525a;
                    if (o84 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        o84 = null;
                    }
                    o84.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener3, "orientationListener");
                    o84.f37484b.remove(orientationListener3);
                    o84.a();
                    C4000r7 c4000r72 = orientationListener3.f37349c;
                    if (c4000r72 != null) {
                        c4000r72.b();
                    }
                    RelativeLayout relativeLayout2 = orientationListener3.f37350d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Q5 q53 = orientationListener3.f37351e;
                    if (q53 != null) {
                        V5 v53 = q53.f37575c;
                        if (v53 != null) {
                            v53.destroy();
                        }
                        q53.f37575c = null;
                        q53.f37576d = null;
                        q53.f37577e = null;
                        xo xoVar2 = q53.f37579g;
                        if (xoVar2 != null) {
                            xoVar2.a();
                        }
                        q53.removeAllViews();
                    }
                    orientationListener3.f37347a.clear();
                    orientationListener3.f37348b = null;
                    orientationListener3.f37349c = null;
                    orientationListener3.f37350d = null;
                    orientationListener3.f37351e = null;
                }
                this.f36526b = null;
            }
            if (100 == this.f36528d && (gestureDetectorOnGestureListenerC3635ci = this.f36527c) != null && (u52 = gestureDetectorOnGestureListenerC3635ci.D0) != null) {
                U5.a(u52, 9, true, null, 12);
            }
        }
        xo xoVar3 = this.f36533i;
        if (xoVar3 != null) {
            xoVar3.a();
        }
        this.f36533i = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        M8 m82;
        O8 o82;
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (m82 = this.f36526b) == null) {
            return;
        }
        C c10 = m82.f37348b;
        Ff orientationProperties = (c10 == null || !(c10 instanceof GestureDetectorOnGestureListenerC3635ci)) ? null : ((GestureDetectorOnGestureListenerC3635ci) c10).getOrientationProperties();
        if (orientationProperties == null || (o82 = this.f36525a) == null) {
            return;
        }
        o82.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f36530f = false;
        this.f36527c = null;
        setIntent(intent);
        M8 m82 = this.f36526b;
        if (m82 != null) {
            SparseArray adContainers = f36523k;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(adContainers, "adContainers");
            m82.a(intent, adContainers);
            C4000r7 c4000r7 = m82.f37349c;
            if (c4000r7 != null) {
                c4000r7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        M8 m82;
        super.onPause();
        int i10 = this.f36528d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = f36524l;
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                gestureDetectorOnGestureListenerC3635ci.c(Mh.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i10 || (m82 = this.f36526b) == null || m82.f37351e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
        m82.a(Mh.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        C4000r7 c4000r7;
        B fullScreenEventsListener;
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", C4240b4.i.f42655u0);
        }
        super.onResume();
        if (this.f36529e) {
            return;
        }
        int i10 = this.f36528d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f36527c;
            if (gestureDetectorOnGestureListenerC3635ci != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3635ci.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f36530f) {
                        this.f36530f = true;
                        ((Vh) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = f36524l;
            if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                gestureDetectorOnGestureListenerC3635ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i10) {
            M8 m82 = this.f36526b;
            if (m82 != null && (c4000r7 = m82.f37349c) != null && !c4000r7.f39453h) {
                try {
                    c4000r7.f39453h = true;
                    B fullScreenEventsListener2 = c4000r7.f39451f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((Vh) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            M8 m83 = this.f36526b;
            if (m83 == null || m83.f37351e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            m83.a(Mh.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        M8 m82;
        Window window;
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        C4148x5.f39893a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.f36534j == null) {
                this.f36534j = new OnBackInvokedCallback() { // from class: v3.f
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(this.f105737a);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f36534j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f36529e || 102 != this.f36528d || (m82 = this.f36526b) == null) {
            return;
        }
        C4000r7 c4000r7 = m82.f37349c;
        if (c4000r7 != null) {
            c4000r7.e();
        }
        C c10 = m82.f37348b;
        if (c10 != null) {
            if ((c10 instanceof GestureDetectorOnGestureListenerC3635ci ? ((GestureDetectorOnGestureListenerC3635ci) c10).W0 : false) && !C4148x5.r() && C4148x5.u()) {
                Object obj = m82.f37347a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        C4148x5.f39893a.getClass();
        if (Build.VERSION.SDK_INT < 33 || this.f36534j == null) {
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        OnBackInvokedCallback onBackInvokedCallback = this.f36534j;
        if (onBackInvokedCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
            onBackInvokedCallback = null;
        }
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public final void a(RelativeLayout relativeLayout) {
        float f10 = J5.d().f37267c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        linearLayout.setOrientation(0);
        linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (F3.a(this)) {
            xo xoVar = this.f36533i;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f36533i = new xo(this, new Q8(layoutParams), this.f36532h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        C3799j5 c3799j5 = new C3799j5(this, (byte) 2, this.f36532h);
        c3799j5.setOnTouchListener(new View.OnTouchListener() { // from class: v3.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(this.f105733b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j5, layoutParams2);
        C3799j5 c3799j52 = new C3799j5(this, (byte) 3, this.f36532h);
        c3799j52.setOnTouchListener(new View.OnTouchListener() { // from class: v3.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(this.f105734b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j52, layoutParams2);
        C3799j5 c3799j53 = new C3799j5(this, (byte) 4, this.f36532h);
        c3799j53.setOnTouchListener(new View.OnTouchListener() { // from class: v3.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(this.f105735b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j53, layoutParams2);
        C3799j5 c3799j54 = new C3799j5(this, (byte) 6, this.f36532h);
        c3799j54.setOnTouchListener(new View.OnTouchListener() { // from class: v3.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(this.f105736b, view, motionEvent);
            }
        });
        linearLayout.addView(c3799j54, layoutParams2);
    }

    public final void b() {
        U5 u52;
        C4000r7 c4000r7;
        InterfaceC3878m9 interfaceC3878m9 = this.f36532h;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C3903n9) interfaceC3878m9).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f36528d;
        if (i10 == 102) {
            InterfaceC3878m9 interfaceC3878m92 = this.f36532h;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C3903n9) interfaceC3878m92).c("InMobiAdActivity", "back pressed on ad");
            }
            M8 m82 = this.f36526b;
            if (m82 == null || (c4000r7 = m82.f37349c) == null) {
                return;
            }
            c4000r7.a();
            return;
        }
        if (i10 == 100) {
            InterfaceC3878m9 interfaceC3878m93 = this.f36532h;
            if (interfaceC3878m93 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C3903n9) interfaceC3878m93).c("InMobiAdActivity", "back pressed in browser");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f36527c;
            if (gestureDetectorOnGestureListenerC3635ci != null && (u52 = gestureDetectorOnGestureListenerC3635ci.D0) != null) {
                U5.a(u52, 7, true, null, 12);
            }
            this.f36529e = true;
            a();
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z10, newConfig);
        onMultiWindowModeChanged(z10);
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = inMobiAdActivity.f36527c;
            if (gestureDetectorOnGestureListenerC3635ci != null && (u52 = gestureDetectorOnGestureListenerC3635ci.D0) != null) {
                U5.a(u52, 5, true, null, 12);
            }
            inMobiAdActivity.f36529e = true;
            inMobiAdActivity.a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        if (isTaskRoot()) {
            C4148x5.f39893a.getClass();
            if (C4148x5.v()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }
}
