package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
public class MraidActivity extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SparseArray f18003e = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f18004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f18005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18006d = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18007a;

        static {
            int[] iArr = new int[i.values().length];
            f18007a = iArr;
            try {
                iArr[i.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18007a[i.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18007a[i.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static Intent a(Context context, i iVar, int i10) {
        Intent intentB = b(context, MraidActivity.class, iVar, i10);
        intentB.addFlags(268435456);
        intentB.addFlags(8388608);
        return intentB;
    }

    static Intent b(Context context, Class cls, i iVar, int i10) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("InterstitialId", i10);
        intent.putExtra("InterstitialType", iVar);
        return intent;
    }

    private void c() {
        b bVar = this.f18005c;
        if (bVar != null) {
            bVar.m();
            this.f18005c = null;
        }
        e(this.f18004b);
    }

    static void d(b bVar) {
        f18003e.put(bVar.f18051a, bVar);
    }

    static void e(Integer num) {
        if (num != null) {
            f18003e.remove(num.intValue());
        }
    }

    public static void h(Context context, b bVar, i iVar) {
        if (bVar == null) {
            d.d("MraidActivity", "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            d.d("MraidActivity", "Context is null during showing MraidActivity", new Object[0]);
            bVar.k(b2.b.h("Context is null during showing MraidActivity"));
            return;
        }
        if (iVar == null) {
            d.d("MraidActivity", "MraidType is null during showing MraidActivity", new Object[0]);
            bVar.k(b2.b.h("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            d(bVar);
            context.startActivity(a(context, iVar, bVar.f18051a));
        } catch (Throwable th2) {
            d.b("Exception during showing MraidActivity", th2);
            bVar.k(b2.b.j("Exception during showing MraidActivity", th2));
            e(Integer.valueOf(bVar.f18051a));
        }
    }

    public void f(Window window) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
    }

    public void g() {
        e2.g.f(this);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f18006d) {
            b bVar = this.f18005c;
            if (bVar != null) {
                bVar.n();
            } else {
                e2.g.l(this);
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        f(getWindow());
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            d.d("MraidActivity", "Mraid display cache id not provided", new Object[0]);
            e2.g.l(this);
            return;
        }
        int intExtra = getIntent().getIntExtra("InterstitialId", 0);
        this.f18004b = Integer.valueOf(intExtra);
        b bVar = (b) f18003e.get(intExtra);
        this.f18005c = bVar;
        if (bVar == null) {
            d.d("MraidActivity", "Mraid interstitial not found in display cache, id=%s", this.f18004b);
            e2.g.l(this);
            return;
        }
        i iVar = (i) getIntent().getSerializableExtra("InterstitialType");
        if (iVar == null) {
            d.d("MraidActivity", "MraidType is null", new Object[0]);
            e2.g.l(this);
            this.f18005c.k(b2.b.f("MraidType is null"));
            return;
        }
        g();
        int i10 = a.f18007a[iVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f18006d = true;
        } else if (i10 == 3) {
            this.f18006d = false;
        }
        try {
            this.f18005c.e(this, false);
        } catch (Exception e10) {
            d.b("Exception during showing MraidInterstial in MraidActivity", e10);
            e2.g.l(this);
            this.f18005c.k(b2.b.j("Exception during showing MraidInterstial in MraidActivity", e10));
            c();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f18005c == null || isChangingConfigurations()) {
            return;
        }
        this.f18005c.h();
        c();
    }
}
