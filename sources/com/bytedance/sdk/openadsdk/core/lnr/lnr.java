package com.bytedance.sdk.openadsdk.core.lnr;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr implements View.OnClickListener, View.OnTouchListener {
    private static float lnr = 0.0f;
    private static float mml = 0.0f;
    private static long mzz = 0;
    private static float qdl = 0.0f;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static float f17293ud = 0.0f;
    protected static int vu = 8;
    protected View kdv;
    protected float aaj = -1.0f;
    protected float jyq = -1.0f;
    protected float oth = -1.0f;
    protected float ljh = -1.0f;
    protected long bch = -1;
    protected long uw = -1;
    protected int xmv = -1;
    protected int bqt = -1024;
    protected int koa = -1;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    protected boolean f17294rc = true;
    public SparseArray<qdl> ekw = new SparseArray<>();
    private int mo = 0;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17295wd = 0;

    public static class qdl {
        public double lnr;
        public long mml;
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public double f17296ud;

        public qdl(int i10, double d10, double d11, long j10) {
            this.qdl = i10;
            this.f17296ud = d10;
            this.lnr = d11;
            this.mml = j10;
        }
    }

    static {
        if (yt.qdl() != null) {
            vu = yt.ud();
        }
        qdl = 0.0f;
        f17293ud = 0.0f;
        lnr = 0.0f;
        mml = 0.0f;
        mzz = 0L;
    }

    private boolean qdl(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (ud.ud(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (qdl(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean mo() {
        return this.f17294rc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            qdl(view, this.aaj, this.jyq, this.oth, this.ljh, this.ekw, this.f17294rc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lnr.lnr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    protected abstract void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<qdl> sparseArray, boolean z10);
}
