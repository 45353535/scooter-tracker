package com.yandex.div.core.view2.errors;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.core.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k8.ea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0012¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0012¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J9\u0010\u0016\u001a\u00020\u00152(\u0010\u0014\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0004\u0012\u00020\u00040\u0011j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR<\u0010\u001d\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0004\u0012\u00020\u00040\u0011j\u0002`\u00130\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010&\u001a\u00020%8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorCollector;", "", "<init>", "()V", "", "notifyObservers", "rebuildErrors", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "logError", "(Ljava/lang/Throwable;)V", "warning", "logWarning", "", "getWarnings", "()Ljava/util/Iterator;", "cleanRuntimeWarningsAndErrors", "Lkotlin/Function2;", "", "Lcom/yandex/div/core/view2/errors/ErrorObserver;", "observer", "Lcom/yandex/div/core/Disposable;", "observeAndGet", "(Lkotlin/jvm/functions/Function2;)Lcom/yandex/div/core/Disposable;", "Lk8/ea;", "divData", "attachParsingErrors", "(Lk8/ea;)V", "", "observers", "Ljava/util/Set;", "", "runtimeErrors", "Ljava/util/List;", "parsingErrors", "warnings", "errors", "", "errorsAreValid", "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ErrorCollector {

    @NotNull
    private final Set<Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> runtimeErrors = new ArrayList();

    @NotNull
    private List<? extends Throwable> parsingErrors = CollectionsKt.emptyList();

    @NotNull
    private List<Throwable> warnings = new ArrayList();

    @NotNull
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector errorCollector, Function2 function2) {
        errorCollector.observers.remove(function2);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(@Nullable ea divData) {
        List<? extends Throwable> listEmptyList;
        if (divData == null || (listEmptyList = divData.f87210h) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.parsingErrors = listEmptyList;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    @NotNull
    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(@NotNull Throwable e10) {
        this.runtimeErrors.add(e10);
        notifyObservers();
    }

    public void logWarning(@NotNull Throwable warning) {
        this.warnings.add(warning);
        notifyObservers();
    }

    @NotNull
    public Disposable observeAndGet(@NotNull Function2<? super List<? extends Throwable>, ? super List<? extends Throwable>, Unit> observer) {
        this.observers.add(observer);
        rebuildErrors();
        observer.invoke(this.errors, this.warnings);
        return new q7.a(this, observer);
    }
}
