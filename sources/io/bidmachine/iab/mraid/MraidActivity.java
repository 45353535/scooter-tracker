package io.bidmachine.iab.mraid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes12.dex */
public class MraidActivity extends io.bidmachine.rendering.internal.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SparseArray f80134e = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f80135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f80136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80137d = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80138a;

        static {
            int[] iArr = new int[q.values().length];
            f80138a = iArr;
            try {
                iArr[q.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80138a[q.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80138a[q.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Intent e(Context context, q qVar, int i10) {
        Intent intentA = ic.d.a(context, MraidActivity.class);
        intentA.putExtra("InterstitialId", i10);
        intentA.putExtra("InterstitialType", qVar);
        return intentA;
    }

    private static void f(f fVar) {
        f80134e.put(fVar.f80219a, fVar);
    }

    private static void g(Integer num) {
        if (num == null) {
            return;
        }
        f80134e.remove(num.intValue());
    }

    private void h() {
        g(this.f80135b);
    }

    public static void i(Context context, f fVar, q qVar) {
        if (fVar == null) {
            i.d("MraidActivity", "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            i.d("MraidActivity", "Context is null during showing MraidActivity", new Object[0]);
            fVar.k(y8.b.h("Context is null during showing MraidActivity"));
            return;
        }
        if (qVar == null) {
            i.d("MraidActivity", "MraidType is null during showing MraidActivity", new Object[0]);
            fVar.k(y8.b.h("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            f(fVar);
            context.startActivity(e(context, qVar, fVar.f80219a));
        } catch (Throwable th2) {
            i.e("Exception during showing MraidActivity", th2);
            fVar.k(y8.b.j("Exception during showing MraidActivity", th2));
            g(Integer.valueOf(fVar.f80219a));
        }
    }

    @Override // io.bidmachine.rendering.internal.a
    protected void b() {
        if (this.f80137d) {
            f fVar = this.f80136c;
            if (fVar != null) {
                fVar.o();
            } else {
                pd.b0.a(this);
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            i.d("MraidActivity", "Mraid display cache id not provided", new Object[0]);
            pd.b0.a(this);
            return;
        }
        int intExtra = getIntent().getIntExtra("InterstitialId", 0);
        this.f80135b = Integer.valueOf(intExtra);
        f fVar = (f) f80134e.get(intExtra);
        this.f80136c = fVar;
        if (fVar == null) {
            i.d("MraidActivity", "Mraid interstitial not found in display cache, id=%s", this.f80135b);
            pd.b0.a(this);
            return;
        }
        q qVar = (q) getIntent().getSerializableExtra("InterstitialType");
        if (qVar == null) {
            i.d("MraidActivity", "MraidType is null", new Object[0]);
            pd.b0.a(this);
            this.f80136c.k(y8.b.f("MraidType is null"));
            return;
        }
        b9.u.g(this);
        int i10 = a.f80138a[qVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f80137d = true;
        } else if (i10 == 3) {
            this.f80137d = false;
        }
        try {
            this.f80136c.e(this, false);
        } catch (Exception e10) {
            i.e("Exception during showing MraidInterstial in MraidActivity", e10);
            pd.b0.a(this);
            this.f80136c.k(y8.b.j("Exception during showing MraidInterstial in MraidActivity", e10));
            h();
        }
        b9.u.i(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f80136c == null || isChangingConfigurations()) {
            return;
        }
        this.f80136c.g();
        h();
    }
}
