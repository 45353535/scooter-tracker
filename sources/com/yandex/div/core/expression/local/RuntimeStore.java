package com.yandex.div.core.expression.local;

import b7.b;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Map;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000 -2\u00020\u0001:\u0001-J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001c\u0010\u0018J3\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001eH&¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0\"H&¢\u0006\u0004\b$\u0010%J-\u0010(\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&H&¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStore;", "", "Lk8/f7;", "child", "", "showWarningIfNeeded", "(Lk8/f7;)V", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "parentResolver", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getOrCreateRuntime", "(Lcom/yandex/div/core/state/DivStatePath;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "resolver", "getRuntimeWithOrNull", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "Lcom/yandex/div/core/DivViewFacade;", "divView", "resolveRuntimeWith", "(Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/core/state/DivStatePath;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "cleanupRuntimes", "(Lcom/yandex/div/core/DivViewFacade;)V", "updateSubscriptions", "()V", "clearBindings", "onDetachedFromWindow", "runtime", "Lkotlin/Function1;", "callback", "traverseFrom", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;Lcom/yandex/div/core/state/DivStatePath;Lkotlin/jvm/functions/Function1;)V", "", "", "getUniquePathsAndRuntimes", "()Ljava/util/Map;", "Lkotlin/Function0;", "createResolver", "getOrPutItemBuilderResolver", "(Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function0;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "getRootRuntime", "()Lcom/yandex/div/core/expression/ExpressionsRuntime;", "rootRuntime", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RuntimeStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStore$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "getEMPTY", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final RuntimeStore EMPTY = new RuntimeStore() { // from class: com.yandex.div.core.expression.local.RuntimeStore$Companion$EMPTY$1
            private final Void throwException() {
                throw new IllegalStateException("Trying to use RuntimeStore before initializing.");
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void cleanupRuntimes(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void clearBindings(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, y0 y0Var, ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7590getOrCreateRuntime(divStatePath, y0Var, expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, Function0 function0) {
                return (ExpressionResolver) m7591getOrPutItemBuilderResolver(str, expressionResolver, (Function0<? extends ExpressionResolver>) function0);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public ExpressionsRuntime getRootRuntime() {
                throwException();
                throw new g();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7592getRuntimeWithOrNull(expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
                throwException();
                throw new g();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void onDetachedFromWindow(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, y0 y0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return (ExpressionsRuntime) m7593resolveRuntimeWith(divViewFacade, divStatePath, y0Var, expressionResolver, expressionResolver2);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* synthetic */ void showWarningIfNeeded(f7 f7Var) {
                b.a(this, f7Var);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull Function1<? super ExpressionsRuntime, Unit> callback) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void updateSubscriptions() {
            }

            @NotNull
            /* JADX INFO: renamed from: getOrCreateRuntime, reason: collision with other method in class */
            public Void m7590getOrCreateRuntime(@NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver parentResolver) {
                throw new IllegalStateException();
            }

            @NotNull
            /* JADX INFO: renamed from: getOrPutItemBuilderResolver, reason: collision with other method in class */
            public Void m7591getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0<? extends ExpressionResolver> createResolver) {
                throwException();
                throw new g();
            }

            @NotNull
            /* JADX INFO: renamed from: getRuntimeWithOrNull, reason: collision with other method in class */
            public Void m7592getRuntimeWithOrNull(@NotNull ExpressionResolver resolver) {
                throwException();
                throw new g();
            }

            @NotNull
            /* JADX INFO: renamed from: resolveRuntimeWith, reason: collision with other method in class */
            public Void m7593resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver) {
                throwException();
                throw new g();
            }
        };

        private Companion() {
        }

        @NotNull
        public final RuntimeStore getEMPTY() {
            return EMPTY;
        }
    }

    void cleanupRuntimes(@NotNull DivViewFacade divView);

    void clearBindings(@NotNull DivViewFacade divView);

    @NotNull
    ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver parentResolver);

    @NotNull
    ExpressionResolver getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0<? extends ExpressionResolver> createResolver);

    @NotNull
    ExpressionsRuntime getRootRuntime();

    @Nullable
    ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver resolver);

    @NotNull
    Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes();

    void onDetachedFromWindow(@NotNull DivViewFacade divView);

    @Nullable
    ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull y0 div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver);

    void showWarningIfNeeded(@NotNull f7 child);

    void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull Function1<? super ExpressionsRuntime, Unit> callback);

    void updateSubscriptions();
}
