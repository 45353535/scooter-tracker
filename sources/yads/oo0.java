package yads;

import android.graphics.RectF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0 implements oc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f114379c;

    public oo0(int i10, RectF rectF) {
        this.f114378b = i10;
        this.f114379c = rectF;
    }

    @Override // yads.oc1
    public final String a() {
        String str;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Integer numValueOf = Integer.valueOf(this.f114378b);
        RectF rectF = this.f114379c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        String str2 = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{numValueOf, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
