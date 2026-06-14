package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.C4557tf;
import com.ironsource.Cf;
import com.ironsource.Hf;
import com.ironsource.S8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class TestSuiteActivity extends Activity implements S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f44257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Hf f44258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Cf f44259c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        String strB = new C4557tf().b(this);
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    return new JSONObject(strB);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f44257a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.S8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(this.f44260b);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f44257a = relativeLayout;
        setContentView(relativeLayout, c());
        Hf hf2 = new Hf(this, this, b(), a());
        this.f44258b = hf2;
        Cf cf2 = new Cf(hf2);
        this.f44259c = cf2;
        cf2.d();
        RelativeLayout relativeLayout2 = this.f44257a;
        Hf hf3 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        Hf hf4 = this.f44258b;
        if (hf4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            hf3 = hf4;
        }
        relativeLayout2.addView(hf3.d(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        Cf cf2 = this.f44259c;
        Hf hf2 = null;
        if (cf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            cf2 = null;
        }
        cf2.a();
        RelativeLayout relativeLayout = this.f44257a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Hf hf3 = this.f44258b;
        if (hf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            hf2 = hf3;
        }
        hf2.a();
        super.onDestroy();
    }

    @Override // com.ironsource.S8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(this.f44261b);
            }
        });
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Hf hf2 = this$0.f44258b;
        Hf hf3 = null;
        if (hf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            hf2 = null;
        }
        if (hf2.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f44257a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            Hf hf4 = this$0.f44258b;
            if (hf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                hf4 = null;
            }
            relativeLayout.removeView(hf4.d());
            RelativeLayout relativeLayout2 = this$0.f44257a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            Hf hf5 = this$0.f44258b;
            if (hf5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                hf5 = null;
            }
            relativeLayout2.addView(hf5.c(), this$0.c());
            Hf hf6 = this$0.f44258b;
            if (hf6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                hf3 = hf6;
            }
            hf3.b();
        }
    }
}
