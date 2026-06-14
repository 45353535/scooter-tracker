package com.yandex.div.core.actions;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.ea;
import k8.j1;
import k8.kw;
import k8.m5;
import k8.y0;
import k8.z4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSubmitHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "Lcom/yandex/div/core/DivRequestExecutor;", "requestExecutor", "<init>", "(Lcom/yandex/div/core/DivRequestExecutor;)V", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "container", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "createBody", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;Lcom/yandex/div/core/view2/Div2View;)Ljava/lang/String;", "", "Lk8/j1;", "onSuccessActions", "onFailActions", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "createCallback", "(Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/DivRequestExecutor$Callback;", "scopeId", "Lk8/m5;", "action", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/DivRequestExecutor;", "ContainerFinder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {

    @NotNull
    private final DivRequestExecutor requestExecutor;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSubmitHandler$ContainerFinder;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "findContainer", "(Lcom/yandex/div/core/view2/Div2View;)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lk8/y0;", "data", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Ljava/lang/String;", "", "containers", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ContainerFinder extends DivTreeVisitor<Unit> {

        @NotNull
        private final List<DivItemBuilderResult> containers;

        @NotNull
        private final String id;

        public ContainerFinder(@NotNull String str) {
            super(null, 1, null);
            this.id = str;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(y0 y0Var, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(y0Var, bindingContext, divStatePath);
            return Unit.f93236a;
        }

        @Nullable
        public final DivItemBuilderResult findContainer(@NotNull Div2View view) {
            ea divData = view.getDivData();
            if (divData == null) {
                return null;
            }
            for (ea.c cVar : divData.f87205c) {
                visit(cVar.f87215a, view.getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(cVar));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Elements that respond to id '" + this.id + "' are not found."));
                return null;
            }
            if (this.containers.size() <= 1) {
                return (DivItemBuilderResult) CollectionsKt.first((List) this.containers);
            }
            DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Found multiple elements that respond to id '" + this.id + "'."));
            return null;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            if (Intrinsics.areEqual(data.c().getId(), this.id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(data, context.getExpressionResolver()));
            }
        }
    }

    public DivActionTypedSubmitHandler(@NotNull DivRequestExecutor divRequestExecutor) {
        this.requestExecutor = divRequestExecutor;
    }

    private final String createBody(DivItemBuilderResult container, Div2View view) {
        VariableController variableController;
        List listC = container.getDiv().c().c();
        List list = listC;
        if (list == null || list.isEmpty() || (variableController = UtilsKt.getVariableController(container.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((kw) it.next());
            Object obj = variableController.get(name);
            if (obj == null || jSONObject.put(name, obj) == null) {
                DivActionTypedUtilsKt.logError(view, new MissingVariableException(name, null, 2, null));
                Unit unit = Unit.f93236a;
            }
        }
        return jSONObject.toString();
    }

    private final DivRequestExecutor.Callback createCallback(final List<j1> onSuccessActions, final List<j1> onFailActions, final Div2View view, final ExpressionResolver resolver) {
        List<j1> list;
        List<j1> list2 = onSuccessActions;
        if ((list2 == null || list2.isEmpty()) && ((list = onFailActions) == null || list.isEmpty())) {
            return null;
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler.createCallback.1
        };
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        z4 z4VarC;
        DivItemBuilderResult divItemBuilderResultFindContainer;
        ArrayList arrayList = null;
        m5.t tVar = action instanceof m5.t ? (m5.t) action : null;
        if (tVar == null || (z4VarC = tVar.c()) == null || (divItemBuilderResultFindContainer = new ContainerFinder((String) z4VarC.f92867a.evaluate(resolver)).findContainer(view)) == null) {
            return false;
        }
        List list = z4VarC.f92870d.f92876a;
        if (list != null) {
            List<z4.c.C1058c> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (z4.c.C1058c c1058c : list2) {
                arrayList.add(new DivRequestExecutor.Header((String) c1058c.f92883a.evaluate(resolver), (String) c1058c.f92884b.evaluate(resolver)));
            }
        }
        view.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request((Uri) z4VarC.f92870d.f92878c.evaluate(resolver), ((z4.c.d) z4VarC.f92870d.f92877b.evaluate(resolver)).toString(), arrayList, createBody(divItemBuilderResultFindContainer, view)), createCallback(z4VarC.f92869c, z4VarC.f92868b, view, resolver)), view);
        return true;
    }
}
