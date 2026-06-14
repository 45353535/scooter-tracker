package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.ea;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b \u0010!J;\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010(J3\u0010/\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00132\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0-H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001801H\u0016¢\u0006\u0004\b2\u00103J-\u00106\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u001a\u0010H\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u00020:*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStoreImpl;", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "Lk8/ea;", "data", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "runtimeProvider", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "<init>", "(Lk8/ea;Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "", "path", "", "reportParentRuntimeError", "(Ljava/lang/String;)V", "Lk8/f7;", "child", "showWarningIfNeeded", "(Lk8/f7;)V", "Lcom/yandex/div/core/state/DivStatePath;", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "parentResolver", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getOrCreateRuntime", "(Lcom/yandex/div/core/state/DivStatePath;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "resolver", "getRuntimeWithOrNull", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "runtime", "parentRuntime", "putRuntime$div_release", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;Ljava/lang/String;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "putRuntime", "Lcom/yandex/div/core/DivViewFacade;", "divView", "resolveRuntimeWith", "(Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/core/state/DivStatePath;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "cleanupRuntimes", "(Lcom/yandex/div/core/DivViewFacade;)V", "updateSubscriptions", "()V", "clearBindings", "onDetachedFromWindow", "Lkotlin/Function1;", "callback", "traverseFrom", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;Lcom/yandex/div/core/state/DivStatePath;Lkotlin/jvm/functions/Function1;)V", "", "getUniquePathsAndRuntimes", "()Ljava/util/Map;", "Lkotlin/Function0;", "createResolver", "getOrPutItemBuilderResolver", "(Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function0;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "", "warningShown", "Z", "", "resolverToRuntime", "Ljava/util/Map;", "pathToRuntime", "Lcom/yandex/div/core/ObserverList;", "allRuntimes", "Lcom/yandex/div/core/ObserverList;", "Lcom/yandex/div/core/expression/local/RuntimeTree;", "tree", "Lcom/yandex/div/core/expression/local/RuntimeTree;", "itemBuilderResolvers", "rootRuntime", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getRootRuntime", "()Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getNeedLocalRuntime", "(Lk8/y0;)Z", "needLocalRuntime", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RuntimeStoreImpl implements RuntimeStore {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionsRuntime rootRuntime;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private boolean warningShown;

    @NotNull
    private final Map<ExpressionResolver, ExpressionsRuntime> resolverToRuntime = new LinkedHashMap();

    @NotNull
    private final Map<String, ExpressionsRuntime> pathToRuntime = new LinkedHashMap();

    @NotNull
    private final ObserverList<ExpressionsRuntime> allRuntimes = new ObserverList<>();

    @NotNull
    private final RuntimeTree tree = new RuntimeTree();

    @NotNull
    private final Map<String, ExpressionResolver> itemBuilderResolvers = new LinkedHashMap();

    public RuntimeStoreImpl(@NotNull ea eaVar, @NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider, @NotNull ErrorCollector errorCollector) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollector = errorCollector;
        ExpressionsRuntime expressionsRuntimeCreateRootRuntime = expressionsRuntimeProvider.createRootRuntime(eaVar, errorCollector, this);
        putRuntime$div_release(expressionsRuntimeCreateRootRuntime, "", null);
        this.rootRuntime = expressionsRuntimeCreateRootRuntime;
    }

    private final boolean getNeedLocalRuntime(y0 y0Var) {
        List listS;
        List listU;
        f7 f7VarC = y0Var.c();
        List listC = f7VarC.c();
        return !((listC == null || listC.isEmpty()) && ((listS = f7VarC.s()) == null || listS.isEmpty()) && ((listU = f7VarC.u()) == null || listU.isEmpty()));
    }

    private final void reportParentRuntimeError(String path) {
        a1 a1Var = a1.f93282a;
        String str = String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{path}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail(str);
        }
        this.errorCollector.logError(new AssertionError(str));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void cleanupRuntimes(@NotNull DivViewFacade divView) {
        this.warningShown = false;
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().cleanup$div_release(divView);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void clearBindings(@NotNull DivViewFacade divView) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().clearBinding(divView);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver parentResolver) {
        String fullPath$div_release = path.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(parentResolver instanceof ExpressionResolverImpl)) {
            return getRootRuntime();
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return getRootRuntime();
        }
        if (!getNeedLocalRuntime(div)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime expressionsRuntimeCreateChildRuntime = this.runtimeProvider.createChildRuntime(path, div.c(), (ExpressionResolverImpl) parentResolver, this.errorCollector);
        putRuntime$div_release(expressionsRuntimeCreateChildRuntime, fullPath$div_release, runtimeWithOrNull);
        return expressionsRuntimeCreateChildRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionResolver getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0<? extends ExpressionResolver> createResolver) {
        Map<String, ExpressionResolver> map = this.itemBuilderResolvers;
        ExpressionResolver expressionResolverInvoke = map.get(path);
        if (expressionResolverInvoke == null) {
            expressionResolverInvoke = createResolver.invoke();
            ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
            if (runtimeWithOrNull != null) {
                this.resolverToRuntime.put(expressionResolverInvoke, runtimeWithOrNull);
            }
            map.put(path, expressionResolverInvoke);
        }
        return expressionResolverInvoke;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getRootRuntime() {
        return this.rootRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver resolver) {
        return this.resolverToRuntime.get(resolver);
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
        return this.tree.getPathToRuntimes();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void onDetachedFromWindow(@NotNull DivViewFacade divView) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromWindow(divView);
        }
    }

    public final void putRuntime$div_release(@NotNull ExpressionsRuntime runtime, @NotNull String path, @Nullable ExpressionsRuntime parentRuntime) {
        this.pathToRuntime.put(path, runtime);
        this.resolverToRuntime.put(runtime.getExpressionResolver(), runtime);
        this.allRuntimes.addObserver(runtime);
        this.tree.storeRuntime(runtime, parentRuntime, path);
        runtime.updateSubscriptions();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver) {
        String fullPath$div_release = path.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(resolver instanceof ExpressionResolverImpl)) {
            return null;
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return null;
        }
        if (getNeedLocalRuntime(div)) {
            ExpressionsRuntime expressionsRuntimeCreateChildRuntime = this.runtimeProvider.createChildRuntime(path, div.c(), (ExpressionResolverImpl) resolver, this.errorCollector);
            putRuntime$div_release(expressionsRuntimeCreateChildRuntime, fullPath$div_release, runtimeWithOrNull);
            return expressionsRuntimeCreateChildRuntime;
        }
        if (Intrinsics.areEqual(resolver, parentResolver)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime expressionsRuntime2 = new ExpressionsRuntime((ExpressionResolverImpl) resolver, null);
        putRuntime$div_release(expressionsRuntime2, fullPath$div_release, runtimeWithOrNull);
        return expressionsRuntime2;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void showWarningIfNeeded(@NotNull f7 child) {
        if (this.warningShown || child.c() == null) {
            return;
        }
        this.warningShown = true;
        this.errorCollector.logWarning(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull final Function1<? super ExpressionsRuntime, Unit> callback) {
        this.tree.invokeRecursively(runtime, path.getFullPath$div_release(), new Function1<RuntimeTree.RuntimeNode, Unit>() { // from class: com.yandex.div.core.expression.local.RuntimeStoreImpl.traverseFrom.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RuntimeTree.RuntimeNode runtimeNode) {
                invoke2(runtimeNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RuntimeTree.RuntimeNode runtimeNode) {
                callback.invoke(runtimeNode.getRuntime());
            }
        });
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void updateSubscriptions() {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().updateSubscriptions();
        }
    }
}
