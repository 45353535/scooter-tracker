package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ky2 {
    public static DivConfiguration a(Context context, jy2 jy2Var, hh0 hh0Var) {
        vg0 vg0Var = new vg0(context);
        hg0 hg0Var = new hg0(new jg0(), new ng0(), new mg0(), new ig0(), new og0(), new kg0());
        jh0 jh0Var = new jh0(hh0Var);
        ly.f113268a.getClass();
        hr2 hr2VarA = ((oy) ky.a(context)).a();
        return new DivConfiguration.Builder(vg0Var).divCustomContainerViewAdapter(hg0Var).typefaceProvider(Intrinsics.areEqual(hr2VarA != null ? Boolean.valueOf(kr2.a(hr2VarA)) : null, Boolean.TRUE) ? new bi0(context) : new di0(context)).extension(jy2Var).extension(jh0Var).build();
    }
}
