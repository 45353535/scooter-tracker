package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class ct2 extends kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt2 f109571a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(zs2 zs2Var, dt2 dt2Var) {
        super(zs2Var);
        this.f109571a = dt2Var;
    }

    @Override // kotlin.properties.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        em1 em1Var = (em1) obj2;
        em1 em1Var2 = (em1) obj;
        if (Intrinsics.areEqual(em1Var, em1Var2)) {
            return;
        }
        gk2 gk2Var = this.f109571a.f110058g;
        KProperty[] kPropertyArr = dt2.f110054j;
        KProperty kProperty = kPropertyArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) gk2Var.f111244a.get();
        if (customizableMediaView == null) {
            return;
        }
        gk2 gk2Var2 = this.f109571a.f110059h;
        KProperty kProperty2 = kPropertyArr[1];
        am1 am1Var = (am1) gk2Var2.f111244a.get();
        if (am1Var == null) {
            return;
        }
        em1Var2.a(customizableMediaView);
        customizableMediaView.post(new bt2(em1Var, customizableMediaView, am1Var));
    }
}
