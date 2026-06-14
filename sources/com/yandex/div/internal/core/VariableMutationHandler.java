package com.yandex.div.internal.core;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/core/VariableMutationHandler;", "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class VariableMutationHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J@\u0010\u0010\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0011*\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00110\u0013H\u0007J*\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/internal/core/VariableMutationHandler$Companion;", "", "()V", "createAndReportError", "Lcom/yandex/div/data/VariableMutationException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "div2View", "Lcom/yandex/div/core/view2/Div2View;", PglCryptUtils.KEY_MESSAGE, "", "findVariable", "Lcom/yandex/div/data/Variable;", "name", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "setVariable", "T", "valueMutation", "Lkotlin/Function1;", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final VariableMutationException createAndReportError(Throwable e10, Div2View div2View, String message) {
            VariableMutationException variableMutationException = new VariableMutationException(message, e10);
            DivActionTypedUtilsKt.logError(div2View, variableMutationException);
            return variableMutationException;
        }

        private final Variable findVariable(String name, ExpressionResolver resolver) {
            VariableController variableController = UtilsKt.getVariableController(resolver);
            if (variableController != null) {
                return variableController.getMutableVariable(name);
            }
            return null;
        }

        @Nullable
        public final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String name, @NotNull String value, @NotNull ExpressionResolver resolver) {
            Object objB;
            Variable variableFindVariable = findVariable(name, resolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + name + "' not defined!");
            }
            try {
                Result.Companion companion = Result.f93230c;
                variableFindVariable.set(value);
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG == null) {
                return null;
            }
            return VariableMutationHandler.INSTANCE.createAndReportError(thG, div2View, "Variable '" + name + "' mutation failed!");
        }

        private Companion() {
        }

        @Nullable
        public final <T extends Variable> VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String name, @NotNull ExpressionResolver resolver, @NotNull Function1<? super T, ? extends T> valueMutation) {
            Object objB;
            Variable variableFindVariable = findVariable(name, resolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + name + "' not defined!");
            }
            try {
                Result.Companion companion = Result.f93230c;
                variableFindVariable.setValue(valueMutation.invoke(variableFindVariable));
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG == null) {
                return null;
            }
            return VariableMutationHandler.INSTANCE.createAndReportError(thG, div2View, "Variable '" + name + "' mutation failed!");
        }
    }

    @Nullable
    public static final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String str, @NotNull String str2, @NotNull ExpressionResolver expressionResolver) {
        return INSTANCE.setVariable(div2View, str, str2, expressionResolver);
    }
}
