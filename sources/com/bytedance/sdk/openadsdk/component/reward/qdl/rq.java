package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private boolean lnr;
    protected int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl f17096ud;

    private static abstract class qdl implements View.OnLayoutChangeListener {
        private int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private int f17097ud;

        private qdl() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.qdl && i19 == this.f17097ud) {
                return;
            }
            this.qdl = i18;
            this.f17097ud = i19;
            qdl(i18, i19);
        }

        abstract void qdl(int i10, int i11);
    }

    public rq(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = 0;
        this.lnr = false;
        this.f17096ud = qdlVar;
        ud();
        try {
            this.qdl = ax.lnr(qdlVar.f17086ag, ax.qdl());
            if (!qdlVar.f17086ag.getWindow().hasFeature(1)) {
                qdlVar.f17086ag.requestWindowFeature(1);
            }
            qdlVar.f17086ag.getWindow().addFlags(16777344);
            if (qdlVar.zlt == 2 || !ax.lnr(qdlVar.f17086ag)) {
                qdlVar.f17086ag.getWindow().addFlags(1024);
            }
            this.lnr = qdlVar.zvv;
            new Throwable();
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f17096ud;
        if (qdlVar.zlt != 2) {
            ud(qdlVar.f17086ag, 1);
        } else if (qdlVar.car) {
            ud(qdlVar.f17086ag, 8);
        } else {
            ud(qdlVar.f17086ag, 0);
        }
    }

    private float mml() {
        return ax.lnr(this.f17096ud.f17086ag, ax.exu(this.f17096ud.f17086ag));
    }

    private float mzz() {
        return ax.lnr(this.f17096ud.f17086ag, ax.fs(this.f17096ud.f17086ag));
    }

    private static boolean qdl(int i10, int i11) {
        return i10 == 2 && i11 == 2;
    }

    private void ud() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f17096ud;
        qdlVar.taz = qdlVar.f17090ud.nv();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f17096ud;
        qdlVar2.zlt = qdl(qdlVar2.f17086ag, qdlVar2.f17090ud);
    }

    private float[] ud(int i10) {
        float fMzz = mzz();
        float fMml = mml();
        int i11 = this.f17096ud.zlt;
        if ((i11 == 1) != (fMzz > fMml)) {
            float f10 = fMzz + fMml;
            fMml = f10 - fMml;
            fMzz = f10 - fMml;
        }
        if (i11 == 1) {
            fMzz -= i10;
        } else {
            fMml -= i10;
        }
        return new float[]{fMml, fMzz};
    }

    public static class ud {
        private qdl qdl;

        public void qdl(Activity activity) {
            Window window;
            if (this.qdl == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.qdl);
            this.qdl = null;
        }

        public void qdl(final Activity activity, final int i10, final float f10, final boolean z10) {
            if (this.qdl == null) {
                try {
                    final boolean z11 = com.bytedance.sdk.openadsdk.core.yt.mml().yh() == 1;
                    final boolean zLnr = ax.lnr(activity);
                    if (zLnr || z11) {
                        try {
                            this.qdl = new qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.ud.1
                                boolean qdl;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void ud() {
                                    try {
                                        int iLnr = rq.lnr(activity, i10);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iLnr == 0) {
                                            int[] iArrUd = rq.ud(activity, decorView, i10, zLnr, z11);
                                            if (iArrUd[4] == 1) {
                                                this.qdl = rq.ud(decorView, iArrUd[0], iArrUd[1], iArrUd[2], iArrUd[3], f10);
                                            }
                                        } else if (this.qdl) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.qdl = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.rq.qdl
                                void qdl(int i11, int i12) {
                                    if (z10) {
                                        ud();
                                    } else {
                                        qdl();
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                private void qdl() {
                                    /*
                                        r8 = this;
                                        int r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 2
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.ax.exu(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                        goto L46
                                    L2d:
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.ax.fs(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                    L46:
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r2.getPaddingLeft()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r2.getPaddingRight()     // Catch: java.lang.Throwable -> Lc4
                                        int r5 = r2.getPaddingBottom()     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != 0) goto Lba
                                        int r0 = r2.getPaddingTop()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r7 = 1
                                        if (r6 != r7) goto L7c
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r7) goto L7c
                                        float r1 = com.bytedance.sdk.openadsdk.utils.ax.qdl()     // Catch: java.lang.Throwable -> Lc4
                                    L79:
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0 + r1
                                        goto La1
                                    L7c:
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        boolean r1 = r5     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto L98
                                        float r1 = com.bytedance.sdk.openadsdk.utils.ax.qdl()     // Catch: java.lang.Throwable -> Lc4
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r3 + r1
                                    L98:
                                        boolean r1 = r6     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto La1
                                        float r1 = com.bytedance.sdk.openadsdk.utils.ax.qdl()     // Catch: java.lang.Throwable -> Lc4
                                        goto L79
                                    La1:
                                        boolean r1 = r2.isAttachedToWindow()     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto Lac
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.qdl = r7     // Catch: java.lang.Throwable -> Lc4
                                    Lac:
                                        float r0 = r7     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 1120403456(0x42c80000, float:100.0)
                                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                        if (r0 != 0) goto Lc4
                                        r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                        r2.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> Lc4
                                        return
                                    Lba:
                                        boolean r0 = r8.qdl     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 == 0) goto Lc4
                                        r0 = 0
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.qdl = r0     // Catch: java.lang.Throwable -> Lc4
                                    Lc4:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.ud.AnonymousClass1.qdl():void");
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.qdl);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lnr(Activity activity, int i10) {
        int i11 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (qdl(i10, i11)) {
            return Math.abs(ax.exu(activity) - decorView.getWidth());
        }
        return Math.abs(ax.fs(activity) - decorView.getHeight());
    }

    public void qdl(koa koaVar) {
        if (koaVar == null) {
            return;
        }
        koaVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = rq.this.f17096ud.f17086ag.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public static int qdl(Activity activity, ljh ljhVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return ljhVar.jb();
    }

    private static void ud(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        int i11 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ud(View view, int i10, int i11, int i12, int i13, float f10) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i10, i11, i12, i13);
        if (f10 != 100.0f) {
            return true;
        }
        view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(boolean r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.qdl(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] ud(Activity activity, View view, int i10, boolean z10, boolean z11) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fQdl;
        int i11 = 0;
        if (activity != null && view != null) {
            int i12 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i10 == 1) {
                if (i12 == 1) {
                    fQdl = ax.qdl();
                    paddingTop2 += (int) fQdl;
                    i11 = 1;
                } else {
                    paddingLeft2 += (int) ax.qdl();
                }
            } else if (i10 == 2) {
                if (i12 == 2) {
                    if (z10) {
                        paddingLeft2 += (int) ax.qdl();
                        i11 = 1;
                    }
                    if (z11) {
                        fQdl = ax.qdl();
                        paddingTop2 += (int) fQdl;
                        i11 = 1;
                    }
                } else {
                    paddingTop2 += (int) ax.qdl();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i11};
        }
        if (view != null) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingLeft = 0;
            paddingBottom = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
    }

    public float[] qdl(int i10) {
        float[] fArrUd = new float[2];
        Activity activity = this.f17096ud.f17086ag;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.lnr && paddingLeft == 0 && paddingTop == 0 && lnr(activity, i10) == 0) {
            int[] iArrUd = ud(activity, decorView, i10, ax.lnr(activity), com.bytedance.sdk.openadsdk.core.yt.mml().yh() == 1);
            int i11 = iArrUd[0];
            paddingTop = iArrUd[1];
            paddingLeft = i11;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35 && this.f17096ud.f17090ud.nv() == 100.0f) {
            fArrUd[0] = decorView.getWidth() - paddingLeft;
            fArrUd[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrUd[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrUd[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrUd[0] = ax.lnr(activity, fArrUd[0]);
        float fLnr = ax.lnr(activity, fArrUd[1]);
        fArrUd[1] = fLnr;
        if (fArrUd[0] < 10.0f || fLnr < 10.0f) {
            fArrUd = ud(this.qdl);
        }
        if (i12 != 26 && i12 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                    if (i10 == 2) {
                        float f10 = fArrUd[0];
                        float f11 = fArrUd[1];
                        if (f10 < f11) {
                            fArrUd[1] = f10;
                            fArrUd[0] = f11;
                        }
                    } else {
                        float f12 = fArrUd[0];
                        float f13 = fArrUd[1];
                        if (f12 > f13) {
                            fArrUd[1] = f12;
                            fArrUd[0] = f13;
                        }
                    }
                }
            }
            float f14 = fArrUd[0];
            float f15 = fArrUd[1];
        }
        return fArrUd;
    }

    public void qdl() {
        ax.qdl(this.f17096ud.f17086ag);
        this.f17096ud.f17086ag.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (rq.this.f17096ud.f17086ag.isFinishing()) {
                            return;
                        }
                        rq.this.f17096ud.f17086ag.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ax.qdl(rq.this.f17096ud.f17086ag);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        aaj.lnr("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }
}
