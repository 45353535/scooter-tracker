package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class vh0 implements DivExtensionHandler {
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        d7.a.a(this, div2View, expressionResolver, view, f7Var);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        Object next;
        JSONObject jSONObject;
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setHyphenationFrequency(2);
            List extensions = f7Var.getExtensions();
            Locale locale = null;
            if (extensions != null) {
                Iterator it = extensions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((k8.rb) next).f90670a, "hyphenation")) {
                            break;
                        }
                    }
                }
                k8.rb rbVar = (k8.rb) next;
                if (rbVar != null && (jSONObject = rbVar.f90671b) != null && (string = jSONObject.getString(CommonUrlParts.LOCALE)) != null) {
                    locale = new Locale(string);
                }
            }
            if (locale != null) {
                textView.setTextLocale(locale);
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(k8.f7 f7Var) {
        List extensions = f7Var.getExtensions();
        if (extensions == null || extensions.isEmpty()) {
            return false;
        }
        Iterator it = extensions.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((k8.rb) it.next()).f90670a, "hyphenation")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void preprocess(k8.f7 f7Var, ExpressionResolver expressionResolver) {
        d7.a.b(this, f7Var, expressionResolver);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
    }
}
