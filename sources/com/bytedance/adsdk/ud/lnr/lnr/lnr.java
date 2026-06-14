package com.bytedance.adsdk.ud.lnr.lnr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ud.aaj;
import com.bytedance.adsdk.ud.to;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mml {
    private String fs;
    private LinearLayout jpc;
    private final List<TextView> rq;
    private final List<String> to;
    private final LinearLayout.LayoutParams tvp;

    public lnr(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar, Context context) {
        List<to.qdl> listLnr;
        super(tvpVar, mzzVar);
        this.tvp = new LinearLayout.LayoutParams(-2, -2);
        this.to = new ArrayList();
        this.rq = new ArrayList();
        com.bytedance.adsdk.ud.to toVar = ((mml) this).f15996wd;
        if (toVar == null || (listLnr = toVar.lnr()) == null || listLnr.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.jpc = linearLayout;
        int i10 = 0;
        linearLayout.setOrientation(0);
        ud(listLnr.get(0).f16119wd);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.jpc.addView(linearLayout2);
        List<String> listFs = fs();
        while (i10 < listLnr.size()) {
            to.qdl qdlVar = listLnr.get(i10);
            TextView textView = new TextView(context);
            qdl(textView, qdlVar, (listFs == null || i10 >= listFs.size()) ? "" : listFs.get(i10));
            int i11 = qdlVar.mo;
            if (i11 != 0) {
                this.tvp.bottomMargin = (int) (i11 * com.bytedance.adsdk.ud.mo.mo.qdl());
                linearLayout2.addView(textView, this.tvp);
            } else {
                linearLayout2.addView(textView);
            }
            i10++;
        }
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        qdl(this.jpc, (int) (((mml) this).f15996wd.qdl() * fQdl), (int) (((mml) this).f15996wd.ud() * fQdl));
    }

    private List<String> fs() {
        com.bytedance.adsdk.ud.tvp tvpVar;
        aaj aajVarBch;
        List<to.qdl> listLnr;
        if (((mml) this).f15996wd == null || (tvpVar = this.f16004ud) == null || (aajVarBch = tvpVar.bch()) == null) {
            return null;
        }
        String strMml = ((mml) this).f15996wd.mml();
        if ((!TextUtils.isEmpty(strMml) || !TextUtils.isEmpty(this.fs)) && (listLnr = ((mml) this).f15996wd.lnr()) != null) {
            String strQdl = this.fs;
            if (TextUtils.isEmpty(strQdl)) {
                strQdl = aajVarBch.qdl(strMml);
            }
            if (!TextUtils.isEmpty(strQdl)) {
                int length = strQdl.length();
                this.to.clear();
                for (int i10 = 0; i10 < listLnr.size(); i10++) {
                    to.qdl qdlVar = listLnr.get(i10);
                    int iMax = qdlVar.qdl;
                    int iMax2 = qdlVar.f16118ud;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.to.add("");
                    } else {
                        if (listLnr.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.to.add(strQdl.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.to;
            }
        }
        return null;
    }

    private void lnr(float f10) {
        List<to.qdl> listLnr;
        com.bytedance.adsdk.ud.to toVar = ((mml) this).f15996wd;
        if (toVar == null || (listLnr = toVar.lnr()) == null || listLnr.size() <= 0) {
            return;
        }
        this.jpc.setOrientation(0);
        this.jpc.setGravity(17);
        if (this.jpc.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.jpc.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.jpc.removeAllViews();
        if (linearLayout.getChildCount() != listLnr.size()) {
            return;
        }
        List<String> listFs = fs();
        this.rq.clear();
        int i10 = 0;
        while (i10 < listLnr.size()) {
            to.qdl qdlVar = listLnr.get(i10);
            TextView textView = (TextView) linearLayout.getChildAt(i10);
            this.rq.add(textView);
            qdl(textView, qdlVar, (listFs == null || i10 >= listFs.size()) ? "" : listFs.get(i10));
            i10++;
        }
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < listLnr.size(); i11++) {
            to.qdl qdlVar2 = listLnr.get(i11);
            TextView textView2 = this.rq.get(i11);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i12 = qdlVar2.mo;
            if (i12 != 0) {
                this.tvp.bottomMargin = (int) (i12 * com.bytedance.adsdk.ud.mo.mo.qdl());
                linearLayout.addView(textView2, this.tvp);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.jpc.setAlpha(f10);
        this.jpc.addView(linearLayout);
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        qdl(this.jpc, (int) (((mml) this).f15996wd.qdl() * fQdl), (int) (((mml) this).f15996wd.ud() * fQdl));
    }

    private void qdl(TextView textView, to.qdl qdlVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(qdlVar.lnr)) {
            textView.setTextColor(Color.parseColor(qdlVar.lnr));
        }
        if (!TextUtils.isEmpty(qdlVar.mml)) {
            textView.setBackgroundColor(Color.parseColor(qdlVar.mml));
        }
        textView.setGravity(17);
        textView.setTextSize(qdlVar.mzz);
    }

    private void ud(String str) {
        if (TextUtils.isEmpty(str)) {
            this.jpc.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals("left")) {
            this.jpc.setGravity(3);
        } else if (str.equals("right")) {
            this.jpc.setGravity(5);
        } else {
            this.jpc.setGravity(17);
        }
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.mml, com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        if (this.jpc != null) {
            canvas.save();
            canvas.concat(matrix);
            qdl(i10);
            lnr(mo());
            this.jpc.draw(canvas);
            canvas.restore();
            return;
        }
        super.ud(canvas, matrix, i10);
    }

    private static void qdl(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void qdl(String str) {
        this.fs = str;
    }
}
