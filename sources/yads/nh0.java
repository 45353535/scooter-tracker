package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nh0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f113874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hh0 f113875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(Context context, hh0 hh0Var) {
        super(0);
        this.f113874b = context;
        this.f113875c = hh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vg0 vg0Var = new vg0(this.f113874b);
        hg0 hg0Var = new hg0(new jg0(), new ng0(), new mg0(), new ig0(), new og0(), new kg0());
        ky kyVar = ly.f113268a;
        Context context = this.f113874b;
        kyVar.getClass();
        hr2 hr2VarA = ((oy) ky.a(context)).a();
        DivConfiguration.Builder builderTypefaceProvider = new DivConfiguration.Builder(vg0Var).divCustomContainerViewAdapter(hg0Var).typefaceProvider(Intrinsics.areEqual(hr2VarA != null ? Boolean.valueOf(kr2.a(hr2VarA)) : null, Boolean.TRUE) ? new bi0(this.f113874b) : new di0(this.f113874b));
        hh0 hh0Var = this.f113875c;
        if (hh0Var != null) {
            builderTypefaceProvider = builderTypefaceProvider.extension(new jh0(hh0Var));
        }
        return builderTypefaceProvider.extension(new vh0()).build();
    }
}
