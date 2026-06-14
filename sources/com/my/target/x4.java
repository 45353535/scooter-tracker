package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.views.MediaAdView;

/* JADX INFO: loaded from: classes11.dex */
public class x4 extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61030i = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f61031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f61032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma f61033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f61034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f61035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f61036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageData f61037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageData f61038h;

    public x4(Context context) {
        super(context);
        setBackgroundColor(0);
        kb kbVarE = kb.e(context);
        this.f61035e = kbVarE;
        ma maVar = new ma(context);
        this.f61033c = maVar;
        int i10 = f61030i;
        maVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        maVar.setLayoutParams(layoutParams);
        kb.b(maVar, "image_view");
        addView(maVar);
        y2 y2Var = new y2(context);
        this.f61031a = y2Var;
        y2Var.a(l0.a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.f61032b = layoutParams2;
        layoutParams2.addRule(7, i10);
        layoutParams2.addRule(6, i10);
        y2Var.setLayoutParams(layoutParams2);
        r0 r0Var = new r0(context);
        this.f61034d = r0Var;
        i iVar = new i(context);
        this.f61036f = iVar;
        iVar.setVisibility(8);
        int iB = kbVarE.b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = iB;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(iB, iB, iB, iB);
        layoutParams4.addRule(5, i10);
        layoutParams4.addRule(6, i10);
        linearLayout.setOrientation(0);
        linearLayout.addView(r0Var);
        linearLayout.addView(iVar, layoutParams3);
        kb.b(y2Var, "close_button");
        addView(y2Var);
        kb.b(r0Var, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    public void a(ImageData imageData, ImageData imageData2, ImageData imageData3) {
        this.f61038h = imageData;
        this.f61037g = imageData2;
        Bitmap bitmap = imageData3 != null ? imageData3.getBitmap() : null;
        if (bitmap != null) {
            this.f61031a.a(bitmap, true);
            this.f61032b.leftMargin = -this.f61031a.getMeasuredWidth();
            RelativeLayout.LayoutParams layoutParams = this.f61032b;
            layoutParams.bottomMargin = layoutParams.leftMargin;
        }
        a();
    }

    @NonNull
    public y2 getCloseButton() {
        return this.f61031a;
    }

    @NonNull
    public ImageView getImageView() {
        return this.f61033c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    public void setAgeRestrictions(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            this.f61034d.setVisibility(8);
            return;
        }
        this.f61034d.a(1, -7829368);
        this.f61034d.setPadding(this.f61035e.b(2), 0, 0, 0);
        this.f61034d.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.f61034d.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f61035e.b(3));
        this.f61034d.setBackgroundColor(1711276032);
        this.f61034d.setText(str);
    }

    public void a(c cVar, View.OnClickListener onClickListener) {
        this.f61036f.setVisibility(0);
        this.f61036f.setImageBitmap(cVar.c().getBitmap());
        this.f61036f.setOnClickListener(onClickListener);
    }

    public final void a() {
        Point pointB = kb.b(getContext());
        int i10 = pointB.x;
        int i11 = pointB.y;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        ImageData imageData = ((float) i10) / ((float) i11) > 1.0f ? this.f61038h : this.f61037g;
        if (imageData == null && (imageData = this.f61038h) == null) {
            imageData = this.f61037g;
        }
        if (imageData == null) {
            return;
        }
        this.f61033c.setImageData(imageData);
    }
}
