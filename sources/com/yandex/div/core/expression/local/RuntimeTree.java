package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionsRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010J \u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0005J \u0010\u000b\u001a\u00020\f*\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeTree;", "", "()V", "pathToNodes", "", "", "Lcom/yandex/div/core/expression/local/RuntimeTree$RuntimeNode;", "runtimesToNodes", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getPathToRuntimes", "", "invokeRecursively", "", "expressionsRuntime", "path", "callback", "Lkotlin/Function1;", "storeRuntime", "runtime", "parentRuntime", "RuntimeNode", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RuntimeTree {

    @NotNull
    private final Map<ExpressionsRuntime, RuntimeNode> runtimesToNodes = new LinkedHashMap();

    @NotNull
    private final Map<String, RuntimeNode> pathToNodes = new LinkedHashMap();

    private final void invokeRecursively(RuntimeNode runtimeNode, Function1<? super RuntimeNode, Unit> function1) {
        function1.invoke(runtimeNode);
        Iterator<T> it = runtimeNode.getChildren().iterator();
        while (it.hasNext()) {
            invokeRecursively((RuntimeNode) it.next(), function1);
        }
    }

    @NotNull
    public final Map<String, ExpressionsRuntime> getPathToRuntimes() {
        Map<String, RuntimeNode> map = this.pathToNodes;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RuntimeNode> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue().getRuntime()));
        }
        return MapsKt.toMap(arrayList);
    }

    public final void storeRuntime(@NotNull ExpressionsRuntime runtime, @Nullable ExpressionsRuntime parentRuntime, @NotNull String path) {
        RuntimeNode runtimeNode;
        List<RuntimeNode> children;
        RuntimeNode runtimeNode2 = new RuntimeNode(runtime, path, null, 4, null);
        this.pathToNodes.put(path, runtimeNode2);
        this.runtimesToNodes.put(runtime, runtimeNode2);
        if (parentRuntime == null || (runtimeNode = this.runtimesToNodes.get(parentRuntime)) == null || (children = runtimeNode.getChildren()) == null) {
            return;
        }
        children.add(runtimeNode2);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeTree$RuntimeNode;", "", "runtime", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "path", "", "children", "", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;Ljava/lang/String;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "getPath", "()Ljava/lang/String;", "getRuntime", "()Lcom/yandex/div/core/expression/ExpressionsRuntime;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RuntimeNode {

        @NotNull
        private final List<RuntimeNode> children;

        @NotNull
        private final String path;

        @NotNull
        private final ExpressionsRuntime runtime;

        public RuntimeNode(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String str, @NotNull List<RuntimeNode> list) {
            this.runtime = expressionsRuntime;
            this.path = str;
            this.children = list;
        }

        @NotNull
        public final List<RuntimeNode> getChildren() {
            return this.children;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final ExpressionsRuntime getRuntime() {
            return this.runtime;
        }

        public /* synthetic */ RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(expressionsRuntime, str, (i10 & 4) != 0 ? new ArrayList() : list);
        }
    }

    public final void invokeRecursively(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String path, @NotNull Function1<? super RuntimeNode, Unit> callback) {
        RuntimeNode runtimeNode = this.runtimesToNodes.get(expressionsRuntime);
        if (runtimeNode == null) {
            return;
        }
        if (StringsKt.a0(runtimeNode.getPath(), path, false, 2, null)) {
            invokeRecursively(runtimeNode, callback);
            return;
        }
        for (RuntimeNode runtimeNode2 : runtimeNode.getChildren()) {
            if (StringsKt.a0(runtimeNode2.getPath(), path, false, 2, null)) {
                invokeRecursively(runtimeNode2, callback);
            }
        }
    }
}
