package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eg0 {
    public static final aw2 a(Div2View div2View) {
        DivActionHandler actionHandler = div2View.getActionHandler();
        aw2 aw2Var = actionHandler instanceof aw2 ? (aw2) actionHandler : null;
        if (aw2Var == null) {
            aw2Var = new aw2(new hu());
        }
        div2View.setActionHandler(aw2Var);
        return aw2Var;
    }
}
