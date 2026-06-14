package yads;

import android.view.View;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jy2 implements DivExtensionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f112513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg0 f112514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f112515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo0 f112516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f112517e;

    public /* synthetic */ jy2(dm2 dm2Var) {
        this(dm2Var, new sg0(), new uo0(), new vo0());
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        d7.a.a(this, div2View, expressionResolver, view, f7Var);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        Integer numValueOf;
        ly2 ly2Var = (ly2) this.f112517e.get(div2View.getDivData());
        if (ly2Var != null) {
            view.setVisibility(8);
            ly2Var.f113273c.getClass();
            k8.rb rbVarA = sg0.a(f7Var, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (rbVarA != null) {
                ly2Var.f113274d.getClass();
                JSONObject jSONObject = rbVarA.f90671b;
                if (jSONObject != null) {
                    try {
                        numValueOf = Integer.valueOf(jSONObject.getInt(C4240b4.i.L));
                    } catch (JSONException unused) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    ArrayList arrayListI = ly2Var.f113271a.i();
                    if (numValueOf.intValue() < 0 || numValueOf.intValue() >= arrayListI.size()) {
                        return;
                    }
                    jz1 jz1Var = (jz1) arrayListI.get(numValueOf.intValue());
                    e02 e02VarA = ly2Var.f113275e.a(view, new x72(numValueOf.intValue()));
                    try {
                        aw2 aw2VarA = eg0.a(div2View);
                        gu guVar = (gu) aw2VarA.f108848a.f111776a.get(numValueOf);
                        if (guVar == null) {
                            guVar = new gu();
                            aw2VarA.f108848a.f111776a.put(numValueOf, guVar);
                        }
                        jz1Var.a(e02VarA, guVar);
                        view.setVisibility(0);
                    } catch (wy1 e10) {
                        ly2Var.f113272b.reportError("Failed to bind DivKit Slider Inner Ad", e10);
                    }
                }
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(k8.f7 f7Var) {
        Integer numValueOf;
        this.f112514b.getClass();
        k8.rb rbVarA = sg0.a(f7Var, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (rbVarA == null) {
            return false;
        }
        this.f112515c.getClass();
        JSONObject jSONObject = rbVarA.f90671b;
        String string = null;
        if (jSONObject != null) {
            try {
                numValueOf = Integer.valueOf(jSONObject.getInt(C4240b4.i.L));
            } catch (JSONException unused) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        this.f112516d.getClass();
        JSONObject jSONObject2 = rbVarA.f90671b;
        if (jSONObject2 != null) {
            try {
                string = jSONObject2.getString("view_name");
            } catch (JSONException unused2) {
            }
        }
        return numValueOf != null && Intrinsics.areEqual("native_ad_view", string);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void preprocess(k8.f7 f7Var, ExpressionResolver expressionResolver) {
        d7.a.b(this, f7Var, expressionResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
    }

    public jy2(dm2 dm2Var, sg0 sg0Var, uo0 uo0Var, vo0 vo0Var) {
        this.f112513a = dm2Var;
        this.f112514b = sg0Var;
        this.f112515c = uo0Var;
        this.f112516d = vo0Var;
        this.f112517e = new ConcurrentHashMap();
    }
}
