package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class cg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RectF f109385j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f109386k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f109387l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109389b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f109390c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f109391d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f109392e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f109393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f109394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f109395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bg f109396i;

    public cg(TextView textView) {
        this.f109394g = textView;
        this.f109395h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f109396i = new ag();
        } else {
            this.f109396i = new zf();
        }
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f109386k;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public final void a() {
        TextView textView = this.f109394g;
        if ((textView instanceof EditText) || this.f109388a == 0) {
            return;
        }
        if (this.f109389b) {
            if (textView.getMeasuredHeight() <= 0 || this.f109394g.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f109396i.a(this.f109394g) ? 1048576 : (this.f109394g.getMeasuredWidth() - this.f109394g.getTotalPaddingLeft()) - this.f109394g.getTotalPaddingRight();
            int height = (this.f109394g.getHeight() - this.f109394g.getCompoundPaddingBottom()) - this.f109394g.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f109385j;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fA = a(rectF);
                    if (fA != this.f109394g.getTextSize()) {
                        a(0, fA);
                    }
                } finally {
                }
            }
        }
        this.f109389b = true;
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f109392e.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f109392e[i13];
                CharSequence text = this.f109394g.getText();
                TransformationMethod transformationMethod = this.f109394g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f109394g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f109394g.getMaxLines();
                TextPaint textPaint = this.f109393f;
                if (textPaint == null) {
                    this.f109393f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f109393f.set(this.f109394g.getPaint());
                this.f109393f.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) a(this.f109394g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f109393f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f109394g.getLineSpacingExtra(), this.f109394g.getLineSpacingMultiplier()).setIncludePad(this.f109394g.getIncludeFontPadding()).setBreakStrategy(this.f109394g.getBreakStrategy()).setHyphenationFrequency(this.f109394g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f109396i.a(builderObtain, this.f109394g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f109392e[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static Object a(Object obj, String str, Object obj2) {
        try {
            return b(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a(int i10, float f10) {
        Resources resources;
        Context context = this.f109395h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (fApplyDimension != this.f109394g.getPaint().getTextSize()) {
            this.f109394g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f109394g.isInLayout();
            if (this.f109394g.getLayout() != null) {
                this.f109389b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f109394g, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!zIsInLayout) {
                    this.f109394g.requestLayout();
                } else {
                    this.f109394g.forceLayout();
                }
                this.f109394g.invalidate();
            }
        }
    }
}
