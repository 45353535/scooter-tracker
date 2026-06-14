package yads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ci0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ di0 f109404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(di0 di0Var) {
        super(0);
        this.f109404b = di0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Typeface font;
        Typeface font2;
        Typeface font3;
        Typeface font4;
        Context context = this.f109404b.f109932a;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        String str = hr2VarA != null ? hr2VarA.V : null;
        if (str == null) {
            return null;
        }
        try {
            lv0 lv0VarValueOf = lv0.valueOf(str);
            if (mv0.f113615a[lv0VarValueOf.ordinal()] != 1) {
                throw new lf.m();
            }
            try {
                font = ResourcesCompat.getFont(context, lv0VarValueOf.f113231b);
            } catch (Throwable unused) {
                font = null;
            }
            try {
                font2 = ResourcesCompat.getFont(context, lv0VarValueOf.f113232c);
            } catch (Throwable unused2) {
                font2 = null;
            }
            try {
                font3 = ResourcesCompat.getFont(context, lv0VarValueOf.f113233d);
            } catch (Throwable unused3) {
                font3 = null;
            }
            try {
                font4 = ResourcesCompat.getFont(context, lv0VarValueOf.f113234e);
            } catch (Throwable unused4) {
                font4 = null;
            }
            return new kv0(font, font2, font3, font4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
