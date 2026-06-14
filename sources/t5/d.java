package t5;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import com.skydoves.balloon.vectortext.VectorTextView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q5.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void a(android.widget.TextView r9, w5.a r10) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.a(android.widget.TextView, w5.a):void");
    }

    public static final /* synthetic */ void b(VectorTextView vectorTextView, com.skydoves.balloon.e iconForm) {
        Intrinsics.checkNotNullParameter(vectorTextView, "<this>");
        Intrinsics.checkNotNullParameter(iconForm, "iconForm");
        if (iconForm.a() != null) {
            int iH = iconForm.h();
            int iF = iconForm.f();
            int iG = iconForm.g();
            CharSequence charSequenceD = iconForm.d();
            Integer numValueOf = Integer.valueOf(iconForm.c());
            if (!(numValueOf.intValue() != Integer.MIN_VALUE)) {
                numValueOf = null;
            }
            w5.a aVar = new w5.a(null, null, null, null, null, null, null, null, false, charSequenceD, Integer.valueOf(iG), Integer.valueOf(iH), Integer.valueOf(iF), null, numValueOf, null, null, null, 238079, null);
            int i10 = a.$EnumSwitchMapping$0[iconForm.e().ordinal()];
            if (i10 == 1) {
                aVar.w(iconForm.a());
                aVar.x(iconForm.b());
            } else if (i10 == 2) {
                aVar.y(iconForm.a());
                aVar.z(iconForm.b());
            } else if (i10 == 3) {
                aVar.s(iconForm.a());
                aVar.t(iconForm.b());
            } else if (i10 == 4) {
                aVar.u(iconForm.a());
                aVar.v(iconForm.b());
            }
            vectorTextView.setDrawableTextViewParams(aVar);
        }
    }

    public static final /* synthetic */ void c(TextView textView, com.skydoves.balloon.f textForm) {
        CharSequence charSequenceB;
        Unit unit;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textForm, "textForm");
        boolean zE = textForm.e();
        if (zE) {
            charSequenceB = d(textForm.b().toString());
        } else {
            if (zE) {
                throw new lf.m();
            }
            charSequenceB = textForm.b();
        }
        textView.setText(charSequenceB);
        textView.setTextSize(textForm.g());
        textView.setGravity(textForm.d());
        textView.setTextColor(textForm.c());
        Float f10 = textForm.f();
        if (f10 != null) {
            textView.setLineSpacing(f10.floatValue(), 1.0f);
        }
        Typeface typefaceI = textForm.i();
        if (typefaceI != null) {
            textView.setTypeface(typefaceI);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            textView.setTypeface(textView.getTypeface(), textForm.h());
        }
        MovementMethod movementMethodA = textForm.a();
        if (movementMethodA != null) {
            textView.setMovementMethod(movementMethodA);
        }
    }

    private static final Spanned d(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : HtmlCompat.fromHtml(str, 0);
    }
}
