package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k8.ea;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002JKB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00150;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/yandex/div/core/view2/reuse/RebindTask;", "", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "oldResolver", "newResolver", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "reporter", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;)V", "Lk8/ea;", "oldDivData", "newDivData", "Landroid/view/ViewGroup;", "rootView", "", "calculateDiff", "(Lk8/ea;Lk8/ea;Landroid/view/ViewGroup;)Z", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "existingToken", "Lcom/yandex/div/core/view2/reuse/NewToken;", "newToken", "", "doNodeInSameMode", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;Lcom/yandex/div/core/view2/reuse/NewToken;)V", "token", "doNodeInExistingMode", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;)V", "doNodeInNewMode", "(Lcom/yandex/div/core/view2/reuse/NewToken;)V", "Lcom/yandex/div/core/state/DivStatePath;", "path", "rebind", "(Lcom/yandex/div/core/state/DivStatePath;)Z", "Lk8/y0;", "div", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "releaseIfNecessary", "(Lk8/y0;Landroid/view/View;)V", "prepareAndRebind", "(Lk8/ea;Lk8/ea;Landroid/view/ViewGroup;Lcom/yandex/div/core/state/DivStatePath;)Z", "clear", "()V", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/view2/DivBinder;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "", "bindingPoints", "Ljava/util/Set;", "", "idsToBind", "Ljava/util/List;", "aloneExisting", "aloneNew", "", "", "aloneIds", "Ljava/util/Map;", "rebindInProgress", "Z", "getRebindInProgress", "()Z", "setRebindInProgress", "(Z)V", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "reusableList", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "getReusableList", "()Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", y.f66058y, "UnsupportedElementException", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RebindTask {

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final ExpressionResolver newResolver;

    @NotNull
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;

    @NotNull
    private final ComplexRebindReporter reporter;

    @NotNull
    private final Set<ExistingToken> bindingPoints = new LinkedHashSet();

    @NotNull
    private final List<ExistingToken> idsToBind = new ArrayList();

    @NotNull
    private final List<ExistingToken> aloneExisting = new ArrayList();

    @NotNull
    private final List<NewToken> aloneNew = new ArrayList();

    @NotNull
    private final Map<String, ExistingToken> aloneIds = new LinkedHashMap();

    @NotNull
    private final ReusableTokenList reusableList = new ReusableTokenList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/reuse/RebindTask$UnsupportedElementException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", PglCryptUtils.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsupportedElementException extends IllegalArgumentException {

        @NotNull
        private final String message;

        public UnsupportedElementException(@NotNull Class<?> cls) {
            this.message = cls + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }
    }

    public RebindTask(@NotNull Div2View div2View, @NotNull DivBinder divBinder, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2, @NotNull ComplexRebindReporter complexRebindReporter) {
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = expressionResolver;
        this.newResolver = expressionResolver2;
        this.reporter = complexRebindReporter;
    }

    private final boolean calculateDiff(ea oldDivData, ea newDivData, ViewGroup rootView) {
        y0 y0Var;
        y0 y0Var2;
        ea.c cVarStateToBind = this.div2View.stateToBind(oldDivData);
        if (cVarStateToBind == null || (y0Var = cVarStateToBind.f87215a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(y0Var, this.oldResolver), 0, rootView, null);
        ea.c cVarStateToBind2 = this.div2View.stateToBind(newDivData);
        if (cVarStateToBind2 == null || (y0Var2 = cVarStateToBind2.f87215a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(y0Var2, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInExistingMode(ExistingToken token) {
        String id2 = token.getDiv().c().getId();
        if (id2 != null) {
            this.aloneIds.put(id2, token);
        } else {
            this.aloneExisting.add(token);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(token, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object next;
        Iterator<T> it = this.aloneExisting.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ExistingToken) next).isCombinable(newToken)) {
                    break;
                }
            }
        }
        ExistingToken existingToken = (ExistingToken) next;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id2 = newToken.getDiv().c().getId();
        ExistingToken existingToken2 = id2 != null ? this.aloneIds.get(id2) : null;
        if (id2 == null || existingToken2 == null || !Intrinsics.areEqual(existingToken2.getDiv().getClass(), newToken.getDiv().getClass()) || !DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().c(), newToken.getDiv().c(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneNew.add(newToken);
        } else {
            this.aloneIds.remove(id2);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object next;
        ExistingToken existingTokenCombineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(existingTokenCombineTokens);
        List mutableList = CollectionsKt.toMutableList((Collection) newToken.getChildrenTokens());
        ArrayList arrayList = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(existingTokenCombineTokens)) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((NewToken) next).isCombinable(existingToken2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NewToken newToken2 = (NewToken) next;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                mutableList.remove(newToken2);
            } else {
                arrayList.add(existingToken2);
            }
        }
        if (mutableList.size() != arrayList.size()) {
            this.bindingPoints.add(existingTokenCombineTokens);
        } else {
            this.reusableList.add(existingTokenCombineTokens);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            doNodeInExistingMode((ExistingToken) it2.next());
        }
        Iterator it3 = mutableList.iterator();
        while (it3.hasNext()) {
            doNodeInNewMode((NewToken) it3.next());
        }
    }

    @MainThread
    private final boolean rebind(DivStatePath path) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), path);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), path);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(y0 div, View view) {
        if (div instanceof y0.d ? true : div instanceof y0.s) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    @NotNull
    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public final boolean prepareAndRebind(@NotNull ea oldDivData, @NotNull ea newDivData, @NotNull ViewGroup rootView, @NotNull DivStatePath path) {
        boolean zCalculateDiff;
        clear();
        this.rebindInProgress = true;
        try {
            zCalculateDiff = calculateDiff(oldDivData, newDivData, rootView);
        } catch (UnsupportedElementException e10) {
            this.reporter.onComplexRebindUnsupportedElementException(e10);
            zCalculateDiff = false;
        }
        if (zCalculateDiff) {
            return rebind(path);
        }
        return false;
    }
}
