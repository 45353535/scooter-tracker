package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f111376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f111377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es2 f111378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l00 f111379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jd1 f111380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z3 f111381f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx0(Context context, t9 t9Var, RelativeLayout relativeLayout, wy wyVar, b2 b2Var, int i10, q2 q2Var, c4 c4Var, es2 es2Var) {
        this(t9Var, relativeLayout, es2Var, new v12(q2Var, new yw0(ut2.a().a(context))), new jd1(context, t9Var, wyVar, b2Var, i10, q2Var, c4Var, es2Var), new z3(q2Var));
        Object obj = vt2.f117186j;
    }

    public final bx0 a(Context context, jz1 jz1Var, wy wyVar) {
        ArrayList arrayList;
        oh0 oh0Var;
        wy wyVar2;
        dp2 dp2Var;
        ArrayList arrayList2;
        Object objPrevious;
        dp2 dp2Var2 = new dp2(context, new mh0(jz1Var, wyVar, ((pr3) this.f111378c).a(), new uh0(), new ei0()), wyVar);
        z3 z3Var = this.f111381f;
        t9 t9Var = this.f111376a;
        z3Var.getClass();
        t2 ho2Var = t9Var.f116108a == qz.f115223f ? new ho2(dp2Var2, new io2(z3Var.f118529a)) : new mb1();
        List listD = jz1Var.d();
        if (listD != null) {
            arrayList = new ArrayList();
            for (Object obj : listD) {
                String str = ((oh0) obj).f114317a;
                nf0[] nf0VarArr = nf0.f113851b;
                if (Intrinsics.areEqual(str, "ad")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List listD2 = jz1Var.d();
        if (listD2 != null) {
            ListIterator listIterator = listD2.listIterator(listD2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                String str2 = ((oh0) objPrevious).f114317a;
                nf0[] nf0VarArr2 = nf0.f113851b;
                if (Intrinsics.areEqual(str2, "pack_shot")) {
                    break;
                }
            }
            oh0Var = (oh0) objPrevious;
        } else {
            oh0Var = null;
        }
        qz1 qz1VarB = jz1Var.b();
        a7 a7Var = qz1VarB != null ? qz1VarB.f115241j : null;
        String str3 = this.f111376a.f116123p;
        kf0[] kf0VarArr = kf0.f112699b;
        if (!Intrinsics.areEqual(str3, "ad_pod") || a7Var == null) {
            wyVar2 = wyVar;
            dp2Var = dp2Var2;
            arrayList2 = arrayList;
        } else {
            if ((jz1Var instanceof i12) || oh0Var != null) {
                l00 l00Var = this.f111379d;
                return new e7(context, jz1Var, l00Var, dp2Var2, arrayList, oh0Var, this.f111377b, ho2Var, wyVar, this.f111380e, a7Var, new ExtendedNativeAdView(context), new s2(jz1Var, wyVar, l00Var), new nh2(), new vv(), new po2(new k43()));
            }
            wyVar2 = wyVar;
            arrayList2 = arrayList;
            dp2Var = dp2Var2;
        }
        ArrayList arrayList3 = arrayList2;
        return new fx0(this.f111380e.a(context, this.f111377b, jz1Var, this.f111379d, new ti2(ho2Var), dp2Var, new w33(new nh2(), new sw2(this.f111376a), new yw2(this.f111376a), new xw2()), new zw2(), arrayList3 != null ? (oh0) CollectionsKt.firstOrNull((List) arrayList3) : null, null), wyVar2);
    }

    public gx0(t9 t9Var, RelativeLayout relativeLayout, es2 es2Var, l00 l00Var, jd1 jd1Var, z3 z3Var) {
        this.f111376a = t9Var;
        this.f111377b = relativeLayout;
        this.f111378c = es2Var;
        this.f111379d = l00Var;
        this.f111380e = jd1Var;
        this.f111381f = z3Var;
    }
}
