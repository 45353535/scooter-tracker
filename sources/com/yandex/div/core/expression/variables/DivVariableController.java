package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.data.Variable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R*\u00102\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0018j\u0002`10'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010)R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/div/core/expression/variables/DivVariableController;", "", "internalVariableController", "<init>", "(Lcom/yandex/div/core/expression/variables/DivVariableController;)V", "", "variableName", "", "isDeclaredLocal", "(Ljava/lang/String;)Z", "Lcom/yandex/div/data/Variable;", "get", "(Ljava/lang/String;)Lcom/yandex/div/data/Variable;", "", "captureAllVariables", "()Ljava/util/List;", "Lcom/yandex/div/core/expression/variables/DeclarationObserver;", "observer", "", "addDeclarationObserver$div_release", "(Lcom/yandex/div/core/expression/variables/DeclarationObserver;)V", "addDeclarationObserver", "removeDeclarationObserver$div_release", "removeDeclarationObserver", "Lkotlin/Function1;", "addVariableObserver$div_release", "(Lkotlin/jvm/functions/Function1;)V", "addVariableObserver", "removeVariablesObserver$div_release", "removeVariablesObserver", "receiveVariablesUpdates$div_release", "receiveVariablesUpdates", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "j$/util/concurrent/ConcurrentHashMap", "variables", "Lj$/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "declarationObservers", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "undeclaredVariables", "Ljava/util/Map;", "", "declaredVariableNames", "Ljava/util/Set;", "pendingDeclaration", "Lcom/yandex/div/core/expression/variables/VariableRequestObserver;", "externalVariableRequestObservers", "requestsObserver", "Lkotlin/jvm/functions/Function1;", "Lcom/yandex/div/core/expression/variables/MultiVariableSource;", "variableSource", "Lcom/yandex/div/core/expression/variables/MultiVariableSource;", "getVariableSource$div_release", "()Lcom/yandex/div/core/expression/variables/MultiVariableSource;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVariableController {

    @NotNull
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;

    @NotNull
    private final Set<String> declaredVariableNames;

    @NotNull
    private final ConcurrentLinkedQueue<Function1<String, Unit>> externalVariableRequestObservers;

    @Nullable
    private final DivVariableController internalVariableController;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final Set<String> pendingDeclaration;

    @NotNull
    private final Function1<String, Unit> requestsObserver;

    @NotNull
    private final Map<String, String> undeclaredVariables;

    @NotNull
    private final MultiVariableSource variableSource;

    @NotNull
    private final ConcurrentHashMap<String, Variable> variables;

    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isDeclaredLocal(String variableName) {
        boolean zContains;
        synchronized (this.declaredVariableNames) {
            zContains = this.declaredVariableNames.contains(variableName);
        }
        return zContains;
    }

    public final void addDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        this.declarationObservers.add(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(observer);
        }
    }

    public final void addVariableObserver$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(observer);
        }
    }

    @NotNull
    public final List<Variable> captureAllVariables() {
        List<Variable> listEmptyList;
        Collection<Variable> collectionValues = this.variables.values();
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController == null || (listEmptyList = divVariableController.captureAllVariables()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) collectionValues, (Iterable) listEmptyList);
    }

    @Nullable
    public final Variable get(@NotNull String variableName) {
        if (isDeclaredLocal(variableName)) {
            return this.variables.get(variableName);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(variableName);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getVariableSource$div_release, reason: from getter */
    public final MultiVariableSource getVariableSource() {
        return this.variableSource;
    }

    public final void receiveVariablesUpdates$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            observer.invoke((Variable) it.next());
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(observer);
        }
    }

    public final void removeDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        this.declarationObservers.remove(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(observer);
        }
    }

    public final void removeVariablesObserver$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(observer);
        }
    }

    public DivVariableController(@Nullable DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.yandex.div.core.expression.variables.DivVariableController$requestsObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                Iterator it = this.this$0.externalVariableRequestObservers.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(str);
                }
            }
        };
        this.requestsObserver = function1;
        this.variableSource = new MultiVariableSource(this, function1);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : divVariableController);
    }
}
